/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadeusuario;

/**
 *
 * @author LEAND
 */

public class Login {

    public boolean validarUsuario(String user, String senha) {
        // Validação do Usuário (E-mail)
        String padrao = "@unifucamp.edu.br";
        if (user == null || !user.trim().endsWith(padrao)) {
            System.out.println("Usuário inválido!");
            return false;
        }

        // Validação da Senha
        if (senha == null) {
            System.out.println("Senha inválida! (Nula)");
            return false;
        }

        boolean valido = true;

        // Tamanho mínimo
        if (senha.length() < 8) {
            System.out.println("Senha inválida! Deve ter no mínimo 8 caracteres");
            valido = false;
        }

        // Maiúscula (Ajustei a Regex: o ".*" garante que a letra esteja em qualquer lugar)
        if (!senha.matches(".*[A-Z].*")) {
            System.out.println("Senha inválida! Deve conter letra maiúscula");
            valido = false;
        }

        // Número
        if (!senha.matches(".*\\d.*")) {
            System.out.println("Senha inválida! Deve conter número");
            valido = false;
        }

        return valido;
    }
}