/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.persona.cocinero;

import org.persona.persona.Persona;



/**
 *
 * @author Notebook4
 */
public class Cocinero extends Persona{
    private String cvCocinero;

    public Cocinero(String cvCocinero, String nombre, String apellido, int telefono, String direccion, int cuil) {
        super(nombre, apellido, telefono, direccion, cuil);
        this.cvCocinero = cvCocinero;
    }

    public String getCvCocinero() {
        return cvCocinero;
    }

    public void setCvCocinero(String cvCocinero) {
        this.cvCocinero = cvCocinero;
    }

    
     

   
    
}
