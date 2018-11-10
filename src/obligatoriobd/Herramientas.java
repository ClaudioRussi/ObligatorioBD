/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriobd;

import java.util.Calendar;

/**
 *
 * @author Claudio Russi
 */
public class Herramientas {
    static String ConvertirCalendarAString(Calendar cal){
        //yyyy/mm/dd hh:mm:ss
        String fecha = ""+ cal.get(Calendar.YEAR)+"/"+(cal.get(Calendar.MONTH)+1) +"/"+cal.get(Calendar.DAY_OF_MONTH)+" "+cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND);
        return fecha;
    }
}
