/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto2tbd2;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;

/**
 *
 * @author serli
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
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
        passwordOrigen_tf = new javax.swing.JTextField();
        probar_OrigenButton = new javax.swing.JButton();
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
        passwordDestino_tf = new javax.swing.JTextField();
        probar_DestinoButton = new javax.swing.JButton();
        guardarButton = new javax.swing.JButton();
        tabTablas = new javax.swing.JPanel();
        tablas_headerLabel = new javax.swing.JLabel();
        sinReplicarLabel = new javax.swing.JLabel();
        sinReplicarScrollPane = new javax.swing.JScrollPane();
        sinReplicarTextArea = new javax.swing.JTextArea();
        replicandoLabel = new javax.swing.JLabel();
        replicandoScrollPane = new javax.swing.JScrollPane();
        replicandoTextArea = new javax.swing.JTextArea();
        toReplicando_button = new javax.swing.JButton();
        toSinReplicar_button = new javax.swing.JButton();
        guardarTablas_button = new javax.swing.JButton();
        cancelarTablas_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        config_headerLabel.setText("Configuración de Bases de Datos");

        origenLabel.setText("Base de Datos de MariaDB");

        instanciaLabel.setText("Nombre Instancia");

        bddLabel.setText("Nombre Base Datos");

        puertoLabel.setText("Puerto");

        usernameLabel.setText("Nombre Usuario");

        passwordLabel.setText("Password");

        probar_OrigenButton.setText("Probar");

        destinoLabel.setText("Base de Datos SQL Server");

        instanciaLabel1.setText("Nombre Instancia");

        bddLabel1.setText("Nombre Base Datos");

        puertoLabel1.setText("Puerto");

        usernameLabel1.setText("Nombre Usuario");

        passwordLabel1.setText("Password");

        probar_DestinoButton.setText("Probar");

        guardarButton.setText("Guardar");

        javax.swing.GroupLayout tabConfiguracionLayout = new javax.swing.GroupLayout(tabConfiguracion);
        tabConfiguracion.setLayout(tabConfiguracionLayout);
        tabConfiguracionLayout.setHorizontalGroup(
            tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabConfiguracionLayout.createSequentialGroup()
                .addGroup(tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabConfiguracionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addComponent(passwordOrigen_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabConfiguracionLayout.createSequentialGroup()
                                .addGroup(tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(puertoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(puertoOrigen_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usernameOrigen_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addGroup(tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addComponent(passwordDestino_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabConfiguracionLayout.createSequentialGroup()
                                .addGroup(tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(puertoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usernameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(puertoDestino_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usernameDestino_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(probar_DestinoButton)))
                    .addGroup(tabConfiguracionLayout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(config_headerLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(tabConfiguracionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(probar_OrigenButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabConfiguracionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(guardarButton))
        );
        tabConfiguracionLayout.setVerticalGroup(
            tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabConfiguracionLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(config_headerLabel)
                .addGap(18, 18, 18)
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
                            .addComponent(passwordOrigen_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLabel)))
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
                            .addComponent(passwordDestino_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLabel1))))
                .addGap(18, 18, 18)
                .addGroup(tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(probar_OrigenButton)
                    .addComponent(probar_DestinoButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(guardarButton)
                .addContainerGap())
        );

        mainTabbedPane.addTab("Configuración", tabConfiguracion);

        tablas_headerLabel.setText("Tablas BD Origen");

        sinReplicarLabel.setText("MariaDB");

        sinReplicarTextArea.setColumns(20);
        sinReplicarTextArea.setRows(5);
        sinReplicarScrollPane.setViewportView(sinReplicarTextArea);

        replicandoLabel.setText("SQL Server");

        replicandoTextArea.setColumns(20);
        replicandoTextArea.setRows(5);
        replicandoScrollPane.setViewportView(replicandoTextArea);

        toReplicando_button.setText(">>");

        toSinReplicar_button.setText("<<");

        guardarTablas_button.setText("Guardar");

        cancelarTablas_button.setText("Cancelar");

        javax.swing.GroupLayout tabTablasLayout = new javax.swing.GroupLayout(tabTablas);
        tabTablas.setLayout(tabTablasLayout);
        tabTablasLayout.setHorizontalGroup(
            tabTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabTablasLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(sinReplicarLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(replicandoLabel)
                .addGap(117, 117, 117))
            .addGroup(tabTablasLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(sinReplicarScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(tabTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(tabTablasLayout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addGroup(tabTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(guardarTablas_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancelarTablas_button)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabTablasLayout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(tablas_headerLabel)))
                    .addGroup(tabTablasLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(tabTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(toReplicando_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(toSinReplicar_button))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(replicandoScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        tabTablasLayout.setVerticalGroup(
            tabTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabTablasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tablas_headerLabel)
                .addGap(18, 18, 18)
                .addGroup(tabTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sinReplicarLabel)
                    .addComponent(replicandoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tabTablasLayout.createSequentialGroup()
                        .addComponent(toReplicando_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(toSinReplicar_button)
                        .addGap(134, 134, 134)
                        .addComponent(guardarTablas_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelarTablas_button))
                    .addGroup(tabTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(replicandoScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sinReplicarScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
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
    private javax.swing.JTextField passwordDestino_tf;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordLabel1;
    private javax.swing.JTextField passwordOrigen_tf;
    private javax.swing.JButton probar_DestinoButton;
    private javax.swing.JButton probar_OrigenButton;
    private javax.swing.JTextField puertoDestino_tf;
    private javax.swing.JLabel puertoLabel;
    private javax.swing.JLabel puertoLabel1;
    private javax.swing.JTextField puertoOrigen_tf;
    private javax.swing.JLabel replicandoLabel;
    private javax.swing.JScrollPane replicandoScrollPane;
    private javax.swing.JTextArea replicandoTextArea;
    private javax.swing.JLabel sinReplicarLabel;
    private javax.swing.JScrollPane sinReplicarScrollPane;
    private javax.swing.JTextArea sinReplicarTextArea;
    private javax.swing.JPanel tabConfiguracion;
    private javax.swing.JPanel tabTablas;
    private javax.swing.JLabel tablas_headerLabel;
    private javax.swing.JButton toReplicando_button;
    private javax.swing.JButton toSinReplicar_button;
    private javax.swing.JTextField usernameDestino_tf;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel usernameLabel1;
    private javax.swing.JTextField usernameOrigen_tf;
    // End of variables declaration//GEN-END:variables
}