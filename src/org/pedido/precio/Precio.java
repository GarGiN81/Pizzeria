/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pedido.precio;

/**
 *
 * @author Notebook4
 */
public class Precio {
    private float precioVariedad;
    private float precioPedido;

    public Precio(float precioVariedad, float precioPedido) {
        this.precioVariedad = precioVariedad;
        this.precioPedido = precioPedido;
    }

  
   public class Pedido{
       public Pedido pedido = new Pedido ();
       
       }

    public float getPrecioVariedad() {
        return precioVariedad;
    }

    public void setPrecioVariedad(float precioVariedad) {
        this.precioVariedad = precioVariedad;
    }

    public float getPrecioPedido() {
        return precioPedido;
    }

    public void setPrecioPedido(float precioPedido) {
        this.precioPedido = precioPedido;
    }
   
   }


