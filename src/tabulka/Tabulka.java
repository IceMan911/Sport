/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabulka;

import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import team.Team;

/**
 *
 * @author iceman
 */
public class Tabulka {

//    public static DefaultTableModel createTable(DefaultListModel<Team> tymy, int number) {
//        String[] columnNames = jmenaTabulky(tymy);
//        int rowCount = number;
//        DefaultTableModel tabulka = new DefaultTableModel(columnNames, rowCount);
//
//        return tabulka;
//    }

    public static int[] jmenaTabulky(DefaultListModel<Team> tymy) {
        int[] cislo = new int[tymy.size()];
        for (int i = 0; i < tymy.size(); i++) {
            cislo[i] = tymy.getElementAt(i).getNumber();
        }

        return cislo;
    }

}
