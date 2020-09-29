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
        drawSky(g, x, y, w, h, Color.BLUE);
        drawGrass(g,x,y+400,w,h, Color.GREEN);
    }

    public static void drawSky(Graphics2D g, int x, int y, int w, int h, Color c) {
        g.setColor(Color.BLUE);
        g.fillRect(x, y, w, h);
    }
    public static void drawGrass(Graphics2D g, int x, int y, int w, int h, Color c) {
        g.setColor(Color.GREEN);
        g.fillRect(x, y, w, h);
    }
    }

