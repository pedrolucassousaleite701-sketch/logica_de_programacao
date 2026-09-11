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
public class Atividadesuitchcase {
    public static void main(String[] args) {
        
        int quantidade,numeroProduto;
        double valortotal;
        
        //Scanner
        
        Scanner entradaNumero = new Scanner(System.in);
        
          System.out.println("Qual e o seu tipo de escolha do nosso cardapio?");
        System.out.println("1 - Hamburguer R$ 15,00\n2 - Pizza R$ 25,00\n3 - Cachorro quente R$ 12,00\n4 - Refrigerante R$ 6,00\n5 - Suco R$ 8,00");
        numeroProduto= entradaNumero.nextInt();
        System.out.println("Quantas unidades voce vai querer do produto?");
        System.out.println("1 - \n2 - \n3 - \n4 - \n5 - \n6 -\n7 - \n8 - \n9 - \n10 -");
        numeroProduto= entradaNumero.nextInt();
        System.out.println("Qual e a sua forma de pagamento?");
        System.out.println("1 - cartao\n2 - dinehiro\n3 - Pix");
        numeroProduto= entradaNumero.nextInt();
        System.out.println("seu pedido esta sendo preparado..");
        
        //Swintch case
        
        switch(numeroProduto){
            case 1:
            int valorTotal = 15*quantidade;
                System.out.println("=====Pedidos=====");
                System.out.println("Produto: Hamburguer\nQuantidade:");
                         quantidadede+"\nPreco unitario:R$15,00\n"+"Valor total:"+valorTotal);
                         
            break;
            case 2:
                
                         

             }
        
        
        
        
        
        
        
        
        
                   
    }
}

    private static void swintch(int numeroProduto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
