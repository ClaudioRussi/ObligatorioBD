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
public class Insumo {
    
    public static int id = 0;
    private int idInsumo;
    private String nombre;
    private String descripcion;
    
    public Insumo(String nombre, String descripcion) {
        idInsumo = Insumo.id++;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Insumo.id = id;
    }

    public int getIDInsumo() {
        return idInsumo;
    }

    public void setIDInsumo(int IDInsumo) {
        this.idInsumo = IDInsumo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
