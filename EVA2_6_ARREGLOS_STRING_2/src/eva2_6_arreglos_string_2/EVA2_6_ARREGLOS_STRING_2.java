/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_arreglos_string_2;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class EVA2_6_ARREGLOS_STRING_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner captu = new Scanner(System.in);
        int dia;
        String díasSemana[]= {"Domingo", "Lunes", "Martes",
                             "Miercoles", "Jueves", "Viernes","Sabado"};
        System.out.println("Introduce el día en número (0-6): ");
        dia = captu.nextInt();
        System.out.println("El día es " + díasSemana[dia]);
        
       
    }
    
}
