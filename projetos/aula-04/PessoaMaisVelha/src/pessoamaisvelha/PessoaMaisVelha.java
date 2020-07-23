/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoamaisvelha;

import java.util.Scanner;

/**
 *
 * @author T-Gamer
 */
public class PessoaMaisVelha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] nome = new String[2];
        int[] idade = new int[2];
        
        for(int i=0;i<2;i++){
            System.out.println("\nDigite o Nome da " + (i+1) + "ª Pessoa:");
            nome[i]=new Scanner(System.in).nextLine();
            
            System.out.println("Digite a Idade da " + (i+1) + "ª Pessoa:");
            idade[i]=new Scanner(System.in).nextInt();
        }
        
        if(idade[0]>idade[1]) System.out.println(nome[0] + " é a Pessoa mais Velha");
        else System.out.println(nome[1] + " é a Pessoa mais Velha");
    }
    
}
