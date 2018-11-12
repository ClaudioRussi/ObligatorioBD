/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriobd;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Agustín
 */
public class Reunion {
        
    static boolean errorAlGuardar = false;
    public static int id = 0;
    private int idReunion;
    private int idUsuarioCreador;
    private String nombre;
    private boolean estaActiva;
    private String horaInicio;
    private String horaFin;
    private LinkedList integrantes = new LinkedList();
    
    public Reunion(String nombre,String horaInicio, String horaFin, int IDUsuarioCreador){
        id++;
        idReunion = id;
        this.idUsuarioCreador = IDUsuarioCreador;        
        this.integrantes.add(this);
        this.nombre = nombre;
    }
    
    public Reunion(int id, String nombre,String horaInicio, String horaFin, int IDUsuarioCreador){
        this.idReunion = id;
        this.idUsuarioCreador = IDUsuarioCreador;        
        this.integrantes.add(this);
        this.nombre = nombre;
    }
    
    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Reunion.id = id;
    }

    public int getIDReunion() {
        return idReunion;
    }

    public void setIDReunion(int IDReunion) {
        this.idReunion = IDReunion;
    }

    public int getIDUsuarioCreador() {
        return idUsuarioCreador;
    }

    public void setIDUsuarioCreador(int IDUsuarioCreador) {
        this.idUsuarioCreador = IDUsuarioCreador;
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
    
    static public void buscarReunionesPorUsuario(ArrayList<Reunion> reuniones, int idUsuario){
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(ObligatorioBD.url, ObligatorioBD.usuario, ObligatorioBD.contrasenia);
            java.sql.Statement st = conexion.createStatement();
            //Toda las reuniones a las que pertenece el usuario
            String sql = "SELECT reunion.id_reunion, reunion.nombre, reunion.id_creador\n" +
"                   FROM reunion, usuario, usuario_reunion \n" +
"                   WHERE usuario_reunion.id_usuario = usuario.id_usuario\n" +
"                   AND usuario_reunion.id_reunion = reunion.id_reunion\n" +
"                   AND usuario_reunion.id_usuario ="+idUsuario+"\n AND usuario_reunion.confirmo_invitacion = true" +
"                   UNION\n" +
                    "SELECT reunion.id_reunion, reunion.nombre, reunion.id_creador\n" +
                    "FROM reunion\n" +
                    "WHERE id_creador = "+idUsuario+"\n" +
                    "";
            ResultSet result = st.executeQuery(sql);
            while(result.next()){
                reuniones.add(new Reunion(result.getInt("id_reunion"),result.getString("nombre"),null,
                        null, result.getInt("id_creador")));
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

    public void Delete(){
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(ObligatorioBD.url, ObligatorioBD.usuario, 
                    ObligatorioBD.contrasenia);
            java.sql.Statement st = conexion.createStatement();
            String Update = "DELETE FROM reunion WHERE id_reunion = "+ this.idReunion+";";
            st.executeUpdate(Update);
            st.close();
            conexion.close();
        }catch (SQLException e){
            System.out.println("ERROR DE CONEXION " + e.getMessage());
        }
        catch(ClassNotFoundException e){
            System.out.println("ERROR AL GUARDAR LA CLASE "+ e.getMessage());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public void Save(){
        Integer verdaderoIdReunion;
        if(idReunion != -1){
            verdaderoIdReunion = idReunion;
        } else{
            verdaderoIdReunion = null;
        }
        
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(ObligatorioBD.url, ObligatorioBD.usuario, 
                    ObligatorioBD.contrasenia);
            java.sql.Statement st = conexion.createStatement();
            String insertion = "INSERT INTO reunion VALUES ("+this.idReunion+", "+ false +", "
                    +"null, null, "+ this.idUsuarioCreador+ ", '" + this.nombre +"');";
            //TEST
            System.out.println("VA INSERCION");
            System.out.println(insertion);
            //
            st.executeUpdate(insertion);
            st.close();
            conexion.close();
            errorAlGuardar = false;
        }catch (SQLException e){
            System.out.println("ERROR DE CONEXION " + e.getMessage());
            errorAlGuardar = true;
        }
        catch(ClassNotFoundException e){
            System.out.println("ERROR AL GUARDAR LA CLASE "+ e.getMessage());
            errorAlGuardar = true;
        }
       
    }
    
    public static boolean verificarGestion (int idUser, int idReunion){
        int idUs = -1;
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(ObligatorioBD.url, ObligatorioBD.usuario, ObligatorioBD.contrasenia);
            java.sql.Statement st = conexion.createStatement();
            
            //Toda las reuniones a las que pertenece el usuario
            String sql = "SELECT * FROM gestiona WHERE gestiona.id_usuario = "+idUser
                    +" AND gestiona.id_reunion = "+ idReunion;
            ResultSet result = st.executeQuery(sql);
            while(result.next()){
                idUs = result.getInt("id_usuario");
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
        
        return idUs == idUser;
    }
    
    
    
}
