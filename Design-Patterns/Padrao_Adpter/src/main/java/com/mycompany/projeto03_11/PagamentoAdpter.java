/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto03_11;

/**
 *
 * @author LEAND
 */
public class PagamentoAdpter implements PagamentoAntigo{
   
    private PagamentoNovo pagamentoNovo;

    public PagamentoAdpter(PagamentoNovo pagamentoNovo) {
        this.pagamentoNovo = pagamentoNovo;
    }
    
    
    
    @Override
    public void pagarComCartao(String NumeroCartao) {
        pagamentoNovo.processarPagamento(NumeroCartao, 133.0);
    }
    
}
