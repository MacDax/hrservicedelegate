package com.springb.hrservice.hrservicedelegate;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.springb.framework.common.core.CommonContextDynamic;
import com.springb.framework.common.core.ProtocolHandler;
import com.springb.framework.common.core.RESTHttpProtocolHandler;
import com.springb.framework.common.core.RequestBuilder;
import com.springb.framework.common.core.SystemHostContext;

public class PersonalProfileRequestBuilder extends RequestBuilder<PersonalProfileRequestTO, SystemHostContext, CommonContextDynamic>{

	private static final Logger LOGGER = LoggerFactory.getLogger(PersonalProfileRequestBuilder.class);
	
	public PersonalProfileRequestBuilder(SystemHostContext hostContextStatic) {
		super(hostContextStatic);
	}
	
	@Override
	public Object buildRequest(PersonalProfileRequestTO requestTO, String protocolName) {
		if(null == requestTO) {
			return null;
		}
		JSONObject hrPersonRequestJson = new JSONObject();
		hrPersonRequestJson.put("id", requestTO.getPersonIdNumber());
		hrPersonRequestJson.put("fname", requestTO.getFname());
		hrPersonRequestJson.put("lname", requestTO.getLname());
		hrPersonRequestJson.put("birthdate", requestTO.getBirthdate());
		return hrPersonRequestJson;
	}
	
	@Override
	public Object buildRequestorContext(CommonContextDynamic hostContextDynamic, String protocolName) {
		hostContextDynamic.setRequestId(UUID.randomUUID().toString());
		return hostContextDynamic;
	}
	
	@Override
	public Map getAdditionalRequestDetails(PersonalProfileRequestTO requestTO, String protocolName) {
		Map<Object, Object> requestMap = new HashMap();
		requestMap.put(RESTHttpProtocolHandler.REST_PROTOCOL_DATA_ELEMENTS.URI, requestTO.getRequestURI());
		if(null != requestTO.getRestMethodType()) {
			requestMap.put(ProtocolHandler.PROTOCOL_DATA_ELEMENTS.HEADER, requestTO.getRestMethodType());
		}else {
			requestMap.put(ProtocolHandler.PROTOCOL_DATA_ELEMENTS.HEADER, RESTHttpProtocolHandler.HTTP_METHOD_TYPE.POST);
		}
		Map<String, String> headerMap = new HashMap();
		if(requestTO.getApplicationHostContext() != null) {
		    CommonContextDynamic contextDynamic = (CommonContextDynamic) requestTO.getApplicationHostContext(); 
			headerMap.put("X-PR-REQUEST-DATE", contextDynamic.getCreationTimeStamp() != null ?
					contextDynamic.getCreationTimeStamp().toString() : null);
			headerMap.put("X-REQUEST-ID", contextDynamic.getRequestId());
			//headerMap.put("X-CLIENTAPP-ID", contextDynamic.getApplicationId);
		}
		requestMap.put(RESTHttpProtocolHandler.REST_PROTOCOL_DATA_ELEMENTS.HEADER, headerMap);
		if(null != requestTO.getContentBodyType()) {
			requestMap.put(RESTHttpProtocolHandler.REST_PROTOCOL_DATA_ELEMENTS.CONTENT_BODY, requestTO.getContentBodyType());
		}else {
			requestMap.put(RESTHttpProtocolHandler.REST_PROTOCOL_DATA_ELEMENTS.CONTENT_BODY, RESTHttpProtocolHandler.HTTP_ENTITY_TYPE.STRING_HTTP_ENTITY);
		}
		if(requestTO.getRawRequest() != null) {
			requestMap.put(ProtocolHandler.PROTOCOL_DATA_ELEMENTS.PAYLOAD, requestTO.getRawRequest());
		}
		if(requestTO.getHeaderContentType() != null) {
			requestMap.put(RESTHttpProtocolHandler.REST_PROTOCOL_DATA_ELEMENTS.CONTENT_HEADER_TYPE, requestTO.getHeaderContentType());
		}else {
			requestMap.put(RESTHttpProtocolHandler.REST_PROTOCOL_DATA_ELEMENTS.CONTENT_HEADER_TYPE, RESTHttpProtocolHandler.HTTP_HEADER_CONTENT_TYPE.APPLICATION_JSON);
		}
		return requestMap;
	}

}
