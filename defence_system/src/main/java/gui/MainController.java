package gui;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */



import gui.Observer;
import java.util.ArrayList;

/**
 *
 * @author TWINTECH
 *
 */

public class MainController extends javax.swing.JFrame{
    private ArrayList <Observer>list;
    private Observer observer;
    /**
     * Creates new form MainController
     */
    public MainController() {
        initComponents();
        setVisible(true);
        this.list=new ArrayList<>();
        lblOxygen.setVisible(false);
        oxygenTxt.setVisible(false);
    }
    public void addDefence(Observer ob){
        list.add(ob);
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
        selectDefence = new javax.swing.JComboBox<>();
        collectInfoBtn = new javax.swing.JButton();
        areaClrBox = new javax.swing.JCheckBox();
        sliderPosition = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sendPrivateCheckBox = new javax.swing.JCheckBox();
        sendBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        msgFromTank = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        msgFromHelicopter = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainControllerMsg = new javax.swing.JTextArea();
        soldierCount = new javax.swing.JTextField();
        ammoCount = new javax.swing.JTextField();
        fuelAmountTxt = new javax.swing.JTextField();
        lblOxygen = new javax.swing.JLabel();
        oxygenTxt = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        msgFromSubmarine = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selectDefence.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        selectDefence.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Defence", "Helicopter", "Submarine", "Tank" }));
        selectDefence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectDefenceActionPerformed(evt);
            }
        });
        jPanel1.add(selectDefence, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 20));

        collectInfoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        collectInfoBtn.setText("Collect Information");
        collectInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collectInfoBtnActionPerformed(evt);
            }
        });
        jPanel1.add(collectInfoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 140, 20));

        areaClrBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        areaClrBox.setText("Area Clear");
        areaClrBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaClrBoxActionPerformed(evt);
            }
        });
        jPanel1.add(areaClrBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        sliderPosition.setMajorTickSpacing(10);
        sliderPosition.setPaintLabels(true);
        sliderPosition.setPaintTicks(true);
        sliderPosition.setSnapToTicks(true);
        sliderPosition.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderPositionStateChanged(evt);
            }
        });
        jPanel1.add(sliderPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 240, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Soldier Count");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Fuel Amount");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Ammo Amount");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Position");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        sendPrivateCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sendPrivateCheckBox.setText("Send Private");
        jPanel1.add(sendPrivateCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));

        sendBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sendBtn.setText("Send");
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });
        jPanel1.add(sendBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        msgFromTank.setColumns(20);
        msgFromTank.setRows(5);
        jScrollPane2.setViewportView(msgFromTank);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 170, 100));

        msgFromHelicopter.setColumns(20);
        msgFromHelicopter.setRows(5);
        jScrollPane3.setViewportView(msgFromHelicopter);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 150, 100));

        mainControllerMsg.setColumns(20);
        mainControllerMsg.setRows(5);
        jScrollPane1.setViewportView(mainControllerMsg);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 190, 90));

        soldierCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soldierCountActionPerformed(evt);
            }
        });
        jPanel1.add(soldierCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 120, -1));

        ammoCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ammoCountActionPerformed(evt);
            }
        });
        jPanel1.add(ammoCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 120, -1));
        jPanel1.add(fuelAmountTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 120, -1));

        lblOxygen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblOxygen.setText("Oxygen Level ");
        jPanel1.add(lblOxygen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        oxygenTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oxygenTxtActionPerformed(evt);
            }
        });
        jPanel1.add(oxygenTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 120, -1));

        msgFromSubmarine.setColumns(20);
        msgFromSubmarine.setRows(5);
        jScrollPane4.setViewportView(msgFromSubmarine);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 170, 100));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Tank");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Submarine");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Helicopter");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectDefenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectDefenceActionPerformed
       int selectionIndex=selectDefence.getSelectedIndex();
       this.observer=list.get(selectionIndex-1); 
    }//GEN-LAST:event_selectDefenceActionPerformed

    private void collectInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_collectInfoBtnActionPerformed

        soldierCount.setText(observer.sendSoldierCount());
        ammoCount.setText(observer.sendAmmoCount());
        fuelAmountTxt.setText(observer.sendFuelAmount());
        String oxygenLevel=observer.sendOxygenLevel();
        if(oxygenLevel!=null){
            lblOxygen.setVisible(true);
            oxygenTxt.setVisible(true);
            oxygenTxt.setText(oxygenLevel);
       }
        else{
            lblOxygen.setVisible(false);
            oxygenTxt.setVisible(false);
        }
        
       
        
    }//GEN-LAST:event_collectInfoBtnActionPerformed

    private void soldierCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soldierCountActionPerformed
        
    }//GEN-LAST:event_soldierCountActionPerformed

    private void ammoCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ammoCountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ammoCountActionPerformed

    private void sliderPositionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderPositionStateChanged
      boolean isDisable;
        if(sliderPosition.getValue()<50){
           isDisable=false;
       }
       else{
           isDisable=true;
       }
       for(Observer ob:list){
               ob.buttonDisable(isDisable);
           }
    }//GEN-LAST:event_sliderPositionStateChanged

    private void oxygenTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oxygenTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oxygenTxtActionPerformed

    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnActionPerformed
       if(sendPrivateCheckBox.isSelected()){
           observer.getMsgFromMainControl(mainControllerMsg.getText());
        
       }
       else{
           for(Observer ob:list){
            ob.getMsgFromMainControl(mainControllerMsg.getText());
        }
       }
    }//GEN-LAST:event_sendBtnActionPerformed
    
    private void areaClrBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaClrBoxActionPerformed
            
                    for(Observer ob:list){
                        ob.areaCleared(areaClrBox.isSelected());
                    }
                 
        
    
    }//GEN-LAST:event_areaClrBoxActionPerformed

    public void getMsgFromHelicopter(String msg){
         msgFromHelicopter.setText(msg);
    }
    public void getMsgFromSubmarine(String msg){
         msgFromSubmarine.setText(msg);
    }
    public void getMsgFromTank(String msg){
         msgFromTank.setText(msg);
    }
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
            java.util.logging.Logger.getLogger(MainController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainController().setVisible(true);
            }
        });
}  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ammoCount;
    private javax.swing.JCheckBox areaClrBox;
    private javax.swing.JButton collectInfoBtn;
    private javax.swing.JTextField fuelAmountTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblOxygen;
    private javax.swing.JTextArea mainControllerMsg;
    private javax.swing.JTextArea msgFromHelicopter;
    private javax.swing.JTextArea msgFromSubmarine;
    private javax.swing.JTextArea msgFromTank;
    private javax.swing.JTextField oxygenTxt;
    private javax.swing.JComboBox<String> selectDefence;
    private javax.swing.JButton sendBtn;
    private javax.swing.JCheckBox sendPrivateCheckBox;
    private javax.swing.JSlider sliderPosition;
    private javax.swing.JTextField soldierCount;
    // End of variables declaration//GEN-END:variables

    private void Swtich(int selectionIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}