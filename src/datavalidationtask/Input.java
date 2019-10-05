
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
        namelbl = new javax.swing.JLabel();
        namefield = new javax.swing.JTextField();
        surnamelbl = new javax.swing.JLabel();
        surnamefield = new javax.swing.JTextField();
        malebtn = new javax.swing.JRadioButton();
        femalebtn = new javax.swing.JRadioButton();
        capdetails = new javax.swing.JButton();
        htlbl = new javax.swing.JLabel();
        hgtfield = new javax.swing.JTextField();
        DOBjDateChooser = new com.toedter.calendar.JDateChooser();
        IDNumField = new javax.swing.JTextField();
        IDlbl = new javax.swing.JLabel();
        DOBlbl = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        namelbl.setText("Name");

        surnamelbl.setText("Surname");

        buttonGroup1.add(malebtn);
        malebtn.setText("male");

        buttonGroup1.add(femalebtn);
        femalebtn.setText("female");

        capdetails.setText("capture details");
        capdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capdetailsActionPerformed(evt);
            }
        });

        htlbl.setText("Height ");

        IDNumField.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N

        IDlbl.setText("ID Number ");

        DOBlbl.setText("Date of Birth");

        Title.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title.setText("Enter your details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(capdetails)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DOBlbl)
                            .addComponent(IDlbl)
                            .addComponent(htlbl)
                            .addComponent(malebtn)
                            .addComponent(surnamelbl)
                            .addComponent(namelbl))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(surnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(femalebtn)
                            .addComponent(IDNumField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DOBjDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hgtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namefield, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(Title)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namelbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(surnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surnamelbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(femalebtn)
                    .addComponent(malebtn))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hgtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(htlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DOBlbl)
                    .addComponent(DOBjDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(capdetails)
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

    private void capdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capdetailsActionPerformed
        String fn = namefield.getText();        
        String sn =surnamefield.getText();       
        boolean m= malebtn.isSelected();
        boolean f= femalebtn.isSelected();
        String hgt = hgtfield.getText();
        String idNum = IDNumField.getText();
        Date dob = DOBjDateChooser.getDate();
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
               
    }//GEN-LAST:event_capdetailsActionPerformed

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
    private com.toedter.calendar.JDateChooser DOBjDateChooser;
    private javax.swing.JLabel DOBlbl;
    private javax.swing.JTextField IDNumField;
    private javax.swing.JLabel IDlbl;
    private javax.swing.JLabel Title;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton capdetails;
    private javax.swing.JRadioButton femalebtn;
    private javax.swing.JTextField hgtfield;
    private javax.swing.JLabel htlbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton malebtn;
    private javax.swing.JTextField namefield;
    private javax.swing.JLabel namelbl;
    private javax.swing.JTextField surnamefield;
    private javax.swing.JLabel surnamelbl;
    // End of variables declaration//GEN-END:variables
}
