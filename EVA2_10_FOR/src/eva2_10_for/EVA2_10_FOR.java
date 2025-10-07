/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_for;
import java.util.Scanner;
/**
 *
 * @author laura
 */
public class EVA2_10_FOR {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //IMPRIMIR LOS NUMEROS DEL 1-20
        //1-2-3-4-5-6...20
        for(int i = 1; i <= 20; i++){
            System.out.print(i + " - ");
        }
        //IMPRIMIR LOS NUMEROS PERES DE 0 A 100
        //0 - 2 - 4 - 6... 100
        //+= suma, -=resta, *=multiplica, /= divide
        System.out.println("");
        for(int i = 0; i <= 100; i+=2)
            System.out.print(i + " - ");
        
        System.out.println("");
          for(int i = 100; i >= 0; i-=2)
            System.out.print(i + " - ");
        
        System.out.println( );
        //SOLICITAR DOS NUMEROS AL USUARIO, IMPRIMIR LISTA
        Scanner captu = new Scanner(System.in);
        int ini, fin;
        System.out.println("Inicio:");
        ini = captu.nextInt();
        System.out.println("Fin:");
        fin = captu.nextInt();
        for(int i = ini; i<= fin; i++)
            System.out.print(i + " - ");
        System.out.println("");
        for(int i = fin; i>= ini; i--)
            System.out.print(i + " - ");


    }
    
}
