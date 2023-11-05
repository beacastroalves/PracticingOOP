package com.beacastroalves.practicingoop.one;

import javax.swing.JFrame;

public class One extends JFrame {
    public One(){
        setTitle("Praticing OOP");
        setSize(Constants.WIDTH, Constants.HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    public static void main(String[] args) {
        One one = new One();

        Game game = new Game();
        one.add(game);

        one.setVisible(true);
        game.start();

    }
}