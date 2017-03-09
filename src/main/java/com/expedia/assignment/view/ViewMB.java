package com.expedia.assignment.view;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.expedia.assignment.model.Filter;
import com.expedia.assignment.model.HotelFinder;
import com.expedia.assignment.model.entities.Hotel;
import com.expedia.assignment.model.entities.Result;

/**
 * View scoped managed bean
 * 
 * @author Mazen H. Khalil
 */
@ManagedBean(name = "viewMB")
@ViewScoped
public class ViewMB {

    private Result result;
    private Filter filter = new Filter();
    private Hotel selectedHotel;

    public Filter getFilter() {
	return filter;
    }

    public void setFilter(Filter filter) {
	this.filter = filter;
    }

    public Hotel getSelectedHotel() {
	return selectedHotel;
    }

    public void setSelectedHotel(Hotel selectedHotel) {
	this.selectedHotel = selectedHotel;
    }

    private void loadResult() {
	result = HotelFinder.find(filter);
    }

    public Result getResult() {
	if (result == null) {
	    loadResult();
	}
	return result;
    }

    public String search() {
	loadResult();
	return null;
    }

    public String convertTime(Long time) {
	if (time == null) {
	    return null;
	}
	Date date = new Date(time);
	Format format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
	return format.format(date);
    }

    public String decodeUrl(String url) throws UnsupportedEncodingException {
	return URLDecoder.decode(url, "UTF-8");
    }
}