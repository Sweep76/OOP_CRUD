
package clock;

import java.util.logging.Level;
import java.util.logging.Logger;
//import java.util.concurrent.TimeUnit;

/**
 *
 * @author User
 */
public class clock extends javax.swing.JFrame{

    /**
     * Creates new form clock
     */
    static int seconds = 00;
    static int minutes = 00;
    static int hours = 00;
    static int secondsTwice = 00;
    static int minutesTwice = 00;
    static int hoursTwice = 00;
    static int secondsHalf = 00;
    static int minutesHalf = 00;
    static int hoursHalf = 00;
    static boolean state = true;
    
    public clock() {
        initComponents();
    }
    
    myClassThreadNormal normal = new myClassThreadNormal();
    myClassThreadHalf half = new myClassThreadHalf();
    myClassThreadTwice twice = new myClassThreadTwice();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelHours = new javax.swing.JLabel();
        jLabelMinutes = new javax.swing.JLabel();
        jLabelSeconds = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelHoursHalf = new javax.swing.JLabel();
        jLabelMinutesHalf = new javax.swing.JLabel();
        jLabelSecondsHalf = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabelHoursTwice = new javax.swing.JLabel();
        jLabelMinutesTwice = new javax.swing.JLabel();
        jLabelSecondsTwice = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonStart = new javax.swing.JButton();
        jButtonStop = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelHours.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelHours.setText("00:");

        jLabelMinutes.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelMinutes.setText("00:");

        jLabelSeconds.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelSeconds.setText("00");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText(" Regular Clock");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelHours)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelMinutes)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelSeconds)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHours)
                    .addComponent(jLabelMinutes)
                    .addComponent(jLabelSeconds))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(21, 21, 21))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelHoursHalf.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelHoursHalf.setText("00:");

        jLabelMinutesHalf.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelMinutesHalf.setText("00:");

        jLabelSecondsHalf.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelSecondsHalf.setText("00");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Half Slow");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabelHoursHalf, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelMinutesHalf)
                .addGap(18, 18, 18)
                .addComponent(jLabelSecondsHalf)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHoursHalf)
                    .addComponent(jLabelMinutesHalf)
                    .addComponent(jLabelSecondsHalf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(23, 23, 23))
        );

        jPanel4.setBackground(new java.awt.Color(153, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelHoursTwice.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelHoursTwice.setText("00:");

        jLabelMinutesTwice.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelMinutesTwice.setText("00:");

        jLabelSecondsTwice.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelSecondsTwice.setText("00");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Twice as Fast");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabelHoursTwice)
                .addGap(18, 18, 18)
                .addComponent(jLabelMinutesTwice)
                .addGap(18, 18, 18)
                .addComponent(jLabelSecondsTwice)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(45, 45, 45))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHoursTwice)
                    .addComponent(jLabelMinutesTwice)
                    .addComponent(jLabelSecondsTwice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(21, 21, 21))
        );

        jButtonStart.setBackground(new java.awt.Color(204, 204, 204));
        jButtonStart.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jButtonStart.setText("Start");
        jButtonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStartActionPerformed(evt);
            }
        });

        jButtonStop.setBackground(new java.awt.Color(255, 255, 153));
        jButtonStop.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jButtonStop.setText("Stop");
        jButtonStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStopActionPerformed(evt);
            }
        });

        jButtonReset.setBackground(new java.awt.Color(255, 153, 153));
        jButtonReset.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonStart)
                    .addComponent(jButtonStop)
                    .addComponent(jButtonReset))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonStart)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonStop)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonReset))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStartActionPerformed
        state = true;
        Thread t1 = new Thread(normal);
        t1.start();
        Thread t2 = new Thread(half);
        t2.start();
        Thread t3 = new Thread(twice);
        t3.start();
    }//GEN-LAST:event_jButtonStartActionPerformed

    private void jButtonStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStopActionPerformed
        state = false;
        
    }//GEN-LAST:event_jButtonStopActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        state = false;
        hours = 0;
        minutes = 0;
        seconds = 0;
        jLabelSeconds.setText(seconds + "00");
        jLabelMinutes.setText(minutes + "00:");
        jLabelHours.setText(hours + "00:");
        hoursTwice = 0;
        minutesTwice = 0;
        secondsTwice = 0;
        jLabelSecondsTwice.setText(secondsTwice + "00");
        jLabelMinutesTwice.setText(minutesTwice + "00:");
        jLabelHoursTwice.setText(hoursTwice + "00:");
        hoursHalf = 0;
        minutesHalf = 0;
        secondsHalf = 0;
        jLabelSecondsHalf.setText(secondsHalf + "00");
        jLabelMinutesHalf.setText(minutesHalf + "00:");
        jLabelHoursHalf.setText(hoursHalf + "00:");
    }//GEN-LAST:event_jButtonResetActionPerformed

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
            java.util.logging.Logger.getLogger(clock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clock().setVisible(true);
            }
        });
    }

    private class myClassThreadNormal extends Thread{
        
    public void run(){
        for(;;){
            if(state == true){
                try{
                    Thread.sleep(1000);
                    if(seconds > 60){
                        seconds = 0;
                        minutes++;
                    }
                    if(minutes > 60){
                        seconds = 0;
                        minutes = 0;
                        hours++;
                    }
                    jLabelSeconds.setText(": " + seconds);
                    seconds++;
                    jLabelMinutes.setText(": " + minutes);
                    jLabelHours.setText("" + hours);
                }
                catch (InterruptedException ex) {
                    Logger.getLogger(myClassThreadNormal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                break;
            }
        }
    }
    }
    
    private class myClassThreadTwice extends Thread{
        
    public void run(){
        for(;;){
            if(state == true){
                try{
                    Thread.sleep(500);
                    if(secondsTwice > 60){
                        secondsTwice = 0;
                        minutesTwice++;
                    }
                    if(minutesTwice > 60){
                        secondsTwice = 0;
                        minutesTwice = 0;
                        hoursTwice++;
                    }
                    jLabelSecondsTwice.setText(": " + secondsTwice);
                    secondsTwice++;
                    jLabelMinutesTwice.setText(": " + minutesTwice);
                    jLabelHoursTwice.setText("" + hoursTwice);
                }
                catch (InterruptedException ex) {
                    Logger.getLogger(myClassThreadTwice.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                break;
            }
        }
    }
    }
    
    private class myClassThreadHalf extends Thread{
        
    public void run(){
        for(;;){
            if(state == true){
                try{
                    Thread.sleep(2000);
                    if(secondsHalf > 60){
                        secondsHalf = 0;
                        minutesHalf++;
                    }
                    if(minutesHalf > 60){
                        secondsHalf = 0;
                        minutesHalf = 0;
                        hoursHalf++;
                    }
                    jLabelSecondsHalf.setText(": " + secondsHalf);
                    secondsHalf++;
                    jLabelMinutesHalf.setText(": " + minutesHalf);
                    jLabelHoursHalf.setText("" + hoursHalf);
                }
                catch (InterruptedException ex) {
                    Logger.getLogger(myClassThreadHalf.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                break;
            }
        }
    }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonStart;
    private javax.swing.JButton jButtonStop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelHours;
    private javax.swing.JLabel jLabelHoursHalf;
    private javax.swing.JLabel jLabelHoursTwice;
    private javax.swing.JLabel jLabelMinutes;
    private javax.swing.JLabel jLabelMinutesHalf;
    private javax.swing.JLabel jLabelMinutesTwice;
    private javax.swing.JLabel jLabelSeconds;
    private javax.swing.JLabel jLabelSecondsHalf;
    private javax.swing.JLabel jLabelSecondsTwice;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}

