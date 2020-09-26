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
        drawCloudBig(g, 560, 150, 55, 90, 3, Color.WHITE);
        drawCloudSmall(g,406,56,60,88,3,Color.WHITE);
    }

    public static void drawCloudBig(Graphics2D g, int x, int y, int w, int h, int n, Color c) {
        g.setColor(Color.WHITE);
        g.fillOval(540, 150, 210, 95);
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
        public static void drawCloudSmall(Graphics2D g, int x, int y, int w, int h, int n, Color c) {
            g.setColor(Color.WHITE);
            g.fillOval(390,60,210,78);
            for(int i = 0; i < n; i++){
                if ( i % 2 == 0){
                    g.setColor(Color.WHITE);
                    g.fillOval(x+i*w,y,w,h);}
                else {
                    g.setColor(Color.WHITE);
                    g.fillOval(x+50,y-22,w+20,h+40);}
            }}


}
