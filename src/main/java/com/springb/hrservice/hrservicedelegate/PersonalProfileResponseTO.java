package com.springb.hrservice.hrservicedelegate;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.springb.framework.common.core.ResponseTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonalProfileResponseTO extends ResponseTO {
	@JsonProperty("persons")
	private List<HRPersonalProfile> personalProfileList;

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

}
