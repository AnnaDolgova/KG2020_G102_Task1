package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DrawPanel  extends JPanel{
    private static Random rnd = new Random();

    Sun s = new Sun(100, 100, 50, 70, 43, Color.ORANGE);
    Background f = new Background(0, 0, 2000, 400, Color.BLUE);
    Pig piglet = new Pig(rnd.nextInt(310) + 50,340,140,120,Color.PINK);
    Pig pigletCousen = new Pig(750,340,145,125,Color.PINK);
    Cloud cloud = new Cloud(560, 150, 55, 90, 3, Color.WHITE);
    Cloud cloud1 = new Cloud(330, 105, 55, 90, 3, Color.WHITE);
    Text text = new Text (50,720, Color.DARK_GRAY);
    @Override
    public void paint (Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        f.draw(gr);
        cloud.draw(gr);
        cloud1.draw(gr);
        piglet.draw(gr);
        pigletCousen.draw(gr);
        text.draw(gr);
        s.draw(gr);
    }
}
