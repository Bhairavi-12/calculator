package org.nlt.views;

import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class calculatorFrame extends javax.swing.JFrame {

    private String operator;
    private String firstNo;

    public calculatorFrame() {
        initComponents();
        operator = "";
        firstNo = "";
    }  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        noTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        perButton = new javax.swing.JButton();
        divideButton = new javax.swing.JButton();
        mulButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        sevenButton = new javax.swing.JButton();
        eightButton = new javax.swing.JButton();
        nineButton = new javax.swing.JButton();
        subButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        fourButton = new javax.swing.JButton();
        fiveButton = new javax.swing.JButton();
        sixbutton = new javax.swing.JButton();
        plusButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        oneButton = new javax.swing.JButton();
        twoButton = new javax.swing.JButton();
        threeButton = new javax.swing.JButton();
        equalsButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        zeroButton = new javax.swing.JButton();
        doubleZeroButton = new javax.swing.JButton();
        dotButton = new javax.swing.JButton();
        sqrButton = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        leftShiftButton = new javax.swing.JButton();
        plusMinusButton = new javax.swing.JButton();
        sqrtButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(7, 1, 10, 10));

        noTextField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        noTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        noTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(noTextField);

        jPanel2.setLayout(new java.awt.GridLayout(1, 4, 10, 10));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("AC");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        perButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        perButton.setText("%");
        perButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perButtonActionPerformed(evt);
            }
        });
        jPanel2.add(perButton);

        divideButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        divideButton.setText("/");
        divideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideButtonActionPerformed(evt);
            }
        });
        jPanel2.add(divideButton);

        mulButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mulButton.setText("*");
        mulButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulButtonActionPerformed(evt);
            }
        });
        jPanel2.add(mulButton);

        jPanel1.add(jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout(1, 4, 10, 10));

        sevenButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sevenButton.setText("7");
        sevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenButtonActionPerformed(evt);
            }
        });
        jPanel3.add(sevenButton);

        eightButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        eightButton.setText("8");
        eightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightButtonActionPerformed(evt);
            }
        });
        jPanel3.add(eightButton);

        nineButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nineButton.setText("9");
        nineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineButtonActionPerformed(evt);
            }
        });
        jPanel3.add(nineButton);

        subButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        subButton.setText("-");
        subButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subButtonActionPerformed(evt);
            }
        });
        jPanel3.add(subButton);

        jPanel1.add(jPanel3);

        jPanel4.setLayout(new java.awt.GridLayout(1, 4, 10, 10));

        fourButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fourButton.setText("4");
        fourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourButtonActionPerformed(evt);
            }
        });
        jPanel4.add(fourButton);

        fiveButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fiveButton.setText("5");
        fiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveButtonActionPerformed(evt);
            }
        });
        jPanel4.add(fiveButton);

        sixbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sixbutton.setText("6");
        sixbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixbuttonActionPerformed(evt);
            }
        });
        jPanel4.add(sixbutton);

        plusButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        plusButton.setText("+");
        plusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusButtonActionPerformed(evt);
            }
        });
        jPanel4.add(plusButton);

        jPanel1.add(jPanel4);

        jPanel5.setLayout(new java.awt.GridLayout(1, 4, 10, 10));

        oneButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        oneButton.setText("1");
        oneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneButtonActionPerformed(evt);
            }
        });
        jPanel5.add(oneButton);

        twoButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        twoButton.setText("2");
        twoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoButtonActionPerformed(evt);
            }
        });
        jPanel5.add(twoButton);

        threeButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        threeButton.setText("3");
        threeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeButtonActionPerformed(evt);
            }
        });
        jPanel5.add(threeButton);

        equalsButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        equalsButton.setText("=");
        equalsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsButtonActionPerformed(evt);
            }
        });
        jPanel5.add(equalsButton);

        jPanel1.add(jPanel5);

        jPanel6.setLayout(new java.awt.GridLayout(1, 4, 10, 10));

        zeroButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        zeroButton.setText("0");
        zeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroButtonActionPerformed(evt);
            }
        });
        jPanel6.add(zeroButton);

        doubleZeroButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        doubleZeroButton.setText("00");
        doubleZeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doubleZeroButtonActionPerformed(evt);
            }
        });
        jPanel6.add(doubleZeroButton);

        dotButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dotButton.setText(".");
        dotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotButtonActionPerformed(evt);
            }
        });
        jPanel6.add(dotButton);

        sqrButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sqrButton.setText("SQR");
        sqrButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrButtonActionPerformed(evt);
            }
        });
        jPanel6.add(sqrButton);

        jPanel1.add(jPanel6);

        jPanel7.setLayout(new java.awt.GridLayout(1, 4, 10, 10));

        jButton21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton21.setText("CLS");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton21);

        leftShiftButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        leftShiftButton.setText("<<");
        leftShiftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftShiftButtonActionPerformed(evt);
            }
        });
        jPanel7.add(leftShiftButton);

        plusMinusButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        plusMinusButton.setText("+/-");
        plusMinusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusMinusButtonActionPerformed(evt);
            }
        });
        jPanel7.add(plusMinusButton);

        sqrtButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sqrtButton.setText("SQRT");
        sqrtButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrtButtonActionPerformed(evt);
            }
        });
        jPanel7.add(sqrtButton);

        jPanel1.add(jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        operator = "";
        noTextField.setText("");
        firstNo="";
    }//GEN-LAST:event_jButton1ActionPerformed

    private void oneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneButtonActionPerformed
        getNumber(evt);
    }//GEN-LAST:event_oneButtonActionPerformed

    private void twoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoButtonActionPerformed
        getNumber(evt);
    }//GEN-LAST:event_twoButtonActionPerformed

    private void threeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeButtonActionPerformed
        getNumber(evt);
    }//GEN-LAST:event_threeButtonActionPerformed

    private void fourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourButtonActionPerformed
        getNumber(evt);
    }//GEN-LAST:event_fourButtonActionPerformed

    private void fiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveButtonActionPerformed
        getNumber(evt);
    }//GEN-LAST:event_fiveButtonActionPerformed

    private void sixbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixbuttonActionPerformed
        getNumber(evt);
    }//GEN-LAST:event_sixbuttonActionPerformed

    private void sevenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenButtonActionPerformed
        getNumber(evt);
    }//GEN-LAST:event_sevenButtonActionPerformed

    private void eightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightButtonActionPerformed
        getNumber(evt);
    }//GEN-LAST:event_eightButtonActionPerformed

    private void nineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineButtonActionPerformed
        getNumber(evt);
    }//GEN-LAST:event_nineButtonActionPerformed

    private void zeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroButtonActionPerformed
        getNumber(evt);
    }//GEN-LAST:event_zeroButtonActionPerformed

    private void doubleZeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doubleZeroButtonActionPerformed
        getNumber(evt);
    }//GEN-LAST:event_doubleZeroButtonActionPerformed

    private void dotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotButtonActionPerformed
        if (!noTextField.getText().contains(".")) {
            if (noTextField.getText().isEmpty()) {
                noTextField.setText("0.");
            } else {
                noTextField.setText(noTextField.getText() + ".");
            }
        }
    }//GEN-LAST:event_dotButtonActionPerformed
   
    private void subButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subButtonActionPerformed
        operator = "-";
        firstNo = noTextField.getText();
        noTextField.setText("");
    }//GEN-LAST:event_subButtonActionPerformed

    private void plusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusButtonActionPerformed
        operator = "+";
        firstNo = noTextField.getText();
        noTextField.setText("");
    }//GEN-LAST:event_plusButtonActionPerformed

    private void equalsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsButtonActionPerformed
        if (!operator.isEmpty()) {
            try {
                if (operator.equals("+")) {
                    String secondNo = noTextField.getText();
                    noTextField.setText((Integer.parseInt(firstNo) + Integer.parseInt(secondNo)) + "");
                } else if (operator.equals("-")) {
                    String secondNo = noTextField.getText();
                    noTextField.setText((Integer.parseInt(firstNo) - Integer.parseInt(secondNo)) + "");
                } else if (operator.equals("*")) {
                    String secondNo = noTextField.getText();
                    noTextField.setText((Integer.parseInt(firstNo) * Integer.parseInt(secondNo)) + "");
                } else if (operator.equals("/")) {
                    throw new NumberFormatException();
                } else if (operator.equals("%")) {
                    String secondNo = noTextField.getText();
                    noTextField.setText((Integer.parseInt(firstNo) * Integer.parseInt(secondNo)) / 100 + "");
                }
            } catch (NumberFormatException ex) 
            {
                if(operator.equals("+")){
                    String secondNo = noTextField.getText();
                    noTextField.setText((Float.parseFloat(firstNo) + Float.parseFloat(secondNo) + ""));
            } else if(operator.equals("-")){
                    String secondNo = noTextField.getText();
                    noTextField.setText((Float.parseFloat(firstNo) - Float.parseFloat(secondNo) + ""));
            }else if(operator.equals("*")){
                    String secondNo = noTextField.getText();
                    noTextField.setText((Float.parseFloat(firstNo) * Float.parseFloat(secondNo) + ""));
            }else if(operator.equals("/")){
                    String secondNo = noTextField.getText();
                    noTextField.setText((Float.parseFloat(firstNo) / Float.parseFloat(secondNo) + ""));
    }//GEN-LAST:event_equalsButtonActionPerformed
            else if(operator.equals("%")){
            String secondNo = noTextField.getText();
            noTextField.setText((Float.parseFloat(firstNo) * Float.parseFloat(secondNo)/100) + "");
    } 
            }//catch close
            
            operator="";
            }//if close
        
    }
    
    private void sqrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqrButtonActionPerformed
        try {
            int no = Integer.parseInt(noTextField.getText());
            noTextField.setText((no * no) + "");
        } catch (NumberFormatException ex) {
            float no = Float.parseFloat(noTextField.getText());
            noTextField.setText((no * no) + "");
        }
    }//GEN-LAST:event_sqrButtonActionPerformed

    private void plusMinusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusMinusButtonActionPerformed
          try {
            int no = Integer.parseInt(noTextField.getText());
            noTextField.setText((no*-1.0f)+"");
        } catch (NumberFormatException ex) {
            float no = Float.parseFloat(noTextField.getText());
            noTextField.setText((no*-1.0f) + "");
        } 
    }//GEN-LAST:event_plusMinusButtonActionPerformed

    private void leftShiftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftShiftButtonActionPerformed
        if(!noTextField.getText().isEmpty())
        {
            noTextField.setText(noTextField.getText().substring(0,noTextField.getText().length()-1));
        }
    }//GEN-LAST:event_leftShiftButtonActionPerformed

    private void perButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perButtonActionPerformed
        operator="%";
        firstNo = noTextField.getText();
        noTextField.setText("");
    }//GEN-LAST:event_perButtonActionPerformed

    private void divideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideButtonActionPerformed
       operator="/";
       firstNo = noTextField.getText();
       noTextField.setText("");
    }//GEN-LAST:event_divideButtonActionPerformed

    private void mulButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulButtonActionPerformed
        operator = "*";
        firstNo = noTextField.getText();
        noTextField.setText("");
    }//GEN-LAST:event_mulButtonActionPerformed

    private void sqrtButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqrtButtonActionPerformed
        try {
            int no = Integer.parseInt(noTextField.getText());
            noTextField.setText(Math.sqrt(no)+"");
        } catch (NumberFormatException ex) {
            float no = Float.parseFloat(noTextField.getText());
            noTextField.setText(Math.sqrt(no)+"");
        }
    }//GEN-LAST:event_sqrtButtonActionPerformed

    private void noTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noTextFieldActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton divideButton;
    private javax.swing.JButton dotButton;
    private javax.swing.JButton doubleZeroButton;
    private javax.swing.JButton eightButton;
    private javax.swing.JButton equalsButton;
    private javax.swing.JButton fiveButton;
    private javax.swing.JButton fourButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton leftShiftButton;
    private javax.swing.JButton mulButton;
    private javax.swing.JButton nineButton;
    private javax.swing.JTextField noTextField;
    private javax.swing.JButton oneButton;
    private javax.swing.JButton perButton;
    private javax.swing.JButton plusButton;
    private javax.swing.JButton plusMinusButton;
    private javax.swing.JButton sevenButton;
    private javax.swing.JButton sixbutton;
    private javax.swing.JButton sqrButton;
    private javax.swing.JButton sqrtButton;
    private javax.swing.JButton subButton;
    private javax.swing.JButton threeButton;
    private javax.swing.JButton twoButton;
    private javax.swing.JButton zeroButton;
    // End of variables declaration//GEN-END:variables

private void getNumber(ActionEvent evt)
{
    JButton btn=(JButton) evt.getSource();
     String str =btn.getActionCommand();
     
     if (noTextField.getText().isEmpty()&&str.contains("0")) {
        
    } else {
         noTextField.setText(noTextField.getText()+str);
    }
    
}
}
