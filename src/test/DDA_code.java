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
public class DDA_code extends JPanel implements ActionListener {

    JLabel l1 = new JLabel("X initial :");
    JLabel l2 = new JLabel("Y initial :");
    JLabel l3 = new JLabel("X Final :");
    JLabel l4 = new JLabel("Y Final :");
    JLabel l5 = new JLabel("X Trans :");
    JLabel l6 = new JLabel("X Trans :");
    JLabel l7 = new JLabel("X Scale :");
    JLabel l8 = new JLabel("Y Scale :");
    JLabel l9 = new JLabel("Rotate Angle :");
    JLabel l10 = new JLabel("X Min :");
    JLabel l11 = new JLabel("Y Min :");
    JLabel l12 = new JLabel("X Max :");
    JLabel l13 = new JLabel("Y Max :");
    JTextField Xi = new JTextField();
    JTextField Yi = new JTextField();
    JTextField Xf = new JTextField();
    JTextField Yf = new JTextField();
    JTextField Xtr = new JTextField();
    JTextField Ytr = new JTextField();
    JTextField Xs = new JTextField();
    JTextField Ys = new JTextField();
    JTextField Ro = new JTextField();
    JTextField Xmin = new JTextField();
    JTextField Ymin = new JTextField();
    JTextField Xmax = new JTextField();
    JTextField Ymax = new JTextField();
    JButton Draw = new JButton("Draw Line");
    JButton trans = new JButton("Translate Line");
    JButton scale = new JButton("Scale Line");
    JButton clip = new JButton("Clipping Line");
    JButton rotate = new JButton("Rotate line");
    Draw_Line_DDA ob = new Draw_Line_DDA();
    Tabel1 object = new Tabel1();
    int xi, xf, yi, yf;

    DDA_code() {
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
        Xi.setBounds(70, 10, 50, 20);
        l2.setBounds(140, 5, 50, 25);
        Yi.setBounds(195, 10, 50, 20);
        l3.setBounds(15, 35, 50, 25);
        Xf.setBounds(70, 40, 50, 20);
        l4.setBounds(140, 35, 50, 25);
        Yf.setBounds(195, 40, 50, 20);
        Draw.setBounds(70, 70, 130, 25);
        h.add(l1);
        h.add(l2);
        h.add(l3);
        h.add(l4);
        h.add(Xi);
        h.add(Yi);
        h.add(Xf);
        h.add(Yf);
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
        scale.setBounds(70, 40, 130, 25);
        l.add(l7);
        l.add(l8);
        l.add(Xs);
        l.add(Ys);
        l.add(scale);
        Panel3.setBounds(10, 255, 270, 100);
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
        Panel4.setBounds(10, 355, 270, 110);
        d.add(Panel4);
        //////////////////////////////////////////////////////////////////////////////
        JPanel Panel5 = new JPanel();
        Panel5.setPreferredSize(new Dimension(210, 175));
        Panel5.setBorder(new TitledBorder("Clipping "));
        Panel5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Panel5.setLayout(new BorderLayout());
        Drawing i = new Drawing("m.jpg");
        Panel5.add(i);
        i.setLayout(null);
        l10.setBounds(15, 5, 50, 25);
        Xmin.setBounds(70, 10, 50, 20);
        l11.setBounds(140, 5, 50, 25);
        Ymin.setBounds(195, 10, 50, 20);
        l12.setBounds(15, 35, 50, 25);
        Xmax.setBounds(70, 40, 50, 20);
        l13.setBounds(140, 35, 50, 25);
        Ymax.setBounds(195, 40, 50, 20);
        clip.setBounds(70, 70, 130, 25);
        i.add(l10);
        i.add(l11);
        i.add(l12);
        i.add(l13);
        i.add(Xmin);
        i.add(Xmax);
        i.add(Ymin);
        i.add(Ymax);
        i.add(clip);
        Panel5.setBounds(10, 465, 270, 130);
        d.add(Panel5);
        JPanel Draw_Line = new JPanel();
        Draw_Line.setPreferredSize(new Dimension(210, 175));
        Draw_Line.setBorder(new TitledBorder("Rotate "));
        Draw_Line.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Draw_Line.setLayout(new BorderLayout());
        Draw_Line.setBounds(600, 10, 490, 610);
        Draw_Line.add(ob);

        JPanel tabl = new JPanel();
        tabl.setLayout(new BorderLayout());

        tabl.setBounds(290, 20, 300, 610);
        object.setBounds(10, 20, 330, 610);
        tabl.add(object);
        d.add(tabl);


        d.add(Draw_Line);
        Draw.addActionListener(this);
        trans.addActionListener(this);
        scale.addActionListener(this);
         clip.addActionListener(this);
         rotate.addActionListener(this);


    }

