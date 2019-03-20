
package etscompartido;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author domit
 */
public class EtsCompartido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        int a = 0;
        int b = 0;
        int c = 0;
        System.out.println("Vamos a cambiar el order de los valores, introduce 2 nuevos numeros: ");
        Scanner teclado = new Scanner(System.in);
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = a;
        System.out.println("Estos son los numeros: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Ahora cambiamos los valores: ");
        a = b; 
        b = c;
        System.out.println("Estos son los numeros: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }    
}
