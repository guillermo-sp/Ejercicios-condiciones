/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condiciones;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class Condiciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        int num1 = teclado.nextInt();
        
        if (num1%20==0 && num1<-100 && num1>100){
           System.out.printf("El numero %d es multiplo de 20 y no esta entre -100 y 100",num1);
        } else if (num1%20==0 && num1>=-100 && num1<=100){   
            System.out.printf("El numero %d es multiplo de 20 y esta entre -100 y 100",num1);
        } else if (num1%20!=0 && num1>=-100 && num1<=100 ){
            System.out.println("No es multiplo de 20 y esta entre -100 y 100");
            
        } else {
            System.out.println("No es multiplo de 20 y no esta entre -100 y 100");
        } 
    }
     
}
