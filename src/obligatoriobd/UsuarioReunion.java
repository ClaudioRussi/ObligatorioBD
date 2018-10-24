package obligatoriobd;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Claudio Russi
 */

//Usuario/Reunion (idUsuario, idReunion, confirmoInvitacion)

public class UsuarioReunion {
    int idUsuario;
    int idReunion;
    boolean confirmoInvitacion;
    
    public UsuarioReunion(int idUsuario, int idReunion, boolean confirmoInvitacion){
        this.idReunion = idReunion;
        this.idUsuario = idUsuario;
        this.confirmoInvitacion = confirmoInvitacion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public int getIdReunion() {
        return idReunion;
    }

    public boolean isConfirmoInvitacion() {
        return confirmoInvitacion;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setIdReunion(int idReunion) {
        this.idReunion = idReunion;
    }

    public void setConfirmoInvitacion(boolean confirmoInvitacion) {
        this.confirmoInvitacion = confirmoInvitacion;
    }
    
    
}
