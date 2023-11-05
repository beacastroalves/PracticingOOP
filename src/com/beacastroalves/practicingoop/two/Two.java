package com.beacastroalves.practicingoop.two;

public class Two extends javax.swing.JFrame {

  public Two() {
    super("Program Two");
    setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setSize(Constants.WIDTH, Constants.HEIGHT);
    setLocationRelativeTo(null);
  }

  public static void main(String[] args) {
    Two two = new Two();
    two.setVisible(true);
  }

}