package Main;

import Admins.AdminActivity;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Sajeeb
 */
public class Admin extends javax.swing.JFrame {

    PreparedStatement prp = null;
    ResultSet result = null;
    Connection connection = null;
    String username;

    public Admin() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aUserLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        aUserField = new javax.swing.JTextField();
        aPassField = new javax.swing.JPasswordField();
        dExitBtn = new javax.swing.JButton();
        aLoginBtn = new javax.swing.JButton();
        mLabel = new java.awt.Label();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome Admin !");
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1000, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aUserLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        aUserLabel.setText("Username:");
        getContentPane().add(aUserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 169, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Password:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 303, -1, -1));

        aUserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aUserFieldActionPerformed(evt);
            }
        });
        getContentPane().add(aUserField, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 169, 279, 29));
        getContentPane().add(aPassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 303, 279, 29));

        dExitBtn.setBackground(new java.awt.Color(0, 204, 204));
        dExitBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dExitBtn.setForeground(new java.awt.Color(255, 255, 255));
        dExitBtn.setText("Home");
        dExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dExitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(dExitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 405, 91, 35));

        aLoginBtn.setBackground(new java.awt.Color(0, 153, 153));
        aLoginBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aLoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        aLoginBtn.setText("Login");
        aLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aLoginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(aLoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 405, 91, 35));

        mLabel.setAlignment(java.awt.Label.CENTER);
        mLabel.setBackground(new java.awt.Color(0, 153, 153));
        mLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        mLabel.setForeground(new java.awt.Color(255, 255, 255));
        mLabel.setText("Hospital Management System");
        getContentPane().add(mLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, 1000, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/dxjKpR[1].jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dExitBtnActionPerformed
        Hospital hospital = new Hospital();
        hospital.setVisible(true);
        dispose();
    }//GEN-LAST:event_dExitBtnActionPerformed

    private void aLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aLoginBtnActionPerformed
        connection = Connector.ConnectDb();
        String user = aUserField.getText();
        String pass = String.valueOf(aPassField.getPassword());

        try {
            String sql = "select username, password from admin where username='" + user + "'";
            prp = connection.prepareStatement(sql);
            result = prp.executeQuery();
            result.first();
            if (pass.equals(result.getString("password"))) {
                AdminActivity adminActivity = new AdminActivity();
                adminActivity.setVisible(true);
                JOptionPane.showMessageDialog(null, "Login Succesful", "Welcome " + user, JOptionPane.INFORMATION_MESSAGE);
                dispose();
                username = user;
                adminActivity.User(username);
                connection.close();
            } else {
                JOptionPane.showMessageDialog(null, "Login Failed", "Error", JOptionPane.WARNING_MESSAGE);
//                JOptionPane.showMessageDialog(null, "User or Password wrong.");
            }

        } catch (HeadlessException | SQLException e) {
//            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "User or Password wrong.");
        }

    }//GEN-LAST:event_aLoginBtnActionPerformed

    private void aUserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aUserFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aUserFieldActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Admin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aLoginBtn;
    private javax.swing.JPasswordField aPassField;
    private javax.swing.JTextField aUserField;
    private javax.swing.JLabel aUserLabel;
    private javax.swing.JButton dExitBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private java.awt.Label mLabel;
    // End of variables declaration//GEN-END:variables
}
