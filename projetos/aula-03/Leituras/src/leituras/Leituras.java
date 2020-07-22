/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leituras;

import java.util.Scanner;

/**
 *
 * @author T-Gamer
 */
public class Leituras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite seu Nome:");
        String nome = scan.nextLine();
        
        System.out.println("Olá, " + nome + ", digite sua Idade:");
        int idade = scan.nextInt();
        
        System.out.println(idade + " anos, muito bem! Digite agora sua Altura:");
        double altura = scan.nextDouble();
        
        System.out.println("Ok, entendi, você tem " + altura + "m de Altura");
    }
    
}
