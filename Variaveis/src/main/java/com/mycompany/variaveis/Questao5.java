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
public class Questao5 {
    public static void main(String[] args) {
        boolean maiordeidade;
        Scanner entradaLogica= new Scanner (System.in);
        
      System.out.println("Voce e maior e idade");
System.out.println("digite true para sim,ou false para nao");
maiordeidade=entradaLogica.hasNext();
System.out.println(" voce e maiordeidade "+maiordeidade);
    }
 
}
