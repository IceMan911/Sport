/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team;

import java.util.logging.Level;
import java.util.logging.Logger;
import player.Player;

/**
 *
 * @author iceman
 */
public class Team implements ITeam {

    private Player player1;
    private Player player2;
    private int number;

    public Team(int number, Player playerOne, Player playerTwo) {
        if (checkNumber(number)) {
            this.number = number;
        }
        this.player1 = playerOne;
        this.player2 = playerTwo;
    }

    @Override
    public int getNumber() {
        return this.number;
    }

    @Override
    public String getPlayer1() {
        return this.player1.getFullName();
    }

    @Override
    public String getPlayer2() {
        return this.player2.getFullName();
    }

    private boolean checkNumber(int value) {
        boolean message = false;
        if (value > 0 && value < 20) {
            message = true;
        } else {
            try {
                throw new InterruptedException("Number must be between (0,20)");
            } catch (InterruptedException ex) {
                Logger.getLogger(Team.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return message;
    }

}
