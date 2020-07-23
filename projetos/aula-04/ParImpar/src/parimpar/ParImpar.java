/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parimpar;

import java.util.Scanner;

/**
 *
 * @author T-Gamer
 */
public class ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Digite um Número:");
        int num = new Scanner(System.in).nextInt();
        
        if(num%2==0) System.out.println("O Número Informado é Par");
        else System.out.println("O Número Informado é Ímpar");
    }
    
}
