/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto2tbd2;

import com.formdev.flatlaf.FlatLightLaf;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Main extends javax.swing.JFrame {

    private String MariaDBIP = "127.0.0.1";
    private String SQLServerAWS = "dbproyecto2.cqb9pqutso6u.us-east-1.rds.amazonaws.com";

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainTabbedPane = new javax.swing.JTabbedPane();
        tabConfiguracion = new javax.swing.JPanel();
        config_headerLabel = new javax.swing.JLabel();
        origenLabel = new javax.swing.JLabel();
        instanciaLabel = new javax.swing.JLabel();
        instanciaOrigen_tf = new javax.swing.JTextField();
        bddLabel = new javax.swing.JLabel();
        bddOrigen_tf = new javax.swing.JTextField();
        puertoLabel = new javax.swing.JLabel();
        puertoOrigen_tf = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        usernameOrigen_tf = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordOrigen_tf = new javax.swing.JPasswordField();
        probar_OrigenButton = new javax.swing.JButton();
        probar_OrigenLabel = new javax.swing.JLabel();
        destinoLabel = new javax.swing.JLabel();
        instanciaLabel1 = new javax.swing.JLabel();
        instanciaDestino_tf = new javax.swing.JTextField();
        bddLabel1 = new javax.swing.JLabel();
        bddDestino_tf = new javax.swing.JTextField();
        puertoLabel1 = new javax.swing.JLabel();
        puertoDestino_tf = new javax.swing.JTextField();
        usernameLabel1 = new javax.swing.JLabel();
        usernameDestino_tf = new javax.swing.JTextField();
        passwordLabel1 = new javax.swing.JLabel();
        passwordDestino_tf = new javax.swing.JPasswordField();
        guardarButton = new javax.swing.JButton();
        probar_DestinoButton = new javax.swing.JButton();
        probar_DestinoLabel = new javax.swing.JLabel();
        tabTablas = new javax.swing.JPanel();
        tablas_headerLabel = new javax.swing.JLabel();
        sinReplicarLabel = new javax.swing.JLabel();
        replicandoLabel = new javax.swing.JLabel();
        toReplicando_button = new javax.swing.JButton();
        guardarTablas_button = new javax.swing.JButton();
        cancelarTablas_button = new javax.swing.JButton();
        MariaDB_scrollpane = new javax.swing.JScrollPane();
        SQLServer_list = new javax.swing.JList<>();
        SQLServer_scrollpane = new javax.swing.JScrollPane();
        MariaDB_list = new javax.swing.JList<>();
        MariaDB_scrollpane1 = new javax.swing.JScrollPane();
        PrelimSQLServer = new javax.swing.JList<>();
        RefreshTables_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Integrador de Bases de Datos");

        mainTabbedPane.setToolTipText("");
        mainTabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mainTabbedPaneStateChanged(evt);
            }
        });

        config_headerLabel.setText("Configuración de Bases de Datos");

        origenLabel.setText("Base de Datos de MariaDB");

        instanciaLabel.setText("Nombre Instancia");

        instanciaOrigen_tf.setText("LocalMariaDB");
        instanciaOrigen_tf.setToolTipText("");

        bddLabel.setText("Nombre Base Datos");

        bddOrigen_tf.setText("proyecto_teoria2");

        puertoLabel.setText("Puerto");

        puertoOrigen_tf.setText("3306");

        usernameLabel.setText("Nombre Usuario");

        usernameOrigen_tf.setText("root");

        passwordLabel.setText("Password");

        passwordOrigen_tf.setText("root");

        probar_OrigenButton.setText("Probar");
        probar_OrigenButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                probar_OrigenButtonMouseClicked(evt);
            }
        });

        destinoLabel.setText("Base de Datos SQL Server");

        instanciaLabel1.setText("Nombre Instancia");

        instanciaDestino_tf.setText("SQLServer");

        bddLabel1.setText("Nombre Base Datos");

        bddDestino_tf.setText("dbproyecto2");
        bddDestino_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bddDestino_tfActionPerformed(evt);
            }
        });

        puertoLabel1.setText("Puerto");

        puertoDestino_tf.setText("1433");

        usernameLabel1.setText("Nombre Usuario");

        usernameDestino_tf.setText("danielserlio");

        passwordLabel1.setText("Password");

        passwordDestino_tf.setText("danielserlio");

        guardarButton.setText("Guardar");
        guardarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarButtonMouseClicked(evt);
            }
        });

        probar_DestinoButton.setText("Probar");
        probar_DestinoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                probar_DestinoButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tabConfiguracionLayout = new javax.swing.GroupLayout(tabConfiguracion);
        tabConfiguracion.setLayout(tabConfiguracionLayout);
        tabConfiguracionLayout.setHorizontalGroup(
            tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabConfiguracionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabConfiguracionLayout.createSequentialGroup()
                        .addGroup(tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabConfiguracionLayout.createSequentialGroup()
                                .addComponent(probar_OrigenButton)
                                .addGap(18, 18, 18)
                                .addComponent(probar_OrigenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(origenLabel)
                                .addGroup(tabConfiguracionLayout.createSequentialGroup()
                                    .addComponent(instanciaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(instanciaOrigen_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(tabConfiguracionLayout.createSequentialGroup()
                                    .addComponent(bddLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bddOrigen_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(tabConfiguracionLayout.createSequentialGroup()
                                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(passwordOrigen_tf))
                                .addGroup(tabConfiguracionLayout.createSequentialGroup()
                                    .addGroup(tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(puertoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(puertoOrigen_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(usernameOrigen_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(107, 107, 107)
                        .addGroup(tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabConfiguracionLayout.createSequentialGroup()
                                .addComponent(probar_DestinoButton)
                                .addGap(18, 18, 18)
                                .addComponent(probar_DestinoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(destinoLabel)
                                .addGroup(tabConfiguracionLayout.createSequentialGroup()
                                    .addComponent(instanciaLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(instanciaDestino_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(tabConfiguracionLayout.createSequentialGroup()
                                    .addComponent(bddLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bddDestino_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(tabConfiguracionLayout.createSequentialGroup()
                                    .addComponent(passwordLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(passwordDestino_tf))
                                .addGroup(tabConfiguracionLayout.createSequentialGroup()
                                    .addGroup(tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(puertoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(usernameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(puertoDestino_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(usernameDestino_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabConfiguracionLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(guardarButton)
                        .addContainerGap())))
            .addGroup(tabConfiguracionLayout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(config_headerLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        tabConfiguracionLayout.setVerticalGroup(
            tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabConfiguracionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(config_headerLabel)
                .addGap(38, 38, 38)
                .addGroup(tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabConfiguracionLayout.createSequentialGroup()
                        .addComponent(origenLabel)
                        .addGap(18, 18, 18)
                        .addGroup(tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(instanciaLabel)
                            .addComponent(instanciaOrigen_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bddLabel)
                            .addComponent(bddOrigen_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(puertoLabel)
                            .addComponent(puertoOrigen_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameLabel)
                            .addComponent(usernameOrigen_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordLabel)
                            .addComponent(passwordOrigen_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tabConfiguracionLayout.createSequentialGroup()
                        .addComponent(destinoLabel)
                        .addGap(18, 18, 18)
                        .addGroup(tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(instanciaLabel1)
                            .addComponent(instanciaDestino_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bddLabel1)
                            .addComponent(bddDestino_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(puertoLabel1)
                            .addComponent(puertoDestino_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameLabel1)
                            .addComponent(usernameDestino_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordLabel1)
                            .addComponent(passwordDestino_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(probar_OrigenButton)
                    .addComponent(probar_DestinoButton)
                    .addComponent(probar_OrigenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(probar_DestinoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(guardarButton)
                .addContainerGap())
        );

        mainTabbedPane.addTab("Configuración", tabConfiguracion);

        tablas_headerLabel.setText("Tablas BD Origen");

        sinReplicarLabel.setText("MariaDB");

        replicandoLabel.setText("SQL Server");

        toReplicando_button.setText(">>");
        toReplicando_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toReplicando_buttonMouseClicked(evt);
            }
        });
        toReplicando_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toReplicando_buttonActionPerformed(evt);
            }
        });

        guardarTablas_button.setText("Guardar");
        guardarTablas_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarTablas_buttonMouseClicked(evt);
            }
        });

        cancelarTablas_button.setText("Cancelar");
        cancelarTablas_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarTablas_buttonMouseClicked(evt);
            }
        });

        MariaDB_scrollpane.setViewportView(SQLServer_list);

        SQLServer_scrollpane.setViewportView(MariaDB_list);

        MariaDB_scrollpane1.setViewportView(PrelimSQLServer);

        RefreshTables_Button.setText("↻");
        RefreshTables_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RefreshTables_ButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tabTablasLayout = new javax.swing.GroupLayout(tabTablas);
        tabTablas.setLayout(tabTablasLayout);
        tabTablasLayout.setHorizontalGroup(
            tabTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabTablasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(tabTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabTablasLayout.createSequentialGroup()
                        .addComponent(SQLServer_scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addGroup(tabTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tablas_headerLabel)
                            .addGroup(tabTablasLayout.createSequentialGroup()
                                .addGroup(tabTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(guardarTablas_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RefreshTables_Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(toReplicando_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cancelarTablas_button, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                                .addGap(50, 50, 50)
                                .addGroup(tabTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MariaDB_scrollpane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MariaDB_scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(tabTablasLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(sinReplicarLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(replicandoLabel)
                        .addGap(110, 110, 110))))
        );
        tabTablasLayout.setVerticalGroup(
            tabTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabTablasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tablas_headerLabel)
                .addGap(24, 24, 24)
                .addGroup(tabTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sinReplicarLabel)
                    .addComponent(replicandoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabTablasLayout.createSequentialGroup()
                        .addGroup(tabTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MariaDB_scrollpane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toReplicando_button))
                        .addGap(8, 8, 8)
                        .addGroup(tabTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(MariaDB_scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tabTablasLayout.createSequentialGroup()
                                .addComponent(RefreshTables_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(guardarTablas_button)
                                .addGap(18, 18, 18)
                                .addComponent(cancelarTablas_button))))
                    .addComponent(SQLServer_scrollpane))
                .addGap(12, 12, 12))
        );

        mainTabbedPane.addTab("Tablas", tabTablas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainTabbedPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainTabbedPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void probar_DestinoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_probar_DestinoButtonMouseClicked
        Conexion_SQLServer prueba = new Conexion_SQLServer();
        String passwordString = new String(passwordDestino_tf.getPassword());
        prueba.connect(probar_DestinoLabel, SQLServerAWS, puertoDestino_tf.getText(), bddDestino_tf.getText(), usernameDestino_tf.getText(), passwordString);
        //System.out.println("done");
    }//GEN-LAST:event_probar_DestinoButtonMouseClicked

    private void probar_OrigenButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_probar_OrigenButtonMouseClicked
        Conexion_MariaDB prueba = new Conexion_MariaDB();
        String passwordString = new String(passwordOrigen_tf.getPassword());
        prueba.Conexion_MariaDB(probar_OrigenLabel, MariaDBIP, puertoOrigen_tf.getText(), bddOrigen_tf.getText(), usernameOrigen_tf.getText(), passwordString);
        //System.out.println("done maria");
    }//GEN-LAST:event_probar_OrigenButtonMouseClicked

    private void bddDestino_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bddDestino_tfActionPerformed
        
    }//GEN-LAST:event_bddDestino_tfActionPerformed

    private void mainTabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_mainTabbedPaneStateChanged

    }//GEN-LAST:event_mainTabbedPaneStateChanged

    private void toReplicando_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toReplicando_buttonMouseClicked
        List<String> selectedItems = MariaDB_list.getSelectedValuesList();
        DefaultListModel<String> PrelimModel = new DefaultListModel<>();

        for (String item : selectedItems) {
            PrelimModel.addElement(item);
            PrelimSQLServer.setModel(PrelimModel);
        }
    }//GEN-LAST:event_toReplicando_buttonMouseClicked

    private void toReplicando_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toReplicando_buttonActionPerformed
        
    }//GEN-LAST:event_toReplicando_buttonActionPerformed

    private void guardarTablas_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarTablas_buttonMouseClicked
        MariaDBToSQLServerExporter exportar = new MariaDBToSQLServerExporter();
        exportar.exportMariaDBToSQLServer(MariaDB_list);
        JOptionPane.showMessageDialog(this, "Exportación Realizada con Éxito");
    }//GEN-LAST:event_guardarTablas_buttonMouseClicked

    private void cancelarTablas_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarTablas_buttonMouseClicked
        DefaultListModel<String> PrelimModel = new DefaultListModel<>();
        PrelimSQLServer.setModel(PrelimModel);
        JOptionPane.showMessageDialog(this, "Exportación Cancelada");
    }//GEN-LAST:event_cancelarTablas_buttonMouseClicked

    private void RefreshTables_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshTables_ButtonMouseClicked
        //Actualizar JList de TABLES de MariaDB
        DefaultListModel<String> MariaListModel = new DefaultListModel<>();
        try {
            String urlMariaDB = "jdbc:mariadb://" + MariaDBIP + ":" + puertoOrigen_tf.getText() + "/" + bddOrigen_tf.getText();
            String passwordString = new String(passwordOrigen_tf.getPassword());
            Connection conexionMariaDB = DriverManager.getConnection(urlMariaDB, usernameOrigen_tf.getText(), passwordString);

            String sql = "SHOW TABLES FROM Proyecto_Teoria2";
            // Create a statement
            Statement statement = conexionMariaDB.createStatement();
            // Execute the query
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String tableName = resultSet.getString(1);
                MariaListModel.addElement(tableName);
            }
            MariaDB_list.setModel(MariaListModel);
            resultSet.close();
            conexionMariaDB.close();
        } catch (SQLException e) {
            //e.printStackTrace();
            DefaultListModel<String> PrelimModel = new DefaultListModel<>();
            MariaDB_list.setModel(PrelimModel);
            PrelimSQLServer.setModel(PrelimModel);
            JOptionPane.showMessageDialog(this, "Conexión con MariaDB No Establecida");
        }

        //Actualizar JList de TABLES de SQL Server
        DefaultListModel<String> ServerListModel = new DefaultListModel<>();
        try {
            String passwordString = new String(passwordDestino_tf.getPassword());
            String sqlServerUrl = "jdbc:sqlserver://" + SQLServerAWS + ":" + puertoDestino_tf.getText() + ";databaseName=" + bddDestino_tf.getText() + ";user=" + usernameDestino_tf.getText() + ";password=" + passwordString + ";encrypt=true;trustServerCertificate=true;loginTimeout=30;";
            Connection connection = DriverManager.getConnection(sqlServerUrl);
            String sql = "SELECT TABLE_NAME\n"
                    + "FROM INFORMATION_SCHEMA.TABLES\n"
                    + "WHERE TABLE_TYPE = 'BASE TABLE' AND TABLE_CATALOG = 'dbproyecto2';";
            // Create a statement
            Statement statement = connection.createStatement();
            // Execute the query
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String tableName = resultSet.getString(1);
                ServerListModel.addElement(tableName);
            }
            SQLServer_list.setModel(ServerListModel);
            resultSet.close();
            connection.close();
        } catch (SQLException e) {
            //e.printStackTrace();
            DefaultListModel<String> PrelimModel = new DefaultListModel<>();
            SQLServer_list.setModel(PrelimModel);
            JOptionPane.showMessageDialog(this, "Conexión con SQLServer No Establecida");
        }
    }//GEN-LAST:event_RefreshTables_ButtonMouseClicked

    private void guardarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarButtonMouseClicked
        JOptionPane.showMessageDialog(this, "Credenciales Actualizadas");
    }//GEN-LAST:event_guardarButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            System.out.println("failed to initialized");
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> MariaDB_list;
    private javax.swing.JScrollPane MariaDB_scrollpane;
    private javax.swing.JScrollPane MariaDB_scrollpane1;
    private javax.swing.JList<String> PrelimSQLServer;
    private javax.swing.JButton RefreshTables_Button;
    private javax.swing.JList<String> SQLServer_list;
    private javax.swing.JScrollPane SQLServer_scrollpane;
    private javax.swing.JTextField bddDestino_tf;
    private javax.swing.JLabel bddLabel;
    private javax.swing.JLabel bddLabel1;
    private javax.swing.JTextField bddOrigen_tf;
    private javax.swing.JButton cancelarTablas_button;
    private javax.swing.JLabel config_headerLabel;
    private javax.swing.JLabel destinoLabel;
    private javax.swing.JButton guardarButton;
    private javax.swing.JButton guardarTablas_button;
    private javax.swing.JTextField instanciaDestino_tf;
    private javax.swing.JLabel instanciaLabel;
    private javax.swing.JLabel instanciaLabel1;
    private javax.swing.JTextField instanciaOrigen_tf;
    private javax.swing.JTabbedPane mainTabbedPane;
    private javax.swing.JLabel origenLabel;
    private javax.swing.JPasswordField passwordDestino_tf;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordLabel1;
    private javax.swing.JPasswordField passwordOrigen_tf;
    private javax.swing.JButton probar_DestinoButton;
    private javax.swing.JLabel probar_DestinoLabel;
    private javax.swing.JButton probar_OrigenButton;
    private javax.swing.JLabel probar_OrigenLabel;
    private javax.swing.JTextField puertoDestino_tf;
    private javax.swing.JLabel puertoLabel;
    private javax.swing.JLabel puertoLabel1;
    private javax.swing.JTextField puertoOrigen_tf;
    private javax.swing.JLabel replicandoLabel;
    private javax.swing.JLabel sinReplicarLabel;
    private javax.swing.JPanel tabConfiguracion;
    private javax.swing.JPanel tabTablas;
    private javax.swing.JLabel tablas_headerLabel;
    private javax.swing.JButton toReplicando_button;
    private javax.swing.JTextField usernameDestino_tf;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel usernameLabel1;
    private javax.swing.JTextField usernameOrigen_tf;
    // End of variables declaration//GEN-END:variables
}
