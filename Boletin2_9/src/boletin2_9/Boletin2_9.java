/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_9;

import java.util.Scanner;

/**
 *
 * @author ccosmesanmartin
 */
public class Boletin2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int euros,c,v,ci,u,m;
       System.out.println("Introduzca la cantidad de Euros:");
       euros=sc.nextInt();
       c=euros/100;
       m=euros%100;
       v=m/20;
       m=m%20;
       ci=m/5;
       m=m%5;
       u=m/1;
       System.out.println(euros+" Euros son "+c+" billetes de 100, "+v+" billetes de 20, "
               +ci+" billetes de 5 y "+u+" moneda de 1 Euro.");
    }
    
}
