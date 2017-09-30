package test;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Draw_Line_DDA extends JPanel {

    float xf, yf, xi, yi, xtr, ytr;

    public Draw_Line_DDA() {
        setSize(500, 500);
        setVisible(true);
    }

    public void Draw_Line(float xi, float yi, float xf, float yf) {

        this.xi = xi;
        this.xf = xf;
        this.yi = yi;
        this.yf = yf;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        double dx = xf - xi;
        double dy = yf - yi;
        double m = dy / dx;
         g.drawLine(getWidth()/2, 0, getWidth()/2, getHeight());
        g.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
        if (m < 1) {
            for (int i = (int) xi; i <= xf; i++, yi += m) {
                g.drawLine(i+(getWidth()/2), (-Math.round(yi)+(getHeight()/2)), i+(getWidth()/2), (-Math.round(yi)+(getHeight()/2)));
            }
        } else {
            for (int i = (int) yi; i <= yf; i++, xi += (1 / m)) {
                g.drawLine(Math.round(xi)+(getWidth()/2),(-i+(getHeight()/2)), Math.round(xi)+(getWidth()/2),(-i+(getHeight()/2)));
            }

        }

    }
}