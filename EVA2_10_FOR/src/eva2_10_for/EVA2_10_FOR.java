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
        Scanner captu = new Scanner(System.in);
        // TODO code application logic here
        //IMPRIMIR LOS NUMEROS DEL 1-20
        //1-2-3-4-5-6...20
        for(int i = 1; i <= 20; i++){
            System.out.print(i + "-");
        }
        //IMPRIMIR LOS NUMEROS PERES DE 0 A 100
        //0 - 2 - 4 - 6... 100
        //+= suma, -=resta, *=multiplica, /= divide
        System.out.println("");
        for(int i = 0; i <= 100; i+=2)
            System.out.print(i + "-");
        
        System.out.println("");
          for(int i = 100; i >= 0; i-=2)
            System.out.print(i + "-");
        
          
         System.out.println("Ingrese el primer número: ");
        int num1;
        num1 = captu.nextInt(); 
        System.out.println("Ingrese el segundo número: ");
        int num2;
        num2 = captu.nextInt();
        System.out.println("");

        if(num1 <= num2)
            for(int i = num1; i <= num2; i++)
           System.out.println(i);
        else
            for(int i = num1; i >= num2; i--)
           System.out.println(i);
          
          
        
        System.out.println("");
        System.out.print("Ingresa el número para ver su tabla de multiplicar: ");
        int n; 
        n= captu.nextInt();
        System.out.println("Tabla de multiplicar del " + n + ":");
        for(int i = 1; i <= 10; i++)
            System.out.println(n + " x " + i + " = " + (n * i));
    }
    
}
