package com.springb.hrservice.hrservicedelegate;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.springb.framework.common.core.ResponseTO;

public class ServicesDataResponseTO extends ResponseTO{
	
	@JsonProperty("servicesList")
	private List<OccupationServices> servicesList;
	@JsonProperty("status")
	private String status;

	public List<OccupationServices> getServicesList() {
		return servicesList;
	}

	public void setServicesList(List<OccupationServices> servicesList) {
		this.servicesList = servicesList;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
