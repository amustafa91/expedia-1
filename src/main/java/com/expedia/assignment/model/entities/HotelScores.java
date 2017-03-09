package com.expedia.assignment.model.entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Mazen H. Khalil
 */
@XmlRootElement(name = "hotelScores")
public class HotelScores {

    @XmlElement(name = "rawAppealScore")
    private Double rawAppealScore;

    @XmlElement(name = "movingAverageScore")
    private Double movingAverageScore;

    public Double getRawAppealScore() {
	return rawAppealScore;
    }

    public void setRawAppealScore(Double rawAppealScore) {
	this.rawAppealScore = rawAppealScore;
    }

    public Double getMovingAverageScore() {
	return movingAverageScore;
    }

    public void setMovingAverageScore(Double movingAverageScore) {
	this.movingAverageScore = movingAverageScore;
    }
}