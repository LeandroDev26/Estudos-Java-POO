/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_04_11;

/**
 *
 * @author LEAND
 */

public class Produto implements IItens {
    
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    @Override
    public double calcularCusto() {
        System.out.println("  -> Produto: " + this.nome + ", Custo: R$" + String.format("%.2f", this.preco));
        return this.preco;
    }
}