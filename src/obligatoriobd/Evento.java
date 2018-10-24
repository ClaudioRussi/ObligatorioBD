/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriobd;

/**
 *
 * @author Agustín
 */
public class Evento {
    public static int id = 0;
    private int IDEvento;
    private int IDUsuario;
    private String descripcion;
    private boolean esMensual;
    private boolean esAnual;
    private String fechaCreacion;
    private String fecha;
    private String tipo;
    
    public Evento(int IDUsuario, String descripcion, boolean esMensual, boolean esAnual, String fecha, String tipo) {
        this.IDEvento = Insumo.id++;
        this.IDUsuario = IDUsuario;
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
        return IDEvento;
    }

    public void setIDEvento(int IDEvento) {
        this.IDEvento = IDEvento;
    }

    public int getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
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

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
