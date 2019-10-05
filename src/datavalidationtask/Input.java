
package datavalidationtask;

//Arabella Balidis

import java.util.Date;
import javax.swing.JOptionPane;

public class Input extends javax.swing.JFrame {
DataValidation objDataValid = new DataValidation();

    public Input() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblSurname = new javax.swing.JLabel();
        txtSurname = new javax.swing.JTextField();
        radiobtnMale = new javax.swing.JRadioButton();
        radiobtnFemale = new javax.swing.JRadioButton();
        btnCaptureDetails = new javax.swing.JButton();
        lblHeight = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        dateChooserDOB = new com.toedter.calendar.JDateChooser();
        txtIDNum = new javax.swing.JTextField();
        lblIDNumber = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblName.setText("Name");

        lblSurname.setText("Surname");

        buttonGroup1.add(radiobtnMale);
        radiobtnMale.setText("male");

        buttonGroup1.add(radiobtnFemale);
        radiobtnFemale.setText("female");

        btnCaptureDetails.setText("capture details");
        btnCaptureDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaptureDetailsActionPerformed(evt);
            }
        });

        lblHeight.setText("Height ");

        txtIDNum.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N

        lblIDNumber.setText("ID Number ");

        lblDOB.setText("Date of Birth");

        lblTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblTitle.setText("Enter your details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCaptureDetails)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDOB)
                            .addComponent(lblIDNumber)
                            .addComponent(lblHeight)
                            .addComponent(radiobtnMale)
                            .addComponent(lblSurname)
                            .addComponent(lblName))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radiobtnFemale)
                            .addComponent(txtIDNum, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateChooserDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lblTitle)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSurname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radiobtnFemale)
                    .addComponent(radiobtnMale))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeight))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIDNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDOB)
                    .addComponent(dateChooserDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCaptureDetails)
                .addGap(134, 134, 134))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCaptureDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaptureDetailsActionPerformed
        String fn = txtName.getText();        
        String sn =txtSurname.getText();       
        boolean m= radiobtnMale.isSelected();
        boolean f= radiobtnFemale.isSelected();
        String hgt = txtHeight.getText();
        String idNum = txtIDNum.getText();
        Date dob = dateChooserDOB.getDate();
        int c1=0;
               
        //Validation of Surname
        if (sn.contentEquals("")) 
        {
            JOptionPane.showMessageDialog(null, "Surname cannot be blank");
        }
        else
        {
        boolean testName1=objDataValid.testforAlphabets(sn);
        if (testName1==false) 
        {
            JOptionPane.showMessageDialog(null, "Surname cannot contain numbers or special characters");
        }
        else
        {
           c1++;
        }
        }
        
        //Validation of Name
        if (fn.contentEquals("")) 
        {
            JOptionPane.showMessageDialog(null, "Name cannot be blank");
        }
        else
        {
        boolean testName2=objDataValid.testforAlphabets(fn);
        if (testName2==false) 
        {
            JOptionPane.showMessageDialog(null, "Name cannot contain numbers or special characters");
        }
        else
        {
            c1++;
        }
        }
        
        //Validation of Gender
        if (objDataValid.mfcheck(m, f)==false) 
        {
            JOptionPane.showMessageDialog(null, "A gender must be selected");
        }
        else
        {
            c1++;
        }
        
        //Validation of Height
        if (hgt.contentEquals("")) 
        {
            JOptionPane.showMessageDialog(null, "Height cannot be blank");
        }
        else
        {
            if (objDataValid.testNumbers(hgt)==false) 
            { 
                JOptionPane.showMessageDialog(null, "Height must be a number");
            }
            else
            {
                    if (objDataValid.testRange(hgt)==false) 
                    {
                    JOptionPane.showMessageDialog(null, "Height must be within the range of 100-300cm. Ensure height is in cm");    
                    }
                    else
                    {
                        c1++;  
                    }               
            }
        }
        
        //Validation of ID
        if (idNum.contentEquals("")) 
        {
            JOptionPane.showMessageDialog(null, "ID cannot be blank");
        }
        else
        {
            if (objDataValid.testNumbers(idNum)==false) 
            {
                JOptionPane.showMessageDialog(null, "ID must be a number");
            }
            else
            {
                if (objDataValid.testID(idNum)==false) 
                {
                    JOptionPane.showMessageDialog(null, "ID must be 13 digits long");
                }
                else
                {
                    c1++;
                }
            }
        }

        //Validation Of Date of Birth
        if (dob==null) 
        {
            JOptionPane.showMessageDialog(null, "Date of birth cannot be blank");
        }
        else
        {
            if (objDataValid.testDate(dob)==false) {
                JOptionPane.showMessageDialog(null, "Date of birth cannot be in the future");
            }
            else
            {
                c1++;
            }
        }
        
        if (c1>5) 
        {
            JOptionPane.showMessageDialog(null, "Captured");
        }
               
    }//GEN-LAST:event_btnCaptureDetailsActionPerformed

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
            java.util.logging.Logger.getLogger(Input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Input().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCaptureDetails;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser dateChooserDOB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblIDNumber;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JRadioButton radiobtnFemale;
    private javax.swing.JRadioButton radiobtnMale;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtIDNum;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
}
