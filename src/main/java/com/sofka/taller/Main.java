package com.sofka.taller;

import com.sofka.taller.ejercicios.ejercicios1y2.Numbers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);

        Numbers numbers = new Numbers();

        //Ejercio 1

        int numberOne = 9;
        int numberTwo = 7;

        System.out.println(numbers.biggerNumber(numberOne,numberTwo));

        //Ejercio 2

        System.out.println("Ingrese un numero");
        int number1 = lea.nextInt();

        System.out.println("Ingrese otro numero");
        int number2 = lea.nextInt();


        System.out.println(numbers.biggerNumber(number1,number2));

    }

}
