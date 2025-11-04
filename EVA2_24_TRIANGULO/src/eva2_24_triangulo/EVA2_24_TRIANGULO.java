/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_triangulo;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class EVA2_24_TRIANGULO {
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num;
        num = captu.nextInt();
        for (int i = 1; i <= num; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        
        System.out.println("");
        }
    }
    
}
