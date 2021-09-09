package com.sofka.taller;

import com.sofka.taller.ejercicios.ejercicio1.Exercise1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int number1 = lea.nextInt();

        System.out.println("Ingrese otro numero");
        int number2 = lea.nextInt();

        Exercise1 exercise1 = new Exercise1();
        System.out.println(exercise1.biggerNumber(number1,number2));

    }

}
