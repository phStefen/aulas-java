/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maiorouigual;

import java.util.Scanner;

/**
 *
 * @author T-Gamer
 */
public class MaiorOuIgual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=0,b=0;
        
        System.out.println("Insira o 1º Valor:");
        a=new Scanner(System.in).nextInt();
        
        System.out.println("Insira o 2º Valor:");
        b=new Scanner(System.in).nextInt();
        
        if(a>b) System.out.println(a);
        else if(b>a) System.out.println(b);
        else System.out.println("Os valores são Iguais");
    }
    
}
