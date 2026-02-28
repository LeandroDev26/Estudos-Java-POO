/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_04_11;

/**
 *
 * @author LEAND
 */

public class main {

    public static void main(String[] args) {
        

        IItens mouse = new Produto("Mouse Gamer", 95.50);
        IItens teclado = new Produto("Teclado Mecânico", 280.00);
        IItens headset = new Produto("Headset 7.1", 450.00);
        IItens monitor = new Produto("Monitor Ultrawide", 1300.00);

        // Criar uma caixa interna (Composite)
        Caixa caixaPerifericos = new Caixa("Caixa de Periféricos");
        
        // Adicionar produtos à caixa interna
        caixaPerifericos.adicionar(mouse);
        caixaPerifericos.adicionar(teclado);

        // Criar a caixa principal do pedido (Composite)
        Caixa pedidoCompleto = new Caixa("Pedido Completo - Setup Gamer");

        // Adicionar itens à caixa principal:
        pedidoCompleto.adicionar(headset);          // Adiciona um Produto
        pedidoCompleto.adicionar(monitor);          // Adiciona um Produto
        pedidoCompleto.adicionar(caixaPerifericos); // Adiciona a OUTRA CAIXA

        //  Calcular o custo total
        System.out.println("=========================================");
        System.out.println("   Calculando o Custo Total do Pedido    ");
        System.out.println("=========================================");
        
        // O cliente só chama o método na caixa principal.
        // O padrão composite cuida de todo o cálculo recursivo.
        double custoTotal = pedidoCompleto.calcularCusto();

        System.out.println("\n=========================================");
        System.out.println("CUSTO TOTAL FINAL DO PEDIDO: R$" + String.format("%.2f", custoTotal));
        System.out.println("=========================================");
    }
}