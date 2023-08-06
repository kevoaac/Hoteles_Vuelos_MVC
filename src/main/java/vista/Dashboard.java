package vista;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import modelo.DAO.implementacion.VueloDAOImp;
import modelo.DAO.interfaces.VueloDAO;
import vista.views.*;

/**
 *
 * @author kevin
 */
public class Dashboard extends javax.swing.JFrame {
    
    public Dashboard() {
        initComponents();
        InitStyles();//Con este metodo llamamos a los estilos que usaremos para cada componente.botones, label, etc
        InitContent();
    }

    private void InitStyles() {
        menuTituloLB.putClientProperty("FlatLaf.style", "font: bold $h1.regular.font");
        menuTituloLB.setForeground(Color.BLACK);

        origenLB.putClientProperty("FlatLaf.style", "font: bold $h2.regular.font");
        origenLB.setForeground(Color.gray);
        destinoLB.putClientProperty("FlatLaf.style", "font: bold $h2.regular.font");
        destinoLB.setForeground(Color.gray);

    }

    private void InitContent() {
        ShowPanel(new PanelBienvenida());
    }

    public static void ShowPanel(JPanel p) {
        p.setSize(883, 650);
        p.setLocation(0, 0);

        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        logoLB = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        menuTituloLB = new javax.swing.JLabel();
        origenCB = new javax.swing.JComboBox<>();
        origenLB = new javax.swing.JLabel();
        destinoLB = new javax.swing.JLabel();
        destinoCB = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        buscarBTN = new javax.swing.JButton();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));

        Background.setBackground(new java.awt.Color(0, 43, 92));
        Background.setMinimumSize(new java.awt.Dimension(1280, 720));
        Background.setPreferredSize(new java.awt.Dimension(1920, 1080));

        header.setBackground(new java.awt.Color(11, 35, 67));

        logoLB.setIcon(new javax.swing.ImageIcon("C:\\Users\\kevin\\Downloads\\NUEVOCODIGO\\Hoteles_Vuelos\\src\\main\\java\\vista\\recursos\\logo40px.png")); // NOI18N

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(logoLB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoLB, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        menu.setBackground(new java.awt.Color(255, 255, 255));

        menuTituloLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuTituloLB.setText("RESERVA TU VUELO");
        menuTituloLB.setToolTipText("");

        origenCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ecuador", "España", "Argentina", "Brasil", "Canadá", "México", "Japón", "Estados Unidos", "China", "Colombia" }));
        origenCB.setToolTipText("Seleccione el país de origen");
        origenCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                origenCBActionPerformed(evt);
            }
        });

        origenLB.setText("Origen");

        destinoLB.setText("Destino");

        destinoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ecuador", "España", "Argentina", "Brasil", "Canadá", "México", "Japón", "Estados Unidos", "China", "Colombia" }));
        destinoCB.setToolTipText("Seleccione el país de destino");

        buscarBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buscarBTN.setForeground(new java.awt.Color(51, 51, 51));
        buscarBTN.setText("Buscar Vuelos");
        buscarBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuTituloLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(origenLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(origenCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(destinoLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(destinoCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 43, Short.MAX_VALUE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buscarBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(menuTituloLB, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(origenLB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(origenCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(destinoLB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(destinoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                .addComponent(buscarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );

        content.setBackground(new java.awt.Color(0, 73, 144));
        content.setPreferredSize(new java.awt.Dimension(883, 20));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 883, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBTNActionPerformed
        ShowPanel(new PanelVuelos());
        String origen = (String) origenCB.getSelectedItem();
        String destino = (String) destinoCB.getSelectedItem();
        DefaultTableModel model = (DefaultTableModel) PanelVuelos.jTableVuelos.getModel();
        

        //Mostrar vuelos en la tabla
        try {
            VueloDAO vueloCRUD = new VueloDAOImp();
            vueloCRUD.listar(origen, destino).forEach(x -> model.addRow(new Object[]{x.getIdVuelo(), x.getOrigen(), x.getDestino(), x.getFechaSalida(), x.getFechaLlegada(), x.getPrecio()}));
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_buscarBTNActionPerformed

    private void origenCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_origenCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_origenCBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatMaterialLighterIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton buscarBTN;
    private static javax.swing.JPanel content;
    private javax.swing.JComboBox<String> destinoCB;
    private javax.swing.JLabel destinoLB;
    private javax.swing.JPanel header;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logoLB;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel menuTituloLB;
    private javax.swing.JComboBox<String> origenCB;
    private javax.swing.JLabel origenLB;
    // End of variables declaration//GEN-END:variables
}
