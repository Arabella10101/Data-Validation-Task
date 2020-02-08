
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
        lblNameErrorMsg1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblSurname = new javax.swing.JLabel();
        txtSurname = new javax.swing.JTextField();
        radiobtnMale = new javax.swing.JRadioButton();
        radiobtnFemale = new javax.swing.JRadioButton();
        btnValidateDetails = new javax.swing.JButton();
        lblHeight = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        txtIDNum = new javax.swing.JTextField();
        lblIDNumber = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblNameErrorMsg = new javax.swing.JLabel();
        lblSurnameErrorMsg = new javax.swing.JLabel();
        lblGenderErrorMsg = new javax.swing.JLabel();
        lblHeightErrorMsg = new javax.swing.JLabel();
        lblIDNumberErrorMsg = new javax.swing.JLabel();
        lblDOBErrorMsg = new javax.swing.JLabel();
        lblValidated = new javax.swing.JLabel();
        dateChooserDOB = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblName.setText("Name");

        lblSurname.setText("Surname");

        buttonGroup1.add(radiobtnMale);
        radiobtnMale.setText("male");

        buttonGroup1.add(radiobtnFemale);
        radiobtnFemale.setText("female");

        btnValidateDetails.setText("validate details");
        btnValidateDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidateDetailsActionPerformed(evt);
            }
        });

        lblHeight.setText("Height ");

        txtIDNum.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N

        lblIDNumber.setText("ID Number ");

        lblDOB.setText("Date of Birth");

        lblTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblTitle.setText("Validate your details");

        lblNameErrorMsg.setBackground(new java.awt.Color(0, 0, 0));
        lblNameErrorMsg.setForeground(new java.awt.Color(204, 0, 0));

        lblSurnameErrorMsg.setForeground(new java.awt.Color(204, 0, 0));

        lblGenderErrorMsg.setForeground(new java.awt.Color(204, 0, 0));

        lblHeightErrorMsg.setForeground(new java.awt.Color(204, 0, 0));

        lblIDNumberErrorMsg.setForeground(new java.awt.Color(204, 0, 0));

        lblDOBErrorMsg.setForeground(new java.awt.Color(204, 0, 0));

        lblValidated.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        lblValidated.setForeground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHeight)
                            .addComponent(radiobtnMale)
                            .addComponent(lblSurname)
                            .addComponent(lblName)
                            .addComponent(lblIDNumber))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDOB)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lblNameErrorMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lblSurnameErrorMsg, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radiobtnFemale))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGenderErrorMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeightErrorMsg, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dateChooserDOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIDNum)
                            .addComponent(btnValidateDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblValidated, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lblIDNumberErrorMsg, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                            .addComponent(lblDOBErrorMsg, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addGap(219, 219, 219))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName)
                    .addComponent(lblNameErrorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSurname))
                    .addComponent(lblSurnameErrorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radiobtnMale)
                        .addComponent(radiobtnFemale))
                    .addComponent(lblGenderErrorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeightErrorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIDNumberErrorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIDNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblIDNumber)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDOBErrorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDOB))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValidated, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnValidateDetails)))
                    .addComponent(dateChooserDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(259, 259, 259))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnValidateDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidateDetailsActionPerformed
        String fn = txtName.getText();        
        String sn =txtSurname.getText();       
        boolean m= radiobtnMale.isSelected();
        boolean f= radiobtnFemale.isSelected();
        String hgt = txtHeight.getText();
        String idNum = txtIDNum.getText();
        Date dob = dateChooserDOB.getDate();
        int counter=0;
               
        //Validation of Surname
        if (sn.contentEquals("")) 
        {
            lblSurnameErrorMsg.setText("Surname cannot be blank");
            lblValidated.setText("");   
        }
        else
        {
        boolean testName1=objDataValid.testforAlphabets(sn);
        if (testName1==false) 
        {
            lblSurnameErrorMsg.setText("Surname cannot contain numbers or "
                    + "special characters");
            lblValidated.setText("");   
        }
        else
        {
           counter++;
           lblSurnameErrorMsg.setText("");
        }
        }
        
        //Validation of Name
        if (fn.contentEquals("")) 
        {
            lblNameErrorMsg.setText("Name cannot be blank");
            lblValidated.setText("");   
        }
        else
        {
        boolean testName2=objDataValid.testforAlphabets(fn);
        if (testName2==false) 
        {
            lblNameErrorMsg.setText("Name cannot contain numbers "
                    + "or special characters");
            lblValidated.setText("");   
        }
        else
        {
            counter++;
            lblNameErrorMsg.setText("");
        }
        }
        
        //Validation of Gender
        if (objDataValid.mfcheck(m, f)==false) 
        {
            lblGenderErrorMsg.setText("A gender must be selected");
            lblValidated.setText("");   
        }
        else
        {
            counter++;
            lblGenderErrorMsg.setText("");
        }
        
        //Validation of Height
        if (hgt.contentEquals("")) 
        {
            lblHeightErrorMsg.setText("Height cannot be blank");
            lblValidated.setText("");   
        }
        else
        {
            if (objDataValid.testDecimalCommma(hgt)==false) 
                {
                    lblHeightErrorMsg.setText("Ensure height is in cm");
                }
            else
            {
                if (objDataValid.testNumbers(hgt)==false) 
                    { 
                        lblHeightErrorMsg.setText("Height must be a number");
                        lblValidated.setText("");   
                    }
                else
                {               
                    if (objDataValid.testRange(hgt)==false) 
                    {
                        lblHeightErrorMsg.setText("Height must be within the "
                                +"range of 100-300cm.");
                        lblValidated.setText("");   
                    }
                    else
                    {
                        counter++;  
                        lblHeightErrorMsg.setText("");
                    }                    
                }
            }
        }
        
        //Validation of ID
        if (idNum.contentEquals("")) 
        {
            lblIDNumberErrorMsg.setText("ID cannot be blank");
            lblValidated.setText("");   
        }
        else
        {
            if (objDataValid.testNumbers(idNum)==false) 
            {
                lblIDNumberErrorMsg.setText("ID must be a number");
                lblValidated.setText("");   
            }
            else
            {
                if (objDataValid.testID(idNum)==false) 
                {
                    lblIDNumberErrorMsg.setText("ID must be 13 digits long");
                    lblValidated.setText("");   
                }
                else
                {
                    counter++;
                    lblIDNumberErrorMsg.setText("");
                }
            }
        }

        //Validation Of Date of Birth
        if (dob==null) 
        {
            lblDOBErrorMsg.setText("Date of birth cannot be blank");
            lblValidated.setText("");   
        }
        else
        {
            if (objDataValid.testDate(dob)==false) 
            {
                lblDOBErrorMsg.setText("Date of birth cannot be in the future");
                lblValidated.setText("");   
            }
            else
            {
                counter++;
                lblDOBErrorMsg.setText("");
            }
        }
        
        if (counter>5) 
        {
            lblValidated.setText("Validated");         
        }       
               
    }//GEN-LAST:event_btnValidateDetailsActionPerformed

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
    private javax.swing.JButton btnValidateDetails;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser dateChooserDOB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDOBErrorMsg;
    private javax.swing.JLabel lblGenderErrorMsg;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblHeightErrorMsg;
    private javax.swing.JLabel lblIDNumber;
    private javax.swing.JLabel lblIDNumberErrorMsg;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNameErrorMsg;
    private javax.swing.JLabel lblNameErrorMsg1;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JLabel lblSurnameErrorMsg;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblValidated;
    private javax.swing.JRadioButton radiobtnFemale;
    private javax.swing.JRadioButton radiobtnMale;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtIDNum;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
}
