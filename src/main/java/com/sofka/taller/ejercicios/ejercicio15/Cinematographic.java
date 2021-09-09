package com.sofka.taller.ejercicios.ejercicio15;

import javax.swing.*;

public class Cinematographic {

    public void cinematographyMenu(){

        int option = 0;

        do{
            option = Integer.parseInt(JOptionPane.showInputDialog(showMenu()));

            switch (option){
                case 1:
                    showMessage("VER ACTOR");
                    break;
                case 2:
                    showMessage("BUSCAR ACTOR!");
                    break;
                case 3:
                    showMessage("ELIMINAR ACTOR!");
                    break;
                case 4:
                    showMessage("MODIFICAR ACTOR!");
                    break;
                case 5:
                    showMessage("VER TODOS LOS ACTORES");
                    break;
                case 6:
                    showMessage("VER PELICULAS DE LOS ACTORES");
                    break;
                case 7:
                    showMessage("VER CATEGORIA DE PELICULAS DE LOS ACTORES");
                    break;
                case 8:
                    showMessage("SALIENDO DEL MENU......");
                    break;
                default:
                    showError("OPCION INCORRECTA");
            }

        }while (option!=8);

    }

    public void showMessage(String text){
        JOptionPane.showMessageDialog(null, text);
    }

    public void showError(String text){
        JOptionPane.showMessageDialog(null, text,
                "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
    }

    public String showMenu(){
        return "****GESTION CINEMATOGRAFICA***\n" +
                "1.Nuevo actor\n" +
                "2.Buscar actor\n" +
                "3.Eliminar actor\n" +
                "4.Modificar actor\n" +
                "5.Ver todos los actores\n" +
                "6.Ver peliculas de los actores\n" +
                "7.Ver categoria de peliculas de los actores\n" +
                "8.Salir";
    }

}
