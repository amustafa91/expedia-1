package com.expedia.assignment.mb;

import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;

import com.expedia.assignment.model.HotelFinder;
import com.expedia.assignment.model.entities.Result;

@ManagedBean(name = "viewMB")
public class ViewMB {

	private Result result;
	private String destinationName;
	private String destinationCity;
	private String regionIds;
	private Date minTripStartDate;
	private Date maxTripStartDate;
	private Integer lengthOfStay;
	private Double minStarRating;
	private Double maxStarRating;
	private Double minTotalRate;
	private Double maxTotalRate;
	private Double minGuestRating;
	private Double maxGuestRating;

	public String getDestinationName() {
		return destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public String getRegionIds() {
		return regionIds;
	}

	public void setRegionIds(String regionIds) {
		this.regionIds = regionIds;
	}

	public Date getMinTripStartDate() {
		return minTripStartDate;
	}

	public void setMinTripStartDate(Date minTripStartDate) {
		this.minTripStartDate = minTripStartDate;
	}

	public Date getMaxTripStartDate() {
		return maxTripStartDate;
	}

	public void setMaxTripStartDate(Date maxTripStartDate) {
		this.maxTripStartDate = maxTripStartDate;
	}

	public Integer getLengthOfStay() {
		return lengthOfStay;
	}

	public void setLengthOfStay(Integer lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}

	public Double getMinStarRating() {
		return minStarRating;
	}

	public void setMinStarRating(Double minStarRating) {
		this.minStarRating = minStarRating;
	}

	public Double getMaxStarRating() {
		return maxStarRating;
	}

	public void setMaxStarRating(Double maxStarRating) {
		this.maxStarRating = maxStarRating;
	}

	public Double getMinTotalRate() {
		return minTotalRate;
	}

	public void setMinTotalRate(Double minTotalRate) {
		this.minTotalRate = minTotalRate;
	}

	public Double getMaxTotalRate() {
		return maxTotalRate;
	}

	public void setMaxTotalRate(Double maxTotalRate) {
		this.maxTotalRate = maxTotalRate;
	}

	public Double getMinGuestRating() {
		return minGuestRating;
	}

	public void setMinGuestRating(Double minGuestRating) {
		this.minGuestRating = minGuestRating;
	}

	public Double getMaxGuestRating() {
		return maxGuestRating;
	}

	public void setMaxGuestRating(Double maxGuestRating) {
		this.maxGuestRating = maxGuestRating;
	}

	private void loadResult() {
		result = HotelFinder.find(null);
	}

	public Result getResult() {
		if (result == null) {
			loadResult();
		}
		return result;
	}

	public String search() {
		result = HotelFinder.find(null);
		return null;
	}
}