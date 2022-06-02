package Doctors;

import Main.Connector;
import Main.Hospital;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Appointment extends javax.swing.JFrame {

    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection connection = null;
    String pName;

    public Appointment(String Nname) {
        initComponents();
        pName = Nname;
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());

        connection = Connector.ConnectDb();
        String sql = "SELECT id,age,gender FROM patient WHERE name='"+pName+"'";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next())
            {
            String Id = rs.getString("id");
            int iage = rs.getInt("age");
            String gender = rs.getString("gender");
            String age = Integer.toString(iage);
            pNamelbl.setText(pName);
            pIdlbl.setText(Id);
            pAgelbl.setText(age);
            pGenderlbl.setText(gender);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public Appointment() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pNamelbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pAgelbl = new javax.swing.JLabel();
        pIdlbl = new javax.swing.JLabel();
        pGenderlbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        appointmentBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Check Appoinments !");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Appointments");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cross.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/backs.png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(511, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(405, 405, 405)
                .addComponent(jLabel21)
                .addGap(55, 55, 55)
                .addComponent(jLabel16)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel16))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, 1227, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Patient Name:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 191, -1, 37));

        pNamelbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pNamelbl.setForeground(new java.awt.Color(153, 153, 153));
        pNamelbl.setText("Patient Name");
        getContentPane().add(pNamelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 192, 220, 37));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Age:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 247, -1, 37));

        pAgelbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pAgelbl.setForeground(new java.awt.Color(153, 153, 153));
        pAgelbl.setText("Patient Age");
        getContentPane().add(pAgelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 248, 220, 37));

        pIdlbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pIdlbl.setForeground(new java.awt.Color(153, 153, 153));
        pIdlbl.setText("Patient Id");
        getContentPane().add(pIdlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 192, 220, 37));

        pGenderlbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pGenderlbl.setForeground(new java.awt.Color(153, 153, 153));
        pGenderlbl.setText("Patient Gender");
        getContentPane().add(pGenderlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 248, 220, 37));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setText("ID:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 191, -1, 37));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setText("Gender:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 247, -1, 37));

        appointmentBtn.setBackground(new java.awt.Color(0, 204, 204));
        appointmentBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        appointmentBtn.setForeground(new java.awt.Color(255, 255, 255));
        appointmentBtn.setText("Details");
        appointmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentBtnActionPerformed(evt);
            }
        });
        getContentPane().add(appointmentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 362, 91, 43));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doctors/dxjKpR[1].jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        Hospital hospital = new Hospital();
        hospital.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        doctorActivity dActivity = new doctorActivity();
        dActivity.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void appointmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentBtnActionPerformed
        //System.out.println("Name :"+pName);
        patientDetails pDetails = new patientDetails(pName);
        pDetails.setVisible(true);
        dispose();
    }//GEN-LAST:event_appointmentBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Appointment().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appointmentBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel pAgelbl;
    private javax.swing.JLabel pGenderlbl;
    private javax.swing.JLabel pIdlbl;
    private javax.swing.JLabel pNamelbl;
    // End of variables declaration//GEN-END:variables
}
