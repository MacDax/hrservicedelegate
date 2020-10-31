package com.springb.hrservice.hrservicedelegate;

import java.util.List;
import java.util.Map;

import com.springb.framework.common.core.RESTHttpProtocolHandler;
import com.springb.framework.common.core.RequestTO;

public class ServiceDataRequestTO extends RequestTO {

	private String requestURI;
	private Map<String, String> HeaderMap;
	private String rawRequest;
	private RESTHttpProtocolHandler.HTTP_METHOD_TYPE restMethodType;
	private RESTHttpProtocolHandler.HTTP_ENTITY_TYPE contentBodyType;
	private RESTHttpProtocolHandler.HTTP_HEADER_CONTENT_TYPE headerContentType;

	List<OccupationServices> servicesDataList;

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

	public List<OccupationServices> getServicesDataList() {
		return servicesDataList;
	}

	public void setServicesDataList(List<OccupationServices> servicesDataList) {
		this.servicesDataList = servicesDataList;
	}

}
