package com.sofka.taller.ejercicios.ejercicio13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateNow {

    public String checkCurrentDate(){

        String currentDateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());

        return "La fecha actual es -> " + currentDateTime;

    }

}
