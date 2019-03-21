
package etscompartido;

import java.util.Scanner;

/**
 *
 * @author domit
 */
public class EtsCompartido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        int AnadimosUnaVariable;
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
        //Es te es el nuevo cambio que vamos a realizar
    }    
}
