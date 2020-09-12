package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawPanel  extends JPanel{
    @Override
    public void paint (Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        //небо
        gr.setColor(Color.BLUE);
        gr.fillRect(0,0,2000,400);
        //земля
        gr.setColor(Color.GREEN);
        gr.fillRect(0,400,2000,400);
        //дерево
        gr.setColor(Color.gray);
        gr.fillRect(1150,250,50,230);
        gr.setColor(Color.GREEN);
        gr.fillOval(1070,100,200,235);
        gr.setColor(Color.GREEN);
        gr.fillOval(1100,95,90,90);
        gr.setColor(Color.GREEN);
        gr.fillOval(1140,90,90,90);
        gr.setColor(Color.GREEN);
        gr.fillOval(1065,130,90,90);
        gr.setColor(Color.GREEN);
        gr.fillOval(1180,115,90,90);
        gr.setColor(Color.GREEN);
        gr.fillOval(1195,160,90,90);
        gr.setColor(Color.GREEN);
        gr.fillOval(1195,205,90,90);
        gr.setColor(Color.GREEN);
        gr.fillOval(1165,245,90,90);
        gr.setColor(Color.GREEN);
        gr.fillOval(1120,255,90,90);
        gr.setColor(Color.GREEN);
        gr.fillOval(1080,240,90,90);
        gr.setColor(Color.GREEN);
        gr.fillOval(1060,215,90,90);
        gr.setColor(Color.GREEN);
        gr.fillOval(1055,190,70,70);
        gr.setColor(Color.RED);
        gr.fillOval(1070,190,30,30);
        gr.setColor(Color.RED);
        gr.fillOval(1220,220,30,30);
        gr.setColor(Color.RED);
        gr.fillOval(1165,140,30,30);
        gr.setColor(Color.RED);
        gr.fillOval(1105,270,30,30);
        gr.setColor(Color.RED);
        gr.fillOval(1095,520,30,30);
        //большое облако
        gr.setColor(Color.WHITE);
        gr.fillOval(600,150,170,90);
        gr.setColor(Color.WHITE);
        gr.fillOval(610,140,80,100);
        gr.setColor(Color.WHITE);
        gr.fillOval(640,125,90,126);
        gr.setColor(Color.WHITE);
        gr.fillOval(680,140,80,100);
        //маленькое облако
        gr.setColor(Color.WHITE);
        gr.fillOval(380,70,110,60);
        gr.setColor(Color.WHITE);
        gr.fillOval(390,65,40,67);
        gr.setColor(Color.WHITE);
        gr.fillOval(410,55,50,85);
        gr.setColor(Color.WHITE);
        gr.fillOval(440,65,40,67);
        //тело
        gr.setColor(Color.PINK);
        gr.fillOval(400,400,240,170);
        //голова
        gr.setColor(Color.PINK);
        gr.fillOval(340,340,140,120);
        //хвостик
        gr.setColor(Color.PINK);
        gr.drawOval(630,480,20,20);
        //контур головы
        gr.setColor(Color.LIGHT_GRAY);
        gr.drawOval(340,340,140,120);
        gr.setColor(Color.BLACK);
        gr.drawOval(385,400,50,30);
        //пятачок
        gr.setColor(Color.BLACK);
        gr.fillOval(403,415,5,5);
        gr.setColor(Color.BLACK);
        gr.fillOval(413,415,5,5);
        //глаза
        gr.setColor(Color.BLACK);
        gr.fillOval(375,375,20,20);
        gr.setColor(Color.BLACK);
        gr.fillOval(425,375,20,20);
        //ушки
        gr.setColor(Color.PINK);
        gr.fillRect(351,345,30,30);
        gr.setColor(Color.PINK);
        gr.fillRect(440,345,30,30);
        //лапки
        gr.setColor(Color.PINK);
        gr.fillOval(600,510,40,100);
        gr.setColor(Color.PINK);
        gr.fillOval(560,530,40,80);
        gr.setColor(Color.PINK);
        gr.fillOval(440,530,40,80);
        gr.setColor(Color.PINK);
        gr.fillOval(400,510,40,100);

        //цветок
        drawFlower(gr,900,700,10,25,8, Color.YELLOW, Color.WHITE);
        //солнце
        drawSun (gr, 100, 100, 50, 70, 43, Color.ORANGE);
    }
    public static void drawSun (Graphics2D g, int x, int y,int r, int R, int n, Color c) {
        g.setColor(c);
        g.fillOval(x - r, y - r, r * 2, r * 2);
        double da = 2 * Math.PI / n;
        for (int i = 0; i < n; i++) {
            double alpha = da * i;
            double x1 = r * Math.cos(alpha);
            double y1 = r * Math.sin(alpha);
            double x2 = R * Math.cos(alpha);
            double y2 = R * Math.sin(alpha);

            g.drawLine(x + (int) x1, y + (int) y1, x + (int) x2, x + (int) y2);
        }
    }
        public static void drawFlower (Graphics2D g, int m,int k,int rf, int Rf, int nf, Color c,Color h) {
            g.setColor(c);
            g.fillOval(m - rf, k - rf, rf * 2, rf * 2);
            double flo = 2 * Math.PI / nf;
            for (int i = 0; i < nf; i++) {
               double gamma = flo * i;
               double x3 = rf * Math.cos(gamma);
               double y3 = rf * Math.sin(gamma);
               double x4 = Rf * Math.cos(gamma);
               double y4 = Rf * Math.sin(gamma);
               g.setColor(Color.WHITE);
                g.drawLine(m + (int) x3, k + (int) y3, m + (int) x4, k + (int) y4);
                g.fillOval( 895, 705, 10, 25);
            }
        }
}

