package com.expedia.assignment.model.entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "hotelUrls")
public class HotelUrls {

	@XmlElement(name = "hotelInfositeUrl")
	private String hotelInfositeUrl;

	@XmlElement(name = "hotelSearchResultUrl")
	private String hotelSearchResultUrl;

	public String getHotelInfositeUrl() {
		return hotelInfositeUrl;
	}

	public void setHotelInfositeUrl(String hotelInfositeUrl) {
		this.hotelInfositeUrl = hotelInfositeUrl;
	}

	public String getHotelSearchResultUrl() {
		return hotelSearchResultUrl;
	}

	public void setHotelSearchResultUrl(String hotelSearchResultUrl) {
		this.hotelSearchResultUrl = hotelSearchResultUrl;
	}
}