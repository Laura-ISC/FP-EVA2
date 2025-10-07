/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_tabla_multiplicar;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class EVA2_12_TABLA_MULTIPLICAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner captu = new Scanner(System.in);       
        System.out.println("");
        System.out.print("Tabla de multiplicar a imprimir: ");
        int num; 
        num= captu.nextInt();
        System.out.println("Tabla de multiplicar del " + num + ":");
        for(int i = 1; i <= 10; i++)
            System.out.println(num + " x " + i + " = " + (num * i));
    }
    
}
