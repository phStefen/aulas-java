/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatorial;

import java.util.Scanner;

/**
 *
 * @author T-Gamer
 */
public class Fatorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int total=1;
        
        System.out.println("Insira um Número:");
        int n = new Scanner(System.in).nextInt();
        
        for(int i=1;i<=n;i++){
            total*=i;
        }
        
        System.out.println("!" + n + " = " + total);
    }
    
}
