package com.sofka.taller.ejercicios.ejercicio8;


import javax.swing.*;

public class Day {


    public void isWorkDay(){

        String message = "";

        Weekdays[] weekdays = {Weekdays.LUNES,Weekdays.MARTES,Weekdays.MIERCOLES,Weekdays.JUEVES,Weekdays.VIERNES,
                Weekdays.SABADO,Weekdays.DOMINGO};

        Weekdays option = (Weekdays)JOptionPane.showInputDialog(null, "SELECCIONE UN DIA DE LA SEMANA",
                "MENU", JOptionPane.QUESTION_MESSAGE, null,
                weekdays,
                weekdays[0]);

        switch (option){

            case LUNES:
            case MARTES:
            case MIERCOLES:
            case JUEVES:
            case VIERNES:
                message = "Es un dia laboral, a trabajar con toda la actidud";
                break;
            case SABADO:
            case DOMINGO:
                message = "Es un dia de descanso, a disfrutar";
        }

        JOptionPane.showMessageDialog (null,message, "ES UN DIA LABORAL ?",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
