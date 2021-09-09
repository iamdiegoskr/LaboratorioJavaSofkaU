package com.sofka.taller;

import com.sofka.taller.ejercicios.ejercicios1y2.Numbers;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);

        int option = 0;

        do{

            option = Integer.parseInt(JOptionPane.showInputDialog("Desea revisar algun ejercicio ? 1.SI 0.NO"));

            if(option==1){

                int numberExercise = Integer.parseInt(JOptionPane.showInputDialog(printMenu()));

                switch (numberExercise){
                    case 1:

                        int number1 = 9;
                        int number2 = 22;

                        Numbers numbers = new Numbers();
                        String result = numbers.biggerNumber(number1,number2);

                        JOptionPane.showMessageDialog (null, result, "Ejercicio 1",
                                JOptionPane.INFORMATION_MESSAGE);

                        break;
                    case 2:
                        
                        int numberOne = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                        int numberTwo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));

                        Numbers numbers2 = new Numbers();
                        String resultNumber = numbers2.biggerNumber(numberOne,numberTwo);

                        JOptionPane.showMessageDialog (null, resultNumber, "Ejercicio 1",
                                JOptionPane.INFORMATION_MESSAGE);

                        break;
                    case 3 :
                        System.out.println("Revisando ejercicio 3");
                        break;
                    case 4:
                        System.out.println("Revisando ejercicio 4");
                        break;
                    case 5:
                        System.out.println("Revisando ejercicio 5");
                        break;
                    case 6:
                        System.out.println("Revisando ejercicio 6");
                        break;
                    case 7:
                        System.out.println("Revisando ejercicio 7");
                        break;
                    case 8:
                        System.out.println("Revisando ejercicio 8");
                        break;
                    case 9:
                        System.out.println("Revisando ejercicio 9");
                        break;
                    case 10:
                        System.out.println("Revisando ejercicio 10");
                        break;
                    case 11:
                        System.out.println("Revisando ejercicio 11");
                        break;
                    case 12:
                        System.out.println("Revisando ejercicio 12");
                        break;
                    case 13:
                        System.out.println("Revisando ejercicio 13");
                        break;
                    case 14:
                        System.out.println("Revisando ejercicio 14");
                        break;
                    case 15:
                        System.out.println("Revisando ejercicio 15");
                        break;
                    case 16:
                        System.out.println("Revisando ejercicio 16");
                        break;
                    case 17:
                        System.out.println("Revisando ejercicio 17");
                        break;
                    case 18:
                        System.out.println("Revisando ejercicio 18");
                        break;
                    default:
                        System.out.println("Ingrese un valor valido");
                }

            }

        }while (option!=0);

    }

    public static String printMenu(){
        return  "INGRESA EL NUMERO DEL EJERCICIO A REVISAR \n\n" +
                "1. Ejercicio 1\n" +
                "2. Ejercicio 2\n" +
                "3. Ejercicio 3\n" +
                "4. Ejercicio 4\n" +
                "5. Ejercicio 5\n" +
                "6. Ejercicio 6\n" +
                "7. Ejercicio 7\n" +
                "8. Ejercicio 8\n" +
                "9. Ejercicio 9\n" +
                "10.Ejercicio 10\n" +
                "11.Ejercicio 11\n" +
                "12.Ejercicio 12\n" +
                "13.Ejercicio 13\n" +
                "14.Ejercicio 14\n" +
                "15.Ejercicio 15\n" +
                "16.Ejercicio 16\n" +
                "17.Ejercicio 17\n" +
                "18.Ejercicio 18\n" +
                "0.SALIR DEL PROGRAMA";
    }

}
