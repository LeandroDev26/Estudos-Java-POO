/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulasolid.Aula2;

/**
 *
 * @author LEAND
 */
public class Relatorio {
    private String conteudo;

    public Relatorio(String conteudo) {
        this.conteudo = conteudo;
    }

    public Relatorio() {
        
    }

  
    public void gerarRelatorio(){
        System.out.println("Gerando relatório com conteúdo:" + conteudo);
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "Relatorio{" + "conteudo=" + conteudo + '}';
    }
    
    
     
}
