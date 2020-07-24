/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForQuadrado;

import java.util.Scanner;

/**
 *
 * @author T-Gamer
 */
public class QuadradoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=1;
        
        while(num!=0){
            System.out.println("Digite um Número:");
            
            num = new Scanner(System.in).nextInt();
            num*=num;
            
            System.out.println(num);
        }
    }
    
}
