/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author varsh
 */
public class AddCustomer extends javax.swing.JFrame {
    
    String url,uname,pass;
    Connection con;
    PreparedStatement pst;
    String query,update;

    /**
     * Creates new form addCustomer
     */
    public AddCustomer() {
        initComponents();
        try{
            url = "jdbc:mysql://localhost:3306/pharmacy?autoReconnect=true&useSSL=false";
            uname = "root";
            pass = "password";
            con = DriverManager.getConnection(url,uname,pass);
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null,e); 
          }  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        phoneTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        custSubmitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pharmacy Management System");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(900, 700));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Add New Customer");

        nameTxt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        phoneTxt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        addressTxt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Customer Name:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Phone number:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Address:");

        custSubmitBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        custSubmitBtn.setText("Submit");
        custSubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custSubmitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(custSubmitBtn)))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(60, 60, 60)
                .addComponent(custSubmitBtn)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void custSubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custSubmitBtnActionPerformed
        // TODO add your handling code here:
        
            if(nameTxt.getText().isEmpty() || phoneTxt.getText().isEmpty() || addressTxt.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"All details are mandatory!");
            }
            else{              
                try{
                    update = "INSERT INTO customer (c_name, c_phone, c_address) VALUES (?,?,?);";
                    pst = con.prepareStatement(update);
                    pst.setString(1, nameTxt.getText());
                    pst.setString(2, phoneTxt.getText());
                    pst.setString(3, addressTxt.getText());
                    int status = pst.executeUpdate();
                    if(status>0){
                        JOptionPane.showMessageDialog(rootPane, "Successfully added a new Customer", "Success", JOptionPane.INFORMATION_MESSAGE);
                        AddCustomer.this.dispose();
                    }
                    else
                        JOptionPane.showMessageDialog(rootPane, "Could not add the customer", "Failed", JOptionPane.ERROR_MESSAGE);
                }
                catch(SQLIntegrityConstraintViolationException e){
                    JOptionPane.showMessageDialog(null,"A customer already exists with this Phone Number\nPlease provide another Phone number");
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null,e); 
              }
            }
            
    }//GEN-LAST:event_custSubmitBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton custSubmitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField phoneTxt;
    // End of variables declaration//GEN-END:variables
}
