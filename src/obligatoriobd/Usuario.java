/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriobd;

import java.sql.*;
import java.util.Date;

/**
 *
 * @author Agustín
 */
public class Usuario {
    
    static String url = "jdbc:postgresql://192.168.56.1:5432/BD2018-1";
    static String PG_usuario = "postgres"; 
    static String PG_contrasenia = "test123";
    
    Boolean RegisterError = false;
    static Boolean LogInError = false;
    
    public static int id = 0;
    private int idUsuario;
    private String username;
    private Date ultimaConexion;
    private String contrasenia;
    
    public Usuario(String username, String contrasenia){
        id++;
        idUsuario = Usuario.id;
        this.username = username;
        this.contrasenia = contrasenia;
    }    
    
    private Usuario(String username, int id, Date ultimaConexion, String contrasenia){
        idUsuario = id;
        this.username = username;
        this.ultimaConexion = ultimaConexion;
        this.contrasenia = contrasenia;
    }

    public Integer getId() {
        return idUsuario;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuername() {
        return username;
    }

    public void setUsuername(String usuername) {
        this.username = usuername;
    }

    public Date getUltimaConexion() {
        return ultimaConexion;
    }

    public void setUltimaConexion(Date ultimaConexion) {
        this.ultimaConexion = ultimaConexion;
    }
    
    public Reunion crearReunion(String horaInicio, String horaFin){
        return new Reunion(horaInicio, horaFin, this.idUsuario);
    }
    
    public void agregarAReunion(Usuario usuario, Reunion reunion/*int IDUsuario, int IDReunion*/){
        //obtener la reunion a partir de su id y lo mismo con usuario
        reunion.getIntegrantes().add(usuario);
    }
    
    public Evento crearEvento(String descripcion, boolean esMensual, boolean esAnual, Date fecha, String tipo){
        //obtener fecha del momento para fechaCreacion
        String fechaCreacion = null;
        return new Evento(this.idUsuario, descripcion, esMensual, esAnual, fecha, tipo);
    }
    
    public Usuario buscarUserPorId(int id){
        Usuario user = null;
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, PG_usuario, PG_contrasenia);
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "SELECT * FROM usuario WHERE id = " + id;
            ResultSet result = st.executeQuery(sql);
            while(result.next()){
                user = (new Usuario(result.getString("username"), result.getInt("id_usuario"), result.getDate("ultima_conexion"), result.getString("contrasenia")));
            }
            result.close();
            st.close();
            conexion.close();
        }catch (Exception e){
            System.out.println("ERROR DE CONEXION" + e.getMessage());
            
        }
        return user;
    }
    
    public void Save(){
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, PG_usuario, PG_contrasenia);
            java.sql.Statement st = conexion.createStatement();
            String insertion = "INSERT INTO usuario VALUES ("+this.idUsuario+" ,'"+this.username+"', "+this.ultimaConexion+", '"+ this.contrasenia +"');";
            st.executeUpdate(insertion);
            st.close();
            conexion.close();
            RegisterError = false;
        }catch (SQLException e){
            System.out.println("ERROR DE CONEXION " + e.getMessage());
            RegisterError = true;
            
        }
        catch(ClassNotFoundException e){
            System.out.println("ERROR AL CARGAR LA CLASE "+ e.getMessage());
            RegisterError = true;
        }
    }
    
    public void Update(){
         try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, PG_usuario, PG_contrasenia);
            java.sql.Statement st = conexion.createStatement();
            String Update = "UPDATE usuario SET username = '"+this.username+"', ultima_conexion = "+this.ultimaConexion+ ", contrasenia = '"+ this.contrasenia +"' WHERE id_usuario = "+ this.idUsuario +";";
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
            Connection conexion = DriverManager.getConnection(url, PG_usuario, PG_contrasenia);
            java.sql.Statement st = conexion.createStatement();
            String Update = "DELETE FROM usuario WHERE id_usuario = "+ this.idUsuario+";";
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
    
    public static Usuario LogIn(String username, String password){
        Usuario user = null;
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, PG_usuario, PG_contrasenia);
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "SELECT * FROM usuario WHERE username = '" + username + "' AND contrasenia = '"+password+"';";
            ResultSet result = st.executeQuery(sql);
            while(result.next()){
                user = (new Usuario(result.getString("username"), result.getInt("id_usuario"), result.getDate("ultima_conexion"), result.getString("contrasenia")));
            }
            result.close();
            st.close();
            conexion.close();
            Usuario.LogInError = false;
        }catch (SQLException e){
            System.out.println("ERROR DE CONEXION " + e.getMessage());
            Usuario.LogInError = true;
        }
        catch(ClassNotFoundException e){
            System.out.println("ERROR AL CARGAR LA CLASE "+ e.getMessage());
            Usuario.LogInError = true;
        }
        return user;
    }
}
