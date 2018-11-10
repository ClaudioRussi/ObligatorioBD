/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriobd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import static obligatoriobd.Compra.url;

/**
 *
 * @author Agustín
 */
public class Posee {
    
    private int idInsumo;
    private int idUsuario;
    private int cantidad;
    static public boolean errorAlGuardar = false;

    public int getIdInsumo() {
        return idInsumo;
    }

    public void setIdInsumo(int idInsumo) {
        this.idInsumo = idInsumo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public Posee(int IDInsumo, int IDUsuario, int cantidad){
        this.idInsumo = idInsumo;
        this.idUsuario = idUsuario;
        this.cantidad = cantidad;
    }
    
    static public Posee buscarPoseePorInsumo(int idInsumo, int idUsuario){
            Posee posee = null;
            try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(ObligatorioBD.url, ObligatorioBD.usuario, ObligatorioBD.contrasenia);
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "SELECT * FROM posee WHERE id_insumo = " + idInsumo + " AND id_usuario = " + idUsuario + ";";
            ResultSet result = st.executeQuery(sql);
            while(result.next()){
                posee = new Posee(result.getInt("id_insumo"), result.getInt("id_usuario"), result.getInt("cantidad_poseida"));                
            }
            result.close();
            st.close();
            conexion.close();
        }catch (Exception e){
            System.out.println("ERROR DE CONEXION" + e.getMessage());
            
        }
            return posee;
    }
    
    public void Save(){
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(ObligatorioBD.url, ObligatorioBD.usuario, ObligatorioBD.contrasenia);
            java.sql.Statement st = conexion.createStatement();
            String insertion = "INSERT INTO posee VALUES ("+this.idInsumo+" ,"+this.idUsuario+", "+this.cantidad+") ;";
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
}
