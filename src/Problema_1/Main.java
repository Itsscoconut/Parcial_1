package Problema_1;
/*Diseñe un POO el cual calculara el costo de una llamada telefónica,
capturando la duración de la llamada en minutos y conociendo lo siguiente:
Cada minuto cuesta $3
Realice el Diagrama UML */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        new Main();
    }

    Main() throws IOException {
        Logic logic = new Logic();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat dc = new DecimalFormat("#.##");

        System.out.println("introduzca loa durtacion de la llamada");
        float minutes = Float.parseFloat(input.readLine());
        logic.setMinutes(minutes);

        if(logic.verify()){
            System.out.println("el total a pagar es ==> "+dc.format(logic.sss()));
        }else{
            System.out.println("Valor incorrecto, Vuelva a ingresar");
        }
    }
}
