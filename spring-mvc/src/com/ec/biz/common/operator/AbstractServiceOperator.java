package com.ec.biz.common.operator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ec.biz.common.req.BaseServiceRequest;
import com.ec.biz.common.resp.BaseServiceResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public abstract class AbstractServiceOperator {

	protected Log log = LogFactory.getLog(super.getClass());
	/**
	 * 请求访问Url
	 */
	private String accessUrl;
	
	/**
	 * 业务处理，调用App相关接口
	 * @param request
	 * @param response
	 */
	public void execute(BaseServiceRequest request,BaseServiceResponse response){
		/**
		 * 校验业务参数
		 */
		checkParam(request,response);
		if(!response.isSuccess())
			return;
		
		/**
		 * 获取接口数据
		 */
		getData(request,response);
		if(!response.isSuccess())
			return;
		/**
		 * 转换接口返回数据，封装业务需要的对象
		 */
		convertData(request,response);
		if(!response.isSuccess())
			return;
		/**
		 * 后置业务处理
		 */
		postProcessing(request,response);
		if(!response.isSuccess())
			return;
		
	}




	/**
	 * 校验请求参数
	 * @param request
	 * @param response
	 */
	public abstract void checkParam(BaseServiceRequest request,BaseServiceResponse response);
	
	/**
	 * 根据不同的业务，调用不同的获取数据的接口
	 * @param request
	 * @param response
	 */
    private void getData(BaseServiceRequest request,BaseServiceResponse response) {
		String result = sendPost(accessUrl,request);
		if(StringUtils.isNotBlank(result)) {
			response.setReturnStr(result);
		}
	}

    /**
     * 转化接口返回数据
     * @param request
     * @param response
     */
	public abstract void convertData(BaseServiceRequest request,BaseServiceResponse response);
	
	/**
	 * 后置业务处理
	 * @param request
	 * @param respone
	 */
	public abstract void postProcessing(BaseServiceRequest request,BaseServiceResponse respone);
    /**
     * 发送
     * @param url
     * @param request
     * @return
     */
	private String sendPost(String url, BaseServiceRequest request) {
		 Gson gson = new GsonBuilder().serializeNulls().create();
		 String param = this.removeKey(gson.toJson(request),"pageCode");
		  PrintWriter out = null;
	      BufferedReader in = null;
	      String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            HttpURLConnection conn = (HttpURLConnection) realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestMethod("POST");
            conn.setUseCaches(false);
            conn.setInstanceFollowRedirects(true);
            conn.setRequestProperty("Content-Type", "application/json");
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(),"UTF-8"));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            log.error(e);
        }
        //使用finally块来关闭输出流、输入流
        finally{
            try{
                if(out!=null){
                    out.close();
                }
                if(in!=null){
                    in.close();
                }
            }
            catch(IOException ex){
                ex.printStackTrace();
            }
        }
        return result;
	}


	public String removeKey(String jsonStr, String obj) {
		if(StringUtils.isBlank(jsonStr)){
			return "{}";
		}
		JSONObject reagObj = JSONObject.fromObject(jsonStr);
		Iterator itt = reagObj.keys();
		JSONObject jsonObj = new JSONObject();
		while(itt.hasNext()){
			String key = itt.next().toString();
			if(key.equals(obj)){
				continue;
			}
			jsonObj.put(key, reagObj.get(key));
		}
		
		return jsonObj.toString();
	}


	public String getAccessUrl() {
		return accessUrl;
	}

	public void setAccessUrl(String accessUrl) {
		this.accessUrl = accessUrl;
	}
	
	
}
