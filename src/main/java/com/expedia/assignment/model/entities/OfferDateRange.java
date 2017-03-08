package com.expedia.assignment.model.entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "offerDateRange")
public class OfferDateRange {

	@XmlElement(name = "travelStartDate")
	private Integer[] travelStartDate;

	@XmlElement(name = "travelEndDate")
	private Integer[] travelEndDate;

	@XmlElement(name = "lengthOfStay")
	private Integer lengthOfStay;

	public Integer[] getTravelStartDate() {
		return travelStartDate;
	}

	public void setTravelStartDate(Integer[] travelStartDate) {
		this.travelStartDate = travelStartDate;
	}

	public Integer[] getTravelEndDate() {
		return travelEndDate;
	}

	public void setTravelEndDate(Integer[] travelEndDate) {
		this.travelEndDate = travelEndDate;
	}

	public Integer getLengthOfStay() {
		return lengthOfStay;
	}

	public void setLengthOfStay(Integer lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}
}