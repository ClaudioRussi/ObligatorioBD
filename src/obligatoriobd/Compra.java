/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriobd;

import java.sql.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Claudio Russi
 */




public class Compra {
    static boolean errorAlGuardar;
    static String url = "jdbc:postgresql://192.168.56.1:5432/BD2018-1";
    static String PG_usuario = "postgres"; 
    static String PG_contrasenia = "test123";
    //AA/MM/DD
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    
    static int id = 0;
    
    int idUsuario;
    int idInsumo;
    int precioCompra;
    Calendar fecha;
    int cantidadComprada;

    
    public Compra(int idUsuario, int idInsumo, int precioCompra, Calendar fecha, int cantidadComprada){
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

    public Calendar getFecha() {
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

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public void setCantidadComprada(int cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }
    
   static public Compra buscarCompraPorIds(int idCompra){
        Compra compra = null;
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, PG_usuario, PG_contrasenia);
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "SELECT * FROM compra WHERE id_insumo = " + idCompra + ";" ;
            ResultSet result = st.executeQuery(sql);
            while(result.next()){
                Calendar fecha = Calendar.getInstance();
                fecha.setTimeInMillis(result.getTimestamp("fecha").getTime());
                
                compra = (new Compra(result.getInt("id_usuario"), result.getInt("id_insumo"), result.getInt("precio_compra") ,
                        fecha, result.getInt("precio_compra")));
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
            String insertion = "INSERT INTO compra VALUES ("+this.idUsuario+" ,"+this.idInsumo+", "
                    +this.precioCompra+", '"+ dtf.parse(this.fecha.toString()) +"', "
                    +this.cantidadComprada+");";
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
        System.out.println(dtf.parse(new Date().toString()));
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, PG_usuario, PG_contrasenia);
            java.sql.Statement st = conexion.createStatement();
            String insertion = "UPDATE compra SET id_usuario = "+this.idUsuario+", id_insumo = "+
                    this.idInsumo+", precio_compra = "+this.precioCompra+", fecha = '"+
                    Herramientas.ConvertirCalendarAString(fecha) +"', cantidad_comprada =  "+this.cantidadComprada+" WHERE id_usuario ="+
                    idUsuario+",id_insumo ="+ idInsumo + ",fecha =" + Herramientas.ConvertirCalendarAString(fecha);;
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
            String Update = "DELETE FROM compra WHERE id_usuario ="+ idUsuario+",id_insumo ="+ idInsumo + 
                    ",fecha =" + Herramientas.ConvertirCalendarAString(fecha);
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
