package Doctors;

import Admins.doctorManagement;
import Main.Connector;
import Main.Hospital;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Sajeeb
 */
public class addDoctor extends javax.swing.JFrame {

    Connection connection = null;
    PreparedStatement prp = null;

    public addDoctor() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dDateField = new javax.swing.JTextField();
        dIdField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dNameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dAgeField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        dPhoneField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dAddressField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dRoomField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        dGenderField = new javax.swing.JComboBox<>();
        dStatusField = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        addDctorbtn = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        clearPbtn = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dBloodField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        dEmailField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dUserField = new javax.swing.JTextField();
        dPassField = new javax.swing.JPasswordField();
        dDeptField = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add new Doctor");

        jPanel2.setPreferredSize(new java.awt.Dimension(1260, 583));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Add Doctor");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cross.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/backs.png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1232, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Joining Date");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 146, -1, -1));

        dDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dDateFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 149, 149, -1));

        dIdField.setText("sjb0HMSd");
        dIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dIdFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 197, 149, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Id");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 194, 98, -1));

        dNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dNameFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 252, 149, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 249, 98, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Age");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 304, 98, -1));

        dAgeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dAgeFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dAgeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 307, 149, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Gender");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 359, 98, -1));

        Gender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Gender.setForeground(new java.awt.Color(0, 153, 153));
        Gender.setText("Department");
        jPanel2.add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 146, 135, -1));

        dPhoneField.setText("+880");
        dPhoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dPhoneFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dPhoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(802, 197, 152, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Phone Number");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 194, 135, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Maritial Status");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 304, 135, -1));

        dAddressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dAddressFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dAddressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(806, 369, 149, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("Address");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 366, 140, -1));

        dRoomField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dRoomFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dRoomField, new org.netbeans.lib.awtextra.AbsoluteConstraints(806, 424, 149, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 153));
        jLabel14.setText("Ward/Room no");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 421, 140, -1));

        dGenderField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item", "Male", "Female" }));
        dGenderField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dGenderFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dGenderField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 361, 149, 25));

        dStatusField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item", "Single", "Married", "Divorced" }));
        dStatusField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dStatusFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dStatusField, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 307, 152, 25));

        jPanel7.setBackground(new java.awt.Color(0, 204, 204));

        addDctorbtn.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        addDctorbtn.setForeground(new java.awt.Color(255, 255, 255));
        addDctorbtn.setText("Add");
        addDctorbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDctorbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(addDctorbtn)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addDctorbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 478, -1, -1));

        jPanel8.setBackground(new java.awt.Color(102, 102, 102));
        jPanel8.setPreferredSize(new java.awt.Dimension(100, 65));

        clearPbtn.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        clearPbtn.setForeground(new java.awt.Color(255, 255, 255));
        clearPbtn.setText("Clear");
        clearPbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearPbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(clearPbtn)
                .addGap(20, 20, 20))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clearPbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 482, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Blood group");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 421, 98, -1));

        dBloodField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dBloodFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dBloodField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 424, 149, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 153));
        jLabel10.setText("Email");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 249, 137, -1));

        dEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dEmailFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dEmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 252, 152, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 153));
        jLabel15.setText("Password");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(992, 306, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("Username");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 255, 110, -1));

        dUserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dUserFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dUserField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1071, 255, 149, -1));
        jPanel2.add(dPassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1071, 300, 149, -1));

        dDeptField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Department", "Medecine", "Dental", "Gynaecology", "Nutrition", "Neurology", "Cardiology", "Haematology", "Microbiology" }));
        jPanel2.add(dDeptField, new org.netbeans.lib.awtextra.AbsoluteConstraints(802, 148, 152, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doctors/dxjKpR[1].jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 570));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1229, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        Hospital hospital = new Hospital();
        hospital.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        doctorManagement dManagement = new doctorManagement();
        dManagement.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void dDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dDateFieldActionPerformed

    private void dIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dIdFieldActionPerformed

    private void dNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dNameFieldActionPerformed

    private void dAgeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dAgeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dAgeFieldActionPerformed

    private void dPhoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dPhoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dPhoneFieldActionPerformed

    private void dAddressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dAddressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dAddressFieldActionPerformed

    private void dRoomFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dRoomFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dRoomFieldActionPerformed

    private void dGenderFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dGenderFieldActionPerformed

    }//GEN-LAST:event_dGenderFieldActionPerformed

    private void dStatusFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dStatusFieldActionPerformed

    }//GEN-LAST:event_dStatusFieldActionPerformed

    private void addDctorbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDctorbtnMouseClicked
        connection = Connector.ConnectDb();
        if (connection != null) {
            String date = dDateField.getText();
            String id = dIdField.getText();
            String name = dNameField.getText();
            int age = Integer.parseInt(dAgeField.getText());
            String gender = (String) dGenderField.getSelectedItem();
            String blood = dBloodField.getText();
            String dept = (String) dDeptField.getSelectedItem();
            String phone = dPhoneField.getText();
            String email = dEmailField.getText();
            String status = (String) dStatusField.getSelectedItem();
            String address = dAddressField.getText();
            int room = Integer.parseInt(dRoomField.getText());
            String user = dUserField.getText();
            String pass = String.valueOf(dPassField.getPassword());
            String sql = "insert into doctor(date,id,name,age,gender,blood,dept,phone,email,status,address,room,username,password) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            try {
                prp = connection.prepareStatement(sql);
                prp.setString(1, date);
                prp.setString(2, id);
                prp.setString(3, name);
                prp.setInt(4, age);
                prp.setString(5, gender);
                prp.setString(6, blood);
                prp.setString(7, dept);
                prp.setString(8, phone);
                prp.setString(9, email);
                prp.setString(10, status);
                prp.setString(11, address);
                prp.setInt(12, room);
                prp.setString(13, user);
                prp.setString(14, pass);
                prp.execute();
                JOptionPane.showMessageDialog(null, "Data Saved");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_addDctorbtnMouseClicked

    private void clearPbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearPbtnMouseClicked
        dDateField.setText("");
        dIdField.setText("sjb0HMSd");
        dNameField.setText("");
        dAgeField.setText("");
        dDeptField.setSelectedIndex(0);
        dPhoneField.setText("+880");
        dAddressField.setText("");
        dRoomField.setText("");
        dGenderField.setSelectedIndex(0);
        dStatusField.setSelectedIndex(0);
        dUserField.setText("");
        dPassField.setText("");
        dEmailField.setText("");
        dBloodField.setText("");
    }//GEN-LAST:event_clearPbtnMouseClicked

    private void dBloodFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dBloodFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dBloodFieldActionPerformed

    private void dEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dEmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dEmailFieldActionPerformed

    private void dUserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dUserFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dUserFieldActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new addDoctor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel addDctorbtn;
    private javax.swing.JLabel clearPbtn;
    private javax.swing.JTextField dAddressField;
    private javax.swing.JTextField dAgeField;
    private javax.swing.JTextField dBloodField;
    private javax.swing.JTextField dDateField;
    private javax.swing.JComboBox<String> dDeptField;
    private javax.swing.JTextField dEmailField;
    private javax.swing.JComboBox<String> dGenderField;
    private javax.swing.JTextField dIdField;
    private javax.swing.JTextField dNameField;
    private javax.swing.JPasswordField dPassField;
    private javax.swing.JTextField dPhoneField;
    private javax.swing.JTextField dRoomField;
    private javax.swing.JComboBox<String> dStatusField;
    private javax.swing.JTextField dUserField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
