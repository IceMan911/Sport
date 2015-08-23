/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team;

import player.Player;

/**
 *
 * @author iceman
 */
public class Team implements ITeam {

    private Player player1;
    private Player player2;
    private int number;

    public Team(int number, Player hrac1, Player hrac2) {
        this.number = number;
        this.player1 = hrac1;
        this.player2 = hrac2;
    }

    @Override
    public int setNumber() {
        int insertNumber = 0;
        if (this.number > 0 && this.number <= 20) {
            insertNumber = this.number;
        } else {
            insertNumber = 100;
        }
        return insertNumber;
    }

    @Override
    public int getNumber() {
        return this.number;
    }

    @Override
    public int checkNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
