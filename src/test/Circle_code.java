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
public class Circle_code extends JPanel implements ActionListener {

    JLabel l1 = new JLabel("X Value :");
    JLabel l2 = new JLabel("Y value :");
    JLabel l3 = new JLabel("R value :");
    JLabel l4 = new JLabel("X scale pos:");
    JLabel l5 = new JLabel("Y Scale pos :");
    JLabel l6 = new JLabel("R Scale :");
    JLabel l7 = new JLabel("X trans :");
    JLabel l8 = new JLabel("Y trans :");
    JLabel l9 = new JLabel("S shrink :");
    JTextField xval = new JTextField();
    JTextField yval = new JTextField();
    JTextField rval = new JTextField();
    JTextField Xs = new JTextField();
    JTextField Ys = new JTextField();
    JTextField Rs = new JTextField();
    JTextField Xtr = new JTextField();
    JTextField Ytr = new JTextField();
    JTextField sh = new JTextField();
    JButton Draw = new JButton("Draw Line");
    JButton trans = new JButton("Translate Circle");
    JButton scale = new JButton("Scale Circle");
    JButton shrink = new JButton("shrink Circle");
    cir_table object3 = new cir_table();
    Draw_Circle ob = new Draw_Circle();

    Circle_code() {
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
        rval.setBounds(70, 40, 50, 20);
        Draw.setBounds(70, 70, 130, 25);
        h.add(l1);
        h.add(l2);
        h.add(l3);
        h.add(xval);
        h.add(yval);
        h.add(rval);
        h.add(Draw);
        Panel1.setBounds(10, 25, 270, 130);
        d.add(Panel1);
        /////////////////////////////////////////////
        JPanel Panel2 = new JPanel();
        Panel2.setPreferredSize(new Dimension(210, 175));
        Panel2.setBorder(new TitledBorder("Scale "));
        Panel2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Panel2.setLayout(new BorderLayout());
        Drawing s = new Drawing("m.jpg");
        Panel2.add(s);
        s.setLayout(null);
        l4.setBounds(15, 5, 50, 25);
        Xs.setBounds(70, 10, 50, 20);
        l5.setBounds(140, 5, 50, 25);
        Ys.setBounds(195, 10, 50, 20);
        l6.setBounds(15, 35, 50, 25);
        Rs.setBounds(70, 40, 50, 20);
        scale.setBounds(70, 70, 130, 25);
        s.add(l5);
        s.add(l6);
        s.add(Xs);
        s.add(Ys);
        s.add(l4);
        s.add(Rs);
        s.add(scale);
        Panel2.setBounds(10, 155, 270, 130);
        d.add(Panel2);
/////////////////////////////////////////////////////////////////////////////
        JPanel Panel3 = new JPanel();
        Panel3.setPreferredSize(new Dimension(210, 175));
        Panel3.setBorder(new TitledBorder("Translate "));
        Panel3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Panel3.setLayout(new BorderLayout());
        Drawing l = new Drawing("m.jpg");
        Panel3.add(l);
        l.setLayout(null);
        l7.setBounds(15, 5, 50, 25);
        Xtr.setBounds(70, 10, 50, 20);
        l8.setBounds(140, 5, 50, 25);
        Ytr.setBounds(195, 10, 50, 20);
        trans.setBounds(70, 40, 130, 25);
        l.add(l7);
        l.add(l8);
        l.add(Xtr);
        l.add(Ytr);
        l.add(trans);
        Panel3.setBounds(10, 285, 270, 100);
        d.add(Panel3);
        /////////////////////////////////////////////////////////////////////////
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

        Panel6.setBounds(10, 385, 270, 100);
        d.add(Panel6);


        /////////////////////////////////////////////////////////////////////////
        JPanel Draw_Line = new JPanel();
        Draw_Line.setPreferredSize(new Dimension(210, 175));
        Draw_Line.setBorder(new TitledBorder("Draw Window "));
        Draw_Line.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Draw_Line.setLayout(new BorderLayout());
        Draw_Line.setBounds(600, 10, 490, 610);
        Draw_Line.add(ob);
        d.add(Draw_Line);
        Draw.addActionListener(this);
        trans.addActionListener(this);
        scale.addActionListener(this);
        shrink.addActionListener(this);
        object3.setBounds(290, 20, 300, 610);
        d.add(object3);
    }

    public void draw() {
        int Xi = Integer.parseInt(xval.getText());
        int Yi = Integer.parseInt(yval.getText());
        int Rvalue = Integer.parseInt(rval.getText());
        object3.create_tabel(Xi, Yi, Rvalue);
        ob.DrawCircle(Xi, Yi, Rvalue);
    }

    public void trasl() {
        int xtr = (int) Float.parseFloat(Xtr.getText());
        int ytr = (int) Float.parseFloat(Ytr.getText());
        ob.DrawCircle((int) Float.parseFloat(xval.getText()) + xtr, (int) Float.parseFloat(yval.getText()) + ytr, (int) Float.parseFloat(rval.getText()));
    }

    public void scale() {
        int xs = (int) Float.parseFloat(Xs.getText());
        int ys = (int) Float.parseFloat(Ys.getText());
        int rs = (int) Float.parseFloat(Rs.getText());
        ob.DrawCircle((int) Float.parseFloat(xval.getText()) + xs, (int) Float.parseFloat(yval.getText()) + ys, (int) Float.parseFloat(rval.getText()) * rs);
    }

    public void shrink() {

        int rs = (int) Float.parseFloat(sh.getText());
        ob.DrawCircle((int) Float.parseFloat(xval.getText()), (int) Float.parseFloat(yval.getText()), (int) Float.parseFloat(rval.getText()) / rs);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Draw) {
            draw();
        } else if (e.getSource() == trans) {
            trasl();
        } else if (e.getSource() == scale) {
            scale();
        } else if (e.getSource() == shrink) {
            shrink();
        }

    }
}
