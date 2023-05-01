/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.web.rest;

import org.springframework.validation.BindingResult;

/**
 *
 * @author Dell
 */
public class MethodeArgumentNotValidException extends Exception {

    public MethodeArgumentNotValidException(Object object, BindingResult bindingResults) {
    }

    MethodeArgumentNotValidException(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
