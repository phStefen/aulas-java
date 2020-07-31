package numeroperfeito;

import java.util.Scanner;

/**
 *
 * @author Raphael Stefen Barreto
 * @site https://phstefen.github.io/
 */
public class NumeroPerfeito {
    public static void main(String[] args) {
        System.out.print("Digite o Número de Tentativas: ");
        int x = new Scanner(System.in).nextInt();
        
        for(int i=0;i<x;i++){
            System.out.print("\nDigite o Número: ");
            int num = new Scanner(System.in).nextInt();
            int s=0;
            
            for(int j=1;j<num;j++){
                if(num%j==0) s+=j;
            }
            
            if(s==num) System.out.println("Perfeito!");
            else System.out.println("Imperfeito!");
        }
    }
}
