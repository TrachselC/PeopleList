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
@Named(value = "peopleBean")
@RequestScoped
public class PeopleBean extends Person{
    
    
    @Inject
    Services service;
    
    private Person personToDelete;
    /**
     * Creates a new instance of PeopleAddBean
     */
    public PeopleBean() {
        super();
    }

    public Services getService() {
        return service;
    }

    public void setService(Services service) {
        this.service = service;
    }

    public Person getPersonToDelete() {
        return personToDelete;
    }

    public void setPersonToDelete(Person personToDelete) {
        this.personToDelete = personToDelete;
    }
    
    public String addPerson(){
        service.savePerson(this.getGender(), this.getFirstName(), this.getLastName(), this.getMarried(), this.getBirthDate());
        return "index.xhtml";
    }
    
    public String deletePerson(){
        service.deletePerson(personToDelete);
        return "index.xhtml";
    }
    
}
