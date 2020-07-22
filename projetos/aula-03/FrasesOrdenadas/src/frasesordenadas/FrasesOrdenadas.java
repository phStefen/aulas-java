/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frasesordenadas;

import java.util.Scanner;

/**
 *
 * @author T-Gamer
 */
public class FrasesOrdenadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Digite a 1º Frase:");
        String f1 = new Scanner(System.in).nextLine();
        
        System.out.println("Digite a 2º Frase:");
        String f2 = new Scanner(System.in).nextLine();
        
        System.out.println("Digite a 3º Frase:");
        String f3 = new Scanner(System.in).nextLine();
        
        System.out.println(f3 + "\n" + f2 + "\n" + f1);
    }
    
}
