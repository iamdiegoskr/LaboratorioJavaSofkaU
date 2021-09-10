package com.sofka.taller.ejercicios.ejercicio16;

import javax.swing.*;

public class Validations {

    public int validateAge(int age){
        if(age<0 || age>200){

            age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una edad validad : "));
            validateAge(age);
        }
        return age;
    }

}
