package com.springb.hrservice.hrservicedelegate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.springb.framework.common.core.MessageStatus;
import com.springb.framework.common.core.ResponseBuilder;
import com.springb.framework.common.core.ResponseContextTO;

public class PersonalProfileResponseBuilder extends ResponseBuilder<PersonalProfileResponseTO>{

	@Override
	public PersonalProfileResponseTO processResponse(Object paramObject) throws Exception {
		String jsonStr = paramObject.toString();
		ObjectMapper mapper = new ObjectMapper();
		JsonNode rootNode = mapper.readTree(jsonStr);
		JavaTimeModule javaTimeModule = new JavaTimeModule();
		javaTimeModule.addSerializer(LocalDate.class, new LocalDateSerializer(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		mapper.registerModule(javaTimeModule);
		PersonalProfileResponseTO responseTo = mapper.readValue(jsonStr, PersonalProfileResponseTO.class);
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

	private void setMessageStatus(PersonalProfileResponseTO responseTo) {
		MessageStatus messageStatus = new MessageStatus();
		messageStatus.setCacheEnableMessage(true);
		messageStatus.setResponse(responseTo.toString());
		messageStatus.setResponseTime(new Long(System.currentTimeMillis()));
		messageStatus.setStatusCode(200);
		messageStatus.setStatusDescription("Success");
	}

}
