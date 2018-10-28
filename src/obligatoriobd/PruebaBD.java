/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriobd;
import java.sql.*;
public class PruebaBD {
   public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:postgresql://192.168.56.1:5432/BD2018-1";
        String usuario = "postgres"; 
        String contrasenia = "test123";
        
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, usuario, contrasenia);
            java.sql.Statement st = conexion.createStatement();
            
            String sql
                    = "SELECT id, nombre, descripcion FROM insumo";
            ResultSet result = st.executeQuery(sql);
            while(result.next()){
                String id = result.getString("id");
                String nombre = result.getString("nombre");
                String desc = result.getString("descripcion");
                System.out.println("ID: " + id + " NOMBRE: " + nombre + " DESCRIPCION: " + desc);
            }
            result.close();
            st.close();
            conexion.close();
        }catch (Exception e){
            System.out.println("ERROR DE CONEXION" + e.getMessage());
            
        }
    }
    
}
