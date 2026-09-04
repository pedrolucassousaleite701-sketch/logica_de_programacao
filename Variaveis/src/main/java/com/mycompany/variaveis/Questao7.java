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
public class Questao7 {
    public static void main(String[] args) {
       
        int idade ;//valor inteiro
        double altura ;//valor decimal grande 
        float peso ; // valor decimal pequeno
        String nome ;//textos
        
        
        // scanners
        Scanner entradaTexto = new Scanner (System.in);
        Scanner entradadanumero= new Scanner (System.in);
        Scanner entradaLogica= new Scanner (System.in);
        
        
        //solicitar os valores para a pessoa digitar
        System.out.println("Digite seu nome");
        nome= entradaTexto.nextLine();
        System.out.println("Digite sua idade");
        idade = entradadanumero.nextInt();
        System.out.println("Digite seu peso");
        peso = (float) entradadanumero.nextDouble();
         System.out.println("Digite seu altura");
        altura =  entradadanumero.nextDouble();
        
        //imprimir
         
         System.out.println("ola "+nome);
         System.out.println("sua idade e:"+idade);
         System.out.println("seu peso e:"+peso);
         System.out.println("sua altura e:"+altura);
         
    }
}
