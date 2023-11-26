package com.beacastroalves.practicingoop.two;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Core extends Canvas implements Runnable {
  private Thread thread;
  private boolean running;
  private int x = 10;

  public void start() {
    this.thread = new Thread(this, "Name");
    //this.thread.start();
    this.running = true;

  }

  @Override
  public void run() {
    this.createBufferStrategy(2);

    while (this.running) {
      this.process();
      this.render();
    }
  }

  private void process() {
    this.x += 1;
  }

  private void render() {
    BufferStrategy bs = this.getBufferStrategy();
    Graphics g = bs.getDrawGraphics();
    g.setColor(Color.BLACK);
    g.fillRect(0,0, Constants.WIDTH, Constants.HEIGHT);
    g.setColor(Color.BLUE);
    g.fillRect(this.x,(Constants.HEIGHT / 2) - 400 / 2, 40, 40);

    bs.show();
  }


}
