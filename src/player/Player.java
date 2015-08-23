/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

/**
 *
 * @author iceman
 */
public class Player implements IPlayer {

    private String firstName;
    private String surname;

    public Player(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getFullName() {
        return firstName + " " + surname;
    }

}
