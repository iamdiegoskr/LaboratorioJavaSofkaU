package com.sofka.taller.ejercicios.ejercicio9;

import java.util.Locale;

public class Text {

    public String replaceText(String textUser){

        String myText = "La sonrisa sera la mejor arma contra la tristeza";

        return myText.replace("a","e").concat(" ").concat(textUser).toLowerCase();

    }


}
