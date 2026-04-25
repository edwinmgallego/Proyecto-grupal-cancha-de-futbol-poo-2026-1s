/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

/**
 *
 * @author felip
 */
public class VistaPanelDueño extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = 
        java.util.logging.Logger.getLogger(VistaPanelDueño.class.getName());
    
    private modelo.ModeloTablaReservas modeloTabla; 

   public VistaPanelDueño() {
    initComponents();
    configurarTabla();
    estilizarBotones();
    new Controlador.ControladorPanelDueño(this);
} 
   
    private void configurarTabla() {
    modeloTabla = new modelo.ModeloTablaReservas();
    jTable1.setModel(modeloTabla);
    jTable1.setRowHeight(30);
    jTable1.setSelectionMode(
        javax.swing.ListSelectionModel.SINGLE_SELECTION);
    jTable1.setShowGrid(true);
    jTable1.setGridColor(new java.awt.Color(200, 200, 200));
    jTable1.setBackground(java.awt.Color.WHITE);
    jTable1.setForeground(java.awt.Color.BLACK);
    jTable1.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 13));
    jTable1.setSelectionBackground(new java.awt.Color(34, 139, 34));
    jTable1.setSelectionForeground(java.awt.Color.WHITE);

    // Encabezado verde letras blancas grandes
    jTable1.getTableHeader().setFont(
        new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
    jTable1.getTableHeader().setBackground(
        new java.awt.Color(34, 139, 34));
    jTable1.getTableHeader().setForeground(java.awt.Color.WHITE);
    jTable1.getTableHeader().setReorderingAllowed(false);

    // Anchos
    jTable1.getColumnModel().getColumn(0).setPreferredWidth(70);
    jTable1.getColumnModel().getColumn(1).setPreferredWidth(180);
    jTable1.getColumnModel().getColumn(2).setPreferredWidth(160);
    jTable1.getColumnModel().getColumn(3).setPreferredWidth(100);
    jTable1.getColumnModel().getColumn(4).setPreferredWidth(70);
    jTable1.getColumnModel().getColumn(5).setPreferredWidth(90);

    // Renderer letras negras alineado izquierda
javax.swing.table.DefaultTableCellRenderer negroIzquierda =
    new javax.swing.table.DefaultTableCellRenderer() {
        @Override
        public java.awt.Component getTableCellRendererComponent(
            javax.swing.JTable table, Object value, boolean isSelected,
            boolean hasFocus, int row, int column) {
            super.getTableCellRendererComponent(
                table, value, isSelected, hasFocus, row, column);
            if (!isSelected) {
                setForeground(java.awt.Color.BLACK);
                // Filas alternas: verde clarito y blanco
                if (row % 2 == 0) {
                    setBackground(new java.awt.Color(220, 245, 220));
                } else {
                    setBackground(java.awt.Color.WHITE);
                }
            } else {
                setForeground(java.awt.Color.WHITE);
                setBackground(new java.awt.Color(34, 139, 34));
            }
            return this;
        }
    };

javax.swing.table.DefaultTableCellRenderer negrocentrado =
    new javax.swing.table.DefaultTableCellRenderer() {
        @Override
        public java.awt.Component getTableCellRendererComponent(
            javax.swing.JTable table, Object value, boolean isSelected,
            boolean hasFocus, int row, int column) {
            super.getTableCellRendererComponent(
                table, value, isSelected, hasFocus, row, column);
            setHorizontalAlignment(javax.swing.JLabel.CENTER);
            if (!isSelected) {
                setForeground(java.awt.Color.BLACK);
                if (row % 2 == 0) {
                    setBackground(new java.awt.Color(220, 245, 220));
                } else {
                    setBackground(java.awt.Color.WHITE);
                }
            } else {
                setForeground(java.awt.Color.WHITE);
                setBackground(new java.awt.Color(34, 139, 34));
            }
            return this;
        }
    };

    // Aplicar a cada columna
    jTable1.getColumnModel().getColumn(0).setCellRenderer(negrocentrado);
    jTable1.getColumnModel().getColumn(1).setCellRenderer(negroIzquierda);
    jTable1.getColumnModel().getColumn(2).setCellRenderer(negroIzquierda);
    jTable1.getColumnModel().getColumn(3).setCellRenderer(negrocentrado);
    jTable1.getColumnModel().getColumn(4).setCellRenderer(negrocentrado);
    jTable1.getColumnModel().getColumn(5).setCellRenderer(negrocentrado);
}

