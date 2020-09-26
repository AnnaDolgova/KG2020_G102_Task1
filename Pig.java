package com.company;

import java.awt.*;

public class Pig implements Drawable {
    private int x, y, w, h, n;
    private Color c;
    public Pig (int x, int y, int w, int h, int n, Color c) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.n = n;
    }
    @Override
    public void draw(Graphics2D g) {

        drawLeg(g,400, 510,40, 100,4, Color.PINK);
        drawBody(g, 400,400,240,170, 1, Color.PINK);
        drawHead(g,340,340,140,120,1,Color.PINK);
        drawNose(g,400,415,5,5, 2, Color.BLACK);
        drawEyes(g, 375,375,20,20,2, Color.BLACK);
    }
    public static void drawBody(Graphics2D g, int x, int y, int w, int h, int n, Color c) {
        g.setColor(Color.PINK);
        g.fillOval(400,400,240,170);
        g.setColor(Color.PINK);
        g.drawOval(630,480,20,20);
    }

    public static void drawHead(Graphics2D g, int x, int y, int w, int h, int n, Color c) {
        g.setColor(Color.PINK);
        g.fillOval(340,340,140,120);
        g.setColor(Color.LIGHT_GRAY);
        g.drawOval(340,340,140,120);
        g.setColor(Color.BLACK);
        g.drawOval(385,400,50,30);
        g.setColor(Color.PINK);
        g.fillRect(351,345,30,30);
        g.setColor(Color.PINK);
        g.fillRect(440,345,30,30);
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
            g.fillOval((x + 5) + w * i + 25 * i,y, w, h);
    }
}}