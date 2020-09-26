package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DrawPanel  extends JPanel{
    private static Random rnd = new Random();

    private Sun s = new Sun(rnd.nextInt(100) + 50, 100, 50, 70, 43, Color.ORANGE);
    private Background sk = new Background(0, 0, 2000, 400, Color.BLUE);
    private Background grass = new Background(0, 400, 2000, 400, Color.GREEN);
    private Background apple = new Background(rnd.nextInt(450)-200, rnd.nextInt(450)+75,30,30,Color.RED);
    private Pig leg = new Pig(400, 510,40, 100, 4, Color.PINK);
    private Cloud cloud1 = new Cloud(820, 140, 80, 100, 3, Color.WHITE);
    private Cloud cloud2 = new Cloud (390,65,40,67,3,Color.WHITE);
    private Pig body = new Pig(400,400,240,170, 1, Color.PINK);
    private Pig head = new Pig(340,340,140,120,1,Color.PINK);
    private Text text = new Text (50,720, Color.DARK_GRAY);
    private Pig nose = new Pig (400,415,5,5, 2, Color.BLACK);
    private Pig eyes = new Pig(375,375,20,20,2, Color.BLACK);
    @Override
    public void paint (Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        sk.draw(gr);
        grass.draw(gr);
        apple.draw(gr);
        cloud1.draw(gr);
        cloud2.draw(gr);
        body.draw(gr);
        head.draw(gr);
        leg.draw(gr);
        text.draw(gr);
        nose.draw(gr);
        eyes.draw(gr);
        s.draw(gr);
    }
}
