/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grenais;

import java.util.Scanner;

/**
 *
 * @author T-Gamer
 */
public class Grenais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pG=0, pI=0, e=0, x=0;
        int opc=0;
        
        do{
            x++;
            System.out.print("Insira o Número de Gols do Grêmio: ");
            int g = new Scanner(System.in).nextInt();

            System.out.print("Insira o Número de Gols do Inter: ");
            int i = new Scanner(System.in).nextInt();
            
            if(g>i)pG++;
            else if(i>g)pI++;
            else e++;
            
            System.out.print("\nDeseja Adicionar outro Grenais?\n1. Sim\n2. Não\nOpção: ");
            opc = new Scanner(System.in).nextInt();
        }while(opc == 1);
        
        System.out.println("\n\nNúmero de Granais: " + x);
        System.out.println("Grêmio: " + pG);
        System.out.println("Inter: " + pI);
        System.out.println("Empates: " + e);
        
        if(pG>pI) System.out.println("Grêmio Venceu");
        else if(pI>pG) System.out.println("Inter Venceu");
        else System.out.println("Empate!");
    }
    
}
