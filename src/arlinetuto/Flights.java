/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package arlinetuto;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author PHU
 */
public class Flights extends javax.swing.JFrame {

    /**
     * Creates new form Flights
     */
    public Flights() {
        initComponents();
        DisplayFlight();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        FCodeTb = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        FSouceCb = new javax.swing.JComboBox<>();
        FDestiCb = new javax.swing.JComboBox<>();
        FDate = new com.toedter.calendar.JDateChooser();
        FNseatTb = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        SaveDtn = new javax.swing.JButton();
        EditDtn = new javax.swing.JButton();
        DeleteDtn = new javax.swing.JButton();
        BackDtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        FlightTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("MyCodeSpace Arline");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("Manage fligths");

        jLabel4.setForeground(new java.awt.Color(51, 204, 255));
        jLabel4.setText("Flight code");

        FCodeTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FCodeTbActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(51, 204, 255));
        jLabel5.setText("Souce");

        jLabel6.setForeground(new java.awt.Color(51, 204, 255));
        jLabel6.setText("Destination");

        jLabel7.setForeground(new java.awt.Color(0, 204, 255));
        jLabel7.setText("Take of Date");

        jLabel8.setForeground(new java.awt.Color(51, 204, 255));
        jLabel8.setText("Number Of Seats");

        FSouceCb.setForeground(new java.awt.Color(51, 204, 255));
        FSouceCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hanoi", "HoChiMinh", "DaNang", "CanTho", "BinhDuong", "HaLong", "Hue", "NhaTrang", " " }));

        FDestiCb.setForeground(new java.awt.Color(51, 204, 255));
        FDestiCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hanoi", "Singapore", "Hongkong", "Califonia", " " }));

        FNseatTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNseatTbActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 153, 255));
        jLabel9.setText("Fligths List");

        SaveDtn.setForeground(new java.awt.Color(51, 204, 255));
        SaveDtn.setText("Save");
        SaveDtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveDtnMouseClicked(evt);
            }
        });

        EditDtn.setForeground(new java.awt.Color(51, 204, 255));
        EditDtn.setText("Edit");
        EditDtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditDtnMouseClicked(evt);
            }
        });

        DeleteDtn.setForeground(new java.awt.Color(51, 204, 255));
        DeleteDtn.setText("Delete");
        DeleteDtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteDtnMouseClicked(evt);
            }
        });

        BackDtn.setForeground(new java.awt.Color(51, 204, 255));
        BackDtn.setText("Back");
        BackDtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackDtnMouseClicked(evt);
            }
        });
        BackDtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackDtnActionPerformed(evt);
            }
        });

        FlightTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        FlightTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FlightTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(FlightTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(FCodeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(39, 39, 39)
                            .addComponent(FSouceCb, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(128, 128, 128)
                            .addComponent(SaveDtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(109, 109, 109)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EditDtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(FDestiCb, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(DeleteDtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(BackDtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(FDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(217, 217, 217))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FNseatTb, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(26, 26, 26)))
                        .addGap(31, 31, 31))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(357, 357, 357))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(325, 325, 325))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FNseatTb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SaveDtn)
                            .addComponent(EditDtn)
                            .addComponent(DeleteDtn)
                            .addComponent(BackDtn)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FCodeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FSouceCb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FDestiCb)))
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FCodeTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FCodeTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FCodeTbActionPerformed

    private void FNseatTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNseatTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FNseatTbActionPerformed

    private void BackDtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackDtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackDtnActionPerformed

    private void BackDtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackDtnMouseClicked
        new Main2().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackDtnMouseClicked
