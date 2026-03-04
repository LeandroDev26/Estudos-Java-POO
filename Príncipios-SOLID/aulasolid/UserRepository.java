/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulasolid;

/**
 *
 * @author LEAND
 */
public class UserRepository {
     
    public boolean saveToDatabase(User user){
       UserValidator validadorUser = new  UserValidator ();
      if (validadorUser.validateUser(user)){
            System.out.println("Salvando Usuario" + user.getUsername() + "...");
            return true;
}
    return false;
    }

   
}
