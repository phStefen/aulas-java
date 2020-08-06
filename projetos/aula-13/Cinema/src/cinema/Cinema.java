package cinema;

import java.util.Scanner;

/**
 *
 * @author Raphael Stefen Barreto
 * @site https://phstefen.github.io/
 */
public class Cinema {
    public static void main(String[] args) {
        Filmes[] filmes = new Filmes[3];
        
        for(int i=0;i<3;i++){
            filmes[i] = cadastrar();
            System.out.println("");
        }
        
        for(Filmes filme : filmes){
            System.out.println(":: " + filme.nome + " - " + filme.ano + " ::");
            System.out.println("Autor: " + filme.autor);
            System.out.println("Valor do Ingresso: R$" + filme.preco + "\n");
        }
    }
    
    public static Filmes cadastrar(){
        Scanner scan = new Scanner(System.in);
        Filmes filme = new Filmes();
        
        System.out.print("Digite o Nome: ");
        filme.nome = scan.nextLine();
        
        System.out.print("Digite o Autor: ");
        filme.autor = scan.nextLine();
        
        System.out.print("Digite o Ano: ");
        filme.ano = scan.nextInt();
        
        System.out.print("Digite o Valor do Ingresso: R$");
        filme.preco = scan.nextDouble();
        
        return filme;
    }
}
