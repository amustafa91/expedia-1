package com.expedia.assignment.view;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 * This class is responsible to converting the a date value to a proper date
 * format
 * 
 * @author Mazen H. Khalil
 */
@FacesConverter(value = "stringDateConverter")
public class StringDateConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
	return value;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
	if (value == null) {
	    return null;
	}
	return value.toString();
    }
}