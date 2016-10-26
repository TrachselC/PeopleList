/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.peoplelist.bean;

import ch.hearc.ig.odi.peoplelist.business.Person;
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
public class PeopleAddBean extends Person{
    
    
    @Inject
    Services service;
    
    /**
     * Creates a new instance of PeopleAddBean
     */
    public PeopleAddBean() {
    }

    public Services getService() {
        return service;
    }

    public void setService(Services service) {
        this.service = service;
    }
    
    public String addPerson(){
        service.savePerson(this.getGender(), this.getFirstName(), this.getLastName(), this.getMarried(), this.getBirthDate());
        return "index.xhtml";
    }
    
}
