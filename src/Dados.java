
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Carlos
 */
public class Dados extends javax.swing.JFrame {

    /**
     * Creates new form Dados
     */
    public Dados() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDado1 = new javax.swing.JLabel();
        jDado2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dados");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dado/dado1.png"))); // NOI18N
        getContentPane().add(jDado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        jDado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dado/dado1.png"))); // NOI18N
        getContentPane().add(jDado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        jButton1.setText("Tirar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIRAR DADOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 70, -1));

        jButton4.setText("Ver");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 60, -1));

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String rutaDado1 = "";
        String rutaDado2 = "";

        int dado1 = (int) (Math.random() * 6 + 1);
        int dado2 = (int) (Math.random() * 6 + 1);
        switch (dado1) {
            case 1:
                rutaDado1 = "/dado/dado1.png";
                break;

            case 2:
                rutaDado1 = "/dado/dado2.png";
                break;

            case 3:
                rutaDado1 = "/dado/dado3.png";
                break;

            case 4:
                rutaDado1 = "/dado/dado4.png";
                break;

            case 5:
                rutaDado1 = "/dado/dado5.png";
                break;
                
            case 6:
           rutaDado1="/dado/dado6.png";
           break;
        
              }
        
        
         switch (dado2) {
            case 1:
                rutaDado2 = "/dado/dado1.png";
                break;

            case 2:
                rutaDado2 = "/dado/dado2.png";
                break;

            case 3:
                rutaDado2 = "/dado/dado3.png";
                break;

            case 4:
                rutaDado2 = "/dado/dado4.png";
                break;

            case 5:
                rutaDado2 = "/dado/dado5.png";
                break;
                
            case 6:
           rutaDado2="/dado/dado6.png";
           break;
        
              }
         
         System.out.println("Dado 1"+dado1);
         System.out.println("Dado 1"+dado2);
         

        ImageIcon icono1 = new ImageIcon(getClass().getResource(rutaDado1));
        ImageIcon icono2 = new ImageIcon(getClass().getResource(rutaDado2));

        jDado1.setIcon(icono1);

        jDado2.setIcon(icono2);
        if(dado1==6 && dado2==6){
            JOptionPane.showMessageDialog(this,"Ganastes!!");
        }
        else{
             JOptionPane.showMessageDialog(this,"En Otra Ocasión!!");
        }
            


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         String rutaDado1 = "/dado/dado1.png";
         String rutaDado2=  "/dado/dado1.png";
         ImageIcon icono1 = new ImageIcon(getClass().getResource(rutaDado1));
        ImageIcon icono2 = new ImageIcon(getClass().getResource(rutaDado2));
        jDado1.setIcon(icono1);
        jDado2.setIcon(icono2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Dados.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dados.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dados.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dados.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jDado1;
    private javax.swing.JLabel jDado2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
