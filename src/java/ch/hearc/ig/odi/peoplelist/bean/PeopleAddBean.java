/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.peoplelist.bean;

import ch.hearc.ig.odi.peoplelist.service.Services;
import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author chloe.trachsel
 */
@Named(value = "peopleAddBean")
@RequestScoped
public class PeopleAddBean{
    
    private String gender;
    private String firstName;
    private String lastName;
    private Boolean married;
    private Date birthDate;
    
    @Inject
    Services service;
    
    /**
     * Creates a new instance of PeopleAddBean
     */
    public PeopleAddBean() {
    }

    public String getGender() {
        return gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Boolean getMarried() {
        return married;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Services getService() {
        return service;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setService(Services service) {
        this.service = service;
    }
    
    public String addPerson(){
        service.savePerson(gender, firstName, lastName, married, birthDate);
        return "index.xhtml";
    }
    
}
