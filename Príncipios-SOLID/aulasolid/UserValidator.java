/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulasolid;

/**
 *
 * @author LEAND
 */
public class UserValidator  {

    public boolean validateUser(User user){
      
       if (user.getUsername()== null || user.getUsername().length() < 3) {
           System.out.println("Erro: Nome de usuario inválido.");
           return false;
       }
       
       if (user.getEmail()== null || !user.getEmail().contains("@") || !user.getEmail().contains(".")){
            System.out.println("Erro: Email inválido.");
           return false;
       }
        
       if (user.getPassword() == null || user.getPassword().length() < 8){
        System.out.println("Erro: Senha é muito curta.");
    }
       return true;
    }
}
