/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pedido.detalle_pedido;

import java.math.BigDecimal;
import org.pedido.estado_pedido.EstadoPedido;
import org.pizza.pizza.Pizza;

/**
 *
 * @author ewiedermann
 */
public class DetallePedido {
    private int numeroPedido;
    private int cantidad;
    private BigDecimal precio;
    private Pizza pizza;
    private EstadoPedido estado;
    
    public DetallePedido(){
        
    }

    public DetallePedido(int numeroPedido, int cantidad, BigDecimal precio, Pizza pizza, EstadoPedido estado) {
        this.numeroPedido = numeroPedido;
        this.cantidad = cantidad;
        this.precio = precio;
        this.pizza = pizza;
        this.estado = estado;
    }
    /**
 * CalcTotalItem: calcula el total según el ítem.
 * Propiedad "multiply": suma por fila y calcula el total de la columna.
 * return precio...(cantidad): multiplica la cantidad por el precio y suma el total.
 * @return 
 */
    public BigDecimal calcTotalItem(){
        return precio.multiply(new BigDecimal(cantidad));
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }
    
    
}
