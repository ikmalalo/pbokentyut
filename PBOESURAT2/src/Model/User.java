/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ikmal
 */
public abstract class User {
    private final String idUser;
    private final String name;
    private final String password;

    public User(String idUser, String name, String password){
        this.idUser = idUser;
        this.name = name;
        this.password = password;
    }


    public abstract String getRole();
}
