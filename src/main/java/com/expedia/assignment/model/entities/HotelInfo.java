package com.expedia.assignment.model.entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "hotelInfo")
public class HotelInfo {

	@XmlElement(name = "hotelId")
	private String hotelId;

	@XmlElement(name = "hotelName")
	private String hotelName;

	@XmlElement(name = "hotelDestination")
	private String hotelDestination;

	@XmlElement(name = "hotelDestinationRegionID")
	private String hotelDestinationRegionId;

	@XmlElement(name = "hotelLongDestination")
	private String hotelLongDestination;

	@XmlElement(name = "hotelStreetAddress")
	private String hotelStreetAddress;

	@XmlElement(name = "hotelCity")
	private String hotelCity;

	@XmlElement(name = "hotelProvince")
	private String hotelProvince;

	@XmlElement(name = "hotelCountryCode")
	private String hotelCountryCode;

	@XmlElement(name = "hotelLocation")
	private String hotelLocation;

	@XmlElement(name = "hotelLatitude")
	private Double hotelLatitude;

	@XmlElement(name = "hotelLongitude")
	private Double hotelLongitude;

	@XmlElement(name = "hotelStarRating")
	private Double hotelStarRating;

	@XmlElement(name = "hotelGuestReviewRating")
	private Double hotelGuestReviewRating;

	@XmlElement(name = "travelStartDate")
	private String travelStartDate;

	@XmlElement(name = "travelEndDate")
	private String travelEndDate;

	@XmlElement(name = "hotelImageUrl")
	private String hotelImageUrl;

	@XmlElement(name = "carPackageScore")
	private Double carPackageScore;

	@XmlElement(name = "description")
	private String description;

	@XmlElement(name = "distanceFromUser")
	private Double distanceFromUser;

	@XmlElement(name = "language")
	private String language;

	@XmlElement(name = "movingAverageScore")
	private Double movingAverageScore;

	@XmlElement(name = "promotionAmount")
	private Double promotionAmount;

	@XmlElement(name = "promotionDescription")
	private String promotionDescription;

	@XmlElement(name = "promotionTag")
	private String promotionTag;

	@XmlElement(name = "rawAppealScore")
	private Double rawAppealScore;

	@XmlElement(name = "relevanceScore")
	private Double relevanceScore;

	@XmlElement(name = "statusCode")
	private String statusCode;

	@XmlElement(name = "statusDescription")
	private String statusDescription;

	@XmlElement(name = "carPackage")
	private Boolean carPackage;

	@XmlElement(name = "allInclusive")
	private Boolean allInclusive;

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelDestination() {
		return hotelDestination;
	}

	public void setHotelDestination(String hotelDestination) {
		this.hotelDestination = hotelDestination;
	}

	public String getHotelDestinationRegionId() {
		return hotelDestinationRegionId;
	}

	public void setHotelDestinationRegionId(String hotelDestinationRegionId) {
		this.hotelDestinationRegionId = hotelDestinationRegionId;
	}

	public String getHotelLongDestination() {
		return hotelLongDestination;
	}

	public void setHotelLongDestination(String hotelLongDestination) {
		this.hotelLongDestination = hotelLongDestination;
	}

	public String getHotelStreetAddress() {
		return hotelStreetAddress;
	}

	public void setHotelStreetAddress(String hotelStreetAddress) {
		this.hotelStreetAddress = hotelStreetAddress;
	}

	public String getHotelCity() {
		return hotelCity;
	}

	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}

	public String getHotelProvince() {
		return hotelProvince;
	}

	public void setHotelProvince(String hotelProvince) {
		this.hotelProvince = hotelProvince;
	}

	public String getHotelCountryCode() {
		return hotelCountryCode;
	}

	public void setHotelCountryCode(String hotelCountryCode) {
		this.hotelCountryCode = hotelCountryCode;
	}

	public String getHotelLocation() {
		return hotelLocation;
	}

	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}

	public Double getHotelLatitude() {
		return hotelLatitude;
	}

	public void setHotelLatitude(Double hotelLatitude) {
		this.hotelLatitude = hotelLatitude;
	}

	public Double getHotelLongitude() {
		return hotelLongitude;
	}

	public void setHotelLongitude(Double hotelLongitude) {
		this.hotelLongitude = hotelLongitude;
	}

	public Double getHotelStarRating() {
		return hotelStarRating;
	}

	public void setHotelStarRating(Double hotelStarRating) {
		this.hotelStarRating = hotelStarRating;
	}

	public Double getHotelGuestReviewRating() {
		return hotelGuestReviewRating;
	}

	public void setHotelGuestReviewRating(Double hotelGuestReviewRating) {
		this.hotelGuestReviewRating = hotelGuestReviewRating;
	}

	public String getTravelStartDate() {
		return travelStartDate;
	}

	public void setTravelStartDate(String travelStartDate) {
		this.travelStartDate = travelStartDate;
	}

	public String getTravelEndDate() {
		return travelEndDate;
	}

	public void setTravelEndDate(String travelEndDate) {
		this.travelEndDate = travelEndDate;
	}

	public String getHotelImageUrl() {
		return hotelImageUrl;
	}

	public void setHotelImageUrl(String hotelImageUrl) {
		this.hotelImageUrl = hotelImageUrl;
	}

	public Double getCarPackageScore() {
		return carPackageScore;
	}

	public void setCarPackageScore(Double carPackageScore) {
		this.carPackageScore = carPackageScore;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getDistanceFromUser() {
		return distanceFromUser;
	}

	public void setDistanceFromUser(Double distanceFromUser) {
		this.distanceFromUser = distanceFromUser;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Double getMovingAverageScore() {
		return movingAverageScore;
	}

	public void setMovingAverageScore(Double movingAverageScore) {
		this.movingAverageScore = movingAverageScore;
	}

	public Double getPromotionAmount() {
		return promotionAmount;
	}

	public void setPromotionAmount(Double promotionAmount) {
		this.promotionAmount = promotionAmount;
	}

	public String getPromotionDescription() {
		return promotionDescription;
	}

	public void setPromotionDescription(String promotionDescription) {
		this.promotionDescription = promotionDescription;
	}

	public String getPromotionTag() {
		return promotionTag;
	}

	public void setPromotionTag(String promotionTag) {
		this.promotionTag = promotionTag;
	}

	public Double getRawAppealScore() {
		return rawAppealScore;
	}

	public void setRawAppealScore(Double rawAppealScore) {
		this.rawAppealScore = rawAppealScore;
	}

	public Double getRelevanceScore() {
		return relevanceScore;
	}

	public void setRelevanceScore(Double relevanceScore) {
		this.relevanceScore = relevanceScore;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusDescription() {
		return statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	public Boolean getCarPackage() {
		return carPackage;
	}

	public void setCarPackage(Boolean carPackage) {
		this.carPackage = carPackage;
	}

	public Boolean getAllInclusive() {
		return allInclusive;
	}

	public void setAllInclusive(Boolean allInclusive) {
		this.allInclusive = allInclusive;
	}
}