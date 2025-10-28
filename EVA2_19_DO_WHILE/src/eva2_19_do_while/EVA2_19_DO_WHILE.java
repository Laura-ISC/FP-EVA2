/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_do_while;
import java.util.Scanner;
/**
 *
 * @author laura
 */
public class EVA2_19_DO_WHILE {
    final static String USUARIO = "admin";
    final static String PWD = "admin";
    public static void main(String[] args) {
        //1. PEDIMOS DATOS DE ACCESO
        Scanner captu = new Scanner(System.in);
        String usu, contra;
        //2. VALIDAMOS
        //INCORRECTO --> VOLVER A PREGUNTAR
        //CORRECTO --> ACCESO AL SISTEMA
        
       do{ 
          System.out.println("Usuario: ");
          usu = captu.nextLine();
          System.out.println("Contraseña: ");
          contra = captu.nextLine();
       }while(!(usu.equals(USUARIO) && contra.equals(PWD)));  
          System.out.println("ACCESO CONCEDIDO. BIENVENIDO AL SISTEMA");
          
        /*if()
        //VALIDAR
        System.out.println("ACCESO CONCEDIDO. BIENVENIDO AL SISTEMA");
        else
            System.out.println("ACCESO DENEGADO");*/
        
    }
    
}
