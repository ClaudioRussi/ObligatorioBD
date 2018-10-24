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
public class ObligatorioBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario user0 = new Usuario("nom1");
        Usuario user1 = new Usuario("nom2");
        System.out.println(user0.getId());
        System.out.println(user1.getId());
        Reunion reu0 = user0.crearReunion("askjd", "skjda");
        System.out.println(reu0.getIDReunion());
        System.out.println(reu0.getIDUsuarioCreador());
        System.out.println(reu0.getIntegrantes().size());
        user0.agregarAReunion(user1, reu0);
        System.out.println(reu0.getIntegrantes().size());
        //cambios para el git
    }
    
}
