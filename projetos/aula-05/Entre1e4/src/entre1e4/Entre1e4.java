/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entre1e4;

import java.util.Scanner;

/**
 *
 * @author T-Gamer
 */
public class Entre1e4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=1;
        
        while(num >= 1 && num <= 4){
            System.out.print("Digite um Número: ");
            num = new Scanner(System.in).nextInt();
            
            if(num >= 1 && num <= 4) System.out.println(num);
            else System.out.println("Número Inválido");
        }
    }
    
}
