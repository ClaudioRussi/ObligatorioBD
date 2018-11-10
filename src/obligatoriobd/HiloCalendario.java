/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriobd;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Claudio Russi
 */

public class HiloCalendario implements Runnable {
    
    ArrayList<Evento> eventos;
    int sleepTime = 60000;
    public HiloCalendario(ArrayList<Evento> events){
        eventos = events;
    }
    
    @Override
    public void run() {
        while (true){
            Calendar calAhora = Calendar.getInstance();
            Calendar calMinutoAntes = Calendar.getInstance();
            calMinutoAntes.add(Calendar.MINUTE, -1);
            Evento.buscarEventosDeUsuarioEntreFechas(calMinutoAntes, 10 ,ObligatorioBD.usuarioLoggeado.getId(), eventos); 
            for(Evento evnt : eventos){
                if((evnt.getFecha().getTimeInMillis() - calAhora.getTimeInMillis()) <= 60000){
                    VentanaNotificaciones vtn = new VentanaNotificaciones(evnt);
                    vtn.setVisible(true);
                }
            }
            Thread.sleep(sleepTime);
        }
             
    }
    
}
