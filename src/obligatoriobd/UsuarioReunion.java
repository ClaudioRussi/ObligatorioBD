package obligatoriobd;

import java.util.ArrayList;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Claudio Russi
 */

//Usuario/Reunion (idUsuario, idReunion, confirmoInvitacion)

public class UsuarioReunion {
    int idUsuario;
    int idReunion;
    boolean confirmoInvitacion;
    private String nombreReunion;
    private String nombreCreador;
    
    static boolean errorAlGuardar;
    static String url = "jdbc:postgresql://192.168.56.1:5432/BD2018-1";
    static String usuario = "postgres"; 
    static String contrasenia = "test123";
    
    public UsuarioReunion(int idUsuario, int idReunion, boolean confirmoInvitacion){
        this.idReunion = idReunion;
        this.idUsuario = idUsuario;
        this.confirmoInvitacion = confirmoInvitacion;
    }
    
    public UsuarioReunion(int idUsuario, int idReunion, boolean confirmoInvitacion, String nombreReunion,
            String nombreCreador){
        this.idReunion = idReunion;
        this.idUsuario = idUsuario;
        this.confirmoInvitacion = confirmoInvitacion;
        this.nombreReunion = nombreReunion;
        this.nombreCreador = nombreCreador;
    }
    
    public static ArrayList<UsuarioReunion> buscarInvitacionesNoAceptadas(int idUsuario){
        ArrayList<UsuarioReunion> invitaciones = new ArrayList();
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, usuario, contrasenia);
            java.sql.Statement st = conexion.createStatement();
           
           //HACIENDO REUNION CON LAS OTRAS TABLAS PARA OBTENER DATOS AMIGABLES AL USUARIO
           String sql = "SELECT usuario_reunion.id_usuario, usuario_reunion.id_reunion, confirmo_invitacion, username, nombre FROM usuario_reunion, usuario, reunion WHERE usuario_reunion.id_usuario = usuario.id_usuario AND usuario_reunion.id_reunion = reunion.id_reunion AND usuario_reunion.id_usuario = " + idUsuario 
                   +" AND confirmo_invitacion = false";
            ResultSet result = st.executeQuery(sql);
            while(result.next()){
                invitaciones.add(new UsuarioReunion(result.getInt("id_usuario"), result.getInt("id_reunion"), 
                        result.getBoolean("confirmo_invitacion"), result.getString("username"),result.getString("nombre")));
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
        
        return invitaciones;
    }
    
    public static void aceptarInvitacion(int idUsuario, int idReunion){
         try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, usuario,contrasenia);
            java.sql.Statement st = conexion.createStatement();
            
            String insertion = "UPDATE usuario_reunion SET confirmo_invitacion = true WHERE " +
                    "id_usuario = " + idUsuario+" AND id_reunion = "+idReunion;
            //TEST
            System.out.println("VA UPDATE");
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
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public int getIdReunion() {
        return idReunion;
    }

    public boolean isConfirmoInvitacion() {
        return confirmoInvitacion;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setIdReunion(int idReunion) {
        this.idReunion = idReunion;
    }

    public void setConfirmoInvitacion(boolean confirmoInvitacion) {
        this.confirmoInvitacion = confirmoInvitacion;
    }

    public String getNombreReunion() {
        return nombreReunion;
    }

    public void setNombreReunion(String nombreReunion) {
        this.nombreReunion = nombreReunion;
    }

    public String getNombreCreador() {
        return nombreCreador;
    }

    public void setNombreCreador(String nombreCreador) {
        this.nombreCreador = nombreCreador;
    }
    
    
    
}
