package com.beacastroalves.practicingoop.two;

import java.awt.*;

public class Two extends javax.swing.JFrame {

  public Two() {
    super("Program Two");
    setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setSize(Constants.WIDTH, Constants.HEIGHT);
    setLocationRelativeTo(null);
  }

  public void test() {

  }

  public static void main(String[] args) {
    Two two = new Two();
    Core core = new Core();
    two.add(core);
    two.setVisible(true);
    core.start();
    core.run();
  }

}