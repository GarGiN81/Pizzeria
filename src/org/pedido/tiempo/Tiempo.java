/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pedido.tiempo;

import java.sql.Time;


/**
 *
 * @author Notebook4
 */
public class Tiempo{
   private Time tiempoCoccion;
   

    public Tiempo(Time tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    public Time getTiempoCoccion() {
        return tiempoCoccion;
    }

    public void setTiempoCoccion(Time tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }
  
   

   
  
   
}
