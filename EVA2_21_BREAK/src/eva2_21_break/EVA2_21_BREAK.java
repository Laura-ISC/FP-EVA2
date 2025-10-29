/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_break;
import java.util.Scanner;

/**
 *
 * @author laura
 */
public class EVA2_21_BREAK {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int valor, adivinar;
        adivinar = (int)(Math.random()*5) +1; //# entre 1 y 5
        while(true){
            System.out.println("Adivina el núnero. -1 para terminar");
            valor = captu.nextInt();
            if(valor == adivinar){
                System.out.println("Felicidades, adivinaste");
                break; //Termina por completo el ciclo
            }
            
            if(valor == -1)
                break; //Termina por completo el ciclo
        }
        System.out.println("Gracias por jugar"); 
    }
    
}
