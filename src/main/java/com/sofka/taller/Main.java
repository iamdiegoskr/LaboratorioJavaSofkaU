package com.sofka.taller;

import com.sofka.taller.ejercicios.ejercicio10.SpaceText;
import com.sofka.taller.ejercicios.ejercicio11.Vowel;
import com.sofka.taller.ejercicios.ejercicio12.ValidateText;
import com.sofka.taller.ejercicios.ejercicio13.DateNow;
import com.sofka.taller.ejercicios.ejercicio14.Numbers2;
import com.sofka.taller.ejercicios.ejercicio15.Cinematographic;
import com.sofka.taller.ejercicios.ejercicio16.Person;
import com.sofka.taller.ejercicios.ejercicio16.Validations;
import com.sofka.taller.ejercicios.ejercicio17.HomeAppliances;
import com.sofka.taller.ejercicios.ejercicio17.Tv;
import com.sofka.taller.ejercicios.ejercicio17.WashingMachine;
import com.sofka.taller.ejercicios.ejercicio18.Serie;
import com.sofka.taller.ejercicios.ejercicio18.VideoGame;
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

                        showMessages(result,"Comparacion de numeros");

                        break;
                    case 2:

                        try {

                            int numberOne = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                            int numberTwo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));

                            Numbers numbers2 = new Numbers();
                            String resultNumber = numbers2.biggerNumber(numberOne,numberTwo);

                            showMessages(resultNumber,"Comparar numeros digitados por usuario");

                        }catch (Exception e){
                            showErrorMessage(e.getMessage());
                        }

                        break;
                    case 3 :

                        try {

                            double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo "));

                            Circle circle = new Circle();
                            double areaCircle = circle.calculateAreaCircle(radio);

                            String response = "El area del circulo es de  " + df2.format(areaCircle) + " metros cuadrados";

                            showMessages(response,"Calcular area del circulo");

                        }catch (Exception e){
                            showErrorMessage("Error debe digitar un numero");
                        }

                        break;
                    case 4:

                        try {

                            String nameProduct = JOptionPane.showInputDialog("Ingrese nombre del producto");
                            double price = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio del producto"));

                            Product product = new Product();

                            String responseIVA = product.responsePriceIvA(nameProduct,price);

                            showMessages(responseIVA,"Productos con iva");

                        }catch (Exception e){
                            showErrorMessage("Error inesperado");
                        }
                        break;
                    case 5:

                        try{
                            EvenOdd evenOdd = new EvenOdd();

                            String resultNumbersPair = evenOdd.generateNumberPair();
                            showMessages(resultNumbersPair,"Numeros pares del 1 al 100");


                            String resultNumbersOdd = evenOdd.generateNumberOdd();
                            showMessages(resultNumbersOdd,"Numeros impares del 1 al 100");

                        }catch (Exception e){
                            showErrorMessage("Error inesperado");
                        }

                        break;
                    case 6:
                        try{
                            EvenAddWithFor evenAddWithFor = new EvenAddWithFor();

                            evenAddWithFor.isOddOrEven();

                            String resultNumberEven = evenAddWithFor.getNumbersEven();
                            String resultNumberOdd2 = evenAddWithFor.getNumberOdd();

                            showMessages(resultNumberEven,"Numeros pares del 1 al 100 utilizando FOR");
                            showMessages(resultNumberOdd2, "Numeros impares del 1 al 100 utilizando FOR");

                        }catch (Exception e){
                            showErrorMessage("Error inesperado");
                        }
                        break;
                    case 7:

                        NumberZero numberZero = new NumberZero();

                        String responseNumberZero = numberZero.validateIfNumberIsZero();

                        showMessages(responseNumberZero,"Numero mayor a cero");

                        break;
                    case 8:

                        Day day = new Day();
                        day.isWorkDay();

                        break;
                    case 9:

                        try{
                            Text text = new Text();

                            String textUser = JOptionPane.showInputDialog("Ingrese una frase");

                            String resultText = text.replaceText(textUser);

                            showMessages(resultText, "Texto reemplazado");

                        }catch (Exception e){
                            showErrorMessage("Error inesperado");
                        }
                        break;
                    case 10:

                        try{
                            SpaceText spaceText = new SpaceText();

                            String textToRemoveSpace = JOptionPane.showInputDialog("Ingrese un mensaje");

                            String responseTextWithoutSpaces = spaceText.removeSpaceText(textToRemoveSpace);

                            showMessages(responseTextWithoutSpaces,"Texto sin espacios");
                        }catch (Exception e){
                            showErrorMessage("Error inesperado");
                        }
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

                        showMessages(responseDifference,"Diferencia entre cadenas");
                        break;
                    case 13:

                        DateNow dateNow = new DateNow();

                        String currentDate = dateNow.checkCurrentDate();

                        showMessages(currentDate,"Fecha actual");
                        break;
                    case 14:

                        try {
                            Numbers2 sequenceNumber = new Numbers2();

                            int numberStart = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero no mayor a 1000"));

                            String sequence = sequenceNumber.printNumbers(numberStart);

                            System.out.println(sequence);

                        }catch (Exception e){
                            showErrorMessage("Error inesperado");
                        }

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
                            showMessages("Persona 1 ingresar datos","Suministro de datos");

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
                            showMessages("Persona 2 ingresar datos","Suministro de datos");

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
                                    showMessages(message,"INDICE MASA CORPORAL");

                                }else if(person.calculateIMC()==0){
                                    String message = person.getName() + " estas por debajo de tu peso ideal";
                                    showMessages(message,"INDICE MASA CORPORAL");
                                }else{
                                    String message = person.getName() + " tienes sobrepeso, cuidate";
                                    showMessages(message,"INDICE MASA CORPORAL");
                                }

                                //Indicar si es mayor de edad

                                if(person.isAdult()){
                                    String message = person.getName() + " eres mayor de edad";
                                    showMessages(message,"ERES MAYOR DE EDAD ?");
                                }else {
                                    String message = person.getName() + " eres menor de edad";
                                    showMessages(message,"ERES MAYOR DE EDAD ?");
                                }

                            }

                            for (Person person : allPersons){
                                showMessages(person.toString(),"INFORMACION DETALLA DE USUARIOS");
                            }

                        }catch (Exception e){
                            showErrorMessage(e.getMessage());
                        }
                        break;
                    case 17:
                        try {
                            double priceAllHomeAppliances = 0;
                            double priceAllWashingMachine = 0;
                            double priceAllTvs = 0;

                            //Creamos electrodomesticos generales
                            HomeAppliances homeAppliances1 = new HomeAppliances(100,"negro",
                                    'D',50);
                            HomeAppliances homeAppliances2 = new HomeAppliances();
                            HomeAppliances homeAppliances3 = new HomeAppliances(200,80);

                            //Creamos Lavadoras
                            WashingMachine washingMachine = new WashingMachine(200,
                                    "morado",'X',40,30);
                            WashingMachine washingMachine1 = new WashingMachine();
                            WashingMachine washingMachine2 = new WashingMachine(300,120);


                            //Televisores
                            Tv tv = new Tv(50,"gris",'B',120,80,true);
                            Tv tv1 = new Tv(70,95);
                            Tv tv2 = new Tv();
                            Tv tv3 = new Tv(40,"amarillo",'C',100,30,false);


                            HomeAppliances []allProducts = {homeAppliances1,homeAppliances2,homeAppliances3,
                                    washingMachine,washingMachine1,washingMachine2,tv,tv1,tv2,tv3};


                            for (HomeAppliances e: allProducts) {
                                if(e instanceof HomeAppliances ){
                                    priceAllHomeAppliances+=e.getPriceFinal();
                                }
                                if (e instanceof  WashingMachine){
                                    priceAllWashingMachine+=e.getPriceFinal();
                                }
                                if(e instanceof  Tv){
                                    priceAllTvs+=e.getPriceFinal();
                                }
                            }

                            double priceTotalToPay = priceAllHomeAppliances + priceAllWashingMachine + priceAllTvs;

                            String priceTotalHomeAppliances = "El precio de todos los electrodomesticos generales " +
                                    " es de : " + priceAllHomeAppliances;

                            String priceTotalWashingMachine = "El precio de todas las " +
                                    "lavadoras es de : " + priceAllWashingMachine;

                            String priceTotalTv = "EL precio de todos los televisores es de : " + priceAllTvs;

                            showMessages(priceTotalHomeAppliances,"ELECTRODOMESTICOS");
                            showMessages(priceTotalWashingMachine,"LAVADORAS");
                            showMessages(priceTotalTv,"TELEVISORES");
                            showMessages("El precio total es de $ " + priceTotalToPay, "PRECIO FINAL");

                        }catch (Exception e){
                            showErrorMessage("Error inesperado");
                        }
                        break;
                    case 18:

                        try {

                            Serie serie1 = new Serie();
                            Serie serie2 = new Serie("Dark","Baran bo Odar");
                            Serie serie3 = new Serie("Stranger things",3, "Science fiction", "Hermanos Duffer");
                            Serie serie4 = new Serie("Peaky Blinders",6, "Crime", "Steven Knight");
                            Serie serie5 = new Serie("La casa de papel","Alex Pina");

                            Serie[] allSeries ={serie1, serie2, serie3, serie4, serie5};

                            VideoGame videoGame1 = new VideoGame();
                            VideoGame videoGame2 = new VideoGame("Grand Theft Auto V",500);
                            VideoGame videoGame3 = new VideoGame("FIFA 21",1000,
                                    "Sports"," Electronic Arts");
                            VideoGame videoGame4 = new VideoGame("Spider-Man",100,"adventure","Insomniac Games");
                            VideoGame videoGame5 = new VideoGame("Halo 2",200);

                            VideoGame[] allVideoGames={videoGame1, videoGame2, videoGame3, videoGame4, videoGame5};

                            allSeries[2].deliver();
                            allSeries[3].deliver();
                            allSeries[4].deliver();

                            allVideoGames[2].deliver();
                            allVideoGames[3].deliver();
                            allVideoGames[4].deliver();


                            int quantityDelivered=0;
                            for (Serie s: allSeries) {
                                if (s.isDelivered()){
                                    quantityDelivered+=1;
                                    s.toReturn();
                                }
                            }
                            for (VideoGame v: allVideoGames) {
                                if (v.isDelivered()){
                                    quantityDelivered+=1;
                                    v.toReturn();
                                }
                            }
                            String messageDelivers = "Hay "+ quantityDelivered +" " +
                                    "cantidades entregadas de Series y Videojuegos";

                            showMessages(messageDelivers,"TOTAL ENTREGADOS");

                            VideoGame videoDameMoreHours = allVideoGames[0];
                            Serie seriesMoreSeasons = allSeries[0];

                            for (int i = 1; i < allVideoGames.length; i++) {
                                if (allVideoGames[i].compareTo(videoDameMoreHours)){
                                    videoDameMoreHours=allVideoGames[i];
                                }
                                if (allSeries[i].compareTo(seriesMoreSeasons)){
                                    seriesMoreSeasons=allSeries[i];
                                }
                            }

                           String videoGameMoreHours = "El videojuego con mas horas es  "+videoDameMoreHours.toString()  + '\n';
                                showMessages(videoGameMoreHours,"VIDEOJUEGO CON MAS HORAS");

                           String serieMoreSeason = "La serie con mas temporadas es"+ seriesMoreSeasons.toString() + '\n';
                                showMessages(serieMoreSeason,"SERIE CON MAS TEMPORADAS");

                        }catch (Exception e){
                            showErrorMessage("Error inesperado");
                        }

                        break;
                    default:
                        showErrorMessage("Ingrese un valor valido");
                }

            }

        }while (option!=0);

    }

    public static void showMessages(String message,String title){
        JOptionPane.showMessageDialog (null,message, title,
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void showErrorMessage(String error){
        JOptionPane.showMessageDialog(null, error,
                "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
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
