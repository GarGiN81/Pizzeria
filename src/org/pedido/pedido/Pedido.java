/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pedido.pedido;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.pedido.detalle_pedido.DetallePedido;
import org.pedido.estado_pedido.EstadoPedido;
import org.factura.factura.Factura;
import org.pedido.tiempo.Tiempo;
import org.persona.cliente.Cliente;
import org.pizza.variedadPizza.VariedadPizza;

/**
 *
 * @author ewiedermann
 */
public class Pedido {
    private Date fechaHoraCreacion;
    private Date fechaHoraEntrega;
    private Cliente cliente;
    private int numero;
    private List<DetallePedido> detallesPedido;
    private Tiempo tiempo;

    public Pedido(Date fechaHoraCreacion, Date fechaHoraEntrega, Cliente cliente, int numero, List<DetallePedido> detallesPedido, Tiempo tiempo) {
        this.fechaHoraCreacion = fechaHoraCreacion;
        this.fechaHoraEntrega = fechaHoraEntrega;
        this.cliente = cliente;
        this.numero = numero;
        this.detallesPedido = detallesPedido;
        this.tiempo = tiempo;
    }

    public Date getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }

    public void setFechaHoraCreacion(Date fechaHoraCreacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
    }

    public Date getFechaHoraEntrega() {
        return fechaHoraEntrega;
    }

    public void setFechaHoraEntrega(Date fechaHoraEntrega) {
        this.fechaHoraEntrega = fechaHoraEntrega;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<DetallePedido> getDetallesPedido() {
        return detallesPedido;
    }

    public void setDetallesPedido(List<DetallePedido> detallesPedido) {
        this.detallesPedido = detallesPedido;
    }

    public Tiempo getTiempo() {
        return tiempo;
    }

    public void setTiempo(Tiempo tiempo) {
        this.tiempo = tiempo;
    }

    public VariedadPizza getVariedadPizza() {
        return variedadPizza;
    }

    public void setVariedadPizza(VariedadPizza variedadPizza) {
        this.variedadPizza = variedadPizza;
    }
    private VariedadPizza variedadPizza;
    
 
    }

    
   
    
    /**
     * DetallePeddo = clase
     * detalle = objeto
     * detallesPedido = atributo
     * total.add = enlista
     * BigDecimal.Zero = instancia en 0
     * @return
     */
   
    
    
