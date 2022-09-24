package Problema_3;
/*El almacén Tu Compra fácil desea que se realizase un programa para calcular el total a pagar
 en la venta de un artículo considerando que se ingresa el nombre del artículo,
 la cantidad y el precio unitario: además considerar que el almacén cobra ITMBS. Imprimir el nombre del
 articulo y costo total a pagar
 */

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

        System.out.print("introduzca el nombre del articulo ==> ");
        String productName = input.readLine();
        logic.setProductName(productName);

        System.out.print("introduzca la cantidad del producto '"+productName+"' ==> ");
        int quantity = Integer.parseInt(input.readLine());
        logic.setQuantity(quantity);

        System.out.print("introduzca el precio Unitario de '"+productName+"' ==> ");
        float price = Float.parseFloat(input.readLine());
        logic.setPrice(price);

        if(logic.verify()){
            System.out.println("\tAlmacen Tu Compra Facil"+"\nNombre del Producto"+"\t\tPrecio Total a pagar");
            System.out.println(logic.getProductName()+"\t\t\t\t\t"+logic.finalPrice());
        }else{
            System.out.println("ERROR, introduzca valores validos");
        }
    }
}
