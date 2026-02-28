package com.mycompany.padraoobserver;


import com.mycompany.padraoobserver.Leitor;

/**
 * Implementação Concreta do Observer (Leitor 1)
 * Reage à notícia "enviando um email".
 */
public class LeitorEmail implements Leitor {
    
    private String email;

    public LeitorEmail(String email) {
        this.email = email;
    }

    @Override
    public void update(String noticia) {
 // Simula o envio de um email
        System.out.println("[Leitor EMAIL: " + this.email + "] Notícia recebida: '" + noticia + "'");    }
}