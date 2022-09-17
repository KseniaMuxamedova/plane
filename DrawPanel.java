package ru.vsu.cs.dunaeva;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawPanel extends JPanel implements ActionListener  {
    private final int PANEL_WIDTH;
    private final int PANEL_HEIGHT;
    private final int TIMER_DELAY;
    private final Plane plane;
    private Timer timer;
    private int ticksFromStart = 0;
    private int i = 0;

    public DrawPanel(final int width, final int height, final int timerDelay) {
        this.PANEL_WIDTH = width;
        this.PANEL_HEIGHT = height;
        this.TIMER_DELAY = timerDelay;
        timer = new Timer(timerDelay, this);
        timer.start();

        this.plane = new Plane(ticksFromStart);
    }


    @Override
    public void paint(final Graphics gr) {
        super.paint(gr);
        Graphics2D g2d = (Graphics2D) gr;
        //background
        g2d.setColor(new Color(30 + i, 100, 255 - i));
        g2d.fillRect(0, 0, PANEL_WIDTH, PANEL_HEIGHT);

        g2d.setColor(new Color(45, 42, 42, 87));

        g2d.drawOval(170, 505, 80, 60);
        g2d.fillOval(170, 505, 80, 60);
        g2d.drawOval(230, 505, 60, 60);
        g2d.fillOval(230, 505, 60, 60);
        g2d.drawOval(270, 505, 80, 60);
        g2d.fillOval(270, 505, 80, 60);

        g2d.setColor(Color.WHITE);
        g2d.drawOval(160, 500, 80, 60);
        g2d.fillOval(160, 500, 80, 60);
        g2d.drawOval(220, 500, 60, 60);
        g2d.fillOval(220, 500, 60, 60);
        g2d.drawOval(260, 500, 80, 60);
        g2d.fillOval(260, 500, 80, 60);



        plane.setX(ticksFromStart);
        plane.draw(gr);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == timer) {
            repaint();
            ++ticksFromStart;
            if(i < 225) {i+=3;}
        }
    }
}
