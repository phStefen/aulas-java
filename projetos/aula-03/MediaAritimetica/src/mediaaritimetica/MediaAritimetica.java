/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaaritimetica;

import java.util.Scanner;

/**
 *
 * @author T-Gamer
 */
public class MediaAritimetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double soma=0;
        String nome;
        
        System.out.println("Nome do Aluno:");
        nome=new Scanner(System.in).nextLine();
        
        for(int i=1;i<=4;i++){
            System.out.println("Informe a " + i + "º Nota:");
            soma+=new Scanner(System.in).nextDouble();
        }
        
        System.out.println("A Média do Aluno " + nome + " é: " + soma/4);
    }
    
}
