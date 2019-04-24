/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.factura.factura;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.factura.estado_factura.EstadoFactura;
import org.pedido.detalle_pedido.DetallePedido;

/**
 *
 * @author ewiedermann
 */
public class Factura {
    private Date fechaHoraEmision;
    private long numero;
    private EstadoFactura estadoFactura;
    private List<DetallePedido> detallesPedido;
    
    public Factura(){
        detallesPedido = new ArrayList();
    }

    public Factura(Date fechaHoraEmision, long numero, EstadoFactura estadoFactura, List<DetallePedido> detallesPedido) {
        this.fechaHoraEmision = fechaHoraEmision;
        this.numero = numero;
        this.estadoFactura = estadoFactura;
        this.detallesPedido = detallesPedido;
    }

    public Date getFechaHoraEmision() {
        return fechaHoraEmision;
    }

    public void setFechaHoraEmision(Date fechaHoraEmision) {
        this.fechaHoraEmision = fechaHoraEmision;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public EstadoFactura getEstadoFactura() {
        return estadoFactura;
    }

    public void setEstadoFactura(EstadoFactura estadoFactura) {
        this.estadoFactura = estadoFactura;
    }

    public List<DetallePedido> getDetallesPedido() {
        return detallesPedido;
    }

    public void setDetallesPedido(List<DetallePedido> detallesPedido) {
        this.detallesPedido = detallesPedido;
    }
    
    
}
