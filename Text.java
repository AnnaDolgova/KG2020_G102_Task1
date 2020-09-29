package com.company;
import java.awt.*;

public class Text implements Drawable {
    private int x, y;
    private Color c;

    public Text (int x, int y, Color c) {
        this.x = x;
        this.y = y;
    }
    @Override
    public void draw(Graphics2D g) {
        drawText(g,x,y,Color.DARK_GRAY);
    }
    public static void drawText(Graphics2D g, int x, int y, Color c) {
        g.setPaint(Color.DARK_GRAY);
        g.setFont(new Font("Ink Free",Font.ROMAN_BASELINE,50));
        g.drawString("There once was a pig named Piglet...",50, 720);
}}

