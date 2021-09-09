package com.sofka.taller.ejercicios.ejercicio11;

import javax.swing.*;

public class Vowel {

    static char[] vocals = {'a','e','i','o','u'};

    public void showVowelsAndLength(String text){
        verifyIfExistVowel(text);
    }


    private void verifyIfExistVowel(String text){

        int quantityVocals = 0;

        String textWithoutSpaces = text.replace(" ","");

        char[] ch = textWithoutSpaces.toCharArray();

        for (char letter : ch){
            if (isVowel(letter)){
                quantityVocals++;
            }
        }

        String textMessageLength = "La longitud de la palabra ingresada es de "
                + textWithoutSpaces.length() + " caracteres";

        JOptionPane.showMessageDialog (null,textMessageLength, "LONGITUD DEL MENSAJE",
                JOptionPane.INFORMATION_MESSAGE);

        String quantityVowelsMessage = "La frase contiene " + quantityVocals + " vocales";

        JOptionPane.showMessageDialog (null,quantityVowelsMessage, "VOCALES EN EL MENSAJE",
                JOptionPane.INFORMATION_MESSAGE);

    }

    private static boolean isVowel(char letter){

        for (char vocal : vocals) {
            if (vocal == letter) {
                return true;
            }
        }
        return false;
    }

}
