/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import org.pedido.pedido.Pedido;
import org.persona.persona.Persona;
import org.reporte.Reporte;

/**
 *
 * @author Garrido_Gisela
 */
public class Pizzeria {
    private int cuit;
    private String direccion;
    private int telefono;
    private Persona cuilPersona;
    private Pedido numeroPedido;
    private Reporte reporte;
    

    public Pizzeria(int cuit, String direccion, int telefono, Persona cuilPersona, Pedido numeroPedido) {
        this.cuit = cuit;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cuilPersona = cuilPersona;
        this.numeroPedido = numeroPedido;
        
    }

    public Reporte getReporte() {
        return reporte;
    }

    public void setReporte(Reporte reporte) {
        this.reporte = reporte;
    }

    public Pizzeria(Reporte reporte) {
        this.reporte = reporte;
    }
     
    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Persona getCuilPersona() {
        return cuilPersona;
    }

    public void setCuilPersona(Persona cuilPersona) {
        this.cuilPersona = cuilPersona;
    }

    public Pedido getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(Pedido numeroPedido) {
        this.numeroPedido = numeroPedido;
    }
    
      public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
