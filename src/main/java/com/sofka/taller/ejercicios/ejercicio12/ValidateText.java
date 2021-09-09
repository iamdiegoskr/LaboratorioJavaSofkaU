package com.sofka.taller.ejercicios.ejercicio12;

import org.apache.commons.lang3.StringUtils;

public class ValidateText {

    public String showDifferenceTexts(String text1, String text2){

        if(text1.equalsIgnoreCase(text2)){
            return text1 + " y " + text2 + " son iguales";
        }else{
            return "PALABRAS DIFERENTES\n" +
                    "Palabra 1 => " + text1 + "\n" +
                    "Palabra 2 => " + text2 + "\n" +
                    "Diferencias en  -> " + StringUtils.difference(text1,text2);
        }
    }
}