Connection Con =null;
PreparedStatement pst = null;
ResultSet Rs= null,Rsl=null;
Statement St= null,Stl=null;
private void DisplayFlight()
{
    try{
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb" ,"root" , "12345");
        St = Con.createStatement();
        Rs = St.executeQuery("select * from flighttbl");
        FlightTable.setModel(DbUtils.resultSetToTableModel(Rs));
        
    }catch (Exception e){     
    }
}
private void Clear()
{
    FCodeTb.setText(" ");
    FNseatTb.setText(" ");
    
    
}
    private void SaveDtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveDtnMouseClicked
         if (FCodeTb.getText().isEmpty() || FNseatTb.getText().isEmpty() || FSouceCb.getSelectedIndex() == -1 || FDestiCb.getSelectedIndex() == -1) {
    JOptionPane.showMessageDialog(this, "Missing Information");
} else {
    try {
       
        
        try (Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb", "root", "12345")) {
            PreparedStatement Add = Con.prepareStatement("INSERT INTO FlightTbl VALUES (?, ?, ?, ?, ?)");
            Add.setString(1, FCodeTb.getText());
            Add.setString(2, FSouceCb.getSelectedItem().toString());
            Add.setString(3, FDestiCb.getSelectedItem().toString());
            Add.setString(4, FDate.getDate().toString());
            Add.setInt(5, Integer.valueOf(FNseatTb.getText()));
            

            int row = Add.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(this, "Flight Added");
                DisplayFlight();
                Clear();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to add passenger");
            }
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
}
    }//GEN-LAST:event_SaveDtnMouseClicked

    private void DeleteDtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteDtnMouseClicked
        if (key == " ") {
        JOptionPane.showMessageDialog(this, "Select a passenger");
    } else {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb", "root", "12345");
            String query;
            if (key == " ") {
                // Special handling for deleting records with pid = 0
                query = "DELETE FROM FlightTbl WHERE Flcode='"+key+"'";
            } else {
                query = "DELETE FROM FlightTbl WHERE Flcode='"+key+"'";
            }
            PreparedStatement deleteStatement = Con.prepareStatement(query);

            int rowsAffected = deleteStatement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Flight deleted successfully");
                DisplayFlight();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to delete passenger");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        } finally {
            try {
                if (Con != null) {
                    Con.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error closing connection: " + e.getMessage());
            }
        }
    }
    }//GEN-LAST:event_DeleteDtnMouseClicked
 String key=" ";
    private void FlightTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlightTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) FlightTable.getModel();
    int MyIndex = FlightTable.getSelectedRow();
    key = model.getValueAt(MyIndex, 0).toString();
    FSouceCb.setSelectedItem(model.getValueAt(MyIndex, 1).toString());
    FDestiCb.setSelectedItem(model.getValueAt(MyIndex, 2).toString());
    FNseatTb.setText(model.getValueAt(MyIndex, 4).toString());
    
    }//GEN-LAST:event_FlightTableMouseClicked

    private void EditDtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditDtnMouseClicked
       if (key =="") {
    JOptionPane.showMessageDialog(this, "Select a flight");
} else {
    try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb", "root", "12345");
        String query = "UPDATE FlightTbl SET FlSource=?, FlDest=?, FlDate=?, FlSoats=? WHERE Flcode=?";
        PreparedStatement updateStatement = Con.prepareStatement(query);

        updateStatement.setString(1, FSouceCb.getSelectedItem().toString());
        updateStatement.setString(2, FDestiCb.getSelectedItem().toString());      
          updateStatement.setString(3, FDate.getDate().toString());
        updateStatement.setString(4, FNseatTb.getText());
        updateStatement.setString(5, key); // Giả sử key là mã chuyến bay

        int row = updateStatement.executeUpdate();
        JOptionPane.showMessageDialog(this, "Flight updated");
        Con.close();
        DisplayFlight();
        Clear();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
}

     
    }//GEN-LAST:event_EditDtnMouseClicked

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
            java.util.logging.Logger.getLogger(Flights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Flights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Flights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Flights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Flights().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackDtn;
    private javax.swing.JButton DeleteDtn;
    private javax.swing.JButton EditDtn;
    private javax.swing.JTextField FCodeTb;
    private com.toedter.calendar.JDateChooser FDate;
    private javax.swing.JComboBox<String> FDestiCb;
    private javax.swing.JTextField FNseatTb;
    private javax.swing.JComboBox<String> FSouceCb;
    private javax.swing.JTable FlightTable;
    private javax.swing.JButton SaveDtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
