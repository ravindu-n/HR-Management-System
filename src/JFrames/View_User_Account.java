/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrames;

import JClasses.SQLConnection;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

/**
 *
 * @author Ravindu
 */
public class View_User_Account extends javax.swing.JFrame {

    /**
     * Creates new form View_User_Account
     */
    public View_User_Account() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUserAccounts = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnViewAll = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "View User Accounts", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblUserAccounts.setBackground(new java.awt.Color(204, 255, 204));
        tblUserAccounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "User Name", "User Type", "EMP ID"
            }
        ));
        tblUserAccounts.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblUserAccountsKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblUserAccounts);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 514, 178));

        btnUpdate.setBackground(new java.awt.Color(51, 0, 204));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 107, 55));

        btnDelete.setBackground(new java.awt.Color(204, 0, 0));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 107, 55));

        btnBack.setBackground(new java.awt.Color(255, 51, 51));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 107, 55));

        btnViewAll.setBackground(new java.awt.Color(153, 153, 153));
        btnViewAll.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewAll.setForeground(new java.awt.Color(255, 255, 255));
        btnViewAll.setText("View All");
        btnViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 130, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int selectedRow = tblUserAccounts.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to update", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String id = tblUserAccounts.getValueAt(selectedRow, 0).toString(); // Assuming the ID is in the first column

        // Use a pop-up dialog to get the new user name
        String newUserName = JOptionPane.showInputDialog(this, "Enter the new user name:");

        if (newUserName == null || newUserName.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "New user name cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Connection connection = SQLConnection.getConnection();
            String query = "UPDATE userlogin SET UserName = ? WHERE ID = ?";
            
            try (PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query)) {
                preparedStatement.setString(1, newUserName);
                preparedStatement.setString(2, id);

                int result = preparedStatement.executeUpdate();

                if (result > 0) {
                    JOptionPane.showMessageDialog(this, "User account updated successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                    // Update the JTable with the new data
                    updateTable();
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to update user account", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateTable() {
        // Logic to refresh the JTable with updated data from the database
        DefaultTableModel model = (DefaultTableModel) tblUserAccounts.getModel();
        model.setRowCount(0); // Clear existing rows

        try {
            Connection connection = SQLConnection.getConnection();
            String query = "SELECT ID, UserName, UserType, EmpId FROM userlogin";
            
            try (PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
                 ResultSet resultSet = preparedStatement.executeQuery()) {

                while (resultSet.next()) {
                    Object[] rowData = {resultSet.getString("ID"), resultSet.getString("UserName"), resultSet.getString("UserType"), resultSet.getString("EmpId")};
                    model.addRow(rowData);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllActionPerformed
        try {
            Connection connection = SQLConnection.getConnection();
            String query = "SELECT ID, UserName, UserType, EmpId FROM userlogin";
            
            try (PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
                 ResultSet resultSet = preparedStatement.executeQuery()) {

                DefaultTableModel model = (DefaultTableModel) tblUserAccounts.getModel();
                model.setRowCount(0); // Clear existing rows

                while (resultSet.next()) {
                    Object[] rowData = {resultSet.getString("ID"), resultSet.getString("UserName"), resultSet.getString("UserType"), resultSet.getString("EmpId")};
                    model.addRow(rowData);
                }

                JOptionPane.showMessageDialog(this, "User accounts loaded successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnViewAllActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = tblUserAccounts.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String id = tblUserAccounts.getValueAt(selectedRow, 0).toString(); // Assuming the ID is in the first column

        int confirmDelete = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this user account?", "Confirm Delete", JOptionPane.YES_NO_OPTION);

        if (confirmDelete != JOptionPane.YES_OPTION) {
            return; // User canceled the delete operation
        }
        try {
            Connection connection = SQLConnection.getConnection();
            String query = "DELETE FROM userlogin WHERE ID = ?";
            
            try (PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query)) {
                preparedStatement.setString(1, id);

                int result = preparedStatement.executeUpdate();

                if (result > 0) {
                    JOptionPane.showMessageDialog(this, "User account deleted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                    // Update the JTable with the new data
                    updateTable();
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to delete user account", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database error", "Error", JOptionPane.ERROR_MESSAGE);
        }    
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblUserAccountsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblUserAccountsKeyPressed
        
    }//GEN-LAST:event_tblUserAccountsKeyPressed

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
            java.util.logging.Logger.getLogger(View_User_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_User_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_User_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_User_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new View_User_Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnViewAll;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUserAccounts;
    // End of variables declaration//GEN-END:variables
}