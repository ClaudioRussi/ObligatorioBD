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
public class Usuario {
    
    public static int id = 0;
    private int IDUsuario;
    private String usuername;
    private String ultimaConexion;
    
    public Usuario(String username){
        IDUsuario = Usuario.id++;
        this.usuername = username;
    }    

    public Integer getId() {
        return IDUsuario;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuername() {
        return usuername;
    }

    public void setUsuername(String usuername) {
        this.usuername = usuername;
    }

    public String getUltimaConexion() {
        return ultimaConexion;
    }

    public void setUltimaConexion(String ultimaConexion) {
        this.ultimaConexion = ultimaConexion;
    }
    
    public Reunion crearReunion(String horaInicio, String horaFin){
        return new Reunion(horaInicio, horaFin, this.IDUsuario);
    }
    
    public void agregarAReunion(Usuario usuario, Reunion reunion/*int IDUsuario, int IDReunion*/){
        //obtener la reunion a partir de su id y lo mismo con usuario
        reunion.getIntegrantes().add(usuario);
    }
}
