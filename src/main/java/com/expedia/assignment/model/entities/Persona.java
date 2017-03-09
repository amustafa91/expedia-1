package com.expedia.assignment.model.entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Mazen H. Khalil
 */
@XmlRootElement(name = "persona")
public class Persona {

    @XmlElement(name = "personaType")
    private String personaType;

    public String getPersonaType() {
	return personaType;
    }

    public void setPersonaType(String personaType) {
	this.personaType = personaType;
    }
}