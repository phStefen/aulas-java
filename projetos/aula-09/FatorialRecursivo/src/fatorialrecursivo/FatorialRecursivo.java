/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatorialrecursivo;

import java.util.Scanner;

/**
 *
 * @author Raphael Stefen Barreto
 */
public class FatorialRecursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Digite um Número: ");
        int num = new Scanner(System.in).nextInt();
        System.out.println("\nO Fatorial de " + num + " é: " + fatorial(num));
    }
    
    public static int fatorial(int num){
        int fat=0;
        if(num < 0) fat = -1;
        else if(num == 0) fat = 1;
        else if(num > 0) fat = fatorial(num-1)*num;
        return fat;
    }
}
