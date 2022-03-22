package login.inicial;

import java.awt.Color;

public class loginpassword extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public loginpassword() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        salidaBtn = new javax.swing.JPanel();
        salida = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        usuariotxt = new javax.swing.JTextField();
        passtxt = new javax.swing.JPasswordField();
        entrarBtn = new javax.swing.JPanel();
        entrarBtxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("UES FMO");
        fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, 140, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/inicial/imagenes/tienda.png"))); // NOI18N
        fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 640, 490));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/inicial/imagenes/favicon.png"))); // NOI18N
        fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 50, 60));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel4.setText("FMOcc");
        fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        jLabel5.setText("INICIAR SESIÓN");
        fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 220, 30));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel6.setText("CONTRASEÑA");
        fondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel7.setText("USUARIO");
        fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        salidaBtn.setBackground(new java.awt.Color(255, 255, 255));

        salida.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        salida.setText("  X");
        salida.setToolTipText("");
        salida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salidaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salidaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout salidaBtnLayout = new javax.swing.GroupLayout(salidaBtn);
        salidaBtn.setLayout(salidaBtnLayout);
        salidaBtnLayout.setHorizontalGroup(
            salidaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salidaBtnLayout.createSequentialGroup()
                .addComponent(salida, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );
        salidaBtnLayout.setVerticalGroup(
            salidaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salidaBtnLayout.createSequentialGroup()
                .addComponent(salida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(salidaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 947, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(salidaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        fondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 30));
        fondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 340, 50));
        fondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 310, 50));

        usuariotxt.setForeground(new java.awt.Color(204, 204, 204));
        usuariotxt.setText("Ingrese su nombre de usuario");
        usuariotxt.setBorder(null);
        usuariotxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuariotxtMousePressed(evt);
            }
        });
        usuariotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariotxtActionPerformed(evt);
            }
        });
        fondo.add(usuariotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 170, 30));

        passtxt.setForeground(new java.awt.Color(204, 204, 204));
        passtxt.setText("*******");
        passtxt.setToolTipText("");
        passtxt.setBorder(null);
        passtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passtxtMousePressed(evt);
            }
        });
        fondo.add(passtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 306, 140, 10));

        entrarBtn.setBackground(new java.awt.Color(0, 134, 190));

        entrarBtxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        entrarBtxt.setForeground(new java.awt.Color(255, 255, 255));
        entrarBtxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entrarBtxt.setText("ENTRAR");
        entrarBtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarBtxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                entrarBtxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                entrarBtxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout entrarBtnLayout = new javax.swing.GroupLayout(entrarBtn);
        entrarBtn.setLayout(entrarBtnLayout);
        entrarBtnLayout.setHorizontalGroup(
            entrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entrarBtxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        entrarBtnLayout.setVerticalGroup(
            entrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entrarBtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        fondo.add(entrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuariotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuariotxtActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
xMouse = evt.getX();
yMouse = evt.getY();// TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
int x = evt.getXOnScreen();
int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseDragged

    private void salidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salidaMouseClicked
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_salidaMouseClicked

    private void salidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salidaMouseEntered
salidaBtn.setBackground(Color.red); 
salida.setForeground(Color.white);// TODO add your handling code here:
    }//GEN-LAST:event_salidaMouseEntered

    private void salidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salidaMouseExited
       salidaBtn.setBackground(Color.white);
       salida.setForeground(Color.black);// TODO add your handling code here:
    }//GEN-LAST:event_salidaMouseExited

    private void entrarBtxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarBtxtMouseEntered
entrarBtn.setBackground(new Color (0, 156, 223) );        // TODO add your handling code here:
    }//GEN-LAST:event_entrarBtxtMouseEntered

    private void entrarBtxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarBtxtMouseExited
entrarBtn.setBackground(new Color (0, 134, 190) );        // TODO add your handling code here:
    }//GEN-LAST:event_entrarBtxtMouseExited

    private void usuariotxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariotxtMousePressed
if (usuariotxt.getText().equals("Ingrese su nombre de usuario")) {
usuariotxt.setText(""); 
usuariotxt.setForeground(Color.black);
}
if (String.valueOf(passtxt.getPassword()).isEmpty()) {
passtxt.setText("******");
passtxt.setForeground(Color.gray);
// TODO add your handling code here:
    }//GEN-LAST:event_usuariotxtMousePressed
}
    
    private void passtxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passtxtMousePressed
     if (usuariotxt.getText().isEmpty()) {
        usuariotxt.setText("Ingrese su nombre de usuario"); 
   usuariotxt.setForeground(Color.gray);
   }
   if (String.valueOf(passtxt.getPassword()).equals("********")) {
passtxt.setText("");
passtxt.setForeground(Color.black);// TODO add your handling code here:
    }//GEN-LAST:event_passtxtMousePressed
}
   
    private void entrarBtxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarBtxtMouseClicked
      javax.swing.JOptionPane.showMessageDialog(this, "Intento de login con los datos:\nUsuario: " + usuariotxt.getText() + "\nContraseña: " + String.valueOf(passtxt.getPassword()), "LOGIN", javax.swing.JOptionPane.INFORMATION_MESSAGE);  // TODO add your handling code here:
    }//GEN-LAST:event_entrarBtxtMouseClicked

    /*
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
            java.util.logging.Logger.getLogger(loginpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginpassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel entrarBtn;
    private javax.swing.JLabel entrarBtxt;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField passtxt;
    private javax.swing.JLabel salida;
    private javax.swing.JPanel salidaBtn;
    private javax.swing.JTextField usuariotxt;
    // End of variables declaration//GEN-END:variables
}
