/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.persona.empleado;

import org.persona.persona.Persona;

/**
 *
 * @author Notebook4
 */
public class Empleado extends Persona{
    private String cvEmpleado;

    public Empleado(String cvEmpleado, String nombre, String apellido, int telefono, String direccion, int cuil) {
        super( nombre, apellido, telefono, direccion, cuil);
        this.cvEmpleado = cvEmpleado;
    }

    public String getCvEmpleado() {
        return cvEmpleado;
    }

    public void setCvEmpleado(String cvEmpleado) {
        this.cvEmpleado = cvEmpleado;
    }

   
    }
    