private void estilizarBotones() {
    javax.swing.JButton[] botones = {
        btnVerReservas, btnCancelarReserva,
        btnActualizar, btnCerrarSesion
    };

    for (javax.swing.JButton btn : botones) {
        btn.setBackground(new java.awt.Color(80, 80, 80));
        btn.setForeground(java.awt.Color.WHITE);
        btn.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 12));
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }

    // Arreglar fuentes del header
    lblTitulo.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 20));
    lblTitulo.setForeground(java.awt.Color.WHITE);
    lblBienvenida.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 14));
    lblBienvenida.setForeground(java.awt.Color.WHITE);
    panelFooter.setBackground(new java.awt.Color(45, 45, 45));
    lblEstado.setForeground(java.awt.Color.BLACK);
    lblEstado.setFont(new java.awt.Font("Segoe UI", java.awt.Font.ITALIC, 12));
    lblEstado.setText("  Reservas del Establecimiento");

    // Cerrar sesion en rojo oscuro
    btnCerrarSesion.setBackground(new java.awt.Color(160, 30, 30));
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
        panelHeader = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblBienvenida = new javax.swing.JLabel();
        panelSidebar = new javax.swing.JPanel();
        btnVerReservas = new javax.swing.JButton();
        btnCancelarReserva = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        panelFooter = new javax.swing.JPanel();
        panelCentro = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblEstado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelHeader.setBackground(new java.awt.Color(22, 139, 34));

        lblTitulo.setBackground(new java.awt.Color(34, 139, 34));
        lblTitulo.setText("Sistema de Reservas");

        lblBienvenida.setBackground(new java.awt.Color(34, 189, 34));
        lblBienvenida.setText("Bienvenido, Dueño");

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBienvenida)
                .addGap(33, 33, 33))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(lblBienvenida))
                .addGap(39, 39, 39))
        );

        panelSidebar.setBackground(new java.awt.Color(45, 45, 45));

        btnVerReservas.setText("Ver Reservas");
        btnVerReservas.addActionListener(this::btnVerReservasActionPerformed);

        btnCancelarReserva.setText("Cancelar Reserva");

        btnActualizar.setText("Actualizar");

        btnCerrarSesion.setText("Cerrar Sesion");

        javax.swing.GroupLayout panelSidebarLayout = new javax.swing.GroupLayout(panelSidebar);
        panelSidebar.setLayout(panelSidebarLayout);
        panelSidebarLayout.setHorizontalGroup(
            panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVerReservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelarReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSidebarLayout.setVerticalGroup(
            panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVerReservas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelarReserva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 502, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelFooterLayout = new javax.swing.GroupLayout(panelFooter);
        panelFooter.setLayout(panelFooterLayout);
        panelFooterLayout.setHorizontalGroup(
            panelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelFooterLayout.setVerticalGroup(
            panelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout panelCentroLayout = new javax.swing.GroupLayout(panelCentro);
        panelCentro.setLayout(panelCentroLayout);
        panelCentroLayout.setHorizontalGroup(
            panelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCentroLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelCentroLayout.setVerticalGroup(
            panelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentroLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );

        lblEstado.setBackground(new java.awt.Color(0, 0, 0));
        lblEstado.setText("Reservas del Establecimiento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(panelSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(panelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerReservasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerReservasActionPerformed

    /**
     * @param args the command line arguments
     */
      public javax.swing.JTable getTablaReservas() {
    return jTable1;
}
    public modelo.ModeloTablaReservas getModeloTabla() { 
        return modeloTabla;       
    }
    public javax.swing.JButton getBtnVerReservas() { 
        return btnVerReservas;    
    }
    public javax.swing.JButton getBtnCancelarReserva() { 
        return btnCancelarReserva; 
    }
    public javax.swing.JButton getBtnActualizar() { 
        return btnActualizar;     
    }
    public javax.swing.JButton getBtnCerrarSesion() { 
        return btnCerrarSesion;   
    }
    public javax.swing.JLabel getLblEstado() { 
        return lblEstado;         
    }
    public int getFilaSeleccionada() { 
        return jTable1.getSelectedRow(); 
    }
    public void setEstado(String msg) { 
        lblEstado.setText("  " + msg); 
    }
    public void mostrarMensaje(String mensaje) {
        javax.swing.JOptionPane.showMessageDialog(this, mensaje); 
    }

        public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : 
                javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | 
                 javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> 
            new VistaPanelDueño().setVisible(true));
        
    }                        


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelarReserva;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnVerReservas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelCentro;
    private javax.swing.JPanel panelFooter;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelSidebar;
    // End of variables declaration//GEN-END:variables
}
