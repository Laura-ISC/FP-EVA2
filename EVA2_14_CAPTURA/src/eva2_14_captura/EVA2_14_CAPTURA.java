/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_captura;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class EVA2_14_CAPTURA {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int tama;
        System.out.println("¿Cuantas calificaciones va a capturar?");
        tama = captu.nextInt();
        int califas[] = new int [tama];
        //CAPTURAR
        for(int i = 0; i < califas.length; i++){
            System.out.println("Calificación " + (i + 1) + ":");
            califas[i] = captu.nextInt();
        }
        //LEER
        for(int i = 0; i < califas.length; i++){
            System.out.print("[" + califas[i] + "]");
            
        }   
       int suma = 0;
       //sumar todas las calificaciones
        for(int i = 0; i < califas.length; i++){
            suma = suma + califas[1];
            //suma += califas[1];
        } 
        
                                //CASTING
        double promedio = suma / (double)tama; // dividiendo enteros
        System.out.println("Promedio = " + promedio);
    }
    
}
