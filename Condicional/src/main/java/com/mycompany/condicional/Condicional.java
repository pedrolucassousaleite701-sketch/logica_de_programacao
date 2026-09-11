/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicional;

import java.util.Scanner;

/**
 *
 * @author PedroLeite
 */
public class Condicional {

    public static void main(String[] args) {
        /*Condicional é o codigo utilizado para
        avaliar dados, e se for a verdade realiza uma
        ação, e se for falso realiza outra ação.
        SE - IF
        SENÃO -BLSE
        
        TABELA LOGICA:
        > MAIOR QUE
        < MENOR QUE 
        >= MAIOR QUE IGUAL
        <= MENRO OU IGUAL
        == IGUAL
        =! DIFERENTE
        */
        //Váriavel
        int idade;
        
        // Váriavel de entrada de dados
        Scanner entradaNumero = new Scanner(System.in);
        
        //solicitação para o usuario
         System.out.println("Digite a sua idade");
         idade = entradaNumero.nextInt();
        
         //análise da idade (processamento)
         if(idade>=18){
           System.out.println("você é maior de idade");
       }else{
             System.out.println("você  é menor de idade");
       }// fim do else
        
    }
}
