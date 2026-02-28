package com.mycompany.padraoobserver;

import com.mycompany.padraoobserver.Leitor;
import java.util.List;
import java.util.ArrayList;

public class Jornal {

    
    private List<Leitor> leitores = new ArrayList<>();
    
    // O estado que os observadores estão interessados
    private String ultimaNoticia;

   
    public void inscrever(Leitor leitor) {
        if (leitor != null && !leitores.contains(leitor)) {
            this.leitores.add(leitor);
            System.out.println("[JORNAL] " + leitor.getClass().getSimpleName() + " se inscreveu.");
        }
    }

   
    public void desinscrever(Leitor leitor) {
        if (leitor != null && leitores.contains(leitor)) {
            this.leitores.remove(leitor);
            System.out.println("[JORNAL] " + leitor.getClass().getSimpleName() + " se desinscreveu.");
        }
    }

   
    private void notificarLeitores() {
        System.out.println("[JORNAL] Notificando " + leitores.size() + " leitores...");
        for (Leitor leitor : this.leitores) {
            leitor.update(this.ultimaNoticia);
        }
    }

    
    public void publicarNoticia(String noticia) {
        this.ultimaNoticia = noticia;
        System.out.println("\n--- [JORNAL] Nova publicação: '" + noticia + "' ---");
        // Após mudar o estado, notifica todos os inscritos
        notificarLeitores();
    }
}