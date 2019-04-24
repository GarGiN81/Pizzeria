/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizza.variedadPizza;

/**
 *
 * 
 */
public class VariedadPizza {
    private int numeroVariedad;
    private String nombreVariedad;
    private int tamanioVariedad;
    private String tipoVariedad;
    
    public VariedadPizza(int numeroVariedad, String nombreVariedad, int tamañoVariedad, String tipoVariedad) {
        this.numeroVariedad = numeroVariedad;
        this.nombreVariedad = nombreVariedad;
        this.tamanioVariedad = tamañoVariedad;
        this.tipoVariedad = tipoVariedad;
    }

    public class Ingrediente{
        public Ingrediente ingrediente = new Ingrediente();
        /* Relación de agregación entre variedad pizza e Ingrediente;
        en este caso Variedad Pizza llama a Ingrediente
        */
    }
    public int getNumeroVariedad() {
        return numeroVariedad;
    }

    public void setNumeroVariedad(int numeroVariedad) {
        this.numeroVariedad = numeroVariedad;
    }

    public String getNombreVariedad() {
        return nombreVariedad;
    }

    public void setNombreVariedad(String nombreVariedad) {
        this.nombreVariedad = nombreVariedad;
    }

    public int getTamañoVariedad() {
        return tamanioVariedad;
    }

    public void setTamanioVariedad(int tamanioVariedad) {
        this.tamanioVariedad = tamanioVariedad;
    }

    public String getTipoVariedad() {
        return tipoVariedad;
    }

    public void setTipoVariedad(String tipoVariedad) {
        this.tipoVariedad = tipoVariedad;
    }

  
}
