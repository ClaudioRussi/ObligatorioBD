/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriobd;

import java.sql.*;
import java.util.ArrayList;

public class ObligatorioBD {
    static String url = "jdbc:postgresql://192.168.56.1:5432/BD2018-1";
    static String usuario = "postgres"; 
    static String contrasenia = "test123";
    
    static Usuario usuarioLoggeado;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Evento> eventos = new ArrayList();
        
        /*Usuario user0 = new Usuario("nom1","pas21");
        Usuario user1 = new Usuario("nom2", "pas21");
        Usuario user2 = new Usuario("nom3", "pas21");
        System.out.println(user0.getId());
        System.out.println(user1.getId());
        Reunion reu0 = user0.crearReunion("askjd", "skjda");
        System.out.println(reu0.getIDReunion());
        System.out.println(reu0.getIDUsuarioCreador());
        System.out.println(reu0.getIntegrantes().size());
        user0.agregarAReunion(user1, reu0);
        System.out.println(reu0.getIntegrantes().size());
        //cambios para el git
        
        //Esto es todo una mie**caca pure
        
        Thread calendario = new Thread(new HiloCalendario(eventos));
        calendario.start();*/
        
        
         
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, usuario, contrasenia);
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "SELECT MAX(id) FROM usuario;";
            ResultSet result = st.executeQuery(sql);
            if(result != null){
                Usuario.id = result.getInt("id");
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
        
        System.out.println("Id cargado, id actual es: "+Usuario.id+".\n");
        
        VentanaSesion vent = new VentanaSesion();
        vent.setVisible(true);
        
                
    }
    
}
