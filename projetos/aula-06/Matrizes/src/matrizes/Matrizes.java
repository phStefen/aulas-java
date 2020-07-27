/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizes;

import java.util.Scanner;

/**
 *
 * @author T-Gamer
 */
public class Matrizes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m = 1, n = 1;
        double maior=0;
        
        System.out.print("Insira quantas Linhas: ");
        m = new Scanner(System.in).nextInt();
        
        System.out.print("Insira quantas Colunas: ");
        n = new Scanner(System.in).nextInt();
        
        double[][] matriz = new double[m][n];
        
        System.out.println("\nInsira " + (m*n) + " Valores: ");
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matriz[i][j] = new Scanner(System.in).nextDouble(); 
                if(matriz[i][j]>maior) maior = matriz[i][j];
            }
        }
        
        System.out.println("\nO Maior Valor informado foi: " + maior);
    }
    
}
