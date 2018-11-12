/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriobd;

import java.sql.*;

/**
 *
 * @author Claudio Russi
 */
public class CompraReunion {
    public static boolean errorAlGuardar = false;
    private int idInsumo;
    private int idReunion;
    private int idUsuario;
    private int cantidadComprada;
    private int precio;

    public CompraReunion(int idInsumo, int idReunion, int idUsuario, int cantidadComprada, int precio) {
        this.idInsumo = idInsumo;
        this.idReunion = idReunion;
        this.idUsuario = idUsuario;
        this.cantidadComprada = cantidadComprada;
        this.precio = precio;
    }

    public int getIdInsumo() {
        return idInsumo;
    }

    public void setIdInsumo(int idInsumo) {
        this.idInsumo = idInsumo;
    }

    public int getIdReunion() {
        return idReunion;
    }

    public void setIdReunion(int idReunion) {
        this.idReunion = idReunion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getCantidadComprada() {
        return cantidadComprada;
    }

    public void setCantidadComprada(int cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public void Save(){
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(ObligatorioBD.url, ObligatorioBD.usuario, ObligatorioBD.contrasenia);
            java.sql.Statement st = conexion.createStatement();
            String insertion = "INSERT INTO compra_reunion VALUES ("+this.idUsuario+" ,"+this.idReunion+", "
                    +this.idInsumo+", '"+ this.cantidadComprada +"', "
                    +this.precio+");";
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
    
    static public CompraReunion buscarCompra(int idInsumo, int idReunion, int idUsuario){
        CompraReunion compr = null;
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(ObligatorioBD.url, ObligatorioBD.usuario, ObligatorioBD.contrasenia);
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "SELECT * FROM compra_reunion WHERE compra_reunion.id_reunion = " + idReunion +" AND compra_reunion.id_insumo = "+ idInsumo + " AND idUsuario = " + idUsuario ;
            ResultSet result = st.executeQuery(sql);
            while(result.next()){
                compr = new CompraReunion(result.getInt("idInsumo"),result.getInt("idReunion"),result.getInt("idUsuario"),result.getInt("cantidad_comprada"),result.getInt("precio"));
                
            }
            result.close();
            st.close();
            conexion.close();
        }catch (Exception e){
            System.out.println("ERROR DE CONEXION" + e.getMessage());
            
        }
        return compr;
    }
    
    public void Delete(){
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(ObligatorioBD.url, ObligatorioBD.usuario, ObligatorioBD.contrasenia);
            java.sql.Statement st = conexion.createStatement();
            String Update = "DELETE FROM compra_reunion WHERE id_insumo = "+ this.idInsumo + " AND id_usuario = " + this.idUsuario + " AND id_reunion = " + this.idReunion;
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
    
    public void Update(){
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(ObligatorioBD.url, ObligatorioBD.usuario, ObligatorioBD.contrasenia);
            java.sql.Statement st = conexion.createStatement();
            String insertion = "UPDATE compra_reunion SET cantidad_comprada = "+ this.cantidadComprada +", precio = " + this.precio+" WHERE id_insumo = "+ this.idInsumo +" AND id_usuario = "+this.idUsuario+" AND id_reunion = "+this.idReunion ;
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
}
