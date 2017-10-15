/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_7;

import java.util.Scanner;

/**
 *
 * @author ccosmesanmartin
 */
public class Boletin2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        double tc,tk,tf;
        System.out.println("Introduzca la temperatura e ºC");
        tc=sc.nextDouble();
        tk=tc+273;
        tf=tc*1.86+32;
        System.out.println(tc+"ºC = "+tk+"ºK = "+tf+"ºF");
    }
    
}
