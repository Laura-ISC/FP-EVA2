/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_28_primo;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class EVA2_28_PRIMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int val;
        boolean esPrimo = true;
        System.out.println("Introduce un valor: ");
        val = captu.nextInt();
        
        for (int i = 2; i < val; i++) {
            //dividir (exacta)
            int residuo = val % i;
            if(residuo ==0){//YA NO ES PRIMO
                esPrimo = false;//una divison exacta  ya no es primo
                break;
            }
            
        }
        if(esPrimo)
            System.out.println("El valor " + val + " si es primo.");
        else
            System.out.println("El valor " + val + " no es primo.");
    }
    
}
