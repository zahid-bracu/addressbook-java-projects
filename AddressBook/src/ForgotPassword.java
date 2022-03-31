
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ForgotPassword extends javax.swing.JFrame {

    
    public ForgotPassword() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        Close = new javax.swing.JButton();
        Minimize = new javax.swing.JButton();
        Close1 = new javax.swing.JButton();
        Minimize1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Close2 = new javax.swing.JButton();
        Minimize2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextForgetPass = new javax.swing.JTextField();
        jButtonSubmitMail = new javax.swing.JButton();
        jButton_Login = new javax.swing.JButton();

        jLabel7.setBackground(new java.awt.Color(204, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("First Name");

        Close.setBackground(new java.awt.Color(204, 255, 204));
        Close.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });

        Minimize.setBackground(new java.awt.Color(204, 255, 204));
        Minimize.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Minimize.setText("Minminize");
        Minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimizeActionPerformed(evt);
            }
        });

        Close1.setBackground(new java.awt.Color(204, 255, 204));
        Close1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Close1.setText("Close");
        Close1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close1ActionPerformed(evt);
            }
        });

        Minimize1.setBackground(new java.awt.Color(204, 255, 204));
        Minimize1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Minimize1.setText("Minminize");
        Minimize1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Minimize1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Welcom to Nexus Address Book");

        Close2.setBackground(new java.awt.Color(204, 255, 204));
        Close2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Close2.setText("Close");
        Close2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close2ActionPerformed(evt);
            }
        });

        Minimize2.setBackground(new java.awt.Color(204, 255, 204));
        Minimize2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Minimize2.setText("Minminize");
        Minimize2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Minimize2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel1)
                .addContainerGap(145, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Minimize2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Close2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Close2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Minimize2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jLabel1)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jLabel8.setBackground(new java.awt.Color(204, 255, 255));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Enter Your Email");

        jTextForgetPass.setText(" ");

        jButtonSubmitMail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonSubmitMail.setText("Submit");
        jButtonSubmitMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitMailActionPerformed(evt);
            }
        });

        jButton_Login.setBackground(new java.awt.Color(102, 204, 255));
        jButton_Login.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton_Login.setText("Login");
        jButton_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_LoginMouseClicked(evt);
            }
        });
        jButton_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jTextForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSubmitMail))))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jTextForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSubmitMail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_LoginMouseClicked
        /*this code for move to the other or previosu login page*/
        Login_Form lgn=new Login_Form();
        lgn.setVisible(true);
        lgn.pack();
        lgn.setLocationRelativeTo(null);
        lgn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//onno page e gele prevoius page close hoye zabe
        this.dispose(); 
    }//GEN-LAST:event_jButton_LoginMouseClicked

    private void jButtonSubmitMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitMailActionPerformed
        PreparedStatement ps;
        ResultSet rs;
        String mail=jTextForgetPass.getText();
        mail=mail.trim();//to avoid spaces
        System.out.println("+++"+mail+"+++");
        

        String query= "SELECT * FROM `registration` WHERE `mail` =?";

        try
        {
            ps=DatabaseConnection.getConnection().prepareStatement(query);
            ps.setString(1, mail);
            rs=ps.executeQuery();

            if(rs.next())
            {
                JOptionPane.showMessageDialog(null,"Mail matches. Press ok to continue");
                UpdatePassword ob=new UpdatePassword();
                ob.setVisible(true);
                ob.pack();
                ob.setLocationRelativeTo(null);
                ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//onno page e gele prevoius page close hoye zabe
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Mail doesn't match");
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Login_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSubmitMailActionPerformed

    private void jButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoginActionPerformed
        Login_Form lgn=new Login_Form();
        lgn.setVisible(true);
        lgn.pack();
        lgn.setLocationRelativeTo(null);
        lgn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//onno page e gele prevoius page close hoye zabe
        this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton_LoginActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CloseActionPerformed

    private void MinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizeActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_MinimizeActionPerformed

    private void Close1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Close1ActionPerformed

    private void Minimize1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Minimize1ActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_Minimize1ActionPerformed

    private void Close2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Close2ActionPerformed

    private void Minimize2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Minimize2ActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_Minimize2ActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JButton Close1;
    private javax.swing.JButton Close2;
    private javax.swing.JButton Minimize;
    private javax.swing.JButton Minimize1;
    private javax.swing.JButton Minimize2;
    private javax.swing.JButton jButtonSubmitMail;
    private javax.swing.JButton jButton_Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextForgetPass;
    // End of variables declaration//GEN-END:variables
}
