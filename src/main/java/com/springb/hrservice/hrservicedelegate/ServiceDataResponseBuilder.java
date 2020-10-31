package com.springb.hrservice.hrservicedelegate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springb.framework.common.core.MessageStatus;
import com.springb.framework.common.core.ResponseBuilder;
import com.springb.framework.common.core.ResponseContextTO;

public class ServiceDataResponseBuilder extends ResponseBuilder<ServicesDataResponseTO>{

	@Override
	public ServicesDataResponseTO processResponse(Object paramObject) throws Exception {
		String jsonStr = paramObject.toString();
		ObjectMapper mapper = new ObjectMapper();
		ServicesDataResponseTO responseTo = mapper.readValue(jsonStr, ServicesDataResponseTO.class);
		setMessageStatus(responseTo);
		ResponseContextTO responseContext = createResponseContextTO();
		responseTo.setResponseContextTo(responseContext);
		return responseTo;
	}
	
	private ResponseContextTO createResponseContextTO() {
		ResponseContextTO responseContext = new ResponseContextTO();
		responseContext.setHost("host");
		responseContext.setMessageName("HRServcie");
		responseContext.setMiddleWareServiceName("HrService");
		//responseContext.setRequestId(UUID.randomUUID());
		responseContext.setRequestId("requestId");
		return responseContext;
	}

	private void setMessageStatus(ServicesDataResponseTO responseTo) {
		MessageStatus messageStatus = new MessageStatus();
		messageStatus.setCacheEnableMessage(true);
		messageStatus.setResponse(responseTo.toString());
		messageStatus.setResponseTime(new Long(System.currentTimeMillis()));
		messageStatus.setStatusCode(200);
		messageStatus.setStatusDescription("Success");
	}

}
