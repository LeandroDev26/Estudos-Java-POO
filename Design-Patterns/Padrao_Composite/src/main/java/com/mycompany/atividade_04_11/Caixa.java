/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_04_11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LEAND
 */

public class Caixa implements IItens {
    
    // Lista para guardar os filhos (Produtos ou outras Caixas)
    private List<IItens> filhos = new ArrayList<>();
    private String nome;

    public Caixa(String nome) {
        this.nome = nome;
    }
    
    // Métodos para gerenciar os filhos
    public void adicionar(IItens item) {
        this.filhos.add(item);
    }

    public void remover(IItens item) {
        this.filhos.remove(item);
    }
    
    // Implementação do método da interface
    @Override
    public double calcularCusto() {
        System.out.println("\nCalculando custos da [CAIXA: " + this.nome + "]...");
        double total = 0.0;
        
        // Itera sobre todos os filhos e soma os custos deles
        for (IItens item : filhos) {
            // Chama o mesmo método no filho, de forma recursiva
            total += item.calcularCusto();
        }
        
        System.out.println("Subtotal da [CAIXA: " + this.nome + "]: R$" + String.format("%.2f", total));
        return total;
    }
}