package led;

import java.util.Scanner;

/**
 *
 * @author Raphael Stefen Barreto
 * @site https://phstefen.github.io/
 */
public class LED {
    public static void main(String[] args) {
        int[] x = {6,2,5,5,4,5,6,3,7,6};
        System.out.print("Digite quantas Linhas de LEDs: ");
        int l = new Scanner(System.in).nextInt();

        for(int i=0;i<l;i++){
            System.out.print("\nDigite o Número de Exibição: ");
            char[] numeros = new Scanner(System.in).next().toCharArray();
            int led=0;

            for(char n : numeros){
                led+=x[Character.getNumericValue(n)];
            }
            
            System.out.println(led + " leds");
        }
    }
}
