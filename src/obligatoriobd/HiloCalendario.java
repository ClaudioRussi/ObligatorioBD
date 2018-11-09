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

    public HiloCalendario(ArrayList<Evento> events){
        eventos = events;
    }
    
    @Override
    public void run() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        
       // Evento.buscarEventosAPartirDeFecha(cal.getTime(), eventos);
               
    }
    
}
