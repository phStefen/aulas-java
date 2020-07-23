/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notasestudante;

import java.util.Scanner;

/**
 *
 * @author T-Gamer
 */
public class NotasEstudante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Insira a Nota do Aluno:");
        double nota = new Scanner(System.in).nextDouble();
        
        if(nota<=3) System.out.println("Você precisa melhorar muito!");
        else if(nota<7) System.out.println("Você está quase conseguindo!");
        else if(nota<9) System.out.println("Você conseguiu!");
        else System.out.println("Você conseguiu com distinção!");
    }
    
}
