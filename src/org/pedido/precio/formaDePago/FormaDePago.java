/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pedido.precio.formaDePago;



/**
 *
 * @author Notebook4
 */
public class FormaDePago{
    private String tarjetaPlastico;
    private String documentoComercial;
    private String efectivo;
    private FormaDePago formaDePago;

    public FormaDePago(String tarjetaPlastico, String documentoComercial, String efectivo, FormaDePago formaDePago) {
        this.tarjetaPlastico = tarjetaPlastico;
        this.documentoComercial = documentoComercial;
        this.efectivo = efectivo;
        this.formaDePago = formaDePago;
    }

    public String getTarjetaPlastico() {
        return tarjetaPlastico;
    }

    public void setTarjetaPlastico(String tarjetaPlastico) {
        this.tarjetaPlastico = tarjetaPlastico;
    }

    public String getDocumentoComercial() {
        return documentoComercial;
    }

    public void setDocumentoComercial(String documentoComercial) {
        this.documentoComercial = documentoComercial;
    }

    public String getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(String efectivo) {
        this.efectivo = efectivo;
    }

    public FormaDePago getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(FormaDePago formaDePago) {
        this.formaDePago = formaDePago;
    }
    
    

}