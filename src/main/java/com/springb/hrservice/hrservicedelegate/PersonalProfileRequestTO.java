package com.springb.hrservice.hrservicedelegate;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.springb.framework.common.core.RESTHttpProtocolHandler;
import com.springb.framework.common.core.RequestTO;
import com.springb.framework.common.core.RESTHttpProtocolHandler.REST_PROTOCOL_DATA_ELEMENTS;

public class PersonalProfileRequestTO extends RequestTO {

	private String requestURI;
	private Map<String, String> HeaderMap;
	private String rawRequest;
	private RESTHttpProtocolHandler.HTTP_METHOD_TYPE restMethodType;
	private RESTHttpProtocolHandler.HTTP_ENTITY_TYPE contentBodyType;
	private RESTHttpProtocolHandler.HTTP_HEADER_CONTENT_TYPE headerContentType;
	private RESTHttpProtocolHandler.REST_PROTOCOL_DATA_ELEMENTS dataElements;
	List<Person> personData;

	
	
	/*public RESTHttpProtocolHandler.REST_PROTOCOL_DATA_ELEMENTS getDataElements() {
		return dataElements;
	}

	public void setDataElements(RESTHttpProtocolHandler.REST_PROTOCOL_DATA_ELEMENTS dataElements) {
		this.dataElements = dataElements;
	}*/

	public String getRequestURI() {
		return requestURI;
	}

	public void setRequestURI(String requestURI) {
		this.requestURI = requestURI;
	}

	public Map<String, String> getHeaderMap() {
		return HeaderMap;
	}

	public void setHeaderMap(Map<String, String> headerMap) {
		HeaderMap = headerMap;
	}

	public String getRawRequest() {
		return rawRequest;
	}

	public void setRawRequest(String rawRequest) {
		this.rawRequest = rawRequest;
	}

	public RESTHttpProtocolHandler.HTTP_METHOD_TYPE getRestMethodType() {
		return restMethodType;
	}

	public void setRestMethodType(RESTHttpProtocolHandler.HTTP_METHOD_TYPE restMethodType) {
		this.restMethodType = restMethodType;
	}

	public RESTHttpProtocolHandler.HTTP_ENTITY_TYPE getContentBodyType() {
		return contentBodyType;
	}

	public void setContentBodyType(RESTHttpProtocolHandler.HTTP_ENTITY_TYPE contentBodyType) {
		this.contentBodyType = contentBodyType;
	}

	public RESTHttpProtocolHandler.HTTP_HEADER_CONTENT_TYPE getHeaderContentType() {
		return headerContentType;
	}

	public void setHeaderContentType(RESTHttpProtocolHandler.HTTP_HEADER_CONTENT_TYPE headerContentType) {
		this.headerContentType = headerContentType;
	}

	public List<Person> getPersonData() {
		return personData;
	}

	public void setPersonData(List<Person> personData) {
		this.personData = personData;
	}

	

}
