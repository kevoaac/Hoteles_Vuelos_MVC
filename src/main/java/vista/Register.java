/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.proxy.ProxyUsuario;

/**
 *
 * @author Joel
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panelAzul = new javax.swing.JPanel();
        panelDorado = new javax.swing.JPanel();
        LAzul = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();
        register = new javax.swing.JButton();
        back = new javax.swing.JButton();
        Inombre = new javax.swing.JTextField();
        Icorreo = new javax.swing.JTextField();
        Iapellido = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        Inpass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAzul.setBackground(new java.awt.Color(0, 0, 51));

        panelDorado.setBackground(new java.awt.Color(246, 255, 248));

        LAzul.setIcon(new javax.swing.ImageIcon("C:\\Users\\kevin\\Documents\\workspace\\patrones-de-disenio\\Hoteles_Vuelos\\src\\main\\java\\vista\\recursos\\images\\LogoAzul.png")); // NOI18N

        nombre.setFont(new java.awt.Font("Roboto Black", 3, 15)); // NOI18N
        nombre.setText("NOMBRE");

        apellido.setFont(new java.awt.Font("Roboto Black", 3, 15)); // NOI18N
        apellido.setText("APELLIDO");

        correo.setFont(new java.awt.Font("Roboto Black", 3, 15)); // NOI18N
        correo.setText("CORREO");

        contraseña.setFont(new java.awt.Font("Roboto Black", 3, 15)); // NOI18N
        contraseña.setText("CONTRASEÑA");

        register.setBackground(new java.awt.Color(0, 0, 0));
        register.setFont(new java.awt.Font("Roboto Medium", 3, 28)); // NOI18N
        register.setForeground(new java.awt.Color(255, 255, 255));
        register.setText("Registrarse");
        register.setBorder(null);
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMouseClicked(evt);
            }
        });

        back.setBackground(new java.awt.Color(246, 255, 248));
        back.setFont(new java.awt.Font("Roboto Medium", 3, 28)); // NOI18N
        back.setForeground(new java.awt.Color(255, 198, 0));
        back.setIcon(new javax.swing.ImageIcon("C:\\Users\\kevin\\Documents\\workspace\\patrones-de-disenio\\Hoteles_Vuelos\\src\\main\\java\\vista\\recursos\\images\\back.png")); // NOI18N
        back.setBorder(null);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        Inombre.setBackground(new java.awt.Color(246, 255, 248));
        Inombre.setFont(new java.awt.Font("Roboto Light", 2, 16)); // NOI18N
        Inombre.setForeground(new java.awt.Color(153, 153, 153));
        Inombre.setText("Ingrese su nombre de pila");
        Inombre.setBorder(null);
        Inombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                InombreMousePressed(evt);
            }
        });

        Icorreo.setBackground(new java.awt.Color(246, 255, 248));
        Icorreo.setFont(new java.awt.Font("Roboto Light", 2, 16)); // NOI18N
        Icorreo.setForeground(new java.awt.Color(153, 153, 153));
        Icorreo.setText("Ingrese su correo");
        Icorreo.setBorder(null);
        Icorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IcorreoActionPerformed(evt);
            }
        });

        Iapellido.setBackground(new java.awt.Color(246, 255, 248));
        Iapellido.setFont(new java.awt.Font("Roboto Light", 2, 16)); // NOI18N
        Iapellido.setForeground(new java.awt.Color(153, 153, 153));
        Iapellido.setText("Ingrese su apellido");
        Iapellido.setBorder(null);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        Inpass.setBackground(new java.awt.Color(246, 255, 248));
        Inpass.setFont(new java.awt.Font("Roboto Light", 2, 16)); // NOI18N
        Inpass.setForeground(new java.awt.Color(153, 153, 153));
        Inpass.setText("****************");

        javax.swing.GroupLayout panelDoradoLayout = new javax.swing.GroupLayout(panelDorado);
        panelDorado.setLayout(panelDoradoLayout);
        panelDoradoLayout.setHorizontalGroup(
            panelDoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDoradoLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(panelDoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDoradoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDoradoLayout.createSequentialGroup()
                        .addGroup(panelDoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelDoradoLayout.createSequentialGroup()
                                .addGroup(panelDoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(89, 89, 89)
                                .addGroup(panelDoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2)
                                    .addComponent(jSeparator4)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDoradoLayout.createSequentialGroup()
                                .addGroup(panelDoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelDoradoLayout.createSequentialGroup()
                                        .addGap(240, 240, 240)
                                        .addComponent(LAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nombre)
                                    .addComponent(apellido)
                                    .addComponent(Inombre, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Iapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelDoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelDoradoLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panelDoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Icorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(correo)
                                            .addComponent(contraseña)))
                                    .addGroup(panelDoradoLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(Inpass)))))
                        .addGap(72, 72, 72))))
        );
        panelDoradoLayout.setVerticalGroup(
            panelDoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDoradoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelDoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDoradoLayout.createSequentialGroup()
                        .addComponent(LAzul)
                        .addGap(6, 6, 6)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Inombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Iapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(panelDoradoLayout.createSequentialGroup()
                        .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Icorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Inpass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panelDoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDoradoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelAzulLayout = new javax.swing.GroupLayout(panelAzul);
        panelAzul.setLayout(panelAzulLayout);
        panelAzulLayout.setHorizontalGroup(
            panelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAzulLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(panelDorado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        panelAzulLayout.setVerticalGroup(
            panelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAzulLayout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(panelDorado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        bg.add(panelAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IcorreoActionPerformed

    private void InombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InombreMousePressed
     
        // TODO add your handling code here:
    }//GEN-LAST:event_InombreMousePressed

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseClicked
        ProxyUsuario proxy = new ProxyUsuario();
        String nombre = Inombre.getText();
        String apellido = Iapellido.getText();
        String correo = Icorreo.getText();
        char[] passwordChars = Inpass.getPassword();
        String contrasenia = new String(passwordChars);
        proxy.registrarse(nombre, apellido, correo, contrasenia);
    }//GEN-LAST:event_registerMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
//Aqui se pone la funcion de la pagina anterior de la flecha
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
    // Ocultar la ventana Login
        this.setVisible(false);
    }//GEN-LAST:event_backMouseClicked

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Iapellido;
    private javax.swing.JTextField Icorreo;
    private javax.swing.JTextField Inombre;
    private javax.swing.JPasswordField Inpass;
    private javax.swing.JLabel LAzul;
    private javax.swing.JLabel apellido;
    private javax.swing.JButton back;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel correo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel nombre;
    private javax.swing.JPanel panelAzul;
    private javax.swing.JPanel panelDorado;
    private javax.swing.JButton register;
    // End of variables declaration//GEN-END:variables
}
