package com.expedia.assignment.model;

/**
 * Hotel finder request filter builder used to filter hotels requests
 * 
 * @author Mazen H. Khalil
 * @see HotelFinder#find(Filter)
 */
public class Filter {

    public static final String DESTINATION_NAME_QUERY_PARAMETER = "destinationName";
    public static final String DESTINATION_CITY_QUERY_PARAMETER = "destinationCity";
    public static final String REGION_IDS_QUERY_PARAMETER = "regionIds";
    public static final String MIN_TRIP_START_DATE_QUERY_PARAMETER = "minTripStartDate";
    public static final String MAX_TRIP_START_DATE_QUERY_PARAMETER = "maxTripStartDate";
    public static final String LENGH_OF_STAY_QUERY_PARAMETER = "lengthOfStay";
    public static final String MIN_STAR_RATING_QUERY_PARAMETER = "minStarRating";
    public static final String MAX_STAR_RATING_QUERY_PARAMETER = "maxStarRating";
    public static final String MIN_TOTAL_RATE_QUERY_PARAMETER = "minTotalRate";
    public static final String MAX_TOTAL_RATE__QUERY_PARAMETER = "maxTotalRate";
    public static final String MIN_GUEST_RATING_QUERY_PARAMETER = "minGuestRating";
    public static final String MAX_GUEST_RATING__QUERY_PARAMETER = "maxGuestRating";

    private String destinationName;
    private String destinationCity;
    private String regionIds;
    private String minTripStartDate;
    private String maxTripStartDate;
    private Integer lengthOfStay;
    private Double minStarRating;
    private Double maxStarRating;
    private Integer minTotalRate;
    private Integer maxTotalRate;
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

    public String getMinTripStartDate() {
	return minTripStartDate;
    }

    public void setMinTripStartDate(String minTripStartDate) {
	this.minTripStartDate = minTripStartDate;
    }

    public String getMaxTripStartDate() {
	return maxTripStartDate;
    }

    public void setMaxTripStartDate(String maxTripStartDate) {
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

    public Integer getMinTotalRate() {
	return minTotalRate;
    }

    public void setMinTotalRate(Integer minTotalRate) {
	this.minTotalRate = minTotalRate;
    }

    public Integer getMaxTotalRate() {
	return maxTotalRate;
    }

    public void setMaxTotalRate(Integer maxTotalRate) {
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
}