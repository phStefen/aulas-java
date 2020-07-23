/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplodedois;

import java.util.Scanner;

/**
 *
 * @author T-Gamer
 */
public class MultiploDeDois {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int soma=0;
        
        for(int i=1;i<=5;i++){
            System.out.println("Digite o " + i + "º Número:");
            soma+= new Scanner(System.in).nextInt();
        }
        
        if(soma%2==0) System.out.println("O Número " + soma + " é Múltiplo de 2");
        else System.out.println("O Número " + soma + " não é Múltiplo de 2");
    }
    
}
