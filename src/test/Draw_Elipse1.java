/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Draw_Elipse1 extends JPanel {
int state=0;
    int x, y, p01, p02, p1k, p1kk, p2k, p2kk, ryx, rxy, ry, rx, xcen, ycen;
    int xval, yval;

    public Draw_Elipse1() {
        setSize(600, 500);
        setVisible(true);
    }

    public void DrawElipse(int xvalue, int yvalue, int Rxvalue, int Ryvalue) {
        state=1;
        this.xval = xvalue;
        this.yval = yvalue;
        this.rx = Rxvalue;
        this.ry = Ryvalue;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
        g.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
    if(state==1)   
    {
        x = 0;
          y = ry;
        p01 = (int) (.25 * Math.pow(rx, 2) - (Math.pow(rx, 2) * ry) + Math.pow(ry, 2));
        p1k = p01;
        do {
            //to transfer to first quarter it is asame in java fourth quarter
            g.drawLine(xval + (getWidth() / 2 + x), -yval + (getHeight() / 2 - y), xval + (getWidth() / 2 + x), -yval + (getHeight() / 2 - y));
            g.drawLine(xval + (getWidth() / 2 - x), -yval + (getHeight() / 2 + y), xval + (getWidth() / 2 - x), -yval + (getHeight() / 2 + y));
            // to transfer to second quarter it is asame in java third quarter
            g.drawLine(xval + (getWidth() / 2 - x), -yval + (getHeight() / 2 - y), xval + (getWidth() / 2 - x), -yval + (getHeight() / 2 - y));
            g.drawLine(xval + (getWidth() / 2 + x), -yval + (getHeight() / 2 + y), xval + (getWidth() / 2 + x), -yval + (getHeight() / 2 + y));

            x++;
            if (p1k < 0) {
                ryx = (int) (Math.pow(ry, 2) * x);
                rxy = (int) (Math.pow(rx, 2) * y);
                p1kk = (int) (p1k + (2 * Math.pow(ry, 2) * x) + Math.pow(ry, 2));
                p1k = p1kk;
            } else {
                y--;
                ryx = (int) (Math.pow(ry, 2) * x);
                rxy = (int) (Math.pow(rx, 2) * y);
                p1kk = (int) (p1k + (2 * Math.pow(ry, 2) * x) + Math.pow(ry, 2) - (2 * Math.pow(rx, 2) * y));
                p1k = p1kk;
            }
            //repaint();
        } while (ryx <= rxy);
        System.out.println(x + " || " + y);
        p02 = (int) (Math.pow(ry, 2) * Math.pow((x + .5), 2) + Math.pow(rx, 2) * Math.pow((y - 1), 2) - Math.pow(rx, 2) * Math.pow(ry, 2));
        p2k = p02;
        do {

            //to transfer to third quarter it is asame in java second quarter
            g.drawLine(xval + (getWidth() / 2 - x), -yval + (getHeight() / 2 + y), xval + (getWidth() / 2 - x), -yval + (getHeight() / 2 + y));
            g.drawLine(xval + (getWidth() / 2 + x), -yval + (getHeight() / 2 - y), xval + (getWidth() / 2 + x), -yval + (getHeight() / 2 - y));
            //to transfer to fouth quarter it is asame in java first quarter
            g.drawLine(xval + (getWidth() / 2 + x), -yval + (getHeight() / 2 + y), xval + (getWidth() / 2 + x), -yval + (getHeight() / 2 + y));
            g.drawLine(xval + (getWidth() / 2 - x), -yval + (getHeight() / 2 - y), xval + (getWidth() / 2 - x), -yval + (getHeight() / 2 - y));
            y--;
            if (p2k < 0) {

                x++;
                ryx = (int) Math.pow(ry, 2) * x;
                rxy = (int) Math.pow(rx, 2) * y;
                p2kk = (int) (p2k + (2 * Math.pow(ry, 2) * x) - (2 * Math.pow(rx, 2) * y) + Math.pow(rx, 2));
                p2k = p2kk;

            } else {
                ryx = (int) Math.pow(ry, 2) * x;
                rxy = (int) Math.pow(rx, 2) * y;
                p2kk = (int) (p2k - (2 * Math.pow(rx, 2) * y) + Math.pow(rx, 2));
                p2k = p2kk;
            }
        } while (rxy > 0);
    }
      
    }
}