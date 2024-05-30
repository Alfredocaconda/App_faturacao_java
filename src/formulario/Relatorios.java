/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import Control.Clogin;
import Control.Cvenda;
import Modal.Mvenda;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TEODORO
 */
public class Relatorios extends javax.swing.JFrame {

    /**
     * Creates new form Devolucao
     */
    String cargo;
    public Relatorios() {
        initComponents();
         Clogin l = new Clogin();
        
        cargo = l.recuprarValor(2);
        pesquisar("", "", "");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtpesquisar = new rojeru_san.RSMTextFull();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbfatura = new javax.swing.JTable();
        rSButtonRiple1 = new rojeru_san.RSButtonRiple();
        datade = new com.toedter.calendar.JDateChooser();
        datapara = new com.toedter.calendar.JDateChooser();
        rSButtonRiple2 = new rojeru_san.RSButtonRiple();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(52, 58, 115));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
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

        jLabel2.setFont(new java.awt.Font("Bauhaus 93", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RELATÓRIO");

        jPanel6.setBackground(new java.awt.Color(52, 58, 115));

        txtpesquisar.setPlaceholder("PESQUISAR");
        txtpesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpesquisarKeyReleased(evt);
            }
        });

        tbfatura.setModel(new javax.swing.table.DefaultTableModel(
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
        tbfatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbfaturaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbfatura);
        if (tbfatura.getColumnModel().getColumnCount() > 0) {
            tbfatura.getColumnModel().getColumn(0).setMinWidth(70);
            tbfatura.getColumnModel().getColumn(0).setPreferredWidth(70);
            tbfatura.getColumnModel().getColumn(0).setMaxWidth(70);
            tbfatura.getColumnModel().getColumn(1).setMinWidth(50);
            tbfatura.getColumnModel().getColumn(1).setPreferredWidth(50);
            tbfatura.getColumnModel().getColumn(1).setMaxWidth(50);
        }

        rSButtonRiple1.setText("Buscar");
        rSButtonRiple1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple1ActionPerformed(evt);
            }
        });

        datade.setBackground(new java.awt.Color(52, 58, 115));
        datade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "De", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ink Free", 1, 14))); // NOI18N
        datade.setForeground(new java.awt.Color(255, 255, 255));
        datade.setFont(new java.awt.Font("Bauhaus 93", 0, 10)); // NOI18N

        datapara.setBackground(new java.awt.Color(52, 58, 115));
        datapara.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Para", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ink Free", 1, 14))); // NOI18N
        datapara.setForeground(new java.awt.Color(255, 255, 255));
        datapara.setFont(new java.awt.Font("Bauhaus 93", 0, 14)); // NOI18N

        rSButtonRiple2.setText("Imprimir");
        rSButtonRiple2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(datade, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(datapara, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rSButtonRiple1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rSButtonRiple2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(datade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datapara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap(35, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSButtonRiple1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSButtonRiple2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    String id;
    int quantida;
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       
        if (cargo.equalsIgnoreCase("Gerente")) {
            new Principal().setVisible(true);
            this.dispose();
        } else {
            new Login().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void rSButtonRiple2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple2ActionPerformed
        resultadodapesquisa(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonRiple2ActionPerformed

    private void rSButtonRiple1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple1ActionPerformed
        // TODO add your handling code here:
        resultadodapesquisa(1);
    }//GEN-LAST:event_rSButtonRiple1ActionPerformed

    private void tbfaturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbfaturaMouseClicked
        // TODO add your handling code here:
//        id = (String) tbfatura.getValueAt(tbfatura.getSelectedRow(), 0);
//        if (evt.getClickCount() == 2) {
//            Object[] recebe = {"SIM", "NÃO"};//declaramos uma vetor objecto que vai armazenar os itens selecionado
//            int n = (int) JOptionPane.showOptionDialog(this, "DESEJA APAGAR ESTE REGISTRO?", "AVISO",
//                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, recebe, recebe[1]);
//            if (n == 0) {
//
//                apagar();
//            }
//        }
    }//GEN-LAST:event_tbfaturaMouseClicked

    private void txtpesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesquisarKeyReleased
        // TODO add your handling code here:
        //        pesquisar(txtpesquisar.getText());
        resultadodapesquisa(1);
    }//GEN-LAST:event_txtpesquisarKeyReleased

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
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser datade;
    private com.toedter.calendar.JDateChooser datapara;
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private rojeru_san.RSButtonRiple rSButtonRiple1;
    private rojeru_san.RSButtonRiple rSButtonRiple2;
    private javax.swing.JTable tbfatura;
    private rojeru_san.RSMTextFull txtpesquisar;
    // End of variables declaration//GEN-END:variables

    private void pesquisar(String pesquisar,String datae,String datap) {
        Cvenda f = new Cvenda();
        DefaultTableModel dt = (DefaultTableModel) tbfatura.getModel();
        Object[] recebe = {"CODIGO", "NOME","PREÇO", "QUANTIDADE", "TOTAL","DATA","FUNCIONARIO"};
        dt.setColumnIdentifiers(recebe);
        dt.setNumRows(0);
        for (Modal.Mvews m : f.relatorio(pesquisar,datae,datap)) {
            Object[] dado = {m.getCodigov(), m.getNome() 
                    + " " + m.getDescricao() + " " + m.getCategoria(),m.getPreco(), 
                    m.getQuantidade(), m.getTotalcompra(),m.getDatavenda(),m.getNomef()};
            dt.addRow(dado);
        }
    }

    private void apagar() {
        Modal.Mvenda md = new Mvenda();//instanciamos a modal
        int codigov = Integer.valueOf((String) tbfatura.getValueAt(tbfatura.getSelectedRow(), 0));
        int codigop = Integer.valueOf((String) tbfatura.getValueAt(tbfatura.getSelectedRow(), 1));
        String qtd = (String) tbfatura.getValueAt(tbfatura.getSelectedRow(), 3);
        md.setCodigo((""+codigov));
        md.setIdproduto(codigop+"");
        md.setQuantidaderequerida(qtd);
        Cvenda cd = new Cvenda();//instanciamos a control
        cd.delete(md);//chamamos o medoto delete que esta na control desmobilizado
         pesquisar(txtpesquisar.getText(),"","");

    }

    private String  buscarData(Date data) {
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
        return f.format( data);
    }

    private void resultadodapesquisa(int i) {
        
String datad,datapar,pesquisar;
        datad=buscarData(datade.getDate());
        datapar=buscarData(datapara.getDate());
        pesquisar=txtpesquisar.getText();
        if (i==0) {
            new Cvenda().impressaoDeRelatorio(pesquisar, datad,datapar);
        } else {
        pesquisar(pesquisar, datad, datapar);        
        }
        
    }
}
