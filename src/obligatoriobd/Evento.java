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
        this.idEvento = Evento.id++;
        this.idUsuario = IDUsuario;
        this.descripcion = descripcion;
        this.esMensual = esMensual;
        this.esAnual = esAnual;
        this.fecha = fecha;
        this.tipo = tipo; 
        
    }
    public Evento(int IDEvento, int IDUsuario, String descripcion, boolean esMensual, boolean esAnual, Date fecha, String tipo) {
        this.idEvento = IDEvento;
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
        return idUsuario;
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
    
    static public void buscarEventosPorUsuario(ArrayList<Evento> eventos, int idUsuario){
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, usuario, contrasenia);
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "SELECT * FROM evento WHERE id_usuario = "+ idUsuario;
            ResultSet result = st.executeQuery(sql);
            while(result.next()){
                eventos.add(new Evento(result.getInt("id_evento"), result.getInt("id_usuario"), result.getString("descripcion"), result.getBoolean("es_mensual"),result.getBoolean("es_anual"), result.getDate("fecha"), result.getString("tipo")));
            }
            result.close();
            st.close();
            conexion.close();
        }catch (SQLException e){
            System.out.println("ERROR DE CONEXION " + e.getMessage());
        }
        catch(ClassNotFoundException e){
            System.out.println("ERROR AL CARGAR LA CLASE "+ e.getMessage());
        }
    }

    static public void buscarEventosAPartirDeFecha(Date fecha, ArrayList<Evento> eventos){
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, usuario, contrasenia);
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "SELECT * FROM evento WHERE fecha >= "+ dateFormat.format(fecha);
            ResultSet result = st.executeQuery(sql);
            while(result.next()){
                eventos.add(new Evento(result.getInt("id_evento"), result.getInt("id_usuario"), result.getString("descripcion"), result.getBoolean("es_mensual"),result.getBoolean("es_anual"), result.getDate("fecha"), result.getString("tipo")));
            }
            result.close();
            st.close();
            conexion.close();
        }catch (SQLException e){
            System.out.println("ERROR DE CONEXION " + e.getMessage());
            
        }
        catch(ClassNotFoundException e){
            System.out.println("ERROR AL CARGAR LA CLASE "+ e.getMessage());
        }
    }
    
    static public Evento buscarEventoPorId(int id){
        Evento evento = null;
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, usuario, contrasenia);
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "SELECT * FROM evento WHERE id_evento = " + id;
            ResultSet result = st.executeQuery(sql);
            while(result.next()){
                evento = (new Evento(result.getInt("id_evento"), result.getInt("id_usuario"), result.getString("descripcion"), result.getBoolean("es_mensual"),result.getBoolean("es_anual"), result.getDate("fecha"), result.getString("tipo")));
            }
            result.close();
            st.close();
            conexion.close();
        }catch (SQLException e){
            System.out.println("ERROR DE CONEXION " + e.getMessage());
            
        }
        catch(ClassNotFoundException e){
            System.out.println("ERROR AL CARGAR LA CLASE "+ e.getMessage());
        }
        return evento;
    }
    
    public void Save(){
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, usuario, contrasenia);
            java.sql.Statement st = conexion.createStatement();
            String insertion = "INSERT INTO evento VALUES ("+this.idEvento+", "+this.idUsuario+", '"+this.descripcion+"', "+this.esMensual+", "+this.esAnual+", "+this.fechaCreacion+", "+this.fecha+", '"+this.tipo+")';";
            st.executeUpdate(insertion);
            st.close();
            conexion.close();
        }catch (SQLException e){
            System.out.println("ERROR DE CONEXION " + e.getMessage());
            
        }
        catch(ClassNotFoundException e){
            System.out.println("ERROR AL CARGAR LA CLASE "+ e.getMessage());
        }
    }
    
    public void Update(){
         try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, usuario, contrasenia);
            java.sql.Statement st = conexion.createStatement();
            String Update = "UPDATE evento SET id_usuario = "+this.idUsuario+", descripcion = '"+this.descripcion+"', es_mensual = "+this.esMensual+", es_anual = "+this.esAnual+", fecha_creacion = "+this.fechaCreacion+", fecha = "+this.fecha+", tipo = '"+this.tipo+"' WHERE id = "+ this.idEvento +";";
            st.executeUpdate(Update);
            st.close();
            conexion.close();
        }catch (SQLException e){
            System.out.println("ERROR DE CONEXION " + e.getMessage());
            
        }
        catch(ClassNotFoundException e){
            System.out.println("ERROR AL CARGAR LA CLASE "+ e.getMessage());
        }
    }
    
    public void Delete(){
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, usuario, contrasenia);
            java.sql.Statement st = conexion.createStatement();
            String Update = "DELETE FROM evento WHERE id_evento = "+ this.idEvento+";";
            st.executeUpdate(Update);
            st.close();
            conexion.close();
        }catch (SQLException e){
            System.out.println("ERROR DE CONEXION " + e.getMessage());
            
        }
        catch(ClassNotFoundException e){
            System.out.println("ERROR AL CARGAR LA CLASE "+ e.getMessage());
        }
    }
}
