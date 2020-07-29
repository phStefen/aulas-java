/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aoquadradofuncao;

import java.util.Scanner;

/**
 *
 * @author T-Gamer
 */
public class AoQuadradoFuncao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Digite um Número: ");
        int n = new Scanner(System.in).nextInt();
        
        System.out.println("\n" + n + "² = " + quadrado(n));
    }
    
    public static int quadrado(int n){
        return n*n;
    }
    
}
