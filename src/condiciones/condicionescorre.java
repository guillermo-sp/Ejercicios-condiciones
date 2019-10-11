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
public class condicionescorre {
    
     
   public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
     int num1 = teclado.nextInt();
     
     if (num1%20==0 && (num1>=-100 || num1<=100) ){
            System.out.println("Es multiplo y esta en el rango");
    } else if (num1 % 20 != 0 && !(num1 >=-100 && num1<=100)){
            System.out.println("No multiplo y esta en el rango");
    }else if (num1%20==0 && !(num1>=-100 && num1<=100)){
            System.out.println("Es multiplo y no esta en el rango");
    } else if(num1%20 !=0 && !(num1>=-100 && num1<=100)){
            System.out.println("No multiplo y no esta en el rango");
    }
            
    
}
}
