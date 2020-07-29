/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizquadrada;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author T-Gamer
 */
public class MatrizQuadrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=1, qtd=1;
        List<Integer> lista = new ArrayList<>();    
        
        System.out.println("Digite '0' para Encerrar\n");
        while(n>0){
            System.out.print("Digite o Tamanho da " + qtd + "º Matriz: ");
            n = new Scanner(System.in).nextInt();
            
            if(n>0){
                 lista.add(n);
                 qtd++;
            }
            else if(n>100) System.out.println("Valor Inválido!\n");
        }
        
        System.out.println("");
        
        for(int i : lista){
            for(int x=0;x<i;x++){
                for(int y=0;y<i;y++){
                    if(x+y<i){
                        // Acima da Diagonal
                        System.out.printf("%3d", Math.min(x+1, y+1));
                    }
                    else{
                        // Abaixo da Diagonal
                        System.out.printf("%3d", Math.min(i-x, i-y));
                    }
                    if(y<i-1) System.out.print(" ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
    
}
