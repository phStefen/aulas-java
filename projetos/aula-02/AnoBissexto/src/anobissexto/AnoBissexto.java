/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anobissexto;

import java.util.Scanner;

/**
 *
 * @author T-Gamer
 */
public class AnoBissexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe um Ano:");
        int ano = Integer.parseInt(scan.nextLine());
        
        if(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) System.out.println("O Ano " + ano + " é Bissexto");
        else System.out.println("O Ano " + ano + " não é Bissexto");
    }
    
}
