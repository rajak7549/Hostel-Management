import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

       public Home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\OneDrive\\Documents\\NetBeansProjects\\HotelControPro\\hostel images & icon\\room.png")); // NOI18N
        jButton1.setText("Manage Room");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 260, 30));

        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\OneDrive\\Documents\\NetBeansProjects\\HotelControPro\\hostel images & icon\\new student.png")); // NOI18N
        jButton2.setText("New Student");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 260, 30));

        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\OneDrive\\Documents\\NetBeansProjects\\HotelControPro\\hostel images & icon\\Update & Delete Student.png")); // NOI18N
        jButton3.setText("Update & delete Student");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 260, 30));

        jButton4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\OneDrive\\Documents\\NetBeansProjects\\HotelControPro\\hostel images & icon\\Fees.png")); // NOI18N
        jButton4.setText("Student Fees");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 260, 30));

        jButton5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\OneDrive\\Documents\\NetBeansProjects\\HotelControPro\\hostel images & icon\\all student living.png")); // NOI18N
        jButton5.setText("All Students living");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 260, 30));

        jButton6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\OneDrive\\Documents\\NetBeansProjects\\HotelControPro\\hostel images & icon\\Leaved students.png")); // NOI18N
        jButton6.setText("Leaved Students");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 260, 30));

        jButton7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\OneDrive\\Documents\\NetBeansProjects\\HotelControPro\\hostel images & icon\\new student.png")); // NOI18N
        jButton7.setText("New Employee");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 260, 30));

        jButton8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\OneDrive\\Documents\\NetBeansProjects\\HotelControPro\\hostel images & icon\\Update & Delete Student.png")); // NOI18N
        jButton8.setText("Update & Delete Employee");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 260, 30));

        jButton9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\OneDrive\\Documents\\NetBeansProjects\\HotelControPro\\hostel images & icon\\Fees.png")); // NOI18N
        jButton9.setText("Employee Payment");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 260, 30));

        jButton10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\OneDrive\\Documents\\NetBeansProjects\\HotelControPro\\hostel images & icon\\all student living.png")); // NOI18N
        jButton10.setText("All Employee Working");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, 260, 30));

        jButton11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\OneDrive\\Documents\\NetBeansProjects\\HotelControPro\\hostel images & icon\\Leaved students.png")); // NOI18N
        jButton11.setText("Leaved Employee");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 720, 260, 30));

        jButton12.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\OneDrive\\Documents\\NetBeansProjects\\HotelControPro\\hostel images & icon\\logout.png")); // NOI18N
        jButton12.setText("LogOut");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(871, 20, -1, 60));

        jButton13.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\OneDrive\\Documents\\NetBeansProjects\\HotelControPro\\hostel images & icon\\Close.png")); // NOI18N
        jButton13.setText("Exit");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, 120, 60));

        jButton14.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\OneDrive\\Documents\\NetBeansProjects\\HotelControPro\\hostel images & icon\\shut Down.png")); // NOI18N
        jButton14.setText("ShutDown");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 20, 160, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\OneDrive\\Documents\\NetBeansProjects\\HotelControPro\\hostel images & icon\\home background.PNG")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jButton4.setForeground(Color.red);
        jButton4.setBackground(new Color(255, 255, 255));
        new StudentFees().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        jButton1.setForeground(new JButton().getForeground());
        jButton1.setBackground(new JButton().getBackground());
        
        jButton2.setForeground(new JButton().getForeground());
        jButton2.setBackground(new JButton().getBackground());
        
        jButton3.setForeground(new JButton().getForeground());
        jButton3.setBackground(new JButton().getBackground());
        
        jButton4.setForeground(new JButton().getForeground());
        jButton4.setBackground(new JButton().getBackground());
        
        jButton5.setForeground(new JButton().getForeground());
        jButton5.setBackground(new JButton().getBackground());
        
        jButton6.setForeground(new JButton().getForeground());
        jButton6.setBackground(new JButton().getBackground());
        
        jButton7.setForeground(new JButton().getForeground());
        jButton7.setBackground(new JButton().getBackground());
        
        jButton8.setForeground(new JButton().getForeground());
        jButton8.setBackground(new JButton().getBackground());
        
        jButton9.setForeground(new JButton().getForeground());
        jButton9.setBackground(new JButton().getBackground());
        
        jButton10.setForeground(new JButton().getForeground());
        jButton10.setBackground(new JButton().getBackground());
        
        jButton11.setForeground(new JButton().getForeground());
        jButton11.setBackground(new JButton().getBackground());
        

    }//GEN-LAST:event_formWindowGainedFocus

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "do you really want to log out ?", "select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "do you really want to log out ?", "select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "do you really want to log out ?", "select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            Runtime runtime = Runtime.getRuntime();
            try {
                Process proc = runtime.exec("shutdown -s -t 0");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jButton1.setForeground(Color.red);
        jButton1.setBackground(new Color(255, 255, 255));
        new ManageRoom().setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jButton2.setForeground(Color.red);
        jButton2.setBackground(new Color(255, 255, 255));
        new NewStudent().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jButton3.setForeground(Color.red);
        jButton3.setBackground(new Color(255, 255, 255));
        new UpdateDeleteStudents().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jButton5.setForeground(Color.red);
        jButton5.setBackground(new Color(255, 255, 255));
        new AllStudentsLiving().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jButton6.setForeground(Color.red);
        jButton6.setBackground(new Color(255, 255, 255));
        
        new LeavedStudents().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jButton7.setForeground(Color.red);
        jButton7.setBackground(new Color(255, 255, 255));
        new NewEmployee().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jButton8.setForeground(Color.red);
        jButton8.setBackground(new Color(255, 255, 255));
        new UpdateDeleteEmployee().setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setForeground(Color.red);
        jButton9.setBackground(new Color(255, 255, 255));
        new EmployeePayment().setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        jButton10.setForeground(Color.red);
        jButton10.setBackground(new Color(255, 255, 255));
        new AllEmployeeWorking().setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        jButton11.setForeground(Color.red);
        jButton11.setBackground(new Color(255, 255, 255));
        new LeavedEmployee().setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
