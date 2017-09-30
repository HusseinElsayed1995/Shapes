/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Draw_Circle extends JPanel {

    int xvalue, yvalue, Rvalue, xc, yc, pk;

    public Draw_Circle() {
        setSize(600, 500);
        setVisible(true);
    }

    public void DrawCircle(int xvalue, int yvalue, int Rvalue) {
        this.xvalue = xvalue;
        this.yvalue = yvalue;
        this.Rvalue = Rvalue;
        repaint();

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        xc = 0;
        yc = Rvalue;
        pk = Rvalue - 1;
        Dimension d = getSize(); //to get the size of our screen (height & width)
        g.drawLine((int) d.getWidth() / 2, 0, (int) d.getWidth() / 2, (int) d.getHeight());
        g.drawLine(0, (int) d.getHeight() / 2, (int) d.getWidth(), (int) d.getHeight() / 2);
        //   g.drawLine((int) (xc + xvalue) + (int) d.getWidth() / 2, -(int) (yc + yvalue) + (int) d.getHeight() / 2, (int) (xc + xvalue) + (int) d.getWidth() / 2, -(int) (yvalue + yvalue) + (int) d.getHeight() / 2);
        // g.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
        // g.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
        while (xc <= yc) {
            g.drawLine(((this.getWidth() / 2) + xc) + xvalue, -yvalue + ((this.getHeight() / 2) - yc), ((this.getWidth() / 2) + xc) + xvalue, -yvalue + ((this.getHeight() / 2) - yc));
            g.drawLine(((this.getWidth() / 2) + yc) + xvalue, -yvalue + ((this.getHeight() / 2) - xc), ((this.getWidth() / 2) + yc) + xvalue, -yvalue + ((this.getHeight() / 2) - xc));

            g.drawLine(((this.getWidth() / 2) - xc) + xvalue, -yvalue + ((this.getHeight() / 2) - yc), ((this.getWidth() / 2) - xc) + xvalue, -yvalue + ((this.getHeight() / 2) - yc));
            g.drawLine(((this.getWidth() / 2) - yc) + xvalue, -yvalue + ((this.getHeight() / 2) - xc), ((this.getWidth() / 2) - yc) + xvalue, -yvalue + ((this.getHeight() / 2) - xc));

            g.drawLine(((this.getWidth() / 2) - xc) + xvalue, -yvalue + ((this.getHeight() / 2) + yc), ((this.getWidth() / 2) - xc) + xvalue, -yvalue + ((this.getHeight() / 2) + yc));
            g.drawLine(((this.getWidth() / 2) - yc) + xvalue, -yvalue + ((this.getHeight() / 2) + xc), ((this.getWidth() / 2) - yc) + xvalue, -yvalue + ((this.getHeight() / 2) + xc));

            g.drawLine(((this.getWidth() / 2) + xc) + xvalue, -yvalue + ((this.getHeight() / 2) + yc), ((this.getWidth() / 2) + xc) + xvalue, -yvalue + ((this.getHeight() / 2) + yc));
            g.drawLine(((this.getWidth() / 2) + yc) + xvalue, -yvalue + ((this.getHeight() / 2) + xc), ((this.getWidth() / 2) + yc) + xvalue, -yvalue + ((this.getHeight() / 2) + xc));
            if (pk < 0) {
                pk = pk + 2 * (xc + 1) + 1;
            } else {
                pk = pk + 2 * (xc + 1) + 1 - 2 * (yc + 1);
                yc--;
            }
            xc++;
        }


    }
}