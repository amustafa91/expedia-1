package com.expedia.assignment.model.entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "hotelPricingInfo")
public class HotelPricingInfo {

	@XmlElement(name = "averagePriceValue")
	private Double averagePriceValue;

	@XmlElement(name = "totalPriceValue")
	private Double totalPriceValue;

	@XmlElement(name = "originalPricePerNight")
	private Double originalPricePerNight;

	@XmlElement(name = "hotelTotalBaseRate")
	private Double hotelTotalBaseRate;

	@XmlElement(name = "hotelTotalTaxesAndFees")
	private Double hotelTotalTaxesAndFees;

	@XmlElement(name = "currency")
	private String currency;

	@XmlElement(name = "hotelTotalMandatoryTaxesAndFees")
	private Double hotelTotalMandatoryTaxesAndFees;

	@XmlElement(name = "percentSavings")
	private Double percentSavings;

	@XmlElement(name = "drr")
	private Boolean drr;

	public Double getAveragePriceValue() {
		return averagePriceValue;
	}

	public void setAveragePriceValue(Double averagePriceValue) {
		this.averagePriceValue = averagePriceValue;
	}

	public Double getTotalPriceValue() {
		return totalPriceValue;
	}

	public void setTotalPriceValue(Double totalPriceValue) {
		this.totalPriceValue = totalPriceValue;
	}

	public Double getOriginalPricePerNight() {
		return originalPricePerNight;
	}

	public void setOriginalPricePerNight(Double originalPricePerNight) {
		this.originalPricePerNight = originalPricePerNight;
	}

	public Double getHotelTotalBaseRate() {
		return hotelTotalBaseRate;
	}

	public void setHotelTotalBaseRate(Double hotelTotalBaseRate) {
		this.hotelTotalBaseRate = hotelTotalBaseRate;
	}

	public Double getHotelTotalTaxesAndFees() {
		return hotelTotalTaxesAndFees;
	}

	public void setHotelTotalTaxesAndFees(Double hotelTotalTaxesAndFees) {
		this.hotelTotalTaxesAndFees = hotelTotalTaxesAndFees;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Double getHotelTotalMandatoryTaxesAndFees() {
		return hotelTotalMandatoryTaxesAndFees;
	}

	public void setHotelTotalMandatoryTaxesAndFees(Double hotelTotalMandatoryTaxesAndFees) {
		this.hotelTotalMandatoryTaxesAndFees = hotelTotalMandatoryTaxesAndFees;
	}

	public Double getPercentSavings() {
		return percentSavings;
	}

	public void setPercentSavings(Double percentSavings) {
		this.percentSavings = percentSavings;
	}

	public Boolean getDrr() {
		return drr;
	}

	public void setDrr(Boolean drr) {
		this.drr = drr;
	}
}