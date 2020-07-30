package dobrorecursivo;

import java.util.Scanner;

/**
 *
 * @author Raphael Stefen Barreto
 * @site https://phstefen.github.io/
 */
public class DobroRecursivo {
    public static void main(String[] args) {
        System.out.print("Digite um Número para ser Dobrado: ");
        int num = new Scanner(System.in).nextInt();
        
        System.out.print("Digite um Limite para o Número: ");
        int limite = new Scanner(System.in).nextInt();
        
        System.out.println("Resultado: " + dobrar(num,limite));
    }
    
    public static int dobrar(int num, int limite){
        int dobro = num*2;
        
        if(dobro>=limite) return num;
        else return dobrar(dobro,limite);
    }
}
