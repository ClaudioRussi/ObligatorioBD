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

//Pago (idPago, precio, fecha, idUsuario, idReunion)
public class Pago {
    int idPago;
    int precio;
    Date fecha;
    int idUsuario;
    int idReunion;
    
    public Pago(int idPago, int precio, Date fecha, int idUsuario, int idReunion){
        this.idPago = idPago;
        this.fecha = fecha;
        this.precio = precio;
        this.idUsuario = idUsuario;
        this.idReunion = idReunion;
    }

    public int getIdPago() {
        return idPago;
    }

    public int getPrecio() {
        return precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public int getIdReunion() {
        return idReunion;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setIdReunion(int idReunion) {
        this.idReunion = idReunion;
    }
    
    
}
