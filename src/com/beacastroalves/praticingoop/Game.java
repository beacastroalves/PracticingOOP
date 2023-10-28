package com.beacastroalves.praticingoop;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.List;
import java.util.ArrayList;

public class Game extends Canvas implements Runnable {

  private Thread thread;
  private boolean running = false;

  private List<Square> squares;


  public void start() {
    this.thread = new Thread(this);
    this.thread.start();
    this.running = true;

    this.squares = new ArrayList<>();

    for (int i = 0; i < 20; i++) {
      int dx = (int) (Math.random() * (8 - (-8))) + (-8);
      int dy = (int) (Math.random() * (8 - (-8))) + (-8);
      Color color = new Color(
          (int) (Math.random() * 255),
          (int) (Math.random() * 255),
          (int) (Math.random() * 255)
      );

      this.squares.add(
          new Square(Constants.WIDTH / 2, Constants.HEIGHT / 2, dx, dy, color)
      );
    }
  }

  public void stop() {
    try {
      this.running = false;
      this.thread.join();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public void run() {
    this.createBufferStrategy(2);

    try {
      Thread.sleep(2);
    } catch (Exception e) {
      e.printStackTrace();
    }

    while (running) {
      try {
        Thread.sleep(4);
      } catch (Exception e) {
        e.printStackTrace();
      }
      this.render();
      this.process();
    }
  }

  private void process() {
    System.out.println("Process");
    for (int i = 0; i < this.squares.size(); i++) {
      Square square = this.squares.get(i);
      square.process();
    }
  }


  private void render() {
    System.out.println("Render");
    BufferStrategy bs = this.getBufferStrategy();

    Graphics g = bs.getDrawGraphics();

    g.setColor(Color.BLACK);
    g.fillRect(0, 0, Constants.WIDTH, Constants.HEIGHT);

    for (int i = 0; i < this.squares.size(); i++) {
      Square square = this.squares.get(i);
      square.render(g);
    }

    bs.show();
  }
}