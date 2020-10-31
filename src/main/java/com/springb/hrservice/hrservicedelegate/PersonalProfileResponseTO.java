package com.springb.hrservice.hrservicedelegate;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.springb.framework.common.core.ResponseTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonalProfileResponseTO extends ResponseTO {
	@JsonProperty("persons")
	private List<HRPersonalProfile> personalProfileList;
	@JsonProperty("status")
	private String status;
	//private List<ErrorMessages> errorMessages;

	@Override
	public String toString() {
		return "PersonalProfileResponseTO [personalProfileList=" + personalProfileList + "]";
	}

	public List<HRPersonalProfile> getPersonalProfileList() {
		return personalProfileList;
	}

	public void setPersonalProfileList(List<HRPersonalProfile> personalProfileList) {
		this.personalProfileList = personalProfileList;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
}
