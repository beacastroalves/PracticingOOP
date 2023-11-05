package com.beacastroalves.practicingoop.one;

import java.awt.Graphics;
import java.awt.Color;

public class Square {

  private int x;
  private int y;
  private int dx;
  private int dy;
  private Color color;



  public Square (int x, int y, int dx, int dy, Color color) {
    this.x = x;
    this.y = y;
    this.dx = dx;
    this.dy = dy;
    this.color = color;
  }


  public void process() {
    this.x += dx;
    this.y += dy;

    if (this.x < 0 || this.x > (Constants.WIDTH - 30)) {
      this.dx *= -1;
    }

    if (this.y < 0 || this.y > (Constants.HEIGHT - 60)) {
      this.dy *= -1;
    }

  }

  public void render(Graphics g) {
    g.setColor(this.color);
    g.fillRect(this.x, this.y, 30, 30);

  }

}