    public void draw() {

        xi = (int) Float.parseFloat(Xi.getText().trim());
        xf = (int) Float.parseFloat(Xf.getText().trim());
        yi = (int) Float.parseFloat(Yi.getText().trim());
        yf = (int) Float.parseFloat(Yf.getText().trim());
        object.create(xi, yi, xf, yf);
        ob.Draw_Line(xi, yi, xf, yf);

    }

    public void translate() {
        int xtr = (int) Float.parseFloat(Xtr.getText().trim());
        int ytr = (int) Float.parseFloat(Ytr.getText().trim());
        ob.Draw_Line(Float.parseFloat(Xi.getText().trim()) + xtr, Float.parseFloat(Yi.getText().trim()) + xtr, Float.parseFloat(Xf.getText().trim()) + ytr, Float.parseFloat(Yf.getText().trim()) + ytr);
    }

    public void scale() {

        int xs = (int) Float.parseFloat(Xs.getText().trim());
        int ys = (int) Float.parseFloat(Ys.getText().trim());
        ob.Draw_Line(Float.parseFloat(Xi.getText()) * xs, Float.parseFloat(Yi.getText()) * xs, Float.parseFloat(Xf.getText()) * ys, Float.parseFloat(Yf.getText()) * ys);
    }
    public void rotat(){
    
      float x1, y1,val1,val2,s;
       xi = (int) Float.parseFloat(Xi.getText().trim());
       yi = (int) Float.parseFloat(Yi.getText().trim());
        x1 = Float.parseFloat(Xf.getText());
        y1 = Float.parseFloat(Yf.getText());
        s=  (Float.parseFloat(Ro.getText()));
       
        int xx1 = (int) (x1 * (float) (Math.cos(s)) - y1 * (float) (Math.sin(s)));
        int yy1 = (int) (x1 * (float) (Math.sin(s)) + y1 * (float) (Math.cos(s)));
      //  val1=(float) ((x1*Math.cos(Math.toRadians(s)))-(y1*Math.sin(Math.toRadians(s))));
      //  val2=(float) ((x1*Math.sin(Math.toRadians(s)))+(y1*Math.cos(Math.toRadians(s))));
        
        int x_new0 = (int) xi;
        int y_new0 = (int) yi;
        int x_new1 = xx1;
        int y_new1 = yy1;
     //   float dx = (int) x_new1 - x_new0;
       // float dy = (int) y_new1 - y_new0;
        ob.Draw_Line(x_new0,y_new0, x_new1, y_new1);
      
        
    }

    
    public void cliping(){
        float p1,p2,p3,p4,q1,q2,q3,q4,u1,u2,u3,u4;

        p2=Float.parseFloat(Xf.getText())-Float.parseFloat(Xi.getText());
        p1=-p2;
        p4=Float.parseFloat(Yf.getText())-Float.parseFloat(Yi.getText());
        p3=-p4;

        System.out.println(" "+p1+" "+" "+p2+" "+" "+p3+" "+" "+p4);

        q1=Float.parseFloat(Xi.getText())-Float.parseFloat(Xmin.getText());
        q2=Float.parseFloat(Xmax.getText())-Float.parseFloat(Xi.getText());
        q3=Float.parseFloat(Yi.getText())-Float.parseFloat(Ymin.getText());
        q4=Float.parseFloat(Ymax.getText())-Float.parseFloat(Yi.getText());

        System.out.println(" "+q1+" "+" "+q2+" "+" "+q3+" "+" "+q4);

        u1=q1/p1;
        u2=q2/p2;
        u3=q3/p3;
        u4=q4/p4;


        if(p1<0 && p3<0){
            if(u1<0 && u3<0){
                u1=0;
                System.out.println(" "+u1);
            }
        }
        if(p2>0&&p4>0){
            if(u2>1 && u4>1){
                u2=1;
                System.out.println(" "+u2);
            }else{
                if(u2>u4){
                    u2=u4;
                    System.out.println(" "+u2);
                }else{
                    u2=u2;
                    System.out.println(" "+u2);
                }
            }
        }
        float xn1,yn1,xn2,yn2;
        xn1=Float.parseFloat(Xi.getText())+(u1*p2); //p2 is equal x2val-x1val
        yn1=Float.parseFloat(Yi.getText())+(u1*p4);
        xn2=Float.parseFloat(Xi.getText())+(u2*p2); //p4 is equal y2val-y1val
        yn2=Float.parseFloat(Yi.getText())+(u2*p4);
        ob.Draw_Line(xn1, yn1, xn2, yn2);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Draw) {


            draw();
        } else if (e.getSource() == trans) {
            translate();
        } else if (e.getSource() == scale) {
            scale();
        }
        else if (e.getSource() == clip) {
            cliping();
        }else if (e.getSource() == rotate){
            rotat();
        
        
        }

    }
}
