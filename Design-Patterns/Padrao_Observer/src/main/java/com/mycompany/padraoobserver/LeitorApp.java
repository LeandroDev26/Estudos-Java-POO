package com.mycompany.padraoobserver;
import com.mycompany.padraoobserver.Leitor;

/**
 * Implementação Concreta do Observer (Leitor 2)
 * Reage à notícia "enviando um push notification".
 */
public class LeitorApp implements Leitor {

    private String idUsuario;

    public LeitorApp(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public void update(String noticia) {
        // Simula o envio de um push notification
        System.out.println("[Leitor APP: " + this.idUsuario + "] (Push) Você tem uma nova notícia: '" + noticia + "'");
    }
}