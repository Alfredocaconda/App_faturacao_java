/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import Control.Cstock;
import Control.Clogin;
import Modal.Mentrada;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TEODORO
 */
public class Stock extends javax.swing.JFrame {

    String idf;

    /**
     * Creates new form entrada
     */
    public Stock() {
        initComponents();
        btnquantidade.setVisible(false);
        pesquisar("");
        pesquisar2("");
        total_compra();
        total_venda();
        idf = new Clogin().recuprarValor(0);
    }
    String idproduto;

    public Stock(String id, String nome, String descricao, String categoria) {
        initComponents();
        idproduto = id;
        txtnome.setText(nome + " " + descricao + " " + categoria);
        btnquantidade.setVisible(false);
        pesquisar("");
        pesquisar2("");
        total_compra();
        total_venda();
        idf = new Clogin().recuprarValor(0);
        txtcompra.requestFocus();

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
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnsalvar = new rojeru_san.RSButton();
        btnentrada = new rojeru_san.RSButton();
        txtnome = new rojeru_san.RSMTextFull();
        txtcompra = new rojeru_san.RSMTextFull();
        txtquantidade = new rojeru_san.RSMTextFull();
        txtcaducidade = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        txtbarra = new rojeru_san.RSMTextFull();
        txtvenda = new rojeru_san.RSMTextFull();
        btnquantidade = new rojeru_san.RSButton();
        txtpesquisar = new rojeru_san.RSMTextFull();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbvenda = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbcompra = new javax.swing.JTable();
        lblucros = new javax.swing.JLabel();
        lbvenda = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(52, 58, 115));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/left.png"))); // NOI18N
        jLabel3.setText("VOLTAR");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(52, 58, 115));

        btnsalvar.setBackground(new java.awt.Color(255, 102, 0));
        btnsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/salvar.png"))); // NOI18N
        btnsalvar.setText("GUARDAR");
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });

        btnentrada.setBackground(new java.awt.Color(255, 102, 0));
        btnentrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/entrada.png"))); // NOI18N
        btnentrada.setText("ENTRADA DO P");
        btnentrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnentradaActionPerformed(evt);
            }
        });

        txtnome.setEnabled(false);
        txtnome.setPlaceholder("NOME DO PRODUTO");
        txtnome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnomeKeyPressed(evt);
            }
        });

        txtcompra.setPlaceholder("PREÇO DA COMPRA");
        txtcompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcompraKeyPressed(evt);
            }
        });

        txtquantidade.setPlaceholder("QUANTIDADE");
        txtquantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtquantidadeKeyPressed(evt);
            }
        });

        try {
            txtcaducidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtcaducidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcaducidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtcaducidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcaducidadeMouseClicked(evt);
            }
        });
        txtcaducidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcaducidadeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CADUCIDADE");

        txtbarra.setPlaceholder("CÓDIGO DE BARRA");

        txtvenda.setPlaceholder("PREÇO DA VENDA");
        txtvenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtvendaKeyPressed(evt);
            }
        });

        btnquantidade.setBackground(new java.awt.Color(255, 102, 0));
        btnquantidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/salvar.png"))); // NOI18N
        btnquantidade.setText("ACTUALIZAR");
        btnquantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquantidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnquantidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsalvar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnentrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtnome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtcompra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtquantidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtvenda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtbarra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtcaducidade, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtcompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtvenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtbarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtcaducidade, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnentrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtpesquisar.setPlaceholder("PESQUISAR");
        txtpesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpesquisarKeyReleased(evt);
            }
        });

        tbvenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbvenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbvendaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbvenda);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("ENTRADA DE PRODUTO");

        tbcompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbcompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbcompraMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbcompra);

        lblucros.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblucros.setText("LUCRO");

        lbvenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbvenda.setText("LUCRO");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("TABELA DE VENDA");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("TABELA DE COMPRA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(296, 296, 296)
                                .addComponent(jLabel1)
                                .addContainerGap(165, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lbvenda, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblucros, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtpesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblucros)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbvenda)
                        .addGap(39, 39, 39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtcaducidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcaducidadeMouseClicked
        txtcaducidade.setText(buscardata());
    }//GEN-LAST:event_txtcaducidadeMouseClicked

    private void txtpesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesquisarKeyReleased
        // TODO add your handling code here:
        pesquisar(txtpesquisar.getText());
    }//GEN-LAST:event_txtpesquisarKeyReleased
    int id, qtd = 0, control = 0;
    private void tbvendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbvendaMouseClicked
        // TODO add your handling code here:
        id = (int) tbvenda.getValueAt(tbvenda.getSelectedRow(), 0);
        if (evt.getClickCount() == 2) {
            Object[] recebe = {"EDITAR", "Cancelar"};//declaramos uma vetor objecto que vai armazenar os itens selecionado
            int n = (int) JOptionPane.showOptionDialog(this, "O QUE DESEJA?", "AVISO",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, recebe, recebe);

            if (n == 0) {
                txtnome.setText((String) tbvenda.getValueAt(tbvenda.getSelectedRow(), 1));
                String p = (String) tbvenda.getValueAt(tbvenda.getSelectedRow(), 2);
                txtcompra.setText("" + p.substring(0, p.indexOf(" ")));//para eliminar a palavra da String kz e adiciona o vazio
                int quantidade = (int) tbvenda.getValueAt(tbvenda.getSelectedRow(), 4);
                txtquantidade.setText("" + quantidade);
                txtcompra.requestFocus();
                String valor_venda = (String) tbvenda.getValueAt(tbvenda.getSelectedRow(), 3);
                txtvenda.setText("" + valor_venda.substring(0, p.indexOf(" ")));//para eliminar a palavra da String kz e adiciona o vazio
                String barra = (String) tbvenda.getValueAt(tbvenda.getSelectedRow(), 5);
                txtbarra.setText(barra);
                String data = (String) tbvenda.getValueAt(tbvenda.getSelectedRow(), 7);
                txtcaducidade.setText("" + data.replace('-', '/'));
                control = 1;
                btnsalvar.setVisible(true);
                btnquantidade.setVisible(false);
            }

        }
    }//GEN-LAST:event_tbvendaMouseClicked

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        // TODO add your handling code here:
        salvar();
        pesquisar("");
    }//GEN-LAST:event_btnsalvarActionPerformed

    private void btnentradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnentradaActionPerformed
        // TODO add your handling code here:
        new Produto().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnentradaActionPerformed

    private void txtcaducidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcaducidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcaducidadeActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        new Principal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void txtnomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeKeyPressed

    private void txtcompraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcompraKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 10) {
            txtquantidade.requestFocus();
        }
    }//GEN-LAST:event_txtcompraKeyPressed

    private void txtvendaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtvendaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 10) {
            txtbarra.requestFocus();
        }

    }//GEN-LAST:event_txtvendaKeyPressed

    private void txtquantidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtquantidadeKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 10) {
            txtvenda.requestFocus();
        }
    }//GEN-LAST:event_txtquantidadeKeyPressed

    private void tbcompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbcompraMouseClicked
        // TODO add your handling code here:
        id = (int) tbcompra.getValueAt(tbcompra.getSelectedRow(), 0);
        if (evt.getClickCount() == 2) {
            Object[] recebe = {"AUMENTAR A QUANTIDADE", "CANCELAR"};//declaramos uma vetor objecto que vai armazenar os itens selecionado
            int n = (int) JOptionPane.showOptionDialog(this, "O QUE DESEJA?", "AVISO",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, recebe, recebe);
            if (n == 0) {
                txtnome.setText((String) tbcompra.getValueAt(tbcompra.getSelectedRow(), 1));
                String p = (String) tbcompra.getValueAt(tbcompra.getSelectedRow(), 2);
                txtcompra.setText("" + p.substring(0, p.indexOf(" ")));//para eliminar a palavra da String kz e adiciona o vazio
                qtd = (int) tbcompra.getValueAt(tbcompra.getSelectedRow(), 3);
                txtquantidade.setText("");
                txtquantidade.requestFocus();
                String data = (String) tbcompra.getValueAt(tbcompra.getSelectedRow(), 5);
                txtcaducidade.setText("" + data.replace('-', '/'));
                txtcaducidade.setEnabled(false);
                txtcompra.setEnabled(false);
                txtvenda.setEnabled(false);
                txtbarra.setEnabled(false);
                btnsalvar.setVisible(false);
                btnquantidade.setVisible(true);
            }
        }

    }//GEN-LAST:event_tbcompraMouseClicked

    private void btnquantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquantidadeActionPerformed
        // TODO add your handling code here:
        actualizar_compra();
    }//GEN-LAST:event_btnquantidadeActionPerformed

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
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButton btnentrada;
    private rojeru_san.RSButton btnquantidade;
    private rojeru_san.RSButton btnsalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblucros;
    private javax.swing.JLabel lbvenda;
    private javax.swing.JTable tbcompra;
    private javax.swing.JTable tbvenda;
    private rojeru_san.RSMTextFull txtbarra;
    private javax.swing.JFormattedTextField txtcaducidade;
    private rojeru_san.RSMTextFull txtcompra;
    private rojeru_san.RSMTextFull txtnome;
    private rojeru_san.RSMTextFull txtpesquisar;
    private rojeru_san.RSMTextFull txtquantidade;
    private rojeru_san.RSMTextFull txtvenda;
    // End of variables declaration//GEN-END:variables

    public int pesquisar2(String pesquisar) {
        int qtdstock = 0;
        Cstock f = new Cstock();
        DefaultTableModel dt = (DefaultTableModel) tbcompra.getModel();
        Object[] recebe = {"CODIGO", "NOME/DESCRIÇÃO/CATEGORIA", "VALOR DA COMPRA", "QUANTIDADE", "DATA DE ENTRADA",
            "CADUCIDADE"};
        dt.setColumnIdentifiers(recebe);
        dt.setNumRows(0);
        for (Mentrada m : f.pesquisar(pesquisar)) {
            Object[] dado = {m.getCodigo(), m.getProduto(), m.getPreco_compra() + " KZ", m.getQuantidade(),
                m.getDataEntrada(), m.getCaducidade()};
            dt.addRow(dado);
            if (m.getQuantidade() > 0) {
                qtdstock++;
            }

        }
        return qtdstock;
    }

    public void total_compra() {
        double luc = 0;
        Cstock f = new Cstock();
        for (Mentrada m : f.total_compra()) {
            DecimalFormat formato = new DecimalFormat("#,###.##");
            lblucros.setText("TOTAL DA COMPRA : " + formato.format(m.getPreco_compra()) + " KZ");

        }
    }

    public void total_venda() {
        double luc = 0;
        Cstock f = new Cstock();
        for (Mentrada m : f.total_venda()) {
            // Formate o número
            DecimalFormat formato = new DecimalFormat("#,###.##");
            lbvenda.setText("TOTAL DA VENDA : " + formato.format(m.getPreco()) + " KZ");
        }
    }

    public int pesquisar(String pesquisar) {
        int qtdstock = 0;
        Cstock f = new Cstock();
        DefaultTableModel dt = (DefaultTableModel) tbvenda.getModel();
        Object[] recebe = {"CODIGO", "NOME/DESCRIÇÃO/CATEGORIA", "VALOR DA COMPRA", "VALOR DA VENDA", "QUANTIDADE", "CODIGO DE BARRA", "DATA DE ENTRADA",
            "CADUCIDADE"};
        dt.setColumnIdentifiers(recebe);
        dt.setNumRows(0);
        for (Mentrada m : f.pesquisar(pesquisar)) {
            Object[] dado = {m.getCodigo(), m.getProduto(), m.getPreco_compra() + " KZ", m.getPreco() + " KZ", m.getQuantidade(), m.getCodigo_barra(),
                m.getDataEntrada(), m.getCaducidade()};
            dt.addRow(dado);
            if (m.getQuantidade() > 0) {
                qtdstock++;
            }
        }
        return qtdstock;
    }

    public String buscardata() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return s.format(d);
    }

    private void actualizar_compra() {
        Mentrada e = new Mentrada();
        Cstock c = new Cstock();
        if (txtquantidade.getText().equals("")) {
            e.mensagem("POR FAVOR PRENCHE A QUANTIDADE");
        } else {
            int quantidade = Integer.valueOf(txtquantidade.getText());
            e.setQuantidade(quantidade + qtd);
            e.setCodigo(id);
            c.atualizarquantidade_stock(e);
            limpar();
            btnsalvar.setVisible(true);
            btnquantidade.setVisible(false);
        }
    }

    private void salvar() {
        Mentrada e = new Mentrada();
        Cstock c = new Cstock();
        String data = txtcaducidade.getText();
        if (txtcompra.getText().equals("") || txtquantidade.getText().equals("") || txtcaducidade.getText().equals("    /  /  ")) {
            e.mensagem("PRENCHA TODOS OS CAMPOS");
            txtcompra.requestFocus();
        } else {
            int quantidade = Integer.valueOf(txtquantidade.getText());
            double preco = Double.valueOf(txtvenda.getText());
            String barra = txtbarra.getText();
            double compra = Double.valueOf(txtcompra.getText());
            e.setDataEntrada(buscardata());
            e.setCaducidade(data);
            e.setPreco(preco);
            e.setCodigo_barra(barra);
            e.setFuncionario(idf);
            e.setQuantidade(quantidade);
            e.setPreco_compra(compra);
            double lucro = preco - compra;
            double pablo = lucro * quantidade;
            e.setLucro(pablo);
            if (control == 0) {
                e.setProduto(idproduto);
                c.salvar(e);
            } else {
                e.setCodigo(id);
                c.atualizar(e);
                txtcaducidade.setEnabled(true);
                txtcompra.setEnabled(true);
                txtvenda.setEnabled(true);
            }
            pesquisar("");
            pesquisar2("");
            btnsalvar.setVisible(false);
            btnquantidade.setVisible(true);
            txtcaducidade.setEnabled(true);
            txtcompra.setEnabled(true);
            txtvenda.setEnabled(true);
            txtbarra.setEnabled(true);
            txtcaducidade.setText("");
            txtnome.setText("");
            txtcompra.setText("");
            txtquantidade.setText("");
            txtbarra.setText("");
            txtvenda.setText("");
        }
    }

    private void limpar() {
        pesquisar("");
        pesquisar2("");
        txtcaducidade.setEnabled(true);
        txtcompra.setEnabled(true);
        txtvenda.setEnabled(true);
        txtbarra.setEnabled(true);
        txtcaducidade.setText("");
        txtnome.setText("");
        txtcompra.setText("");
        txtquantidade.setText("");
        txtbarra.setText("");
        txtvenda.setText("");
    }
}
