/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hussein_pc
 */
public class Tabel1 extends javax.swing.JPanel {

    float xi, yi, xf, yf, dx, dy, xtr, ytr, xs, ys;
    float m;
    int k;
   
    Draw_Line_DDA ob=new Draw_Line_DDA();

    public Tabel1() {
        initComponents();
    }

    public void create(int Xi,int Yi,int Xf,int Yf) {
       DefaultTableModel object1 = (DefaultTableModel) DDA_table.getModel();
        this.xi = Xi;
        this.xf = Xf;
        this.yi = Yi;
        this.yf = Yf;
        m = (yf - yi) / (xf - xi);
        ob.Draw_Line((int)xi, (int)xf,(int) yi,(int) yf);

        if (m < 1) {
            k = 0;
            if (xf > 0) {
                for (int i = (int) xi; i <= xf; i++, k++, yi += m) {
                    object1.addRow(new Object[]{i, yi, i, Math.round(yi)});
                }
            } else {
            }
            for (int i = (int) xi; i >= xf; i--, k++, yi += m) {
                object1.addRow(new Object[]{i, -yi, i, -Math.round(yi)});
            }
        } else {
            if(yf>0){
            k = 0;
            for (int i = (int) yi; i <= yf; i++, k++, xi += (1 / m)) {
                object1.addRow(new Object[]{xi, i, Math.round(xi), i});
            }
            
            }else{
                for (int i = (int) yi; i >= yf; i--, k++, xi += (1 / m)) {
                object1.addRow(new Object[]{xi, i, Math.round(xi), i});
            }
        }
        }




    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        DDA_table = new javax.swing.JTable();

        DDA_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "X", "Y", "Round (X)", "Round(Y)"
            }
        ));
        jScrollPane1.setViewportView(DDA_table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DDA_table;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
