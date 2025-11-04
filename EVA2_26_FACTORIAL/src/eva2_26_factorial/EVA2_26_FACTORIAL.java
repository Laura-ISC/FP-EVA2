/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_26_factorial;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class EVA2_26_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner captu = new Scanner(System.in);
        System.out.println("Introduce un valor: ");
        int val, factorial = 1;
        val = captu.nextInt();
        for (int i = 1; i <= val; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial de " + val + " es " + factorial);
    }
    
}
