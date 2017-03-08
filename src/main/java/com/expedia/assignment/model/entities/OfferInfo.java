package com.expedia.assignment.model.entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "offerInfo")
public class OfferInfo {

	@XmlElement(name = "siteID")
	private String siteId;

	@XmlElement(name = "language")
	private String language;

	@XmlElement(name = "currency")
	private String currency;

	public String getSiteId() {
		return siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
}