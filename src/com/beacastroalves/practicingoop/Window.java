package com.beacastroalves.practicingoop;

import javax.swing.JFrame;

public class Window extends JFrame {
    public Window(){
        setTitle("Praticing OOP");
        setSize(Constants.WIDTH, Constants.HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    public static void main(String[] args) {
        Window window = new Window();

        Game game = new Game();
        window.add(game);

        window.setVisible(true);
        game.start();

    }
}