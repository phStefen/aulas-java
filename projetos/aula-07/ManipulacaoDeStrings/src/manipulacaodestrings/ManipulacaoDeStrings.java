/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulacaodestrings;

import java.util.Scanner;

/**
 *
 * @author T-Gamer
 */
public class ManipulacaoDeStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Digite um Texto: ");
        String t1 = new Scanner(System.in).next(); 
        
        System.out.print("Digite outro Texto: ");
        String t2 = new Scanner(System.in).next();
        
        // Letras Maíusculas e Minusculas são DIFERENTES
        System.out.print("\nSem tratamento de CAPS ");
        if(t1.equals(t2)) System.out.println("os textos são IGUAIS");
        else System.out.println("os textos são DIFERENTES");
        
        // Letras Maíusculas e Minusculas são IGUAIS
        String e1 = t1.toLowerCase();
        String e2 = t2.toLowerCase();
        System.out.print("Com tratamento de CAPS BRUTO ");
        if(e1.equals(e2)) System.out.println("os textos são IGUAIS");
        else System.out.println("os textos são DIFERENTES");
        
        // Jeito Correto de Fazer a Comparação SEM ALTERAR o conteúdo
        System.out.print("Com tratamento de CAPS SEM ALTERAÇÃO ");
        if(e1.equalsIgnoreCase(e2)) System.out.println("os textos são IGUAIS");
        else System.out.println("os textos são DIFERENTES");
        
        // Converter o Texto em uma Array de Char
        char[] a1 = t1.toCharArray();
        System.out.print("\nO Texto separado em Arrays fica: ");
        for(char a : a1){
            System.out.print(a + " ");
        }
        
        // Mostrar cada Letra sem a necessidade de uma Conversão
        System.out.print("\nO Texto separado Sem o Uso de Array fica: ");
        for(int i = 0;i<t2.length();i++){
            System.out.print(t2.charAt(i) + " ");
        }
        
        //Busca de Char na String
        System.out.print("\n\nDigite uma Letra para Pesquisar no 1º Texto: ");
        char p1 = new Scanner(System.in).next().toLowerCase().charAt(0);
        System.out.println("O Caractere '" + p1 + "' se encontra na Posição: " + (t1.toLowerCase().indexOf(p1) + 1));
        
        //Buscar quantas Vezes o Char 
        System.out.print("\nDigite uma Letra para Quantas Vezes ela Aparece no 2º Texto: ");
        char p2 = new Scanner(System.in).next().toLowerCase().charAt(0);
        int inicio=0, posicao = t2.indexOf(p2), cont=0;
        while (inicio < t2.length() && posicao != -1) {
            inicio = posicao + 1;
            posicao = t2.indexOf(p2, inicio);
            cont++;
        }
        System.out.println("O Caractere '" + p2 + "' apareceu " + cont + " vezesa");
        
        //Buscar String no Nome
        System.out.print("\nDigite seu Nome Completo: ");
        String nome = new Scanner(System.in).next();
        
        if(nome.length()>6 && nome.substring(0,7).equalsIgnoreCase("Raphael")) System.out.println("Olá Raphael!");
        else System.out.println("Epa, Você não é Raphael!");
    }
}
