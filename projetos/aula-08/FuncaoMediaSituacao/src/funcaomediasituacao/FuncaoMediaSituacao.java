package funcaomediasituacao;

import java.util.Scanner;

public class FuncaoMediaSituacao {
    
    public static final String aprovado = "Aprovado";
    public static final String reprovado = "Reprovado";
    public static final String recuperacao = "Recuperação";
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        pedirNotas(scan);
    }
    
    public static void pedirNotas(Scanner scan){
        System.out.println("Digite '-1' para Encerrar a Média");
        System.out.println("Digite as Notas do Aluno: ");
        
        double i=0, qtd=0, s=0;
        
        while(i!=-1){
            i = scan.nextDouble();
            if(i>=0 && i<=10){
                qtd++;
                s+=i;
            }
        }
        
        s = s/qtd;
        
        System.out.println("\nA Média do Aluno foi: " + s);
        System.out.println("A Situação do Aluno foi: " + situacao(s));
    }
    
    public static String situacao(double m){
        if(m >= 7) return aprovado;
        else if (m < 3) return reprovado;
        else return recuperacao;
    }
}
