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

import java.sql.*;
import java.util.ArrayList;

public class Insumo {
    static boolean errorAlGuardar;
    static String url = "jdbc:postgresql://192.168.56.1:5432/BD2018-1";
    static String PG_usuario = "postgres"; 
    static String PG_contrasenia = "test123";
    
    public static int id = 0;
    private int idInsumo;
    private String nombre;
    private String descripcion;
    private int cantidad = 0;
    
    public Insumo(int idInsumo, String nombre, String descripcion) {
        this.idInsumo = idInsumo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    public Insumo(String nombre, String descripcion) {
        id++;
        idInsumo = id;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    static public void buscarInsumoPorUsuario(ArrayList<Insumo> insumos, int idUsuario){
        Insumo insumo = null;
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, PG_usuario, PG_contrasenia);
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "SELECT * FROM posee, insumo WHERE id_usuario = " + idUsuario 
                    +" AND insumo.id_insumo = posee.id_insumo AND cantidad_poseida >= 0;";
            ResultSet result = st.executeQuery(sql);
            while(result.next()){
                insumo = (new Insumo(result.getInt("id_insumo"),result.getString("nombre"), result.getString("descripcion")));
                insumo.setCantidad(result.getInt("cantidad_poseida"));
                insumos.add(insumo);
                
            }
            result.close();
            st.close();
            conexion.close();
        }catch (Exception e){
            System.out.println("ERROR DE CONEXION" + e.getMessage());
            
        }
    }
    
    static public void buscarInsumoPorReunion(ArrayList<Insumo> insumos, int idReunion){
        Insumo insumo = null;
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, PG_usuario, PG_contrasenia);
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "SELECT * FROM compra_reunion, insumo WHERE compra_reunion.id_reunion = " + idReunion 
                    +" AND insumo.id_insumo = compra_reunion.id_insumo";
            ResultSet result = st.executeQuery(sql);
            while(result.next()){
                insumo = (new Insumo(result.getInt("insumo.id_insumo"),result.getString("insumo.nombre"), result.getString("insumo.descripcion")));
                insumo.setCantidad(result.getInt("compra_reunion.cantidad_comprada"));
                insumos.add(insumo);
                
            }
            result.close();
            st.close();
            conexion.close();
        }catch (Exception e){
            System.out.println("ERROR DE CONEXION" + e.getMessage());
            
        }
    }
    
    static public void buscarInsumoPorUsuarioYNombre(ArrayList<Insumo> insumos, int idUsuario, String nombre){
        Insumo insumo = null;
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, PG_usuario, PG_contrasenia);
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "SELECT * FROM posee, insumo WHERE id_usuario = " + idUsuario 
                    +" AND insumo.id_insumo = posee.id_insumo AND cantidad_poseida >= 0 AND LOWER(nombre) LIKE '%" + nombre.toLowerCase() + "%';";
            ResultSet result = st.executeQuery(sql);
            while(result.next()){
                insumo = (new Insumo(result.getInt("id_insumo"),result.getString("nombre"), result.getString("descripcion")));
                insumo.setCantidad(result.getInt("cantidad_poseida"));
                insumos.add(insumo);
                
            }
            result.close();
            st.close();
            conexion.close();
        }catch (Exception e){
            System.out.println("ERROR DE CONEXION" + e.getMessage());
            
        }
    }
    static public Insumo buscarInsumoPorId(int ID){
        Insumo insumo = null;
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, PG_usuario, PG_contrasenia);
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "SELECT * FROM Insumo WHERE id_insumo = " + ID +";" ;
            ResultSet result = st.executeQuery(sql);
            while(result.next()){
                insumo = (new Insumo(result.getString("nombre"), result.getString("descripcion")));
            }
            result.close();
            st.close();
            conexion.close();
        }catch (Exception e){
            System.out.println("ERROR DE CONEXION" + e.getMessage());
            
        }
        return insumo;
    }
    
    public void Save(){
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, PG_usuario, PG_contrasenia);
            java.sql.Statement st = conexion.createStatement();
            String insertion = "INSERT INTO insumo VALUES ("+this.idInsumo+", '"+this.nombre+"', '"+this.descripcion+"');";
            st.executeUpdate(insertion);
            st.close();
            conexion.close();
            errorAlGuardar = false;
        }catch (SQLException e){
            System.out.println("ERROR DE CONEXION " + e.getMessage());
            errorAlGuardar = true;
        }
        catch(ClassNotFoundException e){
            System.out.println("ERROR AL CARGAR LA CLASE "+ e.getMessage());
            errorAlGuardar = true;
        }
    }
    
    public void Update(){
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, PG_usuario, PG_contrasenia);
            java.sql.Statement st = conexion.createStatement();
            String insertion = "UPDATE Insumo SET nombre = '"+this.nombre+"', descripcion = '"+this.descripcion+"' WHERE id_insumo = "+ this.idInsumo +";";
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
    
    public void Delete(){
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, PG_usuario, PG_contrasenia);
            java.sql.Statement st = conexion.createStatement();
            String Update = "DELETE FROM insumo WHERE id_insumo = "+ this.idInsumo +";";
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
    
    static public ArrayList<Insumo> buscarInsumosPorNombre(String nombre){
        ArrayList<Insumo> insumos = new ArrayList();
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, PG_usuario, PG_contrasenia);
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "SELECT * FROM insumo WHERE LOWER(nombre) LIKE '%" + nombre.toLowerCase() +"%';" ;
            ResultSet result = st.executeQuery(sql);
            while(result.next()){
                insumos.add(new Insumo(result.getInt("id_insumo"),result.getString("nombre"), result.getString("descripcion")));
            }
            result.close();
            st.close();
            conexion.close();
        }catch (Exception e){
            System.out.println("ERROR DE CONEXION" + e.getMessage());
            
        }
        return insumos;
    }
}
