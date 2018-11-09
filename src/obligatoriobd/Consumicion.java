/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriobd;

/**
 *
 * @author Claudio Russi
 */

import java.sql.*;
public class Consumicion {
    
    static boolean errorAlGuardar;
    static String url = "jdbc:postgresql://192.168.56.1:5432/BD2018-1";
    static String PG_usuario = "postgres"; 
    static String PG_contrasenia = "test123";
    
    static int id = 0;
    int idConsumicion;
    int idUsuario;
    int idInsumo;
    int cantidadConsumida;

    public Consumicion(int idUsuario, int idInsumo, int cantidadConsumida) {
        id++;
        this.idConsumicion = id;
        this.idUsuario = idUsuario;
        this.idInsumo = idInsumo;
        this.cantidadConsumida = cantidadConsumida;
    }

    public Consumicion(int idConsumicion, int idUsuario, int idInsumo, int cantidadConsumida) {
        this.idConsumicion = idConsumicion;
        this.idUsuario = idUsuario;
        this.idInsumo = idInsumo;
        this.cantidadConsumida = cantidadConsumida;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdInsumo() {
        return idInsumo;
    }

    public void setIdInsumo(int idInsumo) {
        this.idInsumo = idInsumo;
    }

    public int getCantidadConsumida() {
        return cantidadConsumida;
    }

    public void setCantidadConsumida(int cantidadConsumida) {
        this.cantidadConsumida = cantidadConsumida;
    }
    
    public Consumicion buscarConsumicionPorId(int idConsumicion){
        Consumicion cons = null;
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, PG_usuario, PG_contrasenia);
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "SELECT * FROM compra WHERE id_insumo = " + idConsumicion + ";" ;
            ResultSet result = st.executeQuery(sql);
            while(result.next()){
                cons = (new Consumicion(result.getInt("id_consumicion"), result.getInt("id_usuario"), result.getInt("id_insumo"), result.getInt("cantidad_consumida")));
            }
            result.close();
            st.close();
            conexion.close();
        }catch (Exception e){
            System.out.println("ERROR DE CONEXION" + e.getMessage());
            
        }
        return cons;
    }
    
    public void Save(){
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, PG_usuario, PG_contrasenia);
            java.sql.Statement st = conexion.createStatement();
            String insertion = "INSERT INTO Consumicion VALUES ("+this.idInsumo+" ,"+this.idUsuario+", "+this.cantidadConsumida+", "+ this.idConsumicion+");";
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
            String insertion = "UPDATE consumicion SET id_usuario = "+this.idUsuario+", id_insumo = "+this.idInsumo+", precio_consumicion = "+this.cantidadConsumida+" WHERE id_consumicion = "+ this.idConsumicion +";";
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
            String Update = "DELETE FROM consumicion WHERE id_consumicion = "+ this.idConsumicion +";";
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
