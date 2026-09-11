/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.condicional;

import java.util.Scanner;

/**
 *
 * @author PedroLeite
 */
public class Desafio {
    public static void main(String[] args) {
        
        // Variaveis
       int idade; 
       String nome,tipodeingresso;
       boolean altorizacao;

       //Scanner
       Scanner entradaNumero = new Scanner(System.in);
       Scanner entradaTexto = new Scanner(System.in);
       Scanner entradaLogica = new Scanner(System.in);
       
       //  SOLICITAÇÕES
       
       System.out.println("Digite seu nome");
       nome = entradaTexto.nextLine();
       
       System.out.println("Por favor, Digite sua idade!");
       idade = entradaNumero.nextInt();
       
       System.out.println("Qual e o seu tipo de ingrasso? Vip ou Comun");
       tipodeingresso = entradaLogica.nextLine();
       
        System.out.println("Digite sua altorização");
        altorizacao= entradaLogica.hasNext();
        
        System.out.println("Olá! seu nome e"+nome +"A sua idade e");
        boolean autorizacao;
        
        
       
       
       
       
       // VARIAÇÕES COM IF ELSE
       
       if(idade>=18 && tipodeingresso.equals("Vip")){
            System.out.println("Acesso Vip Liberado");
       }else if(idade>=18 && tipodeingresso.equals("Comuns")){
           System.out.println("Acesso Comun Liberado");
       }else if((idade==16 || idade==17) && altorizacao==true){
           System.out.println("Acesso liberado com autorizacao, Diverta-se sua sala Vip!");
       }else if(tipodeingresso.equals("Professor")){
           
       }   
           
       
           
           
               
        }
        }
       
       
       
       
       
       
    
    

