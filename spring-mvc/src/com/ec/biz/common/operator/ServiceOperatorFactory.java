package com.ec.biz.common.operator;

import java.util.Map;

public class ServiceOperatorFactory {

    Map<String,AbstractServiceOperator> operatorMap;
    
    /**
     * app接口访问url配置
     */
    Map<String,String>    accessUrlMap;
    
    /**
     * 根据Code,获取不同的服务操作类
     * @param code
     * @return
     */
    public AbstractServiceOperator getOperatorByCode(String code){
    	if((operatorMap == null || operatorMap.isEmpty())||(accessUrlMap == null || accessUrlMap.isEmpty()) )
    		return null;
    	AbstractServiceOperator operator = operatorMap.get(code);
    	if(operator != null){
    		operator.setAccessUrl(accessUrlMap.get(code));
    	}
    	return operator;
    }

	public Map<String, AbstractServiceOperator> getOperatorMap() {
		return operatorMap;
	}

	public void setOperatorMap(Map<String, AbstractServiceOperator> operatorMap) {
		this.operatorMap = operatorMap;
	}

	public Map<String, String> getAccessUrlMap() {
		return accessUrlMap;
	}

	public void setAccessUrlMap(Map<String, String> accessUrlMap) {
		this.accessUrlMap = accessUrlMap;
	}
    
    
}
