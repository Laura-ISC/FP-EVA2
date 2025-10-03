/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_arreglos_string;
import java.util.Scanner;
/**
 *
 * @author laura
 */
public class EVA2_5_ARREGLOS_STRING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int dia;
        String díasSemana[]= new String [7];
        díasSemana[0]= "Domingo";        
        díasSemana[1]= "Lunes";
        díasSemana[2]= "Martes";
        díasSemana[3]= "Miercoles";
        díasSemana[4]= "Jueves";
        díasSemana[5]= "Viernes";
        díasSemana[6]= "Sabado";
        System.out.println("Introduce el día en número (0-6): ");
        dia = captu.nextInt();
        System.out.println("El día es " + díasSemana[dia]);
        
    }
    
}
