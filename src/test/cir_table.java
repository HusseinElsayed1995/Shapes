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
public class cir_table extends javax.swing.JPanel {
  int xvalue, yvalue, Rvalue, pk, K, pkk, Xi, Yi;
    /**
     * Creates new form Tabel1
     */
    public cir_table() {
        initComponents();
    }
    public void create_tabel(int xi,int yi,int r){
   
        DefaultTableModel object1 = (DefaultTableModel) table1.getModel();
        DefaultTableModel object2 = (DefaultTableModel) table2.getModel();
        DefaultTableModel object3 = (DefaultTableModel) table3.getModel();
        this.Xi = xi;
        this.Yi = yi;
        this.Rvalue = r;
        pk = 1 - Rvalue;
        xvalue = 0;
        yvalue = Rvalue;
        K = 0;
        while (xvalue < yvalue) {
            if (pk < 0) {
                xvalue++;
                pkk = pk + 2 * (xvalue) + 1;
                object1.addRow(new Object[]{K, pk, pkk, xvalue, yvalue});
                object2.addRow(new Object[]{"(" + xvalue + "," + yvalue + ")", "(" + (-xvalue) + "," + yvalue + ")", "(" + (-xvalue) + "," + (-yvalue) + ")", "(" + xvalue + "," + (-yvalue) + ")"});
                object3.addRow(new Object[]{"(" + (xvalue + Xi) + "," + (yvalue + Yi) + ")", "(" + (-xvalue + Xi) + "," + (yvalue + Yi) + ")", "(" + (-xvalue + Xi) + "," + (-yvalue + Yi) + ")", "(" + (xvalue + Xi) + "," + (-yvalue + Yi) + ")"});
                pk = pkk;
            } else {
                xvalue++;
                yvalue--;
                pkk = pk + 2 * (xvalue) + 1 - 2 * (yvalue);
                object1.addRow(new Object[]{K, pk, pkk, xvalue, yvalue});
                object2.addRow(new Object[]{"(" + xvalue + "," + yvalue + ")", "(" + (-xvalue) + "," + yvalue + ")", "(" + (-xvalue) + "," + (-yvalue) + ")", "(" + xvalue + "," + (-yvalue) + ")"});
                object3.addRow(new Object[]{"(" + (xvalue + Xi) + "," + (yvalue + Yi) + ")", "(" + (-xvalue + Xi) + "," + (yvalue + Yi) + ")", "(" + (-xvalue + Xi) + "," + (-yvalue + Yi) + ")", "(" + (xvalue + Xi) + "," + (-yvalue + Yi) + ")"});
                pk = pkk;
            }
            K++;
        }

        for (int i = K - 2; i >= 0; i--) {
            int x = (int) object1.getValueAt(i, 3);
            int y = (int) object1.getValueAt(i, 4);
            object2.addRow(new Object[]{"(" + y + "," + x + ")", "(" + (-y) + "," + x + ")", "(" + (-y) + "," + (-x) + ")", "(" + y + "," + (-x) + ")"});
            object3.addRow(new Object[]{"(" + (y + Yi) + "," + (x + Xi) + ")", "(" + (-y + Yi) + "," + (x + Xi) + ")", "(" + (-y + Yi) + "," + (-x + Xi) + ")", "(" + (y + Yi) + "," + (-x + Xi) + ")"});

        }


    
    
    
    
    
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
                "K", "Pk", "Pk+1", "X", "Y"
            }
        ));
        jScrollPane1.setViewportView(table1);

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "1st quarter", "2nd quarter", "3rd quarter", "4th quarter"
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
