/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonnaci;

import java.util.Scanner;

/**
 *
 * @author T-Gamer
 */
public class Fibonnaci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Insira quantas Sequências de Fibonacci deseja ver:");
        int n = new Scanner(System.in).nextInt();
        
        int ant=1, fibo=0;
        
        for(int i=1;i<=n;i++){
            System.out.println(i + "ª Sequência: " + fibo);
            fibo+=ant;
            ant = fibo - ant;
        }
    }
    
}
