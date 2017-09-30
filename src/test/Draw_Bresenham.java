/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author hussein_pc
 */
public class Draw_Bresenham extends JPanel {

    int xi, yi, xf, yf, dx, dy, pk,pkk;

    Draw_Bresenham() {
        setSize(500, 500);
        setVisible(true);
    }

    public void Draw(int Xi, int Yi, int Xf, int Yf) {
        this.xi = Xi;
        this.yi = Yi;
        this.xf = Xf;
        this.yf = Yf;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        dx = xf - xi;
        dy = yf - yi;
        g.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
        g.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
        if (dy < dx) {
            pk = (2 * dy) - dx;
            for (int i = 0; i <dx; i++) {

                if (pk < 0) {
                    
                    pkk = pk + (2 * dy);
                    g.drawLine(xi+(getWidth()/2), -yi+(getHeight()/2), xi+(getWidth()/2), -yi+(getHeight()/2));
                    pk=pkk;
                    xi++;
                } else {

                   
                    yi++;
                    pkk = pk + (2 * dy) - (2 * dx);
                    g.drawLine(xi+(getWidth()/2), -yi+(getHeight()/2), xi+(getWidth()/2), -yi+(getHeight()/2));
                    pk=pkk;
                     xi++;
                }
            }
        }
    }
}
