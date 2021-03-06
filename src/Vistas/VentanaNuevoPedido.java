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
import Modelo.Producto;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 17
 */
public class VentanaNuevoPedido extends javax.swing.JDialog implements IVentanaPedido
{

    private DefaultTableModel modeloCatalogo;
    private DefaultTableModel modeloPedido;
    private ControladorRegistrarPedido controlador;
    
    public VentanaNuevoPedido(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        controlador = new ControladorRegistrarPedido(new NegocioMySQL());
        setControlador(controlador);
        
        initComponents();
        comboMesas.setModel(new DefaultComboBoxModel(controlador.cargarComboMesas()));
        comboMozos.setModel(new DefaultComboBoxModel(controlador.cargarComboMozos()));
        
        setModeloTablaCatalogo();
        setModeloTablaPedido();
        iniciarTablCatalogo();
        
        tablaCatalogo.setComponentPopupMenu(menuTablaCatalogo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuTablaCatalogo = new javax.swing.JPopupMenu();
        btnAgregarProducto = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFiltrar = new javax.swing.JTextField();
        btnConfirmarPedido = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        comboMesas = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCatalogo = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPedido = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        comboMozos = new javax.swing.JComboBox<>();
        btnFiltrar = new javax.swing.JButton();

        btnAgregarProducto.setText("Agregar Producto");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });
        menuTablaCatalogo.add(btnAgregarProducto);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nuevo Pedido");

        jLabel2.setText("Filtrar:");

        btnConfirmarPedido.setText("Confirmar Pedido");
        btnConfirmarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarPedidoActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel3.setText("Seleccionar Mesa: ");

        comboMesas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMesasActionPerformed(evt);
            }
        });

        tablaCatalogo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Producto", "Precio"
            }
        ));
        jScrollPane1.setViewportView(tablaCatalogo);

        jScrollPane3.setViewportView(jScrollPane1);

        tablaPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "SubTotal"
            }
        ));
        jScrollPane2.setViewportView(tablaPedido);

        jScrollPane4.setViewportView(jScrollPane2);

        jLabel4.setText("Selecionar Mozo:");

        comboMozos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(btnFiltrar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(comboMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(comboMozos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnConfirmarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel1)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboMozos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(comboMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrar))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmarPedido)
                    .addComponent(btnCancelar))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        // TODO add your handling code here:
        int row = tablaCatalogo.getSelectedRow();
        int cantidad = Integer.valueOf(JOptionPane.showInputDialog(this, "Cantidad: "));
        String nombreProducto = getNombreProducto(row);
        double precioProducto = getPrecioProducto(row);
        
        agregarFilaTablaPedido(nombreProducto, cantidad, cantidad * precioProducto);
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void comboMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMesasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMesasActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfirmarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarPedidoActionPerformed
        // TODO add your handling code here:
        double total = 0;
        int row = tablaPedido.getRowCount();
        for(int i = 0; i < row; i++) 
            {
                total += getSubtotal(i);
            }
        System.out.println(total);
        dispose();
    }//GEN-LAST:event_btnConfirmarPedidoActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        // TODO add your handling code here:
        
        filtrarTablaCatlogo();
        
    }//GEN-LAST:event_btnFiltrarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnAgregarProducto;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmarPedido;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JComboBox<String> comboMesas;
    private javax.swing.JComboBox<String> comboMozos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu menuTablaCatalogo;
    private javax.swing.JTable tablaCatalogo;
    private javax.swing.JTable tablaPedido;
    private javax.swing.JTextField txtFiltrar;
    // End of variables declaration//GEN-END:variables

    public void setModeloTablaCatalogo()
    {
        String[] columnas = {
            "Id", "Producto", "Precio", "Agregado"
        };
        final Class[] columnClass = new Class[] 
        {
            Integer.class,String.class, Double.class, Boolean.class
        };
        modeloCatalogo = new DefaultTableModel(null, columnas) 
        {
            @Override
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }
            @Override
            public Class<?> getColumnClass(int columnIndex)
            {
                return columnClass[columnIndex];
            }
        };
        tablaCatalogo.setModel(modeloCatalogo);
    }
    
    public void limpiarTablaCatalogo()
    {
        DefaultTableModel model = (DefaultTableModel) tablaCatalogo.getModel();
        model.setRowCount(0);
    }
    public void setModeloTablaPedido()
    {
        String[] columnas = {
            "Producto", "Cantidad", "Subtotal"
        };
        final Class[] columnClass = new Class[] 
        {
           String.class, Integer.class, Double.class
        };
        modeloPedido = new DefaultTableModel(null, columnas) 
        {
            @Override
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }
            @Override
            public Class<?> getColumnClass(int columnIndex)
            {
                return columnClass[columnIndex];
            }
        };
        tablaPedido.setModel(modeloPedido);
    }
    
    
    
    public void iniciarTablCatalogo()
    {
        for(Producto p: controlador.getProductos())
        {
            modeloCatalogo.addRow(new Object[]{p.getId(),p.getDescripcion(),p.getPrecio(),p.isEsAgregado()});
        }
    }

    public void filtrarTablaCatlogo()
    {
        limpiarTablaCatalogo();
        String filtro = txtFiltrar.getText();
        for(Producto p: controlador.getProductos())
        {
            if(p.getDescripcion().contains(filtro))
                modeloCatalogo.addRow(new Object[]{p.getId(),p.getDescripcion(),p.getPrecio(),p.isEsAgregado()});
        }
    }
    public void agregarFilaTablaPedido(String producto,int cantidad,double subTotal)
    {
        modeloPedido.addRow(new Object[]{producto,cantidad,subTotal});
    }
    
     
    private void removeCurrentRowTablaPedido() {
        int selectedRow = tablaPedido.getSelectedRow();
        modeloCatalogo.removeRow(selectedRow);
    }
    private String getNombreProducto(int row)
    {
        return tablaCatalogo.getValueAt(row, 1).toString();
    }
    private double getPrecioProducto(int row)
    {
        return (double) tablaCatalogo.getValueAt(row, 2);
    }
    private double getSubtotal(int row)
    {
        return (double) tablaPedido.getValueAt(row, 2);
    }

    @Override
    public void setControlador(ControladorRegistrarPedido control) 
    {
        control.setVentana(this);
    }
}
