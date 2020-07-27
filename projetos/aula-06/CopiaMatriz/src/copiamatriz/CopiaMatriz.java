/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copiamatriz;

import java.util.Scanner;

/**
 *
 * @author T-Gamer
 */
public class CopiaMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int k=1;
        int[][] a = new int[3][4];
        int[][] b = new int[3][2];
        int[][] c = new int[3][6];
        
        while(k<3){
            for(int i=0;i<3;i++){
                switch(k){
                    case 1:
                        if(i<1)System.out.println("Insira 12 Valores: ");
                        for(int j=0;j<4;j++){
                            a[i][j] = new Scanner(System.in).nextInt(); 
                        }
                        break;
                    case 2:
                        if(i<1)System.out.println("\nInsira 6 Valores: ");
                        for(int j=0;j<2;j++){
                            b[i][j] = new Scanner(System.in).nextInt(); 
                        }
                        break;
                }
            }
            k++;
        }
                
        System.out.println("\n Matriz Final é: ");
        
        for(int i=0;i<3;i++){
            for(int j=0;j<6;j++){
                if(j<4) c[i][j] = a[i][j];
                else c[i][j] = b[i][j-4];
                
                System.out.print(c[i][j] + " ");
            }
            
            System.out.println("");
        }
        
    }
}
