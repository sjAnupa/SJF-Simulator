package ProjectSJF;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ProjectSJF.SJF;
import ProjectSJF.Process;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.runtime.Context;

public class Test1 extends javax.swing.JFrame implements ActionListener{

    private DefaultTableModel modelProcess;
    private ArrayList<Process> process;
    private javax.swing.JLabel[] label;
    private String[] processID;
    private Process p;

    public Test1() {
        initComponents();
        modelProcess = (DefaultTableModel) tblProcess.getModel();
        process = new ArrayList<Process>();
        
    }
    
    public void loadRandomColors(){
        
    }
    
    public int[] getColor(String name){
        
        for (int i = 0; i < process.size(); i++) {
            p = process.get(i); 
            if(p.getProcessID().equals(name)){                
                return p.getColor();
                
            }
        }
        return null;
    }

    public void createDynamicLabel(int time, String[] pList) {
        int[] set=new int[3];          
        
        testPnl.removeAll();
        
        JLabel j_label[] = new JLabel[time];
        JLabel j_labelNums[] = new JLabel[time];
        Border border=BorderFactory.createLineBorder(Color.BLACK, 1);
        for (int i = 0; i < time; i++) {                
                set=getColor(pList[i]);
                j_label[i] = new JLabel(pList[i]);
                j_label[i].setBounds(i * 40, 30, 40, 90);
                j_label[i].setBackground(new Color(set[0], set[1], set[2]));
                j_label[i].setAlignmentX(CENTER_ALIGNMENT);
                j_label[i].setHorizontalAlignment(JLabel.CENTER);
                j_label[i].setVerticalAlignment(JLabel.CENTER);
                j_label[i].setFont(new Font("Times New Roman", Font.BOLD, 14));
                j_label[i].setBorder(border);
                j_label[i].setOpaque(true);
                
                
                
                j_labelNums[i] = new JLabel(""+(i+1));
                j_labelNums[i].setBounds(i * 40, 0, 40, 30);
                j_labelNums[i].setBackground(Color.WHITE);
                j_labelNums[i].setAlignmentX(CENTER_ALIGNMENT);
                j_labelNums[i].setHorizontalAlignment(JLabel.CENTER);
                j_labelNums[i].setVerticalAlignment(JLabel.CENTER);
                j_labelNums[i].setFont(new Font("Times New Roman", Font.BOLD, 14));
                j_labelNums[i].setBorder(border);
                j_labelNums[i].setOpaque(true);
                
                testPnl.add(j_labelNums[i]);
                testPnl.add(j_label[i]);
                          

        }
        testPnl.validate();       
        testPnl.repaint();

        

    }

