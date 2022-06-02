package Main;

import Doctors.doctorActivity;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Doctor extends javax.swing.JFrame {

    PreparedStatement prp = null;
    ResultSet result = null;
    Connection connection = null;
    String userName;

    public Doctor() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mLabel = new java.awt.Label();
        aUserLabel = new javax.swing.JLabel();
        dUserField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dPassField = new javax.swing.JPasswordField();
        dExitBtn = new javax.swing.JButton();
        dLoginBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hello Doctor !");
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1004, 0, 13, -1));

        mLabel.setAlignment(java.awt.Label.CENTER);
        mLabel.setBackground(new java.awt.Color(0, 153, 153));
        mLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        mLabel.setForeground(new java.awt.Color(255, 255, 255));
        mLabel.setText("Hospital Management System");
        getContentPane().add(mLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 1017, 70));

        aUserLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        aUserLabel.setText("Username:");
        getContentPane().add(aUserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 170, -1, -1));

        dUserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dUserFieldActionPerformed(evt);
            }
        });
        getContentPane().add(dUserField, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 170, 279, 29));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Password:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 304, -1, -1));
        getContentPane().add(dPassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 304, 279, 29));

        dExitBtn.setBackground(new java.awt.Color(0, 204, 204));
        dExitBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dExitBtn.setForeground(new java.awt.Color(255, 255, 255));
        dExitBtn.setText("Home");
        dExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dExitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(dExitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 406, 91, 35));

        dLoginBtn.setBackground(new java.awt.Color(0, 153, 153));
        dLoginBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dLoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        dLoginBtn.setText("Login");
        dLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dLoginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(dLoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 406, 91, 35));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/dxjKpR[1].jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dUserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dUserFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dUserFieldActionPerformed

    private void dExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dExitBtnActionPerformed
        Hospital hospital = new Hospital();
        hospital.setVisible(true);
        dispose();
    }//GEN-LAST:event_dExitBtnActionPerformed

    private void dLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dLoginBtnActionPerformed
        connection = Connector.ConnectDb();
        String user = dUserField.getText();
        String pass = String.valueOf(dPassField.getPassword());

        try {
            String sql = "select username, password from doctor2 where username='" + user + "'";
            prp = connection.prepareStatement(sql);
            result = prp.executeQuery();
            result.first();
            userName = user;
            if (pass.equals(result.getString("password"))) {
                doctorActivity dActivity = new doctorActivity(userName);
                dActivity.setVisible(true);
                JOptionPane.showMessageDialog(null, "Login Succesful", "Welcome " + user, JOptionPane.INFORMATION_MESSAGE);
                dispose();
                connection.close();
            } else {
                JOptionPane.showMessageDialog(null, "Login Failed", "Error", JOptionPane.WARNING_MESSAGE);
            }

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "User or Password wrong.");
        }
    }//GEN-LAST:event_dLoginBtnActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Doctor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aUserLabel;
    private javax.swing.JButton dExitBtn;
    private javax.swing.JButton dLoginBtn;
    private javax.swing.JPasswordField dPassField;
    private javax.swing.JTextField dUserField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label mLabel;
    // End of variables declaration//GEN-END:variables
}
