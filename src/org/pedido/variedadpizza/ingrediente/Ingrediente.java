/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pedido.variedadpizza.ingrediente;




/**
 *
 * @author Notebook4
 */
public class Ingrediente{
    private String conTacc;
    private String sinTacc;
    private String disponibilidad;

    public Ingrediente(String conTacc, String sinTacc, String disponibilidad) {
        this.conTacc = conTacc;
        this.sinTacc = sinTacc;
        this.disponibilidad = disponibilidad;
    }

    public String getConTacc() {
        return conTacc;
    }

    public void setConTacc(String conTacc) {
        this.conTacc = conTacc;
    }

    public String getSinTacc() {
        return sinTacc;
    }

    public void setSinTacc(String sinTacc) {
        this.sinTacc = sinTacc;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

   
    
    
}
