/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package arlinetuto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author PHU
 */
public class TicketBooking extends javax.swing.JFrame {

    public TicketBooking() {
        initComponents();
        GetPassenger();
        NationalityTb.setEditable(false);
        PassNameTb.setEditable(false);
        PassNumTb.setEditable(false);
        GenTb.setEditable(false);
        GetFlights();
        DisplayBooking();
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb", "root", "12345");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PassNameTb = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        AmountTB = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        BookDtn = new javax.swing.JButton();
        ResetDtn = new javax.swing.JButton();
        BackDtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        BookinTable = new javax.swing.JTable();
        PassNumTb = new javax.swing.JTextField();
        NationalityTb = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        PassIdCB = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        GenTb = new javax.swing.JTextField();
        PassCodeCb = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jLabel3.setText("Ticket Booking");

        jLabel4.setForeground(new java.awt.Color(51, 204, 255));
        jLabel4.setText("Passengers  name");

        PassNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassNameTbActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(51, 204, 255));
        jLabel5.setText("Nationality");

        jLabel6.setForeground(new java.awt.Color(51, 204, 255));
        jLabel6.setText("Gender");

        jLabel7.setForeground(new java.awt.Color(0, 204, 255));
        jLabel7.setText("Passport Number");

        jLabel8.setForeground(new java.awt.Color(51, 204, 255));
        jLabel8.setText("Amount");

        AmountTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmountTBActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 153, 255));
        jLabel9.setText("Bookings");

        BookDtn.setForeground(new java.awt.Color(51, 204, 255));
        BookDtn.setText("Book");
        BookDtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookDtnMouseClicked(evt);
            }
        });

        ResetDtn.setForeground(new java.awt.Color(51, 204, 255));
        ResetDtn.setText("Reset");
        ResetDtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetDtnMouseClicked(evt);
            }
        });
        ResetDtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetDtnActionPerformed(evt);
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

        BookinTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(BookinTable);

        PassNumTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassNumTbActionPerformed(evt);
            }
        });

        NationalityTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NationalityTbActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(51, 204, 255));
        jLabel11.setText(" Passengers ID");

        PassIdCB.setForeground(new java.awt.Color(51, 204, 255));
        PassIdCB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PassIdCBMouseClicked(evt);
            }
        });
        PassIdCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassIdCBActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(51, 204, 255));
        jLabel12.setText("Flight Code");

        GenTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenTbActionPerformed(evt);
            }
        });

        PassCodeCb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PassCodeCbMouseClicked(evt);
            }
        });
        PassCodeCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassCodeCbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(PassIdCB, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(PassNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BookDtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PassCodeCb, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ResetDtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GenTb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(PassNumTb, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                        .addComponent(AmountTB, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(74, 74, 74)
                                        .addComponent(BackDtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(216, 216, 216))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(67, 67, 67)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(230, 230, 230)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NationalityTb, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PassNumTb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AmountTB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PassIdCB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PassNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NationalityTb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GenTb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PassCodeCb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BookDtn)
                            .addComponent(ResetDtn)
                            .addComponent(BackDtn))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)))
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PassNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassNameTbActionPerformed

    private void AmountTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmountTBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmountTBActionPerformed

    private void BackDtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackDtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackDtnActionPerformed

    private void PassNumTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassNumTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassNumTbActionPerformed

    private void NationalityTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NationalityTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NationalityTbActionPerformed

    private void ResetDtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetDtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetDtnActionPerformed
    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null, Rsl = null;
    Statement St = null, Stl = null;

    private void GetPassenger() {
        try {

            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb", "root", "12345");
            St = Con.createStatement();
            String Query = "select * from PassengersTbl";
            Rs = St.executeQuery(Query);
            while (Rs.next()) {
                String PId = String.valueOf(Rs.getInt("PId"));
                PassIdCB.addItem(PId);
            }
        } catch (Exception e) {
        }

    }

    private void GetFlights() {
        try {

            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb", "root", "12345");
            St = Con.createStatement();
            String Query = "select * from FlightTbl";
            Rs = St.executeQuery(Query);
            while (Rs.next()) {
                String FCode = Rs.getString("Flcode");
                PassCodeCb.addItem(FCode);
            }
        } catch (Exception e) {
        }

    }

    private void GetPassengerData() {
        String Query = "select * from PassengersTbl where PId=" + PassIdCB.getSelectedItem().toString();
        Statement St;
        ResultSet Rs;
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb", "root", "12345");
            St = Con.createStatement();
            Rs = St.executeQuery(Query);
            if (Rs.next()) {
                PassNameTb.setText(Rs.getString("PName"));
                GenTb.setText(Rs.getString("PGen"));
                PassNumTb.setText(Rs.getString("Ppass"));
                NationalityTb.setText(Rs.getString("PNat"));

            }
        } catch (Exception e) {
        }
    }

    private void DisplayBooking() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb", "root", "12345");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from BookingTBl");
            BookinTable.setModel(DbUtils.resultSetToTableModel(Rs));

        } catch (Exception e) {
        }
    }
    int TId = 0;
    private int CountFlights() {
        try {
        Stl = Con.createStatement();
        Rsl = Stl.executeQuery("SELECT MAX(Ticketld) FROM BookingTbl");
        if (Rsl.next()) {
            TId = Rsl.getInt(1);
            TId += 1; // Increment the maximum ID by 1 to generate a new ID
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return TId;
    }
    private void BookDtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookDtnMouseClicked
        if (PassIdCB.getSelectedIndex() == -1 || PassCodeCb.getSelectedIndex() == -1 || AmountTB.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else {
            try {
                int newTicketId = CountFlights();
                CountFlights();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb", "root", "12345");
                PreparedStatement Add = Con.prepareStatement("INSERT INTO BookingTbl VALUES (?, ?, ?, ?, ?, ?, ?)");
                
                Add.setInt(1, newTicketId);
                Add.setString(2, PassNameTb.getText());
                Add.setString(3, PassCodeCb.getSelectedItem().toString());
                Add.setString(4, GenTb.getText());
                Add.setString(5, PassNumTb.getText());
                Add.setInt(6, Integer.valueOf(AmountTB.getText()));
                Add.setString(7, NationalityTb.getText());
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Ticket Booked");
                Con.close();
                DisplayBooking();
Clear();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }

    }//GEN-LAST:event_BookDtnMouseClicked

    private void GenTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenTbActionPerformed

    private void PassIdCBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassIdCBMouseClicked

    }//GEN-LAST:event_PassIdCBMouseClicked

    private void PassIdCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassIdCBActionPerformed
        GetPassengerData();
    }//GEN-LAST:event_PassIdCBActionPerformed

    private void PassCodeCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassCodeCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassCodeCbActionPerformed

    private void BackDtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackDtnMouseClicked
        new Main2().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_BackDtnMouseClicked
private void Clear(){
    PassCodeCb.setSelectedIndex(-1);
//PassIdCB.setSelectedIndex(-1);
PassNameTb.setText(" ");
PassNumTb.setText(" ");
GenTb.setText(" ");
NationalityTb.setText(" ");
AmountTB.setText(" ");
}

    private void ResetDtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetDtnMouseClicked
Clear();
    }//GEN-LAST:event_ResetDtnMouseClicked

    private void PassCodeCbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassCodeCbMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PassCodeCbMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
  
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AmountTB;
    private javax.swing.JButton BackDtn;
    private javax.swing.JButton BookDtn;
    private javax.swing.JTable BookinTable;
    private javax.swing.JTextField GenTb;
    private javax.swing.JTextField NationalityTb;
    private javax.swing.JComboBox<String> PassCodeCb;
    private javax.swing.JComboBox<String> PassIdCB;
    private javax.swing.JTextField PassNameTb;
    private javax.swing.JTextField PassNumTb;
    private javax.swing.JButton ResetDtn;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
