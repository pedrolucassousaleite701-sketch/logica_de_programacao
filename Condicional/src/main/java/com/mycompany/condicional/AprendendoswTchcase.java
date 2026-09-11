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
public class AprendendoswTchcase {
    public static void main(String[] args) {
       
        //Sistema de Agendamento de Serviços Pet
        
        String nomePet, racaPet;
        int idadePet, opcaoServico;
        
        
        Scanner entradaTexto = new Scanner(System.in);
        Scanner entradaNumero = new Scanner(System.in);
        
        // solicitar os dados
        
        System.out.println("Ola!, Por favor comesse digite o nome do seu Pet");
        nomePet = entradaTexto.nextLine();
        System.out.println("Seja Bem-Vindo (a)"+nomePet+", Qual e o tipo de raca dele?");
        racaPet = entradaTexto.nextLine();
        System.out.println("Agora que sabemos sua raca, Por favor, nos informa idade do seu Pet");
        idadePet = entradaNumero.nextInt();
        System.out.println("Escolha um de nossos tipos de servicos ");
        System.out.println("1-tosa\n2-banho\n3-banho e tosa\n4-Veterinario");
        opcaoServico = entradaNumero.nextInt();
        
        // analizando o serviço com switch case
        
        switch (opcaoServico){
            case 1:
                System.out.println(nomePet+" voce possui "+idadePet+" anos de idade, e da raca "+racaPet+" e escolha o servico tosa.");
                
        break;
            case 2:
                System.out.println(nomePet+" voce possui "+idadePet+" anos de idade, e da raca "+racaPet+" escolheu o servico de banho.");
                break;
            case 3:
                System.out.println(" voce possui "+idadePet+" anos de idade, e da raca "+racaPet+" e escolheu o servico banho e tosa.");
                
                break;
            case 4:
                System.out.println(nomePet+" voce possoi "+idadePet+" anos de idade,  da raca "+racaPet+" e escolheu o servico Veterinario.");
                break;
            default:
                System.out.println("A opcao escolhida e"+ " invalida!");
                break;
        
        }// fim do switch case¨
         
               
    }
    }
    
