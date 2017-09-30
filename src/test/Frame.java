package test;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Frame extends JFrame implements ActionListener {

    JButton DDa, bresenham, circle, ellipse;
    // available_trips tt = new available_trips();
    JPanel p4 = new JPanel();
    JPanel p7 = new JPanel();
    DDA_code ob = new DDA_code();
    Bresenham_code obb = new Bresenham_code();
    Circle_code obbb = new Circle_code();
    Ellipse_code obbbb = new Ellipse_code();
    CardLayout c = new CardLayout();

    Frame() {
        // proberties of frame
        setSize(1350, 700);//2000 500
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setBackground(Color.white);
        Drawing d = new Drawing("h.jpg");
        add(d);
        d.setLayout(null);

        /////////////////////////////////////////////////////
        JPanel n1 = new JPanel();
        n1.setPreferredSize(new Dimension(210, 175));
        n1.setBorder(new TitledBorder("Drawing Line"));
        n1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        n1.setLayout(null);
        DDa = new JButton("DDA Algorithm");
        bresenham = new JButton("Bresenham Algorithm");
        bresenham.setBounds(5, 65, 200, 30);//5, 65, 200, 30
        DDa.setBounds(5, 30, 200, 30);//65
        DDa.addActionListener(this);
        bresenham.addActionListener(this);
        n1.add(DDa);
        n1.add(bresenham);

        n1.setBounds(3, 170, 220, 150);
        add(n1);

        ////////////////////////////////////////////////////////////////
        JPanel n2 = new JPanel();
        n2.setPreferredSize(new Dimension(210, 175));
        n2.setBorder(new TitledBorder("shapes"));
        n2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        n2.setLayout(null);
        circle = new JButton("Circle");
        ellipse = new JButton("Elipse");
        circle.setBounds(5, 30, 200, 30);
        ellipse.setBounds(5, 65, 200, 30);
        circle.addActionListener(this);
        ellipse.addActionListener(this);
        n2.add(circle);
        n2.add(ellipse);
        n2.setBounds(3, 330, 220, 150);
        add(n2);
        p4.setBounds(230, 30, 1100, 630);
        add(p4);
        p4.setLayout(c);
        p4.add(ob, "1");
        p4.add(obb, "2");
        p4.add(obbb, "3");
        p4.add(obbbb, "m");
        ///////////////////////////////////////////////////////////////////
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == DDa) {
            c.show(p4, "1");
        } else if (e.getSource() == bresenham) {
            c.show(p4, "2");
        } else if (e.getSource() == circle) {
            c.show(p4, "3");
        } else if (e.getSource() == ellipse) {
            c.show(p4, "m");
        }

    }
}
