
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class detailsContact extends javax.swing.JFrame {

    public String Search;
    /**
     * Creates new form detailsContact
     */
    public void setvalue(String Search)
    {
        this.Search=Search;
        PreparedStatement ps;
        ResultSet rs;
        
        //String search=Search.getText(); 
        String query= "SELECT * FROM `list` WHERE `fname`=?";
        
        try {
            ps=DatabaseConnection.getConnection().prepareStatement(query);
            ps.setString(1, Search); 
            
            rs=ps.executeQuery();
            
            
            if(rs.next())
            {
                String value1=rs.getString("fname");
                //System.out.println("Answer is "+"++++"+value1);
                FirstName.setText(value1);
                
                String value2=rs.getString("lname");
                //System.out.println("Answer is "+"++++"+value);
                LastName.setText(value2);
                
                
                String value3=rs.getString("landPhone");
                //System.out.println("Answer is "+"++++"+value);
                LandPhone.setText(value3);
                
                String value4=rs.getString("mobilePhone");
                //System.out.println("Answer is "+"++++"+value);
                MobilePhone.setText(value4);
                
                
                String value5=rs.getString("mail");
                //System.out.println("Answer is "+"++++"+value);
                Mail.setText(value5);
                
                String value6=rs.getString("socialID");
                //System.out.println("Answer is "+"++++"+value);
                SocialID.setText(value5);
                
                String value7=rs.getString("socialID");
                //System.out.println("Answer is "+"++++"+value);
                SocialID.setText(value7);
                
                String value8=rs.getString("address");
                //System.out.println("Answer is "+"++++"+value);
                Address.setText(value8);
                
                //JOptionPane.showMessageDialog(null,"Found");
                
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Not Found");
            }
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public detailsContact() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Close = new javax.swing.JButton();
        Minimize = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Close1 = new javax.swing.JButton();
        Minimize1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        landPhone = new javax.swing.JLabel();
        mobile = new javax.swing.JLabel();
        mail = new javax.swing.JLabel();
        socialID = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        FirstName = new javax.swing.JLabel();
        LandPhone = new javax.swing.JLabel();
        MobilePhone = new javax.swing.JLabel();
        Mail = new javax.swing.JLabel();
        SocialID = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        SearchButton = new javax.swing.JButton();
        LastName = new javax.swing.JLabel();
        Homepage = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Close.setText("close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });

        Minimize.setText("minimize");
        Minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimizeActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Welcome to Nexus Address Book");

        Close1.setText("close");
        Close1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close1ActionPerformed(evt);
            }
        });

        Minimize1.setText("minimize");
        Minimize1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Minimize1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Minimize1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Close1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(235, 235, 235))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Close1)
                    .addComponent(Minimize1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(0, 32, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        name.setText("Name :");

        landPhone.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        landPhone.setText("Land Phone :");

        mobile.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mobile.setText("Mobile :");

        mail.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mail.setText("Mail : ");

        socialID.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        socialID.setText("Social ID : ");

        address.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        address.setText("Address :");

        FirstName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        FirstName.setText(" ");

        LandPhone.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LandPhone.setText(" ");

        MobilePhone.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        MobilePhone.setText(" ");

        Mail.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Mail.setText(" ");

        SocialID.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SocialID.setText(" ");

        Address.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Address.setText(" ");

        SearchButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SearchButton.setText("Click Here To View Details");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        LastName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LastName.setText(" ");

        Homepage.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Homepage.setText("Hompage");
        Homepage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomepageActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name)
                    .addComponent(landPhone)
                    .addComponent(mobile)
                    .addComponent(mail)
                    .addComponent(socialID)
                    .addComponent(address))
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MobilePhone, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LandPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Mail, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                .addComponent(SocialID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(128, 128, 128))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(SearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Homepage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(312, 312, 312))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(FirstName)
                    .addComponent(LastName))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(landPhone)
                    .addComponent(LandPhone))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobile)
                    .addComponent(MobilePhone))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mail)
                    .addComponent(Mail))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(socialID)
                    .addComponent(SocialID))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Homepage, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed

        System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_CloseActionPerformed

    private void MinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizeActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_MinimizeActionPerformed

    private void Close1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close1ActionPerformed

        System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_Close1ActionPerformed

    private void Minimize1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Minimize1ActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_Minimize1ActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        PreparedStatement ps;
        ResultSet rs;
        
        //String search=Search.getText(); 
        String query= "SELECT * FROM `list` WHERE `fname`=?";
        
        try {
            ps=DatabaseConnection.getConnection().prepareStatement(query);
            ps.setString(1, Search); 
            
            rs=ps.executeQuery();
            
            
            if(rs.next())
            {
                String value1=rs.getString("fname");
                //System.out.println("Answer is "+"++++"+value1);
                FirstName.setText(value1);
                
                String value2=rs.getString("lname");
                //System.out.println("Answer is "+"++++"+value);
                LastName.setText(value2);
                
                
                String value3=rs.getString("landPhone");
                //System.out.println("Answer is "+"++++"+value);
                LandPhone.setText(value3);
                
                String value4=rs.getString("mobilePhone");
                //System.out.println("Answer is "+"++++"+value);
                MobilePhone.setText(value4);
                
                
                String value5=rs.getString("mail");
                //System.out.println("Answer is "+"++++"+value);
                Mail.setText(value5);
                
                String value6=rs.getString("socialID");
                //System.out.println("Answer is "+"++++"+value);
                SocialID.setText(value5);
                
                String value7=rs.getString("socialID");
                //System.out.println("Answer is "+"++++"+value);
                SocialID.setText(value7);
                
                String value8=rs.getString("address");
                //System.out.println("Answer is "+"++++"+value);
                Address.setText(value8);
                
                //JOptionPane.showMessageDialog(null,"Found");
                
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Not Found");
            }
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }// TODO add your handling code here:
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void HomepageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomepageActionPerformed
         HomePage ob=new HomePage();
         ob.setVisible(true);
         ob.pack();
         ob.setLocationRelativeTo(null);
         ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
         this.dispose();
    }//GEN-LAST:event_HomepageActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
         PreparedStatement ps;
         ResultSet rs;
         
         String query= "DELETE FROM `list` WHERE `fname`=?";
         
        try {
            ps=DatabaseConnection.getConnection().prepareStatement(query);
            ps.setString(1, Search);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data Has Been Deleted");
            
            HomePage ob=new HomePage();
            ob.setVisible(true);
            ob.pack();
            ob.setLocationRelativeTo(null);
            ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
            
        } catch (SQLException ex) {
            Logger.getLogger(detailsContact.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            
    }//GEN-LAST:event_DeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         Update frm=new Update();
         frm.setSearch(Search);
         frm.setVisible(true); 
         frm.pack();
         frm.setLocationRelativeTo(null);
         frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(detailsContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(detailsContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(detailsContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(detailsContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new detailsContact().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JButton Close;
    private javax.swing.JButton Close1;
    private javax.swing.JButton Delete;
    private javax.swing.JLabel FirstName;
    private javax.swing.JButton Homepage;
    private javax.swing.JLabel LandPhone;
    private javax.swing.JLabel LastName;
    private javax.swing.JLabel Mail;
    private javax.swing.JButton Minimize;
    private javax.swing.JButton Minimize1;
    private javax.swing.JLabel MobilePhone;
    private javax.swing.JButton SearchButton;
    private javax.swing.JLabel SocialID;
    private javax.swing.JLabel address;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel landPhone;
    private javax.swing.JLabel mail;
    private javax.swing.JLabel mobile;
    private javax.swing.JLabel name;
    private javax.swing.JLabel socialID;
    // End of variables declaration//GEN-END:variables
}