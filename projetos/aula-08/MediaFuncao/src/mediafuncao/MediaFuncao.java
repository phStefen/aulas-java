/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediafuncao;

import java.util.Scanner;

/**
 *
 * @author T-Gamer
 */
public class MediaFuncao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=-2;
        while(n<0 && n>100){
            System.out.print("\nDigite o Tamanho de N: ");
            n = new Scanner(System.in).nextInt();
            
            if(n<0 && n>100) System.out.println("Valor Inválido!");
        }
    }
    
    public static double media(double s){
        return s/4;
    }
    
}
