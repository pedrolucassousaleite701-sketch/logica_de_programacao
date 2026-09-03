/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variaveis;

/**
 *
 * @author PedroLeite
 */

// importanto as bibliotecas do Scanner
import java.util.Scanner;


public class EntradaSaida {
    
   public static void main(String[] args) {
       
  // codigo para cadastrar o pet
  String nome;
  String raca;
  int idade;
  double peso;
  boolean foiVacinado;
  // criado as váriaveis de captura de dados
Scanner entradaTexto = new Scanner (System.in);
Scanner entradadanumero= new Scanner (System.in);
Scanner entradaLogica= new Scanner (System.in);
       
System.out.println("Digite o nome do seu pet");
nome= entradaTexto.nextLine();

System.out.println("bem-vindo(a) "+nome);

       
System.out.println("Digite a raça do seu pet");
raca = entradaTexto.nextLine();

System.out.println("Digite a idade do seu pet");
idade = entradadanumero.nextInt();

System.out.println("Digite o peso do seu pet");
peso = entradadanumero.nextDouble();

System.out.println("Seu pet foi vacinado");
System.out.println("digite true para sim,ou false para nao");
foiVacinado= entradaLogica.hasNext();

System.out.println("Bem-vindo(a) "+nome);
System.out.println("voce e da raca "+raca+" e tem "+idade+" anos");
System.out.println("Seu dono informa que seu peso e "+peso+" kg ");
System.out.println("E que seu status de vacina e "+foiVacinado);

       
}
  
} 
