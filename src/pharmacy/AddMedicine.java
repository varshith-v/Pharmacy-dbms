/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author varsh
 */
public class AddMedicine extends javax.swing.JFrame {
    
    String url,uname,pass;
    Connection con;
    Statement st;
    PreparedStatement pst;
    String query,update;

    /**
     * Creates new form AddProduct
     */
    public AddMedicine() {
        initComponents();
        try{
            url = "jdbc:mysql://localhost:3306/pharmacy?autoReconnect=true&useSSL=false";
            uname = "root";
            pass = "password";
            con = DriverManager.getConnection(url,uname,pass);
            
        } catch (Exception e) {
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

        jLabel5 = new javax.swing.JLabel();
        pidTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pnameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        stockTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        priceTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        productSubmitBtn = new javax.swing.JButton();
        catCombo = new javax.swing.JComboBox<>();
        rackTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pharmacy Management System");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Medicine ID");

        pidTxt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Medicine Name");

        pnameTxt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Category");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Stock");

        stockTxt.setEditable(false);
        stockTxt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        stockTxt.setText("0");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Price");

        priceTxt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Add New Medicine");

        productSubmitBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        productSubmitBtn.setText("SUBMIT");
        productSubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productSubmitBtnActionPerformed(evt);
            }
        });

        catCombo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        catCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tablets", "Syrup", "Pills", "Injection", "Cream / Ointment", "Others" }));

        rackTxt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("Rack");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(pnameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                            .addComponent(pidTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                            .addComponent(stockTxt)
                            .addComponent(catCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(productSubmitBtn)
                                .addGap(136, 136, 136))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rackTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                                    .addComponent(priceTxt))))))
                .addContainerGap(237, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel6)
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pidTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(catCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stockTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rackTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(36, 36, 36)
                .addComponent(productSubmitBtn)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productSubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productSubmitBtnActionPerformed
        // TODO add your handling code here:
        if(pidTxt.getText().isEmpty() || pnameTxt.getText().isEmpty() || priceTxt.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"All details are mandatory!");
            }
            else{              
                try{
                    update = "INSERT INTO medicine (mid,m_name,category,price) VALUES (?,?,?,?);";
                    pst = con.prepareStatement(update);
                    pst.setString(1, pidTxt.getText());
                    pst.setString(2, pnameTxt.getText());
                    pst.setString(3, catCombo.getSelectedItem().toString());
                    pst.setString(4, priceTxt.getText());
                    int status1 = pst.executeUpdate();
                    
                    update = "INSERT INTO inventory (mid,rack,stock) VALUES (?,?,?);";
                    pst = con.prepareStatement(update);
                    pst.setString(1, pidTxt.getText());
                    pst.setString(2, rackTxt.getText());
                    pst.setString(3, stockTxt.getText());
                    int status2 = pst.executeUpdate();
                    
                    if(status1>0 && status2>0){
                        JOptionPane.showMessageDialog(rootPane, "Successfully added a new Medicine", "Success", JOptionPane.INFORMATION_MESSAGE);
                        AddMedicine.this.dispose();
                    }
                    else
                        JOptionPane.showMessageDialog(rootPane, "Could not add the Medicine", "Failed", JOptionPane.ERROR_MESSAGE);
                }
                catch(SQLIntegrityConstraintViolationException e){
                    JOptionPane.showMessageDialog(null,"A Medicine already exists with this Medicine ID");
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null,e); 
              }
            }
    }//GEN-LAST:event_productSubmitBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> catCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField pidTxt;
    private javax.swing.JTextField pnameTxt;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JButton productSubmitBtn;
    private javax.swing.JTextField rackTxt;
    private javax.swing.JTextField stockTxt;
    // End of variables declaration//GEN-END:variables
}
