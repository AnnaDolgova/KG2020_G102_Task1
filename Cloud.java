package com.company;

import java.awt.*;

public class Cloud implements Drawable {
    private int x, y, w, h, n;
    private Color c;

    public Cloud (int x, int y, int w, int h, int n, Color c) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.n = n;
    }
    @Override
    public void draw(Graphics2D g) {
        drawCloud(g, x, y, w, h, n, Color.WHITE);
    }

    public static void drawCloud(Graphics2D g, int x, int y, int w, int h, int n, Color c) {
        g.setColor(Color.WHITE);
        g.fillOval(x-20, y, w+155, h+5);
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                g.setColor(Color.WHITE);
                g.fillOval(x + i * w, y - 10, w + 9, h + 20);
            } else {
                g.setColor(Color.WHITE);
                g.fillOval(x + 42, y - 32, w + 34, h + 60);
            }
        }
    }



}
