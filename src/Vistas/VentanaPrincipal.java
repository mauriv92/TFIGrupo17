/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Datos.NegocioMySQL;
import Main.NegocioEnMemoria;
import Modelo.ControladorRegistrarPedido;
import Modelo.IVentanaPedido;

/**
 *
 * @author 17
 */
public class VentanaPrincipal extends javax.swing.JFrame implements IVentanaPedido{

    private ControladorRegistrarPedido controlador;
    
    public VentanaPrincipal() 
    {
        controlador = new ControladorRegistrarPedido(new NegocioMySQL());
        setControlador(controlador);
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

        panelAyuda = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAyuda = new javax.swing.JTextArea();
        panelBotones = new javax.swing.JPanel();
        btnVentanPedido = new javax.swing.JButton();
        btnCatalogoPedido = new javax.swing.JButton();
        btnMesasPedido = new javax.swing.JButton();
        btnEmpleadosPedido = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(MAXIMIZED_BOTH);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new java.awt.GridLayout(0, 1));

        panelAyuda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtAyuda.setColumns(20);
        txtAyuda.setRows(5);
        txtAyuda.setText("ALT+S : SALIR DEL PROGRAMA\t\tALT+P : MENU VENTAS\n\nALT+C : MENU CATALOGO\t\t\tALT+M : MENU MESAS\n\nALT+E : MENU EMPLEADOS\t\t\t");
        txtAyuda.setEnabled(false);
        jScrollPane1.setViewportView(txtAyuda);

        javax.swing.GroupLayout panelAyudaLayout = new javax.swing.GroupLayout(panelAyuda);
        panelAyuda.setLayout(panelAyudaLayout);
        panelAyudaLayout.setHorizontalGroup(
            panelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
        );
        panelAyudaLayout.setVerticalGroup(
            panelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );

        getContentPane().add(panelAyuda);

        panelBotones.setLayout(new java.awt.GridLayout(1, 0));

        btnVentanPedido.setMnemonic('p');
        btnVentanPedido.setText("Ventas");
        btnVentanPedido.setToolTipText("Menu de Pedidos");
        btnVentanPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentanPedidoActionPerformed(evt);
            }
        });
        panelBotones.add(btnVentanPedido);

        btnCatalogoPedido.setText("Catalogo");
        panelBotones.add(btnCatalogoPedido);

        btnMesasPedido.setText("Mesas");
        btnMesasPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesasPedidoActionPerformed(evt);
            }
        });
        panelBotones.add(btnMesasPedido);

        btnEmpleadosPedido.setText("Empleados");
        panelBotones.add(btnEmpleadosPedido);

        getContentPane().add(panelBotones);

        jMenu.setText("Sistema");

        jMenuItem1.setText("Acerca de...");
        jMenu.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItem2);

        jMenuBar1.add(jMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVentanPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentanPedidoActionPerformed
        // TODO add your handling code here:

        if(VentanaPedidos.isBandera())
        {
            VentanaPedidos vp = new VentanaPedidos();
            vp.setVisible(true);  
        }
        
    }//GEN-LAST:event_btnVentanPedidoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnMesasPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesasPedidoActionPerformed
        VentanaMesas vm = new VentanaMesas();
        vm.setVisible(true);
    }//GEN-LAST:event_btnMesasPedidoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCatalogoPedido;
    private javax.swing.JButton btnEmpleadosPedido;
    private javax.swing.JButton btnMesasPedido;
    private javax.swing.JButton btnVentanPedido;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelAyuda;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JTextArea txtAyuda;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setControlador(ControladorRegistrarPedido control) 
    {
        control.setVentana(this);
    }
}
