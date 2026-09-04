/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variaveis;

/**
 *
 * @author PedroLeite
 */
import java.util.Scanner;
        
public class questão1 {
    public static void main(String[] args) {
         // variavel
         String nome;
         //criar a entrada
         Scanner entradaTexto= new
             Scanner(System.in);
         //solicitar que o usuario digite seru nome
         System.out.println("Digite o seu nome:");
         nome=  entradaTexto.nextLine();
         
         // imprimir a mensagen
         System.out.println("Ola,"+nome+"seja bem-vindo(a) ao Jave.");
         
         
         
     } 
}
