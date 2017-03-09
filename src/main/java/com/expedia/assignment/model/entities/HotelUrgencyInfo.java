package com.expedia.assignment.model.entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Mazen H. Khalil
 */
@XmlRootElement(name = "hotelUrgencyInfo")
public class HotelUrgencyInfo {

    @XmlElement(name = "airAttachRemainingTime")
    private Long airAttachRemainingTime;

    @XmlElement(name = "numberOfPeopleViewing")
    private Long numberOfPeopleViewing;

    @XmlElement(name = "numberOfPeopleBooked")
    private Long numberOfPeopleBooked;

    @XmlElement(name = "numberOfRoomsLeft")
    private Long numberOfRoomsLeft;

    @XmlElement(name = "lastBookedTime")
    private Long lastBookedTime;

    @XmlElement(name = "almostSoldStatus")
    private String almostSoldStatus;

    @XmlElement(name = "link")
    private String link;

    // FIXME --> Unknown type...
    @XmlElement(name = "almostSoldOutRoomTypeInfoCollection")
    private String[] almostSoldOutRoomTypeInfoCollection;

    @XmlElement(name = "airAttachEnabled")
    private Boolean airAttachEnabled;

    public Long getAirAttachRemainingTime() {
	return airAttachRemainingTime;
    }

    public void setAirAttachRemainingTime(Long airAttachRemainingTime) {
	this.airAttachRemainingTime = airAttachRemainingTime;
    }

    public Long getNumberOfPeopleViewing() {
	return numberOfPeopleViewing;
    }

    public void setNumberOfPeopleViewing(Long numberOfPeopleViewing) {
	this.numberOfPeopleViewing = numberOfPeopleViewing;
    }

    public Long getNumberOfPeopleBooked() {
	return numberOfPeopleBooked;
    }

    public void setNumberOfPeopleBooked(Long numberOfPeopleBooked) {
	this.numberOfPeopleBooked = numberOfPeopleBooked;
    }

    public Long getNumberOfRoomsLeft() {
	return numberOfRoomsLeft;
    }

    public void setNumberOfRoomsLeft(Long numberOfRoomsLeft) {
	this.numberOfRoomsLeft = numberOfRoomsLeft;
    }

    public Long getLastBookedTime() {
	return lastBookedTime;
    }

    public void setLastBookedTime(Long lastBookedTime) {
	this.lastBookedTime = lastBookedTime;
    }

    public String getAlmostSoldStatus() {
	return almostSoldStatus;
    }

    public void setAlmostSoldStatus(String almostSoldStatus) {
	this.almostSoldStatus = almostSoldStatus;
    }

    public String getLink() {
	return link;
    }

    public void setLink(String link) {
	this.link = link;
    }

    public String[] getAlmostSoldOutRoomTypeInfoCollection() {
	return almostSoldOutRoomTypeInfoCollection;
    }

    public void setAlmostSoldOutRoomTypeInfoCollection(String[] almostSoldOutRoomTypeInfoCollection) {
	this.almostSoldOutRoomTypeInfoCollection = almostSoldOutRoomTypeInfoCollection;
    }

    public Boolean getAirAttachEnabled() {
	return airAttachEnabled;
    }

    public void setAirAttachEnabled(Boolean airAttachEnabled) {
	this.airAttachEnabled = airAttachEnabled;
    }
}