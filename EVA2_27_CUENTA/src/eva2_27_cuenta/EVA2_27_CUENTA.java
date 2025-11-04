/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_27_cuenta;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class EVA2_27_CUENTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
       int saldo = 1000000;
       int val;
       do{ 
           System.out.println("¿Cuanto deseas retirar?");
           val = captu.nextInt();
           saldo = saldo - val;
           System.out.println("Tu saldo es = " + saldo);
           //saldo -=val;
       }while(saldo > 0);
    }
    
}
