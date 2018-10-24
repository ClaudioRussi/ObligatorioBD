/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriobd;

import java.util.Date;

/**
 *
 * @author Agustín
 */
public class Evento {
    public static int id = 0;
    private int idEvento;
    private int idUsuario;
    private String descripcion;
    private boolean esMensual;
    private boolean esAnual;
    private Date fechaCreacion;
    private Date fecha;
    private String tipo;
    
    public Evento(int IDUsuario, String descripcion, boolean esMensual, boolean esAnual, Date fecha, String tipo) {
        this.idEvento = Insumo.id++;
        this.idUsuario = IDUsuario;
        this.descripcion = descripcion;
        this.esMensual = esMensual;
        this.esAnual = esAnual;
        this.fecha = fecha;
        this.tipo = tipo; 
        
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Evento.id = id;
    }

    public int getIDEvento() {
        return idEvento;
    }

    public void setIDEvento(int IDEvento) {
        this.idEvento = IDEvento;
    }

    public int getIDUsuario() {
        return idEvento;
    }

    public void setIDUsuario(int IDUsuario) {
        this.idEvento = IDUsuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEsMensual() {
        return esMensual;
    }

    public void setEsMensual(boolean esMensual) {
        this.esMensual = esMensual;
    }

    public boolean isEsAnual() {
        return esAnual;
    }

    public void setEsAnual(boolean esAnual) {
        this.esAnual = esAnual;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
