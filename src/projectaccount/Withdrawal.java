/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectaccount;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;


/**
 *
 * @author Dr.Stanley
 */
public class Withdrawal extends javax.swing.JFrame {

    /**
     * Creates new form Deposit
     */
      Connection con; 
           ResultSet res;
           String rs;
           int curRow=0;
           Statement Sobj;
           String passwd;
           double ball;
    public void ConnectionMth(){
      //  bal.setEnabled(false);
        amt.setEnabled(false);
        withdra.setEnabled(false);
        try{
            con= DriverManager.getConnection("jdbc:derby://localhost:1527/base1","base1","base1");
           Sobj=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
           //String SQL= "select * from TABLE1";
           //res=Sobj.executeQuery(SQL);
           //res.next();  
                }
        catch(Exception e){
        JOptionPane.showMessageDialog(Withdrawal.this, e.getMessage());
        }
    }
    public Withdrawal() {
        initComponents();
        ConnectionMth();
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
        jLabel2 = new javax.swing.JLabel();
        amt = new javax.swing.JTextField();
        withdra = new javax.swing.JButton();
        pwd = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Withdrawal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 0, 0))); // NOI18N

        jLabel2.setText("Amount:");

        amt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amtActionPerformed(evt);
            }
        });

        withdra.setText("Withdraw");
        withdra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdraActionPerformed(evt);
            }
        });

        jLabel5.setText("Password");

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 275, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(68, 68, 68)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(withdra, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 97, Short.MAX_VALUE))
                                    .addComponent(amt)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pwd)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pwd, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(withdra, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

 try{  Sobj.close();
            res.close();
      }
      catch(Exception e){}      
 this.dispose();
       new Account().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        String pass= pwd.getText();
        try{
            //con= DriverManager.getConnection("jdbc:derby://localhost:1527/base1","base1","base1");
            //Sobj=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String SQL= "select * from TABLE1 where password='"+pass+"'";
            res=Sobj.executeQuery(SQL);
            res.next();
            String pasd =res.getString("password");
            String accN=res.getString("accnum");
                if (pass.equals(pasd)){
                    JOptionPane.showMessageDialog(Withdrawal.this, "Sign_in successfull !!!");
                    amt.setEnabled(true);
                    withdra.setEnabled(true);
                    submit.setEnabled(false);
                    pwd.setEnabled(false); 
                    ball= res.getDouble("Ballance");
                }
                else{
                    JOptionPane.showMessageDialog(Withdrawal.this, "Incorrect data");
                }
               
            }
            //}
        catch(Exception e){
            JOptionPane.showMessageDialog(Withdrawal.this, e.getMessage());
        }
    }//GEN-LAST:event_submitActionPerformed

    private void withdraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdraActionPerformed
        try{    
            String pass= pwd.getText();
             String SQL= "select * from TABLE1 where password='"+pass+"'";
            res=Sobj.executeQuery(SQL);
            res.next();
            //String pasd =res.getString("password");
            String amot = amt.getText();
         
            double cash = Double.parseDouble(amot);
           double bal= res.getDouble("Ballance");
            String name = res.getString("accname");
           String acc=res.getString("accnum");
               int depID= res.getInt("id");
              if(cash>bal){
           //JOptionPane.showMessageDialog(Withdrawal.this, "Insufficent fund");
           new fund().setVisible(true);
           Sobj.close();
            res.close();
           this.dispose();
           } 
           else{
                  
            double total = bal-cash;
            res.updateDouble("ballance",total);
            res.updateRow();       Calendar dat = new GregorianCalendar();
                int day = dat.get(Calendar.DAY_OF_MONTH);
                int year = dat.get(Calendar.YEAR);
                int mon = dat.get(Calendar.MONTH);
                int hour = dat.get(Calendar.HOUR_OF_DAY);
                int min = dat.get(Calendar.MINUTE);
                mon++;
                String date = day + "-" + mon + "-" + year+" : "+hour+":"+min;
           //JOptionPane.showMessageDialog(Withdrawal.this, "Debited");
        String detal = "Withdrawal Reciept\n"+"Name: "+name+"\nAccount Number: "+acc+"\nAmount: "+amot;
           JOptionPane.showMessageDialog(Withdrawal.this, detal);
           detal = "***Withdraw***\n"+"Name: "+name+"\nAccount Number: "+acc+"\nAmount: "+amot+ "\n Date: " + date;
           
      
                // inserting into decription table 
                String SQLi = "select * from descrip";
                res = Sobj.executeQuery(SQLi);
                res.next();
                int id_det;

                if (res.last()) {
                    id_det = res.getInt("id_det");
                    id_det++;
                } else {
                    id_det = 1;
                }
                res.moveToInsertRow();
                res.updateString("description", detal);
                res.updateInt("id_det", id_det);
                res.updateInt("identity_id", depID);
                 res.updateInt("month", mon);
                res.updateString("date", date);
                res.insertRow();

            Sobj.close();
            res.close();
            this.dispose();
            new query().setVisible(true);
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(Withdrawal.this,e.getMessage());
                }
    }//GEN-LAST:event_withdraActionPerformed

    private void amtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amtActionPerformed
    
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
            java.util.logging.Logger.getLogger(Withdrawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Withdrawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Withdrawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Withdrawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Withdrawal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amt;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JButton submit;
    private javax.swing.JButton withdra;
    // End of variables declaration//GEN-END:variables
}
