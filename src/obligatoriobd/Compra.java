/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriobd;

import java.sql.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Claudio Russi
 */




public class Compra {
    
    static String url = "jdbc:postgresql://192.168.56.1:5432/BD2018-1";
    static String PG_usuario = "postgres"; 
    static String PG_contrasenia = "test123";
    //AA/MM/DD
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    
    static int id = 0;
    
    int idUsuario;
    int idInsumo;
    int precioCompra;
    Date fecha;
    int cantidadComprada;
    int idCompra;

    
    public Compra(int idUsuario, int idInsumo, int precioCompra, Date fecha, int cantidadComprada){
        this.idCompra = id;
        id++;
        this.idUsuario = idUsuario;
        this.idInsumo = idInsumo;
        this.precioCompra = precioCompra;
        this.fecha = fecha;
        this.cantidadComprada = cantidadComprada;
    }
    public Compra(int idUsuario, int idInsumo, int precioCompra, Date fecha, int cantidadComprada, int idCompra){
        this.idCompra = idCompra;
        this.idUsuario = idUsuario;
        this.idInsumo = idInsumo;
        this.precioCompra = precioCompra;
        this.fecha = fecha;
        this.cantidadComprada = cantidadComprada;
    }
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public int getIdInsumo() {
        return idInsumo;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getCantidadComprada() {
        return cantidadComprada;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setIdInsumo(int idInsumo) {
        this.idInsumo = idInsumo;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCantidadComprada(int cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }
    
    public Compra buscarCompraPorIds(int idCompra){
        Compra compra = null;
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, PG_usuario, PG_contrasenia);
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "SELECT * FROM compra WHERE id_insumo = " + idCompra + ";" ;
            ResultSet result = st.executeQuery(sql);
            while(result.next()){
                compra = (new Compra(result.getInt("id_usuario"), result.getInt("id_insumo"), result.getInt("precio_compra") ,result.getDate("fecha"), result.getInt("precio_compra"), result.getInt("idCompra")));
            }
            result.close();
            st.close();
            conexion.close();
        }catch (Exception e){
            System.out.println("ERROR DE CONEXION" + e.getMessage());
            
        }
        return compra;
    }
    
    public void Save(){
        System.out.println(dtf.parse(new Date().toString()));
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, PG_usuario, PG_contrasenia);
            java.sql.Statement st = conexion.createStatement();
            String insertion = "INSERT INTO compra VALUES ("+this.idUsuario+" ,"+this.idInsumo+", "+this.precioCompra+", '"+ dtf.parse(this.fecha.toString()) +"', "+this.cantidadComprada+", "+ this.idCompra+");";
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
        System.out.println(dtf.parse(new Date().toString()));
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, PG_usuario, PG_contrasenia);
            java.sql.Statement st = conexion.createStatement();
            String insertion = "UPDATE compra SET id_usuario = "+this.idUsuario+", id_insumo = "+this.idInsumo+", precio_compra = "+this.precioCompra+", fecha = '"+ dtf.parse(this.fecha.toString()) +"', cantidad_comprada =  "+this.cantidadComprada+" WHERE id_compra = "+ this.idCompra +";";
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
            String Update = "DELETE FROM compra WHERE id_compra = "+ this.idCompra +";";
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
