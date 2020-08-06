package enumeracao;

import java.util.Scanner;

/**
 *
 * @author Raphael Stefen Barreto
 * @site https://phstefen.github.io/
 */
public class Enumeracao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mes=0;
        
        while(mes < 1 || mes > 12){
            System.out.print("\nDigite o Mês (1 a 12): ");
            mes = scan.nextInt();
            if(mes < 1 || mes > 12) System.out.println("Mês Inválido");
        }
        
        Meses meses = pegarMes(mes);
        
        System.out.println("\nMês Selecionado: " + nomeMes(meses));
    }
    
    public static Meses pegarMes(int mes){
        switch(mes){
            case 1:
                return Meses.JANEIRO;
            case 2:
                return Meses.FEVEREIRO;
            case 3:
                return Meses.MARCO;
            case 4:
                return Meses.ABRIL;
            case 5:
                return Meses.MAIO;
            case 6:
                return Meses.JUNHO;
            case 7:
                return Meses.JULHO;
            case 8:
                return Meses.AGOSTO;
            case 9:
                return Meses.SETEMBRO;
            case 10:
                return Meses.OUTUBRO;
            case 11:
                return Meses.NOVEMBRO;
            case 12:
                return Meses.DEZEMBRO;
            default:
                return Meses.JANEIRO;
        }
    }
    
    public static String nomeMes(Meses mes){
        switch(mes){
            case JANEIRO:
                return "Janeiro";
            case FEVEREIRO:
                return "Fevereiro";
            case MARCO:
                return "Março";
            case ABRIL:
                return "Abril";
            case MAIO:
                return "Maio";
            case JUNHO:
                return "Junho";
            case JULHO:
                return "Julho";
            case AGOSTO:
                return "Agosto";
            case SETEMBRO:
                return "Setembro";
            case OUTUBRO:
                return "Outubro";
            case NOVEMBRO:
                return "Novembro";
            case DEZEMBRO:
                return "Dezembro";
            default:
                return "Janeiro";
        }
    }
}
