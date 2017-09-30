/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author hussein_pc
 */
public class Ellipse_code extends JPanel implements ActionListener {

    JLabel l1 = new JLabel("X Value :");
    JLabel l2 = new JLabel("Y Value :");
    JLabel l3 = new JLabel("RX Value :");
    JLabel l4 = new JLabel("Ry Value :");
    JLabel l5 = new JLabel("X Trans :");
    JLabel l6 = new JLabel("X Trans :");
    JLabel l7 = new JLabel("X Scale :");
    JLabel l8 = new JLabel("Y Scale :");
    JLabel l9 = new JLabel("Rotate Angle :");
    JLabel l10 = new JLabel("Rx Scale :");
    JLabel l11 = new JLabel("RY Scale :");
    JLabel l12 = new JLabel("S shrink :");
    JTextField xval = new JTextField();
    JTextField yval = new JTextField();
    JTextField rxval = new JTextField();
    JTextField ryval = new JTextField();
    JTextField Xtr = new JTextField();
    JTextField Ytr = new JTextField();
    JTextField Xs = new JTextField();
    JTextField Ys = new JTextField();
    JTextField Ro = new JTextField();
    JTextField Rxs = new JTextField();
    JTextField Rys = new JTextField();
    JTextField sh = new JTextField();
    JButton Draw = new JButton("Draw Ellipse");
    JButton trans = new JButton("Translate Ellipse");
    JButton scale = new JButton("Scale Ellipse");
    JButton rotate = new JButton("Rotate Elipse");
     JButton shrink = new JButton("Shrink Elipse");
    Draw_Elipse1 obb = new Draw_Elipse1();
    ellipse_table1 object = new ellipse_table1();
    int xvalue, yvalue, rxvalue, ryvalue;

    Ellipse_code() {
        create();
    }

    public void create() {
        setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(600, 300));
        setBorder(new TitledBorder(""));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        Drawing d = new Drawing("m.jpg");
        add(d);
        d.setLayout(null);
        /////////////////////////////////////////////////
        JPanel Panel1 = new JPanel();
        Panel1.setPreferredSize(new Dimension(210, 175));
        Panel1.setBorder(new TitledBorder("Draw "));
        Panel1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Panel1.setLayout(new BorderLayout());
        Drawing h = new Drawing("m.jpg");
        Panel1.add(h);
        h.setLayout(null);
        l1.setBounds(15, 5, 50, 25);
        xval.setBounds(70, 10, 50, 20);
        l2.setBounds(140, 5, 50, 25);
        yval.setBounds(195, 10, 50, 20);
        l3.setBounds(15, 35, 50, 25);
        rxval.setBounds(70, 40, 50, 20);
        l4.setBounds(140, 35, 50, 25);
        ryval.setBounds(195, 40, 50, 20);
        Draw.setBounds(70, 70, 130, 25);
        h.add(l1);
        h.add(l2);
        h.add(l3);
        h.add(l4);
        h.add(xval);
        h.add(yval);
        h.add(rxval);
        h.add(ryval);
        h.add(Draw);
        Panel1.setBounds(10, 25, 270, 130);
        d.add(Panel1);
        /////////////////////////////////////////////
        JPanel Panel2 = new JPanel();
        Panel2.setPreferredSize(new Dimension(210, 175));
        Panel2.setBorder(new TitledBorder("Translate "));
        Panel2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Panel2.setLayout(new BorderLayout());
        Drawing s = new Drawing("m.jpg");
        Panel2.add(s);
        s.setLayout(null);
        l5.setBounds(15, 5, 60, 25);
        Xtr.setBounds(70, 10, 50, 20);
        l6.setBounds(140, 5, 60, 25);
        Ytr.setBounds(195, 10, 50, 20);
        trans.setBounds(70, 40, 130, 25);
        s.add(l5);
        s.add(l6);
        s.add(Xtr);
        s.add(Ytr);
        s.add(trans);
        Panel2.setBounds(10, 155, 270, 100);
        d.add(Panel2);
/////////////////////////////////////////////////////////////////////////////
        JPanel Panel3 = new JPanel();
        Panel3.setPreferredSize(new Dimension(210, 175));
        Panel3.setBorder(new TitledBorder("Scale "));
        Panel3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Panel3.setLayout(new BorderLayout());
        Drawing l = new Drawing("m.jpg");
        Panel3.add(l);
        l.setLayout(null);
        l7.setBounds(15, 5, 50, 25);
        Xs.setBounds(70, 10, 50, 20);
        l8.setBounds(140, 5, 50, 25);
        Ys.setBounds(195, 10, 50, 20);
        l10.setBounds(15, 35, 50, 25);
        Rxs.setBounds(70, 40, 50, 20);
        l11.setBounds(140, 35, 50, 25);
        Rys.setBounds(195, 40, 50, 20);

        scale.setBounds(70, 65, 130, 25);
        l.add(l7);
        l.add(l8);
        l.add(Xs);
        l.add(Ys);
        l.add(l10);
        l.add(l11);
        l.add(Rxs);
        l.add(Rys);

