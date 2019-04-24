/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.ui;

import java.awt.event.WindowEvent;

/**
 *
 * @author gichu
 */
public class Pedidos_cliente extends javax.swing.JFrame {

    /**
     * Creates new form Pedidos_cliente
     */
    public Pedidos_cliente() {
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

        jPanel1 = new javax.swing.JPanel();
        jlbl_fecha = new javax.swing.JLabel();
        jlbl_nombre = new javax.swing.JLabel();
        jlbl_apellido = new javax.swing.JLabel();
        jlbl_direccion = new javax.swing.JLabel();
        jlbl_cuil = new javax.swing.JLabel();
        jlbl_telefono = new javax.swing.JLabel();
        jlbl_coccion = new javax.swing.JLabel();
        jlbl_tamaño = new javax.swing.JLabel();
        jlbl_ingredientes = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jchk_parmesano = new javax.swing.JCheckBox();
        jchk_muzzarela = new javax.swing.JCheckBox();
        jchk_tomC = new javax.swing.JCheckBox();
        jchk_tomate = new javax.swing.JCheckBox();
        jchk_sardinas = new javax.swing.JCheckBox();
        jchk_mRojo = new javax.swing.JCheckBox();
        jchk_mVerde = new javax.swing.JCheckBox();
        jchk_oregano = new javax.swing.JCheckBox();
        jchk_palmito = new javax.swing.JCheckBox();
        jchk_pinia = new javax.swing.JCheckBox();
        jchk_huevo = new javax.swing.JCheckBox();
        jchk_cebolla = new javax.swing.JCheckBox();
        jchk_salame = new javax.swing.JCheckBox();
        jchk_pepperoni = new javax.swing.JCheckBox();
        jchk_aceituna = new javax.swing.JCheckBox();
        jlbl_precio = new javax.swing.JLabel();
        jlbl_tiempo = new javax.swing.JLabel();
        jchk_sTacc = new javax.swing.JCheckBox();
        jchk_pago = new javax.swing.JCheckBox();
        jtxt_nombre = new javax.swing.JTextField();
        jtxt_apellido = new javax.swing.JTextField();
        jtxt_direccion = new javax.swing.JTextField();
        jtxt_cuil = new javax.swing.JTextField();
        jcmx_coccion = new javax.swing.JComboBox<>();
        jcmx_tamaño = new javax.swing.JComboBox<>();
        jbtn_aceptar = new javax.swing.JButton();
        jbtn_cancelar = new javax.swing.JButton();
        jtxt_telefono = new javax.swing.JTextField();
        jfmf_fecha = new javax.swing.JFormattedTextField();
        jfmf_precio = new javax.swing.JFormattedTextField();
        jfmf_tiempo = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jtxt_monto1 = new javax.swing.JTextField();
        jlbl_monto1 = new javax.swing.JLabel();
        jlbl_pago1 = new javax.swing.JLabel();
        jcmx_pago1 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jlbl_pago2 = new javax.swing.JLabel();
        jcmx_pago2 = new javax.swing.JComboBox<>();
        jtxt_monto2 = new javax.swing.JTextField();
        jlbl_monto2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jlbl_fecha.setText("Ingrese Fecha:");

        jlbl_nombre.setText("Nombre:");

        jlbl_apellido.setText("Apellido:");

        jlbl_direccion.setText("Dirección:");

        jlbl_cuil.setText("Cuil:");

        jlbl_telefono.setText("Teléfono:");

        jlbl_coccion.setText("Seleccione tipo de Pizza s/ cocción:");

        jlbl_tamaño.setText("Seleccione Tamaño:");

        jlbl_ingredientes.setText("Seleccione Ingredientes:");

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jchk_parmesano.setBackground(new java.awt.Color(153, 255, 153));
        jchk_parmesano.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jchk_parmesano.setText("Queso Parmesano");
        jchk_parmesano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchk_parmesanoActionPerformed(evt);
            }
        });

        jchk_muzzarela.setBackground(new java.awt.Color(153, 255, 153));
        jchk_muzzarela.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jchk_muzzarela.setText("Queso Muzzarela");

        jchk_tomC.setBackground(new java.awt.Color(153, 255, 153));
        jchk_tomC.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jchk_tomC.setText("Tomate Cherry");

        jchk_tomate.setBackground(new java.awt.Color(153, 255, 153));
        jchk_tomate.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jchk_tomate.setText("Tomate");

        jchk_sardinas.setBackground(new java.awt.Color(153, 255, 153));
        jchk_sardinas.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jchk_sardinas.setText("Sardinas");

        jchk_mRojo.setBackground(new java.awt.Color(153, 255, 153));
        jchk_mRojo.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jchk_mRojo.setText("Morrón Rojo");

        jchk_mVerde.setBackground(new java.awt.Color(153, 255, 153));
        jchk_mVerde.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jchk_mVerde.setText("Morrón Verde");

        jchk_oregano.setBackground(new java.awt.Color(153, 255, 153));
        jchk_oregano.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jchk_oregano.setText("Orégano");

        jchk_palmito.setBackground(new java.awt.Color(153, 255, 153));
        jchk_palmito.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jchk_palmito.setText("Palmito");

        jchk_pinia.setBackground(new java.awt.Color(153, 255, 153));
        jchk_pinia.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jchk_pinia.setText("Piña");

        jchk_huevo.setBackground(new java.awt.Color(153, 255, 153));
        jchk_huevo.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jchk_huevo.setText("Huevo");

        jchk_cebolla.setBackground(new java.awt.Color(153, 255, 153));
        jchk_cebolla.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jchk_cebolla.setText("Cebolla");

        jchk_salame.setBackground(new java.awt.Color(153, 255, 153));
        jchk_salame.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jchk_salame.setText("Salame");

        jchk_pepperoni.setBackground(new java.awt.Color(153, 255, 153));
        jchk_pepperoni.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jchk_pepperoni.setText("Pepperoni");

        jchk_aceituna.setBackground(new java.awt.Color(153, 255, 153));
        jchk_aceituna.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jchk_aceituna.setText("Aceituna");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jchk_parmesano)
                    .addComponent(jchk_muzzarela)
                    .addComponent(jchk_tomC)
                    .addComponent(jchk_tomate)
                    .addComponent(jchk_sardinas))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jchk_mRojo)
                    .addComponent(jchk_palmito)
                    .addComponent(jchk_oregano)
                    .addComponent(jchk_mVerde)
                    .addComponent(jchk_pinia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jchk_huevo)
                    .addComponent(jchk_cebolla)
                    .addComponent(jchk_salame)
                    .addComponent(jchk_pepperoni)
                    .addComponent(jchk_aceituna))
                .addGap(90, 90, 90))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jchk_parmesano)
                    .addComponent(jchk_mRojo)
                    .addComponent(jchk_huevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jchk_muzzarela)
                    .addComponent(jchk_mVerde)
                    .addComponent(jchk_cebolla))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jchk_tomC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jchk_tomate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jchk_sardinas))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jchk_oregano)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jchk_palmito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jchk_pinia))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jchk_salame)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jchk_pepperoni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jchk_aceituna)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jlbl_precio.setText("Precio:");

        jlbl_tiempo.setText("Tiempo Estimado de Espera:");

        jchk_sTacc.setText("Sin Tacc");
        jchk_sTacc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jchk_pago.setText("¿Un sólo pago?");

        jcmx_coccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A la piedra", "A la parrilla", "De molde" }));

        jcmx_tamaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8 porciones", "10 porciones", "12 porciones" }));

        jbtn_aceptar.setText("Aceptar");
        jbtn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_aceptarActionPerformed(evt);
            }
        });

        jbtn_cancelar.setText("Cancelar");
        jbtn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_cancelarActionPerformed(evt);
            }
        });

        jfmf_fecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jfmf_precio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("$"))));

        jfmf_tiempo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance())));

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        jlbl_monto1.setText("Monto a pagar:");

        jlbl_pago1.setText("Forma de Pago:");

        jcmx_pago1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta de débito", "Tarjeta de crédito", "Cheque" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jlbl_monto1)
                        .addGap(18, 18, 18)
                        .addComponent(jtxt_monto1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jlbl_pago1)
                        .addGap(18, 18, 18)
                        .addComponent(jcmx_pago1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_monto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_monto1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_pago1)
                    .addComponent(jcmx_pago1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jlbl_pago2.setText("Forma de Pago:");

        jcmx_pago2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta de débito", "Tarjeta de crédito", "Cheque" }));

        jlbl_monto2.setText("Monto a Pagar:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_monto2)
                    .addComponent(jlbl_pago2))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jcmx_pago2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jtxt_monto2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_monto2)
                    .addComponent(jtxt_monto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_pago2)
                    .addComponent(jcmx_pago2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtn_aceptar)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn_cancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlbl_ingredientes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jchk_sTacc))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jchk_pago)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlbl_precio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jfmf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(jlbl_tiempo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jfmf_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlbl_cuil)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jtxt_cuil, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jlbl_telefono)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jtxt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jlbl_fecha)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jfmf_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jlbl_coccion, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jlbl_tamaño, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jcmx_coccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jcmx_tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jlbl_nombre)
                                                .addGap(18, 18, 18)
                                                .addComponent(jtxt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jlbl_apellido)))
                                        .addGap(18, 18, 18)
                                        .addComponent(jtxt_apellido))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlbl_direccion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtxt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jfmf_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_fecha))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_nombre)
                    .addComponent(jlbl_apellido)
                    .addComponent(jtxt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_direccion)
                    .addComponent(jtxt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlbl_cuil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbl_telefono)
                            .addComponent(jtxt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbl_coccion)
                            .addComponent(jcmx_coccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbl_tamaño)
                            .addComponent(jcmx_tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbl_ingredientes)
                            .addComponent(jchk_sTacc)))
                    .addComponent(jtxt_cuil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_precio)
                    .addComponent(jlbl_tiempo)
                    .addComponent(jfmf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jfmf_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jchk_pago)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_aceptar)
                    .addComponent(jbtn_cancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jchk_parmesanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchk_parmesanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jchk_parmesanoActionPerformed

    private void jbtn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_cancelarActionPerformed
        this.dispatchEvent(new WindowEvent (this, WindowEvent.WINDOW_CLOSING));
        
    }//GEN-LAST:event_jbtn_cancelarActionPerformed

    private void jbtn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_aceptarActionPerformed
        
        
        
        
     
    }//GEN-LAST:event_jbtn_aceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Pedidos_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pedidos_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pedidos_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pedidos_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pedidos_cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbtn_aceptar;
    private javax.swing.JButton jbtn_cancelar;
    private javax.swing.JCheckBox jchk_aceituna;
    private javax.swing.JCheckBox jchk_cebolla;
    private javax.swing.JCheckBox jchk_huevo;
    private javax.swing.JCheckBox jchk_mRojo;
    private javax.swing.JCheckBox jchk_mVerde;
    private javax.swing.JCheckBox jchk_muzzarela;
    private javax.swing.JCheckBox jchk_oregano;
    private javax.swing.JCheckBox jchk_pago;
    private javax.swing.JCheckBox jchk_palmito;
    private javax.swing.JCheckBox jchk_parmesano;
    private javax.swing.JCheckBox jchk_pepperoni;
    private javax.swing.JCheckBox jchk_pinia;
    private javax.swing.JCheckBox jchk_sTacc;
    private javax.swing.JCheckBox jchk_salame;
    private javax.swing.JCheckBox jchk_sardinas;
    private javax.swing.JCheckBox jchk_tomC;
    private javax.swing.JCheckBox jchk_tomate;
    private javax.swing.JComboBox<String> jcmx_coccion;
    private javax.swing.JComboBox<String> jcmx_pago1;
    private javax.swing.JComboBox<String> jcmx_pago2;
    private javax.swing.JComboBox<String> jcmx_tamaño;
    private javax.swing.JFormattedTextField jfmf_fecha;
    private javax.swing.JFormattedTextField jfmf_precio;
    private javax.swing.JFormattedTextField jfmf_tiempo;
    private javax.swing.JLabel jlbl_apellido;
    private javax.swing.JLabel jlbl_coccion;
    private javax.swing.JLabel jlbl_cuil;
    private javax.swing.JLabel jlbl_direccion;
    private javax.swing.JLabel jlbl_fecha;
    private javax.swing.JLabel jlbl_ingredientes;
    private javax.swing.JLabel jlbl_monto1;
    private javax.swing.JLabel jlbl_monto2;
    private javax.swing.JLabel jlbl_nombre;
    private javax.swing.JLabel jlbl_pago1;
    private javax.swing.JLabel jlbl_pago2;
    private javax.swing.JLabel jlbl_precio;
    private javax.swing.JLabel jlbl_tamaño;
    private javax.swing.JLabel jlbl_telefono;
    private javax.swing.JLabel jlbl_tiempo;
    private javax.swing.JTextField jtxt_apellido;
    private javax.swing.JTextField jtxt_cuil;
    private javax.swing.JTextField jtxt_direccion;
    private javax.swing.JTextField jtxt_monto1;
    private javax.swing.JTextField jtxt_monto2;
    private javax.swing.JTextField jtxt_nombre;
    private javax.swing.JTextField jtxt_telefono;
    // End of variables declaration//GEN-END:variables
}