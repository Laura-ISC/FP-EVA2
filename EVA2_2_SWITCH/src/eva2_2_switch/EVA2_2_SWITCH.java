/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_switch;
import java.util.Scanner;
/**
 *
 * @author laura
 */
public class EVA2_2_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner captu = new Scanner(System.in);
        int opc;
        System.out.println("1. consultar saldo");
        System.out.println("2. retirar monto");
        System.out.println("3. depositar monto");
        System.out.println("seleccione una opcion del menu");
        opc = captu.nextInt();
        switch(opc){
            case 1:
            System.out.println("Elegiste imprimir saldo!!");
            break; //rompe o detiene la instruccion
            case 2:
            System.out.println("Elegiste retirar saldo");
            break; //rompe o detiene la instruccion
            case 3:
            System.out.println("Elegiste depositar!!");
            break; //rompe o detiene la instruccion
            default:
            System.out.println("Opcion incorrecta!!");
            
    
       
}
    }
    
}
