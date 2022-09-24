package Problema_2;

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

        System.out.println("introduzca la cantidad a invertir ==> ");
        float quantity = Float.parseFloat(input.readLine());
        logic.setQuantity(quantity);

        if(logic.verify()){
            System.out.println("para el segundo mes su capital ha crecido "+dc.format(logic.show()));
        }else{
            System.out.println("ERROR, valores de entrada no validos");
        }

    }
}