        l.add(scale);
        Panel3.setBounds(10, 255, 270, 130);
        d.add(Panel3);
        /////////////////////////////////////////////////////////////////////////
        JPanel Panel4 = new JPanel();
        Panel4.setPreferredSize(new Dimension(210, 175));
        Panel4.setBorder(new TitledBorder("Rotate "));
        Panel4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Panel4.setLayout(new BorderLayout());
        Drawing k = new Drawing("m.jpg");
        Panel4.add(k);
        k.setLayout(null);
        l9.setBounds(10, 15, 80, 25);
        Ro.setBounds(90, 20, 150, 20);
        rotate.setBounds(80, 50, 100, 25);
        k.add(l9);
        k.add(Ro);
        k.add(rotate);
        Panel4.setBounds(10, 385, 270, 110);
        d.add(Panel4);
        //////////////////////////////////////////////////////////////////////////////
             JPanel Panel6 = new JPanel();
        Panel6.setPreferredSize(new Dimension(210, 175));
        Panel6.setBorder(new TitledBorder("Translate "));
        Panel6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Panel6.setLayout(new BorderLayout());
        Drawing o = new Drawing("m.jpg");
        Panel6.add(o);
        o.setLayout(null);
        l9.setBounds(15, 5, 80, 25);
        sh.setBounds(95, 10, 50, 20);
        shrink.setBounds(140, 30, 100, 25);

        o.add(l9);
        o.add(sh);
        o.add(shrink);

        Panel6.setBounds(10, 495, 270, 100);
        d.add(Panel6);
///////////////////////////////////////////////////
        

        JPanel Draw_Line = new JPanel();
        Draw_Line.setPreferredSize(new Dimension(210, 175));
        Draw_Line.setBorder(new TitledBorder("Draw Window "));
        Draw_Line.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Draw_Line.setLayout(new BorderLayout());
        Draw_Line.setBounds(600, 10, 490, 610);
        Draw_Line.add(obb);
        d.add(Draw_Line);
        Draw.addActionListener(this);
        trans.addActionListener(this);
        scale.addActionListener(this);
        object.setBounds(290, 20, 300, 610);
        d.add(object);



        Draw.addActionListener(this);
        trans.addActionListener(this);
        scale.addActionListener(this);
        rotate.addActionListener(this);
        shrink.addActionListener(this);

    }

    public void draw() {

        xvalue = Integer.parseInt(xval.getText());
        yvalue = Integer.parseInt(yval.getText());
        rxvalue = Integer.parseInt(rxval.getText());
        ryvalue = Integer.parseInt(ryval.getText());
        object.create_tabel(xvalue, yvalue, rxvalue, ryvalue);
        obb.DrawElipse(xvalue, yvalue, rxvalue, ryvalue);

    }

    public void translate() {

        int xtr = (int) Float.parseFloat(Xtr.getText());
        int ytr = (int) Float.parseFloat(Ytr.getText());
        obb.DrawElipse((int) Float.parseFloat(xval.getText()) + xtr, (int) Float.parseFloat(yval.getText()) + ytr, (int) Float.parseFloat(rxval.getText()), (int) Float.parseFloat(ryval.getText()));
    }

    public void scale() {

        int xs = (int) Float.parseFloat(Xs.getText());
        int ys = (int) Float.parseFloat(Ys.getText());
        int rxs = (int) Float.parseFloat(Rxs.getText());
        int rys = (int) Float.parseFloat(Rys.getText());
        obb.DrawElipse((int) Float.parseFloat(xval.getText()) + xs, (int) Float.parseFloat(yval.getText()) + ys, (int) Float.parseFloat(rxval.getText()) * rxs, (int) Float.parseFloat(ryval.getText()) * rys);
    }
public void shrink() {

        int rs = (int) Float.parseFloat(sh.getText());
        
        obb.DrawElipse((int) Float.parseFloat(xval.getText()), (int) Float.parseFloat(yval.getText()), (int) Float.parseFloat(rxval.getText()) / rs,(int) Float.parseFloat(ryval.getText()) / rs);
    }
    public void rotat() {
        int x, y, x1, y1, s;
        s = Integer.parseInt(Ro.getText());
        x1 = Integer.parseInt(xval.getText());
        y1 = Integer.parseInt(yval.getText());
        int rx = Integer.parseInt(rxval.getText());
        int ry = Integer.parseInt(ryval.getText());
        int trx = rx * 2;
        int trY = ry * 2;
        
        x = (int) ((x1 * Math.cos(Math.toRadians(s))) - (ry * Math.sin(Math.toRadians(s))));
        y = (int) ((rx * Math.sin(Math.toRadians(s))) + (y1 * Math.cos(Math.toRadians(s))));
        obb.DrawElipse(x1, y1, x, y);
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Draw) {
            draw();
        } else if (e.getSource() == trans) {
            translate();
        } else if (e.getSource() == scale) {
            scale();
        } else if (e.getSource() == rotate) {
            rotat();
        } else if (e.getSource() == shrink) {
            shrink();
        }
    }
}
