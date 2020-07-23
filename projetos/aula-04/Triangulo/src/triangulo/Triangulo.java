/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

import java.util.Scanner;

/**
 *
 * @author T-Gamer
 */
public class Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c=0;
        
        System.out.println("Insira o 1º Lado do Triângulo:");
        a=new Scanner(System.in).nextInt();
        
        System.out.println("Insira o 2º Lado do Triângulo:");
        b=new Scanner(System.in).nextInt();
        
        System.out.println("Insira o 3º Lado do Triângulo:");
        c=new Scanner(System.in).nextInt();
        
        if(a<b+c && b<a+c && c<b+a) System.out.println("É um Triângulo");
        else System.out.println("Não é um TriÂngulo");
    }
    
}
