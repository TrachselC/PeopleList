/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.peoplelist.bean;

import ch.hearc.ig.odi.peoplelist.service.Services;
import java.io.Serializable;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author chloe.trachsel
 */
@Named(value = "peopleListBean")
@SessionScoped
public class PeopleListBean implements Serializable{

    @Inject Services services;
    /**
     * Creates a new instance of PeopleListBean
     */
    public PeopleListBean() {
    }

    public List getPeopleList() {
        return services.getPeopleList();
    }
    
}
