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
public class Questao6 {
    public static void main(String[] args) {
        int numero1 , numero2;
        double resultadoSoma, resultadoSubtracao ,
                resultadoMultiplicacao, resultadoDivisao;
        
        Scanner entradanumero = new Scanner(System.in);
        
        System.out.println("Digite um valor inteiros:");
                 numero1=entradanumero.nextInt();
        
        System.out.println("Digite outro valor inteiros");
        numero2 =entradanumero.nextInt();
        
        // SOMA
        resultadoSoma = numero1 + numero2 ;
        
        System.out.println("A soma dos numeros e:"+resultadoSoma);
    }
}
