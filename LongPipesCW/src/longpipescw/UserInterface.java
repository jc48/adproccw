/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longpipescw;

import java.util.*;

/**
 *
 * @author conorfarrell
 */
public class UserInterface extends javax.swing.JFrame {
    //move array list later
    protected ArrayList<Object> order = new ArrayList<Object>();
    
    protected double diameterContent;
    protected double lengthContent;
    protected int gradeContent;
    protected double quantityContent;
    protected Boolean chemResistContent;
    protected String colour1Content;
    protected String colour2Content;
    protected String numOfColours;
    protected Boolean innerInsulationContent;
    protected Boolean outterReinforcementContent;
    
    
    /**
     * Creates new form NewJFrame
     */
    public UserInterface() {
        initComponents();
        
        //DISABLE action buttons and window resize
        setResizable(false);
        //actionMethod();
        completeOrderButton.setEnabled(false);
        addToBasketButton.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        diameterTextField = new javax.swing.JTextField();
        diameterLabel = new javax.swing.JLabel();
        lengthLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pGradeLabel = new javax.swing.JLabel();
        pGradeComboBox = new javax.swing.JComboBox<>();
        colour2Label = new javax.swing.JLabel();
        insulationComboBox = new javax.swing.JComboBox<>();
        completeOrderButton = new javax.swing.JButton();
        insulationLabel = new javax.swing.JLabel();
        colour2ComboBox = new javax.swing.JComboBox<>();
        reinforcementLabel = new javax.swing.JLabel();
        reinforcementComboBox = new javax.swing.JComboBox<>();
        quantityLabel = new javax.swing.JLabel();
        quantityTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lengthTextField = new javax.swing.JTextField();
        cancelOrderButton = new javax.swing.JButton();
        resistanceLabel = new javax.swing.JLabel();
        resistanceComboBox = new javax.swing.JComboBox<>();
        colour1ComboBox = new javax.swing.JComboBox<>();
        colour1Label = new javax.swing.JLabel();
        addToBasketButton = new javax.swing.JButton();
        basket = new javax.swing.JScrollPane();
        myBasket = new javax.swing.JList<>();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        diameterTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diameterTextFieldActionPerformed(evt);
            }
        });

        diameterLabel.setText("Diameter (Inches):");

        lengthLabel.setText("Length (meters):");

        jLabel3.setText("Pipe Order System");

        pGradeLabel.setText("Plastic grade:");

        pGradeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose:", "1", "2", "3", "4", "5" }));
        pGradeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pGradeComboBoxActionPerformed(evt);
            }
        });

        colour2Label.setText("Colour 2:");

        insulationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose:", "Yes", "No" }));
        insulationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insulationComboBoxActionPerformed(evt);
            }
        });

        completeOrderButton.setText("Complete Order");
        completeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeOrderButtonActionPerformed(evt);
            }
        });

        insulationLabel.setText("Insulation:");

        colour2ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose:", "Blue", "Green", "Purple", "Yellow" }));
        colour2ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colour2ComboBoxActionPerformed(evt);
            }
        });

        reinforcementLabel.setText("Reinforcement:");

        reinforcementComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose:", "Yes", "No" }));
        reinforcementComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reinforcementComboBoxActionPerformed(evt);
            }
        });

        quantityLabel.setText("Quantity:");

        quantityTextField.setText("1");
        quantityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityTextFieldActionPerformed(evt);
            }
        });

        jLabel10.setText("Your Basket:");

        lengthTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthTextFieldActionPerformed(evt);
            }
        });

        cancelOrderButton.setText("Cancel Order");
        cancelOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelOrderButtonActionPerformed(evt);
            }
        });

        resistanceLabel.setText("Chemical Resistance:");

        resistanceComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose:", "Yes", "No" }));
        resistanceComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resistanceComboBoxActionPerformed(evt);
            }
        });

        colour1ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose:", "Black", "White" }));
        colour1ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colour1ComboBoxActionPerformed(evt);
            }
        });

        colour1Label.setText("Colour 1:");

        addToBasketButton.setText("Add To Basket");
        addToBasketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToBasketButtonActionPerformed(evt);
            }
        });

        myBasket.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "TEST" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        basket.setViewportView(myBasket);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(colour1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(reinforcementLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(insulationComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(reinforcementComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(colour2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(69, 69, 69)
                            .addComponent(colour2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(pGradeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(46, 46, 46)
                            .addComponent(pGradeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resistanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resistanceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(quantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lengthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diameterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(diameterTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lengthTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3)
                    .addComponent(insulationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colour1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(basket, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(addToBasketButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(completeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(diameterLabel)
                            .addComponent(diameterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lengthLabel)
                            .addComponent(lengthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pGradeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pGradeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(colour1Label)
                            .addComponent(colour1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(colour2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(colour2Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insulationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(insulationLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reinforcementComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reinforcementLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resistanceLabel)
                            .addComponent(resistanceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(basket)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityLabel)
                    .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addToBasketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(completeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void diameterTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diameterTextFieldActionPerformed
        // TODO add your handling code here:
        enableDisable();
        if(!diameterTextField.getText().equals("")){
            diameterLabel.setText("Diameter (inches): ✓");
        } else{
            diameterLabel.setText("Diameter (inches): ");
        }
        //FIX having to press enter to intialise the textfield
        diameterContent = Double.parseDouble(diameterTextField.getText());
        System.out.println(diameterContent);
    }//GEN-LAST:event_diameterTextFieldActionPerformed

    private void pGradeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pGradeComboBoxActionPerformed
        // TODO add your handling code here:
        enableDisable();
        if(pGradeComboBox.getSelectedItem() == "Choose:"){
            pGradeLabel.setText("Plastic grade: ");
        } else{
            pGradeLabel.setText("Plastic grade: ✓");
        }
        String tempGradeContent = (String)pGradeComboBox.getSelectedItem();
        
        gradeContent = Integer.parseInt(tempGradeContent);
        
        System.out.println(gradeContent);
    }//GEN-LAST:event_pGradeComboBoxActionPerformed

    private void insulationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insulationComboBoxActionPerformed
        // TODO add  handling code here:
        if(insulationComboBox.getSelectedItem() == "Choose:"){
            insulationLabel.setText("Insulation: ");
        } else{
            insulationLabel.setText("Insulation: ✓");
        }
        
        if(insulationComboBox.getSelectedItem() == "Yes"){
            innerInsulationContent = true;
        } else{
            innerInsulationContent = false;
        }
        
        System.out.println(innerInsulationContent);
    }//GEN-LAST:event_insulationComboBoxActionPerformed

    private void colour2ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colour2ComboBoxActionPerformed
        // TODO add your handling code here:
        if(colour2ComboBox.getSelectedItem() == "Choose:"){
            colour2Content = null;
            colour2Label.setText("Colour 2: ");
        } else{
            colour2Label.setText("Colour 2: ✓");
        }
        colour2Content = (String)colour2ComboBox.getSelectedItem();
        System.out.println(colour2Content);
    }//GEN-LAST:event_colour2ComboBoxActionPerformed

    private void reinforcementComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reinforcementComboBoxActionPerformed
        // TODO add your handling code here:
        if(reinforcementComboBox.getSelectedItem() == "Choose:"){
            reinforcementLabel.setText("Reinforcement: ");
        } else{
            reinforcementLabel.setText("Reinforcement: ✓");
        }
        
        if(reinforcementComboBox.getSelectedItem() == "Yes"){
            outterReinforcementContent = true;
        } else{
            outterReinforcementContent = false;
        }
        
        System.out.println(outterReinforcementContent);
    }//GEN-LAST:event_reinforcementComboBoxActionPerformed

    private void quantityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityTextFieldActionPerformed
        // TODO add your handling code here:
        if(!quantityTextField.getText().equals("")){
            quantityLabel.setText("Quantity: ✓");
        } else{
            quantityLabel.setText("Quantity: ");
        }
        
        quantityContent = Integer.parseInt(quantityTextField.getText());
        
        System.out.println(quantityContent);
    }//GEN-LAST:event_quantityTextFieldActionPerformed

    private void lengthTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthTextFieldActionPerformed
        // TODO add your handling code here:
        enableDisable();
        if(!lengthTextField.getText().equals("")){
            lengthLabel.setText("Length (meters): ✓");
        } else {
            lengthLabel.setText("Length (meters): ");
        }
        lengthContent = Double.parseDouble(lengthTextField.getText());
        
        System.out.println(lengthContent);
    }//GEN-LAST:event_lengthTextFieldActionPerformed

    private void completeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeOrderButtonActionPerformed
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
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        new Invoice(order).setVisible(true);
    }//GEN-LAST:event_completeOrderButtonActionPerformed

    private void cancelOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelOrderButtonActionPerformed
        //exit the window
        System.exit(0);
    }//GEN-LAST:event_cancelOrderButtonActionPerformed

    private void resistanceComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resistanceComboBoxActionPerformed
        // TODO add your handling code here:
        enableDisable();
        if(resistanceComboBox.getSelectedItem() == "Choose:"){
            resistanceLabel.setText("Chemical Resistance: ");
        } else{
            resistanceLabel.setText("Chemical Resistance: ✓");
        }
        if(resistanceComboBox.getSelectedItem() == "Yes"){
            chemResistContent = true;
        } else{
            chemResistContent = false;
        }
        System.out.println(chemResistContent);
    }//GEN-LAST:event_resistanceComboBoxActionPerformed

    private void colour1ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colour1ComboBoxActionPerformed
        // TODO add your handling code here:
        if(colour1ComboBox.getSelectedItem() == "Choose:"){
            colour1Content = null;
            colour1Label.setText("Colour 1: ");
        } else{
            colour1Label.setText("Colour 1: ✓");
        }
        colour1Content = (String)colour1ComboBox.getSelectedItem();
        System.out.println(colour1Content);
    }//GEN-LAST:event_colour1ComboBoxActionPerformed
      
    private void addToBasketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToBasketButtonActionPerformed
        // ADD VALIDATION
        
        Pipe pipeObj;
        if(colour1Content == null && colour2Content == null && innerInsulationContent == null && outterReinforcementContent == null){
            pipeObj = new Type1(diameterContent, lengthContent, gradeContent, 
                chemResistContent);
            //conso
        } else if(colour2Content == null && innerInsulationContent == null && outterReinforcementContent == null){
            pipeObj = new Type2(diameterContent, lengthContent, gradeContent, 
                chemResistContent, colour1Content);
        } else if(innerInsulationContent == null && outterReinforcementContent == null){
            pipeObj = new Type3(diameterContent, lengthContent, gradeContent, 
                chemResistContent, colour1Content, colour2Content);
            System.out.println(pipeObj.totalCost());
        } else if(outterReinforcementContent == null) {
            pipeObj = new Type4(diameterContent, lengthContent, gradeContent, 
                chemResistContent, colour1Content, colour2Content, 
                innerInsulationContent);
        } else {
            pipeObj = new Type5(diameterContent, lengthContent, gradeContent, 
                chemResistContent, colour1Content, colour2Content, 
                innerInsulationContent, outterReinforcementContent);
        }
        pipeObj.quantity = quantityContent;
        pipeObj.getPipeType();
        pipeObj.totalCost();
        
        order.add(pipeObj);
        
    }//GEN-LAST:event_addToBasketButtonActionPerformed
    
    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToBasketButton;
    private javax.swing.JScrollPane basket;
    private javax.swing.JButton cancelOrderButton;
    private javax.swing.JComboBox<String> colour1ComboBox;
    private javax.swing.JLabel colour1Label;
    private javax.swing.JComboBox<String> colour2ComboBox;
    private javax.swing.JLabel colour2Label;
    private javax.swing.JButton completeOrderButton;
    private javax.swing.JLabel diameterLabel;
    private javax.swing.JTextField diameterTextField;
    private javax.swing.JComboBox<String> insulationComboBox;
    private javax.swing.JLabel insulationLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lengthLabel;
    private javax.swing.JTextField lengthTextField;
    private javax.swing.JList<String> myBasket;
    private javax.swing.JComboBox<String> pGradeComboBox;
    private javax.swing.JLabel pGradeLabel;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JComboBox<String> reinforcementComboBox;
    private javax.swing.JLabel reinforcementLabel;
    private javax.swing.JComboBox<String> resistanceComboBox;
    private javax.swing.JLabel resistanceLabel;
    // End of variables declaration//GEN-END:variables
//    public void actionMethod(){
//        diameterTextField.setFocusable(true);
//    }
   
    public void enableDisable(){
        if(!diameterTextField.getText().equals("") && !lengthTextField.getText().equals("")
                && pGradeComboBox.getSelectedItem() != "Choose:" && resistanceComboBox.getSelectedItem() != "Choose:"){
            completeOrderButton.setEnabled(true);
            addToBasketButton.setEnabled(true);
        } else{
            completeOrderButton.setEnabled(false);
            addToBasketButton.setEnabled(false);
        }
    }
}
