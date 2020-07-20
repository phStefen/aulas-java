/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package situacaoaluno;

import java.io.Console;
import java.util.Scanner;

/**
 *
 * @author T-Gamer
 */
public class SituacaoAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        double media;
        
        System.out.println(":: SITUAÇÃO DOS ALUNOS ::\n\nInsira a Média do Aluno:");
        media = Double.parseDouble(scan.nextLine());
       
        if (media>=7) System.out.println("Aprovado");
        else if (media<3) System.out.println("Reprovado");
        else System.out.println("Recuperação");
    }
    
}
