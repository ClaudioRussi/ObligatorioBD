/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriobd;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Claudio Russi
 */

//Pago (idPago, precio, fecha, idUsuario, idReunion)
public class Pago {
    int idPago;
    int precio;
    Calendar fecha;
    int idUsuario;
    int idReunion;
    boolean aceptado = false;
    static public int ID = 0;
    static boolean errorAlGuardar = false;
    
    public Pago(int precio, Calendar fecha, int idUsuario, int idReunion, boolean aceptado){
        ID++;
        this.idPago = ID;
        this.fecha = fecha;
        this.precio = precio;
        this.idUsuario = idUsuario;
        this.idReunion = idReunion;
        this.aceptado = aceptado;
    }
    
    public Pago(int idPago, int precio, Calendar fecha, int idUsuario, int idReunion, boolean aceptado){
        this.idPago = idPago;
        this.fecha = fecha;
        this.precio = precio;
        this.idUsuario = idUsuario;
        this.idReunion = idReunion;
        this.aceptado = aceptado;
    }

    public boolean isAceptado() {
        return aceptado;
    }

    public void setAceptado(boolean aceptado) {
        this.aceptado = aceptado;
    }

    public int getIdPago() {
        return idPago;
    }

    public int getPrecio() {
        return precio;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public int getIdReunion() {
        return idReunion;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setIdReunion(int idReunion) {
        this.idReunion = idReunion;
    }
    
    public void Save(){
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(ObligatorioBD.url, ObligatorioBD.usuario, ObligatorioBD.contrasenia);
            java.sql.Statement st = conexion.createStatement();
            String insertion = "INSERT INTO pago VALUES ("+this.idPago+" ,"+this.precio+", '"
                    +Herramientas.ConvertirCalendarAString(fecha)+"', "+ this.idUsuario +", "
                    +this.idReunion+ ", " + this.aceptado +");";
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
    
    static void buscarPagosPorReunion(int idReunion, ArrayList<Pago> pagos){
        Compra compra = null;
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(ObligatorioBD.url, ObligatorioBD.usuario, ObligatorioBD.contrasenia);
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "SELECT * FROM pago WHERE id_reunion = " + idReunion;
            ResultSet result = st.executeQuery(sql);
            while(result.next()){
                Calendar fecha = Calendar.getInstance();
                fecha.setTimeInMillis(result.getTimestamp("fecha").getTime());
                pagos.add(new Pago(result.getInt("id_pago"),result.getInt("precio"),fecha,result.getInt("id_usuario"),result.getInt("id_reunion"),result.getBoolean("aceptado")));
            }
            result.close();
            st.close();
            conexion.close();
        }catch (Exception e){
            System.out.println("ERROR DE CONEXION" + e.getMessage());
            
        }
    }
    
    void Update(){
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion =  DriverManager.getConnection(ObligatorioBD.url, ObligatorioBD.usuario, ObligatorioBD.contrasenia);
            java.sql.Statement st = conexion.createStatement();
            String insertion = "UPDATE pago SET aceptado = "+ this.aceptado +" WHERE id_pago ="+ this.idPago;
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
    
    void Delete(){
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(ObligatorioBD.url, ObligatorioBD.usuario, ObligatorioBD.contrasenia);
            java.sql.Statement st = conexion.createStatement();
            String Update = "DELETE FROM pago WHERE id_pago ="+this.idPago;
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
