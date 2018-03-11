/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.speranza;

import org.beanio.types.TypeConversionException;
import org.beanio.types.TypeHandler;


public class DoubleCustomTypeHandlerImpl implements TypeHandler{

    @Override
    public Object parse(String text) throws TypeConversionException {
        if(text == null) {
            return null;
        }
        
        String value = text.replace(".", ",");
        return Double.valueOf(value);
    }

    @Override
    public String format(Object value) {
        Double valore = ((Double)value);
        if(valore == null) {
            return null;
        }
        return String.valueOf(valore).replace(".", ",");
    }

    @Override
    public Class<?> getType() {
        return Double.class;
    }
    
}
