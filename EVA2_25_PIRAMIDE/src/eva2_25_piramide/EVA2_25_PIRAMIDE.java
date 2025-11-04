/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_piramide;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class EVA2_25_PIRAMIDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int valor;
        System.out.println("Introduce un valor: ");
        valor = captu.nextInt();
        for (int i = 1; i <= valor; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        System.out.println();
     }
        for (int k = valor; k >= 1; k--) {
            for (int j = 1; j <= k; j++) {
                System.out.print("*");
            }
        System.out.println();
    }
    }
    
}
