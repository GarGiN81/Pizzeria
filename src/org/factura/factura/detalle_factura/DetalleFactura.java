/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.factura.factura.detalle_factura;


import java.util.Date;
import java.util.List;
import org.factura.estado_factura.EstadoFactura;
import org.factura.factura.Factura;
import org.pedido.detalle_pedido.DetallePedido;


/**
 *
 * @author Notebook4
 */
public class DetalleFactura extends Factura{
  

    public DetalleFactura() {
       
        
        
        
    }

    public DetalleFactura(Date fechaHoraEmision, long numero, EstadoFactura estadoFactura, List<DetallePedido> detallesPedido) {
        super(fechaHoraEmision, numero, estadoFactura, detallesPedido);
    }
    
    
}
