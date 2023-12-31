/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista.views;

import controlador.Reserva.Logica;
import controlador.Reserva.Registro;
import controlador.Reserva.RegistroBuilder;
import java.awt.Color;

/**
 *
 * @author kevin
 */
public class PanelCierre extends javax.swing.JPanel {

    /**
     * Creates new form Principal
     */
    public PanelCierre() {
        initComponents();
        InitStyles();
    }

    private void InitStyles() {
        titulo3LB.putClientProperty("FlatLaf.style", "font: 200% bold $h1.regular.font");
        titulo3LB.setForeground(Color.black);

        Registro registro = new RegistroBuilder().build();

        h3_cliente.setText("Cliente:           " + registro.getNombreUsuario() + " " + registro.getApellidoUsuario());
        h3_vuelo.setText("Vuelo:             " + registro.getPrecioVuelo());
        h3_habitacion.setText("Habitacion:        " +registro.getPrecioHabitacion());
        h3_total.setText("Total + IVA (12%): " + Logica.calcularPrecioTotal());
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        tituloLB = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        titulo3LB = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        h2 = new javax.swing.JLabel();
        h3_cliente = new javax.swing.JLabel();
        h3_vuelo = new javax.swing.JLabel();
        h3_habitacion = new javax.swing.JLabel();
        h3_total = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 73, 144));
        setMinimumSize(new java.awt.Dimension(883, 650));
        setPreferredSize(new java.awt.Dimension(883, 650));

        bg.setBackground(new java.awt.Color(0, 73, 144));
        bg.setPreferredSize(new java.awt.Dimension(800, 466));

        header.setBackground(new java.awt.Color(234, 234, 234));

        tituloLB.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tituloLB.setText("Descubre el mundo con AEROLINEAS Q-AQP");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloLB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        body.setBackground(new java.awt.Color(0, 73, 144));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo3LB.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        titulo3LB.setForeground(new java.awt.Color(255, 255, 255));
        titulo3LB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo3LB.setText("GRACIAS POR ELEGIRNOS");
        body.add(titulo3LB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 24, 880, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        h2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        h2.setForeground(new java.awt.Color(100, 100, 100));
        h2.setText("Resumen");

        h3_cliente.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        h3_cliente.setForeground(new java.awt.Color(100, 100, 100));
        h3_cliente.setText("Cliente: ");

        h3_vuelo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        h3_vuelo.setForeground(new java.awt.Color(100, 100, 100));
        h3_vuelo.setText("Vuelo:");

        h3_habitacion.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        h3_habitacion.setForeground(new java.awt.Color(100, 100, 100));
        h3_habitacion.setText("Habitacion:");

        h3_total.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        h3_total.setForeground(new java.awt.Color(100, 100, 100));
        h3_total.setText("Total:");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\kevin\\Documents\\workspace\\patrones-de-disenio\\Hoteles_Vuelos\\src\\main\\java\\vista\\recursos\\imagenCierre.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h2)
                    .addComponent(h3_cliente)
                    .addComponent(h3_habitacion)
                    .addComponent(h3_total)
                    .addComponent(h3_vuelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(h2)
                        .addGap(44, 44, 44)
                        .addComponent(h3_cliente)
                        .addGap(18, 18, 18)
                        .addComponent(h3_vuelo)
                        .addGap(18, 18, 18)
                        .addComponent(h3_habitacion)
                        .addGap(18, 18, 18)
                        .addComponent(h3_total))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        body.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 650, 430));

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel body;
    private javax.swing.JLabel h2;
    private javax.swing.JLabel h3_cliente;
    private javax.swing.JLabel h3_habitacion;
    private javax.swing.JLabel h3_total;
    private javax.swing.JLabel h3_vuelo;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titulo3LB;
    private javax.swing.JLabel tituloLB;
    // End of variables declaration//GEN-END:variables
}
