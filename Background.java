package com.company;

import java.awt.*;

public class Background implements Drawable {
    private int x, y, w, h;
    private Color c;

    public Background(int x, int y, int w, int h, Color c) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    @Override
    public void draw(Graphics2D g) {
        drawSky(g, 0, 0, 2000, 400, Color.BLUE);
        drawGrass(g,0,400,2000,400, Color.GREEN);
        drawApple(g,650,650,30,30, Color.RED);
    }

    public static void drawSky(Graphics2D g, int x, int y, int w, int h, Color c) {
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 2000, 400);
    }
    public static void drawGrass(Graphics2D g, int x, int y, int w, int h, Color c) {
        g.setColor(Color.GREEN);
        g.fillRect(0, 400, 2000, 400);
    }
    public static void drawApple(Graphics2D g,int x, int y,int w, int h, Color c){
        g.setColor(Color.RED);
        g.fillOval(650,650,30,30);
    }

}

