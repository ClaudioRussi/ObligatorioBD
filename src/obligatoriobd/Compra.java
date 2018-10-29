/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriobd;

import java.util.Date;

/**
 *
 * @author Claudio Russi
 */




public class Compra {
    int idUsuario;
    int idInsumo;
    int precioCompra;
    Date fecha;
    int cantidadComprada;

    
    public Compra(int idUsuario, int idInsumo, int precioCompra, Date fecha, int cantidadComprada){
        this.idUsuario = idUsuario;
        this.idInsumo = idInsumo;
        this.precioCompra = precioCompra;
        this.fecha = fecha;
        this.cantidadComprada = cantidadComprada;
    }
    public int getIdUsuario() {
        return idUsuario;
    }

    public int getIdInsumo() {
        return idInsumo;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getCantidadComprada() {
        return cantidadComprada;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setIdInsumo(int idInsumo) {
        this.idInsumo = idInsumo;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCantidadComprada(int cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }
    
   
     
}
