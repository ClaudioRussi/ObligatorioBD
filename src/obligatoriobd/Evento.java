/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriobd;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Agustín
 */
public class Evento {
    
    
    static String url = "jdbc:postgresql://192.168.56.1:5432/BD2018-1";
    static String usuario = "postgres"; 
    static String contrasenia = "test123";
    static DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    
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
    
    static public void buscarEventosAPartirDeFecha(Date fecha, ArrayList<Evento> eventos){
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, usuario, contrasenia);
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "SELECT * FROM evento WHERE fecha >= "+ dateFormat.format(fecha);
            ResultSet result = st.executeQuery(sql);
            while(result.next()){
                eventos.add(new Evento(result.getInt("id_usuario"), result.getString("descripcion"), result.getBoolean("es_mensual"),result.getBoolean("es_anual"), result.getDate("fecha"), result.getString("tipo")));
            }
            result.close();
            st.close();
            conexion.close();
        }catch (Exception e){
            System.out.println("ERROR DE CONEXION" + e.getMessage());
            
        }
    }
    
    static public Evento buscarEventoPorId(int id){
        Evento evento = null;
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, usuario, contrasenia);
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "SELECT * FROM evento WHERE id = " + id;
            ResultSet result = st.executeQuery(sql);
            if(result != null){
                evento = (new Evento(result.getInt("id_usuario"), result.getString("descripcion"), result.getBoolean("es_mensual"),result.getBoolean("es_anual"), result.getDate("fecha"), result.getString("tipo")));
            }
            result.close();
            st.close();
            conexion.close();
        }catch (Exception e){
            System.out.println("ERROR DE CONEXION" + e.getMessage());
            
        }
        return evento;
    }
}
