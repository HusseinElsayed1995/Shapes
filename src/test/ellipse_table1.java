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
public class ellipse_table1 extends javax.swing.JPanel {
   int xtr, ytr,xs,xy;
    drawellipse object = new drawellipse();
    DefaultTableModel m1, m2, m3;
     int x, y, k1, k2, p1k, p1kk, p2k, p2kk, ryx, rxy;
        int xvalue, yvalue, rxvalue, ryvalue;
        float p10, p20;

    /**
     * Creates new form Tabel1
     */
    public ellipse_table1() {
        initComponents();
    }
    public void create_tabel(int xi,int yi,int rx,int ry){
    

       this. xvalue = xi;
       this. yvalue = yi;
        this.rxvalue = rx;
       this. ryvalue = ry;
        object.takevalue(xvalue, yvalue, rxvalue, ryvalue);
        object.setVisible(true);
        x = 0;
        k1 = 0;
        y = ryvalue;
        p10 = (float) (.25 * Math.pow(rxvalue, 2) - (Math.pow(rxvalue, 2) * ryvalue) + Math.pow(ryvalue, 2));
        p1k = (int) p10;

        m1 = (DefaultTableModel) table1.getModel();
        m2 = (DefaultTableModel) table2.getModel();
        m3 = (DefaultTableModel) table3.getModel();
        do {
            if (p1k < 0) {
                x++;
                ryx = (int) Math.pow(ryvalue, 2) * x;
                rxy = (int) Math.pow(rxvalue, 2) * y;
                p1kk = (int) (p1k + (2 * Math.pow(ryvalue, 2) * x) + Math.pow(ryvalue, 2));
                m1.addRow(new Object[]{k1, p1k, p1kk, x, y, ryx, rxy});
                m3.addRow(new Object[]{"(" + x + "," + y + ")", "(-" + x + "," + y + ")", "(-" + x + ", -" + y + ")", "(" + x + ", -" + y + ")"});
                p1k = p1kk;
            } else {
                x++;
                y--;
                ryx = (int) Math.pow(ryvalue, 2) * x;
                rxy = (int) Math.pow(rxvalue, 2) * y;
                p1kk = (int) (p1k + (2 * Math.pow(ryvalue, 2) * x) + Math.pow(ryvalue, 2) - (2 * Math.pow(rxvalue, 2) * y));
                m1.addRow(new Object[]{k1, p1k, p1kk, x, y, ryx, rxy});
                m3.addRow(new Object[]{"(" + x + "," + y + ")", "(-" + x + "," + y + ")", "(-" + x + ", -" + y + ")", "(" + x + ", -" + y + ")"});
                p1k = p1kk;
            }
            k1++;
        } while (ryx <= rxy);

        int xget, yget;
        xget = (int) m1.getValueAt((k1 - 1), 3);
        yget = (int) m1.getValueAt((k1 - 1), 4);

        p20 = (float) (Math.pow(ryvalue, 2) * Math.pow((xget + .5), 2) + Math.pow(rxvalue, 2) * Math.pow((yget - 1), 2) - Math.pow(rxvalue, 2) * Math.pow(ryvalue, 2));
        p2k = (int) p20;
        k2 = 0;
        int ryx2, rxy2;

        do {
            if (p2k < 0) {
                xget++;
                yget--;
                ryx2 = (int) Math.pow(ryvalue, 2) * xget;
                rxy2 = (int) Math.pow(rxvalue, 2) * yget;
                p2kk = (int) (p2k + (2 * Math.pow(ryvalue, 2) * xget) - (2 * Math.pow(rxvalue, 2) * yget) + Math.pow(rxvalue, 2));
                m2.addRow(new Object[]{k2, p2k, p2kk, xget, yget, ryx2, rxy2});
                m3.addRow(new Object[]{"(" + xget + "," + yget + ")", "(-" + xget + "," + yget + ")", "(-" + xget + ", -" + yget + ")", "(" + xget + ", -" + yget + ")"});
                p2k = p2kk;
            } else {
                yget--;
                ryx2 = (int) Math.pow(ryvalue, 2) * xget;
                rxy2 = (int) Math.pow(rxvalue, 2) * yget;
                p2kk = (int) (p2k - (2 * Math.pow(rxvalue, 2) * yget) + Math.pow(rxvalue, 2));
                m2.addRow(new Object[]{k2, p2k, p2kk, xget, yget, ryx2, rxy2});
                m3.addRow(new Object[]{"(" + xget + "," + yget + ")", "(-" + xget + "," + yget + ")", "(-" + xget + ", -" + yget + ")", "(" + xget + ", -" + yget + ")"});
                p2k = p2kk;
            }
            k2++;
        } while (rxy2 > 0);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        table3 = new javax.swing.JTable();

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "K", "Pk", "Pk+1", "X", "Y", "r2yx", "r2xy"
            }
        ));
        jScrollPane1.setViewportView(table1);

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "K", "pk", "pk+1", "X", "Y", "r2yx", "r2yx"
            }
        ));
        jScrollPane2.setViewportView(table2);

        table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "1st quarter", "2nd quarter", "3rd quarter", "4th quarter"
            }
        ));
        jScrollPane3.setViewportView(table3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
    private javax.swing.JTable table3;
    // End of variables declaration//GEN-END:variables
}