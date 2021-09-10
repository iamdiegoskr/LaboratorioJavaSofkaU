package com.sofka.taller;

import com.sofka.taller.ejercicios.ejercicio10.SpaceText;
import com.sofka.taller.ejercicios.ejercicio11.Vowel;
import com.sofka.taller.ejercicios.ejercicio12.ValidateText;
import com.sofka.taller.ejercicios.ejercicio13.DateNow;
import com.sofka.taller.ejercicios.ejercicio14.Numbers2;
import com.sofka.taller.ejercicios.ejercicio15.Cinematographic;
import com.sofka.taller.ejercicios.ejercicio16.Person;
import com.sofka.taller.ejercicios.ejercicio16.Validations;
import com.sofka.taller.ejercicios.ejercicio3.Circle;
import com.sofka.taller.ejercicios.ejercicio4.Product;
import com.sofka.taller.ejercicios.ejercicio5.EvenOdd;
import com.sofka.taller.ejercicios.ejercicio6.EvenAddWithFor;
import com.sofka.taller.ejercicios.ejercicio7.NumberZero;
import com.sofka.taller.ejercicios.ejercicio8.Day;
import com.sofka.taller.ejercicios.ejercicio9.Text;
import com.sofka.taller.ejercicios.ejercicios1y2.Numbers;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);

        DecimalFormat df2 = new DecimalFormat("#.##");

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

                        JOptionPane.showMessageDialog (null, result, "Comparar numeros",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 2:

                        int numberOne = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                        int numberTwo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));

                        Numbers numbers2 = new Numbers();
                        String resultNumber = numbers2.biggerNumber(numberOne,numberTwo);

                        JOptionPane.showMessageDialog (null, resultNumber, "Comparar numeros",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 3 :

                        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo "));

                        Circle circle = new Circle();
                        double areaCircle = circle.calculateAreaCircle(radio);

                        String response = "El area del circulo es de  " + df2.format(areaCircle) + " metros cuadrados";

                        JOptionPane.showMessageDialog (null,response, "Comparar numeros",
                                JOptionPane.INFORMATION_MESSAGE);

                        break;
                    case 4:

                        String nameProduct = JOptionPane.showInputDialog("Ingrese nombre del producto");
                        double price = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio del producto"));

                        Product product = new Product();

                        String responseIVA = product.responsePriceIvA(nameProduct,price);

                        JOptionPane.showMessageDialog (null,responseIVA, "Productos con iva",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 5:

                        EvenOdd evenOdd = new EvenOdd();

                        String resultNumbersPair = evenOdd.generateNumberPair();

                        JOptionPane.showMessageDialog (null,resultNumbersPair, "NUMEROS PARES DEL 1 AL 100",
                                JOptionPane.INFORMATION_MESSAGE);


                        String resultNumbersOdd = evenOdd.generateNumberOdd();

                        JOptionPane.showMessageDialog (null,resultNumbersOdd, "NUMEROS IMPARES DEL 1 AL 100",
                                JOptionPane.INFORMATION_MESSAGE);

                        break;
                    case 6:

                        EvenAddWithFor evenAddWithFor = new EvenAddWithFor();

                        evenAddWithFor.isOddOrEven();

                        String resultNumberEven = evenAddWithFor.getNumbersEven();
                        String resultNumberOdd2 = evenAddWithFor.getNumberOdd();

                        JOptionPane.showMessageDialog (null,resultNumberEven, "NUMEROS PARES DEL 1 AL 100",
                                JOptionPane.INFORMATION_MESSAGE);

                        JOptionPane.showMessageDialog (null,resultNumberOdd2, "NUMEROS IMPARES DEL 1 AL 100",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 7:

                        NumberZero numberZero = new NumberZero();

                        String responseNumberZero = numberZero.validateIfNumberIsZero();

                        JOptionPane.showMessageDialog (null,responseNumberZero, "NUMERO MAYOR A 0",
                                JOptionPane.INFORMATION_MESSAGE);

                        break;
                    case 8:

                        Day day = new Day();
                        day.isWorkDay();

                        break;
                    case 9:

                        Text text = new Text();

                        String textUser = JOptionPane.showInputDialog("Ingrese una frase");

                        String resultText = text.replaceText(textUser);

                        JOptionPane.showMessageDialog (null,resultText, "TEXTO REEMPLAZADO",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 10:

                        SpaceText spaceText = new SpaceText();

                        String textToRemoveSpace = JOptionPane.showInputDialog("Ingrese un mensaje");

                        String responseTextWithoutSpaces = spaceText.removeSpaceText(textToRemoveSpace);

                        JOptionPane.showMessageDialog (null,responseTextWithoutSpaces, "TEXTO SIN ESPACIOS",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 11:

                        Vowel vowel = new Vowel();

                        String messageUser = JOptionPane.showInputDialog("Ingrese un mensaje");

                        vowel.showVowelsAndLength(messageUser);

                        break;
                    case 12:

                        ValidateText validateText = new ValidateText();

                        String wordDifference1 = JOptionPane.showInputDialog("Ingrese una palabra");
                        String wordDifference2 = JOptionPane.showInputDialog("Ingrese otra palabra para comparar");

                        String responseDifference = validateText.showDifferenceTexts(wordDifference1,wordDifference2);

                        JOptionPane.showMessageDialog (null,responseDifference, "DIFERENCIAS ENTRE TEXTOS",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 13:

                        DateNow dateNow = new DateNow();

                        String currentDate = dateNow.checkCurrentDate();

                        JOptionPane.showMessageDialog (null,currentDate, "DIFERENCIAS ENTRE TEXTOS",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 14:

                        Numbers2 sequenceNumber = new Numbers2();

                        int numberStart = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero no mayor a 1000"));

                        String sequence = sequenceNumber.printNumbers(numberStart);

                        System.out.println(sequence);

                        break;
                    case 15:

                        Cinematographic cinematographic = new Cinematographic();

                        cinematographic.cinematographyMenu();
                        break;
                    case 16:

                        try{

                            Validations validations = new Validations();

                            ArrayList<Person> allPersons=new ArrayList<Person>();

                            //Persona 1
                            JOptionPane.showMessageDialog (null,"PERSONA 1 INGRESAR DATOS",
                                    "LLENAR FORMULARIO",
                                    JOptionPane.INFORMATION_MESSAGE);
                            String name =  JOptionPane.showInputDialog("Ingrese su nombre");
                            int age = validations.validateAge(Integer.parseInt(
                                    JOptionPane.showInputDialog("Ingrese su edad")
                            ));
                            String gender = JOptionPane.
                                    showInputDialog("Ingrese su genero H.Hombre o M.Mujer").toUpperCase();
                            double weight = Double.
                                    parseDouble(JOptionPane.showInputDialog("Ingrese su peso en kg"));
                            double height = Double.
                                    parseDouble(JOptionPane.showInputDialog("Ingrese su altura en cm"));

                            Person person1 = new Person(name,age,gender.charAt(0),weight,height);
                            allPersons.add(person1);

                            //Persona 2
                            JOptionPane.showMessageDialog (null,"PERSONA 2 INGRESAR DATOS",
                                    "LLENAR FORMULARIO",
                                    JOptionPane.INFORMATION_MESSAGE);

                            String name2 =  JOptionPane.showInputDialog("Ingrese su nombre");
                            int age2 = validations.validateAge(Integer.parseInt(
                                    JOptionPane.showInputDialog("Ingrese su edad")
                            ));
                            String gender2 = JOptionPane.
                                    showInputDialog("Ingrese su genero H.Hombre o M.Mujer").toUpperCase();

                            Person person2 = new Person(name2,age2,gender2.charAt(0));
                            allPersons.add(person2);



                            //Persona 3
                            Person person3 = new Person();
                            person3.setName("Messi");
                            person3.setAge(34);
                            person3.setGender('H');
                            person3.setWeight(68);
                            person3.setHeight(170);

                            allPersons.add(person3);



                            for (Person person : allPersons){

                                //Indicar si su peso es ideal o no
                                if(person.calculateIMC()==-1){
                                    String message = person.getName() + " tienes buen indice de peso";
                                    JOptionPane.showMessageDialog (null,message,
                                            "INDICE DE MASA CORPORAL",
                                            JOptionPane.INFORMATION_MESSAGE);
                                }else if(person.calculateIMC()==0){
                                    String message = person.getName() + " estas por debajo de tu peso ideal";
                                    JOptionPane.showMessageDialog (null,message,
                                            "INDICE DE MASA CORPORAL",
                                            JOptionPane.INFORMATION_MESSAGE);
                                }else{
                                    String message = person.getName() + " tienes sobrepeso, cuidate";
                                    JOptionPane.showMessageDialog (null,message,
                                            "INDICE DE MASA CORPORAL",
                                            JOptionPane.INFORMATION_MESSAGE);
                                }

                                //Indicar si es mayor de edad

                                if(person.isAdult()){
                                    String message = person.getName() + " eres mayor de edad";
                                    JOptionPane.showMessageDialog (null,message,
                                            "ERES MAYOR DE EDAD?",
                                            JOptionPane.INFORMATION_MESSAGE);
                                }else {
                                    String message = person.getName() + " eres menor de edad";
                                    JOptionPane.showMessageDialog (null,message,
                                            "ERES MAYOR DE EDAD?",
                                            JOptionPane.INFORMATION_MESSAGE);
                                }

                            }


                            for (Person person : allPersons){
                                JOptionPane.showMessageDialog (null,person.toString(),
                                        "ERES MAYOR DE EDAD?",
                                        JOptionPane.INFORMATION_MESSAGE);
                            }



                        }catch (Exception e){
                            JOptionPane.showMessageDialog(null, e.getMessage(),
                                    "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
                        }
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
