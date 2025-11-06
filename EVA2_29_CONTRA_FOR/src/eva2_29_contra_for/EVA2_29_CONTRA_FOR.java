/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_29_contra_for;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class EVA2_29_CONTRA_FOR {
    
     final static String USUARIO = "Laura";
     final static String PWD = "1234";
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);        
       String usua, contra;
       boolean accesoConcedido = false;
       for (int i =1; i <= 4; i++){
           System.out.print("Usuario: ");
           usua = captu.nextLine();
           System.out.print("Contraseña: ");
           contra = captu.nextLine();
           if (usua.equals(USUARIO) && contra.equals(PWD)) {
               accesoConcedido = true;
               break;
           }
       }
       
       if(accesoConcedido)
            System.out.println("ACCESO CONCEDIDO");
       else
            System.out.println("ACCESO DENEGADO");

    }
    
}