    @SuppressWarnings("unchecked")

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        txtBurstTime = new javax.swing.JTextField();
        txtArrivalTime = new javax.swing.JTextField();
        txtProcessID = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnlTable = new javax.swing.JPanel();
        btnStart = new javax.swing.JButton();
        btnCleartable = new javax.swing.JButton();
        btnDeleteRow = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProcess = new javax.swing.JTable();
        title2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        testPnl = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(153, 153, 153));
        mainPanel.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setBackground(new java.awt.Color(204, 255, 255));
        title.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        title.setText("Shortest Job First");
        title.setAlignmentX(1.0F);
        title.setAlignmentY(1.0F);
        mainPanel.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 370, 80));

        txtBurstTime.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        mainPanel.add(txtBurstTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 210, 40));

        txtArrivalTime.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtArrivalTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArrivalTimeActionPerformed(evt);
            }
        });
        txtArrivalTime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtArrivalTimeKeyPressed(evt);
            }
        });
        mainPanel.add(txtArrivalTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 210, 40));

        txtProcessID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtProcessID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProcessIDActionPerformed(evt);
            }
        });
        mainPanel.add(txtProcessID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 210, 40));

        btnAdd.setBackground(new java.awt.Color(102, 102, 102));
        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        mainPanel.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 180, 40));

        btnClear.setBackground(new java.awt.Color(102, 102, 102));
        btnClear.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnClear.setText("Clear Text Fields");
        btnClear.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });
        mainPanel.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 180, 180, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Burst Time :");
        mainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 160, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Arrival Time :");
        mainPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 160, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Process ID :");
        mainPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 160, 30));

        pnlTable.setBackground(new java.awt.Color(102, 102, 102));
        pnlTable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStart.setBackground(new java.awt.Color(102, 102, 102));
        btnStart.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnStart.setText("Simulate");
        btnStart.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStartMouseClicked(evt);
            }
        });
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        pnlTable.add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 140, 40));

        btnCleartable.setBackground(new java.awt.Color(102, 102, 102));
        btnCleartable.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCleartable.setText("Clear Table");
        btnCleartable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCleartable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCleartableMouseClicked(evt);
            }
        });
        pnlTable.add(btnCleartable, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 140, 40));

        btnDeleteRow.setBackground(new java.awt.Color(102, 102, 102));
        btnDeleteRow.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDeleteRow.setText("Delete Row");
        btnDeleteRow.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDeleteRow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteRowMouseClicked(evt);
            }
        });
        btnDeleteRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRowActionPerformed(evt);
            }
        });
        pnlTable.add(btnDeleteRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 140, 40));

        jScrollPane2.setViewportBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        tblProcess.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tblProcess.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process ID", "Burst Time", "Arrival Time"
            }
        ));
        tblProcess.setName(""); // NOI18N
        tblProcess.setRowHeight(25);
        tblProcess.setRowMargin(5);
        tblProcess.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tblProcess.setSelectionForeground(new java.awt.Color(102, 102, 102));
        jScrollPane2.setViewportView(tblProcess);

        pnlTable.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 350));

        mainPanel.add(pnlTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 670, 380));

        title2.setBackground(new java.awt.Color(204, 255, 255));
        title2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        title2.setText("Gannt Chart :");
        title2.setAlignmentX(1.0F);
        title2.setAlignmentY(1.0F);
        mainPanel.add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 370, 40));

        testPnl.setPreferredSize(new java.awt.Dimension(1000, 50));

        javax.swing.GroupLayout testPnlLayout = new javax.swing.GroupLayout(testPnl);
        testPnl.setLayout(testPnlLayout);
        testPnlLayout.setHorizontalGroup(
            testPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        testPnlLayout.setVerticalGroup(
            testPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 107, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(testPnl);

        mainPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 850, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 943, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtArrivalTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArrivalTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArrivalTimeActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        if (!(txtProcessID.getText().equals("") || txtBurstTime.getText().equals("") || txtArrivalTime.getText().equals(""))) {
            if ((txtBurstTime.getText().matches("[0-9]+") & txtArrivalTime.getText().matches("[0-9]+"))) {
                modelProcess.addRow(new Object[]{txtProcessID.getText(), txtBurstTime.getText(), txtArrivalTime.getText()});
                txtProcessID.setText("");
                txtBurstTime.setText("");
                txtArrivalTime.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Please Enter Times in Digits");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please fill every text box Data!!");
        }
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        txtProcessID.setText("");
        txtBurstTime.setText("");
        txtArrivalTime.setText("");
    }//GEN-LAST:event_btnClearMouseClicked

    private void btnCleartableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCleartableMouseClicked
        modelProcess.setRowCount(0);
    }//GEN-LAST:event_btnCleartableMouseClicked

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed

    }//GEN-LAST:event_btnStartActionPerformed

    private void btnStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartMouseClicked
        
        Random rand = new Random();
        processID=new String[modelProcess.getRowCount()];
        if (!process.isEmpty()) {
            process = new ArrayList<Process>();
        }
        
        for (int i = 0; i < modelProcess.getRowCount(); i++) {
            int r = rand.nextInt(120)+120;
            int g = rand.nextInt(120)+120;
            int b = rand.nextInt(120)+120;
            process.add(new Process(String.valueOf(modelProcess.getValueAt(i, 0)), String.valueOf(modelProcess.getValueAt(i, 1)), String.valueOf(modelProcess.getValueAt(i, 2)),r,g,b));
            processID[i]=String.valueOf(modelProcess.getValueAt(i, 0));
        }
        SJF sjf = new SJF(process);
        createDynamicLabel(sjf.getTotTime(), sjf.gannt);
        //System.out.println(sjf.getTurnAroundTime());
        //sjf.showFinalProcesses();

    }//GEN-LAST:event_btnStartMouseClicked

    private void btnDeleteRowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteRowMouseClicked
        try {
            modelProcess.removeRow(tblProcess.getSelectedRow());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Place Select a row.");
        }
    }//GEN-LAST:event_btnDeleteRowMouseClicked

    private void btnDeleteRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteRowActionPerformed

    private void txtProcessIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProcessIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProcessIDActionPerformed

    private void txtArrivalTimeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtArrivalTimeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArrivalTimeKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Test1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test1().setVisible(true);
            }
        });
    }

    public void findSJF() {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCleartable;
    private javax.swing.JButton btnDeleteRow;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel pnlTable;
    private javax.swing.JTable tblProcess;
    private javax.swing.JPanel testPnl;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title2;
    private javax.swing.JTextField txtArrivalTime;
    private javax.swing.JTextField txtBurstTime;
    private javax.swing.JTextField txtProcessID;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
