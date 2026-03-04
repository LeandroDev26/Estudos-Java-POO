/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.aulasolid;

import com.mycompany.aulasolid.Aula2.Relatorio;

/**
 *
 * @author LEAND
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("--- Testando Sistema de Validação e Salvamento ---");

        UserRepository repository = new UserRepository();

        // Cenário 1: Usuário totalmente válido
        System.out.println("\n[Cenário 1] Usuário Válido:");
        User usuarioValido = new User("Leandro", "leandro@email.com", "senhaForte123");
        boolean salvo1 = repository.saveToDatabase(usuarioValido);
        System.out.println("Status final: " + (salvo1 ? "Sucesso" : "Falha"));

        // Cenário 2: Usuário com nome inválido (menos de 3 caracteres)
        System.out.println("\n[Cenário 2] Nome Inválido:");
        User nomeInvalido = new User("Le", "leandro@email.com", "senhaForte123");
        boolean salvo2 = repository.saveToDatabase(nomeInvalido);
        System.out.println("Status final: " + (salvo2 ? "Sucesso" : "Falha"));

        // Cenário 3: Usuário com e-mail inválido (sem @)
        System.out.println("\n[Cenário 3] E-mail Inválido:");
        User emailInvalido = new User("Leandro", "leandro.com", "senhaForte123");
        boolean salvo3 = repository.saveToDatabase(emailInvalido);
        System.out.println("Status final: " + (salvo3 ? "Sucesso" : "Falha"));

        // Cenário 4: Usuário com senha muito curta (menos de 8 caracteres)
        System.out.println("\n[Cenário 4] Senha Curta:");
        User senhaCurta = new User("Leandro", "leandro@email.com", "12345");
        boolean salvo4 = repository.saveToDatabase(senhaCurta);
        System.out.println("Status final: " + (salvo4 ? "Sucesso" : "Falha"));
    }
}
