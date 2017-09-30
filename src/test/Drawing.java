
package test;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Drawing extends JPanel {

    String name;

    public Drawing(String name) {
        this.name = name;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        ImageIcon i = new ImageIcon("src/javaapplication5/" + name);
        Image im = i.getImage();
        g.drawImage(im, 0, 0, getWidth(), getHeight(), this);
    }
}
