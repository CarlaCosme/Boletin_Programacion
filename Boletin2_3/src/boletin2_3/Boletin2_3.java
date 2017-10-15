/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3;

import static java.sql.DriverManager.println;
import java.util.Scanner;

/**
 *
 * @author ccosmesanmartin
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        float cambio, euros, dolares;
        System.out.println("teclea euros");
        euros= sc.nextFloat();
        System.out.println("teclea cambio");
        cambio=sc.nextFloat();
        System.out.println("dolares");
        dolares=sc.nextFloat();
        System.out.println(euros+"€son"+"dolares");
    }
    
}
