/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_exa1;
import java.util.Scanner;
/**
 *
 * @author laura
 */
public class EVA2_1_EXA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
       int saldo = 5000; 
       int calculo;
      int pin, opc, monto;
      System.out.println("Introduce el PIN: ");
      pin = captu.nextInt();
      if (pin == 1234){
         System.out.println("1. Consulta el saldo");
         System.out.println("2. Retirar monto");
         System.out.println("3. Depositar monto");
         System.out.println("Selecciona la operación");
        opc = captu.nextInt();
         if (opc == 1){
           System.out.println("Tu saldo es " + saldo);  
         }else if (opc == 2){
             System.out.println("¿Cuanto vas a retirar? ");
         monto = captu.nextInt();

                if (monto <= saldo) {
                    saldo = saldo - monto;
                    System.out.println("Retiro exitoso.");
                    System.out.println("Tu saldo actual es: " + saldo);
                } else {
                    System.out.println("Monto mayor al saldo disponible.");
                }

            } else if (opc == 3) {
                // Depositar dinero
                System.out.println("¿Cuánto vas a depositar?");
                monto = captu.nextInt();
                if (monto >= 0) {
                    saldo = saldo + monto;
                    System.out.println("Depósito exitoso.");
                    System.out.println("Tu saldo actual es: " + saldo);
                } else {
                    System.out.println("Monto no válido (negativo).");
                }

            } else {
                System.out.println("Opción no válida.");
            }

        } else {
            System.out.println("PIN incorrecto.");
        }
       
         
      
      
    }
    
}
