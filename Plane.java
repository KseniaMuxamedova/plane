package ru.vsu.cs.dunaeva;

import java.awt.*;

public class Plane {

    private int x;

    public Plane( final int x) {
        this.x = x;

    }

    public void setX(int x) {
        this.x = x;
    }


    void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        //footprint
        int[] arrax = {0, this.x + 50, this.x + 50, 0};
        int[] array = {240, 290, 365, 410};
        Polygon poly = new Polygon(arrax, array, 4);
        g2d.setColor(Color.WHITE);
        g2d.drawPolygon(poly);
        g2d.fillPolygon(poly);

        //upper part of tail
        g2d.setColor(Color.BLACK);
        int[] arrayX = {this.x + 50,this.x + 40, this.x + 50, this.x + 90};
        int[] arrayY = {317, 290, 290, 317};
        Polygon pol = new Polygon(arrayX, arrayY, 4);
        g2d.drawPolygon(pol);
        g2d.setColor(Color.GRAY);
        g2d.fillPolygon(pol);

        //upper part of wing
        g2d.setColor(Color.BLACK);
        int[] arrx = {this.x + 120, this.x + 90, this.x + 100, 170 + this.x};
        int[] arry = {317, 240, 240, 317};
        Polygon polyn = new Polygon(arrx, arry, 4);
        g2d.drawPolygon(polyn);
        g2d.setColor(Color.GRAY);
        g2d.fillPolygon(polyn);

        //plane
        g2d.setColor(Color.BLACK);
        g.drawOval(40 + this.x, 310, 190, 30);
        g2d.setColor(Color.DARK_GRAY);
        g2d.fillOval(40 + this.x, 310, 190, 30);
        g2d.setColor(Color.BLACK);

        //lower part of tail
        int[] arrayy = {330, 365, 365, 335};
        Polygon polyr = new Polygon(arrayX, arrayy, 4);
        g2d.drawPolygon(polyr);
        g2d.setColor(Color.GRAY);
        g2d.fillPolygon(polyr);

        //lower part of wing
        g2d.setColor(Color.BLACK);
        int[] arrY = {337, 410, 410, 337};
        Polygon polyt = new Polygon(arrx, arrY, 4);
        g2d.drawPolygon(polyt);
        g2d.setColor(Color.GRAY);
        g2d.fillPolygon(polyt);

        //windows
        g2d.setColor(Color.BLACK);
        g.drawOval(100 + this.x, 317, 13, 13);
        g2d.setColor(Color.CYAN);
        g2d.fillOval(100 + this.x, 317, 13, 13);

        g2d.setColor(Color.BLACK);
        g.drawOval(135 + this.x, 317, 13, 13);
        g2d.setColor(Color.CYAN);
        g2d.fillOval(135 + this.x, 317, 13, 13);

        g2d.setColor(Color.BLACK);
        g.drawOval(170 + this.x, 317, 13, 13);
        g2d.setColor(Color.CYAN);
        g2d.fillOval(170 + this.x, 317, 13, 13);
    }

}
