package com.company;

import java.awt.*;

public class Pig implements Drawable {
    private int x, y, w, h;
    private Color c;
    public Pig (int x, int y, int w, int h, Color c) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    @Override
    public void draw(Graphics2D g) {
        drawLeg(g,x+60, y+170,w-100, h-20,4, Color.PINK);
        drawBody(g, x+60,y+60,w+100,h+50,  Color.PINK);
        drawHead(g,x,y,w,h,Color.PINK);
        drawNose(g,x+60,y+75,w-135,h-115, 2, Color.BLACK);
        drawEyes(g, x+35,y+35,w-120,h-100,2, Color.BLACK);
    }
    public static void drawBody(Graphics2D g, int x, int y, int w, int h, Color c) {
        g.setColor(Color.PINK);
        g.fillOval(x,y,w,h);
        g.setColor(Color.PINK);
        g.drawOval(x+230,y+80,w-220,h-150);
    }

    public static void drawHead(Graphics2D g, int x, int y, int w, int h, Color c) {
        g.fillOval( x,y,w,h);
        g.setColor(Color.LIGHT_GRAY);
        g.drawOval( x,y,w,h);
        g.setColor(Color.BLACK);
        g.drawOval(x+45,y+60,w-90,h-90);
        g.setColor(Color.PINK);
        g.fillRect(x+11,y+5,w-110,h-90);
        g.setColor(Color.PINK);
        g.fillRect(x+100,y+5,w-110,h-90);
    }
    public static void drawNose(Graphics2D g, int x, int y, int w, int h, int n, Color c) {
        g.setColor(Color.BLACK);
        for (int i = 0; i < n; i++) {
            g.fillOval(x + w * i + 10 * i, y, w, h);}
    }
    public static void drawEyes(Graphics2D g, int x, int y, int w, int h, int n, Color c) {
        g.setColor(Color.BLACK);
        for (int i = 0; i < n; i++) {
            g.fillOval(x  + w * i + 28 * i, y, w, h);}
    }

    public static void drawLeg(Graphics2D g, int x, int y, int w, int h, int n, Color c) {
        g.setColor(Color.PINK);
        for (int i = 0; i < n; i++) {
            g.fillOval(x + i * w + 20 * i, y, w, h);
    }
}}
