/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriobd;

import java.util.LinkedList;

/**
 *
 * @author Agustín
 */
public class Reunion {
        
    public static int id = 0;
    private int IDReunion;
    private int IDUsuarioCreador;
    private boolean estaActiva;
    private String horaInicio;
    private String horaFin;
    private LinkedList integrantes = new LinkedList();
    
    public Reunion(String horaInicio, String horaFin, int IDUsuarioCreador){
        IDReunion = Reunion.id++;
        this.IDUsuarioCreador = IDUsuarioCreador;        
        this.integrantes.add(this);
    }
    
    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Reunion.id = id;
    }

    public int getIDReunion() {
        return IDReunion;
    }

    public void setIDReunion(int IDReunion) {
        this.IDReunion = IDReunion;
    }

    public int getIDUsuarioCreador() {
        return IDUsuarioCreador;
    }

    public void setIDUsuarioCreador(int IDUsuarioCreador) {
        this.IDUsuarioCreador = IDUsuarioCreador;
    }

    public boolean isEstaActiva() {
        return estaActiva;
    }

    public void setEstaActiva(boolean estaActiva) {
        this.estaActiva = estaActiva;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public LinkedList getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(LinkedList integrantes) {
        this.integrantes = integrantes;
    }
    
}
