/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.peoplelist.bean;

import javax.inject.Named;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.ValidatorException;
import ch.hearc.ig.odi.peoplelist.business.Person;
import ch.hearc.ig.odi.peoplelist.service.Services;
import javax.inject.Inject;

/**
 *
 * @author chloe.trachsel
 */
@Named(value = "validationBean")
@FacesValidator
public class ValidationBean implements javax.faces.validator.Validator{
    @Inject Services services;
    /**
     * Creates a new instance of ValidationBean
     */
    public ValidationBean() {
    }

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        // A IMPLEMENTER            
            
    }
    
}
