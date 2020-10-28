package com.springb.hrservice.hrservicedelegate;

import java.time.LocalDate;
import java.util.Map;

import com.springb.framework.common.core.RESTHttpProtocolHandler;
import com.springb.framework.common.core.RequestTO;

public class PersonalProfileRequestTO extends RequestTO {

	private String requestURI;
	private Map<String, String> HeaderMap;
	private String rawRequest;
	private RESTHttpProtocolHandler.HTTP_METHOD_TYPE restMethodType;
	private RESTHttpProtocolHandler.HTTP_ENTITY_TYPE contentBodyType;
	private RESTHttpProtocolHandler.HTTP_HEADER_CONTENT_TYPE headerContentType;
	private String personIdNumber;
	private String fname;
	private String lname;
	private LocalDate birthdate;

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

	public String getPersonIdNumber() {
		return personIdNumber;
	}

	public void setPersonIdNumber(String personIdNumber) {
		this.personIdNumber = personIdNumber;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	
	

}
