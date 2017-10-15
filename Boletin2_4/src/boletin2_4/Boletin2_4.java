/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;

import java.util.Scanner;

/**
 *
 * @author ccosmesanmartin
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner teclado=new Scanner(System.in);
        float n1,n2;
        System.out.println("teclea n1: ");
        n1=teclado.nextFloat();
        System.out.println("teclea n2: ");
        n2=teclado.nextFloat();
        float suma= n1+n2;
        System.out.println("suma="+ suma);
        float resta= n1-n2;
        System.out.println("resta="+(n1-n2));
        float multiplicacion= n1*n2;
        System.out.println("multiplicacion="+ n1*n2);
        float division= n1/n2;
        System.out.println("division="+division);
        
        
    }
    
}
