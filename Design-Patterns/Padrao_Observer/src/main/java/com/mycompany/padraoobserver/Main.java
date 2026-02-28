package com.mycompany.padraoobserver;

import com.mycompany.padraoobserver.Jornal;
import com.mycompany.padraoobserver.Leitor;
import com.mycompany.padraoobserver.LeitorEmail;
import com.mycompany.padraoobserver.LeitorApp;


public class Main {
    public static void main(String[] args) {
        // 1. Criar o Subject (Jornal)
        Jornal folha = new Jornal();

        // 2. Criar os Observers (Leitores)
        Leitor leitor1 = new LeitorEmail("joao@email.com");
        Leitor leitor2 = new LeitorApp("usuario_maria123");
        Leitor leitor3 = new LeitorEmail("ana@email.com");

        // 3. Leitores se inscrevem no jornal
        folha.inscrever(leitor1);
        folha.inscrever(leitor2);
        folha.inscrever(leitor3);

        // 4. Jornal publica uma notícia (Todos os 3 devem ser notificados)
        folha.publicarNoticia("Economia cresce 2% no último trimestre");

        // 5. Um leitor se desinscreve
        folha.desinscrever(leitor3);

        // 6. Jornal publica outra notícia (Apenas os 2 restantes devem ser notificados)
        folha.publicarNoticia("Novas descobertas científicas anunciadas");
    }
}