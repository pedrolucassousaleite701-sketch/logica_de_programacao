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
public class Exemplo2 {
    public static void main(String[] args) {
        
        // variavel
        int quantidadeMiojo, quantidadeSalada;
        
        // Scenner
        Scanner entradaNumero= new Scanner(System.in);
        
        //Solocitar os dados para o usuario
        System.out.println("A quantidade dias que você não come miojo?");
        quantidadeMiojo = entradaNumero.nextInt();
        System.out.println("A quantos dias você não come salada?");
        quantidadeSalada = entradaNumero.nextInt();
        
        if(quantidadeMiojo<2 || quantidadeSalada>7){
            System.out.println("Pouco saudavel");    
        }
        if(quantidadeMiojo>2 || quantidadeSalada<7){
            System.out.println("Saudavel");
            
          
        }
    }
}
