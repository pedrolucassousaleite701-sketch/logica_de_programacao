/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variaveis;

import java.util.Scanner;

/**
 *
 * @author PedroLeite
 */
public class Questao3 {
    public static void main(String[] args) {
        // variavel
       // criado as váriaveis de captura de dados
        Scanner entradanumero = new Scanner (System.in);

        double nota1, nota2, media;
        
        System.out.print("Digite a primeira nota: ");
        nota1 = entradanumero.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        nota2 = entradanumero.nextInt();
        
        
        media= (nota1 + nota2) / 2;
        
        System.out.println("A média é: " + media);
        
        
        
    }
}
        
        
        
        
        
        
        
    
   

