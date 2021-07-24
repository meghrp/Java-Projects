package com.raj;

import java.awt.BorderLayout;
import javax.swing.*;

public class Tetris extends JFrame {
    private JLabel statusBar;

    public Tetris() {
        statusBar = new JLabel ("0");
        statusBar.setFont(new java.awt.Font("Arial", 1, 20))    ;
        add (statusBar, BorderLayout.SOUTH);
        Board board = new Board(this);
        add(board);

        board.start();

        setSize(200,400);
        setTitle("Awesome Tetris Game");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public JLabel getStatusBar(){
        return statusBar;
    }

    public static void main (String [] args) {
        Tetris myTetris = new Tetris ();
        myTetris.setLocationRelativeTo(null);
        myTetris.setVisible(true);
    }
}
