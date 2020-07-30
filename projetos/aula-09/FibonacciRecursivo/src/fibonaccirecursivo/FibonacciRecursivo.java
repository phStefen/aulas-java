package fibonaccirecursivo;

import java.util.Scanner;

/**
 *
 * @author Raphael Stefen Barreto
 * @site https://phstefen.github.io/
 */
public class FibonacciRecursivo {
    public static void main(String[] args) {
        System.out.print("Digite um Número: ");
        int num = new Scanner(System.in).nextInt();
        
        System.out.println("O " + num + "º Número na Sequência de Fibonacci é: " + fibonacci(num));
    }
    
    public static int fibonacci(int num){
        int fibo=0;
        
        if(num<=0) fibo=0;
        else if(num>1) fibo = fibonacci(num-1)+fibonacci(num-2);
        else fibo=1;
        
        return fibo;
    }
}
