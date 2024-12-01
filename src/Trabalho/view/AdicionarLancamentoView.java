/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Trabalho.view;

import Trabalho.model.Categoria;
import Trabalho.model.Despesa;
import Trabalho.model.LancamentoController;
import Trabalho.model.Receita;
import Trabalho.model.TipoCategoria;
import java.awt.Color;
import java.time.DateTimeException;
import java.time.LocalDate;

/**
 *
 * @author Paulo Fontenele da Silva
 */
public class AdicionarLancamentoView extends javax.swing.JDialog {

    private LancamentosView parent;
    private LancamentoController controller;
    private TipoCategoria tipoCategoria;
    
    /**
     * Creates new form AdicionarLancamento
     */
    public AdicionarLancamentoView(LancamentoController controller, TipoCategoria tipoCategoria, java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.parent = (LancamentosView)parent;
        this.controller = controller;
        this.tipoCategoria = tipoCategoria;
        initComponents();
        switch(tipoCategoria){
            case DESPESA -> despesa();
            case RECEITA -> receita();
        }
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
        lbTitulo = new javax.swing.JLabel();
        lbTitulo1 = new javax.swing.JLabel();
        lbTitulo2 = new javax.swing.JLabel();
        lbTitulo3 = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        spValor = new javax.swing.JSpinner();
        tfData = new javax.swing.JFormattedTextField();
        cbCategoria = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lbTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lbTitulo.setText("Adicionar");

        lbTitulo1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbTitulo1.setForeground(new java.awt.Color(0, 0, 0));
        lbTitulo1.setText("R$");

        lbTitulo2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbTitulo2.setForeground(new java.awt.Color(0, 0, 0));
        lbTitulo2.setText("Data");

        lbTitulo3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbTitulo3.setForeground(new java.awt.Color(0, 0, 0));
        lbTitulo3.setText("Categoria");

        btnAdicionar.setBackground(new java.awt.Color(33, 33, 33));
        btnAdicionar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionar.setText("Adicionar");
        btnAdicionar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAdicionar.setBorderPainted(false);
        btnAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionar.setFocusPainted(false);
        btnAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdicionarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdicionarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAdicionarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAdicionarMouseReleased(evt);
            }
        });
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(225, 59, 59));
        btnCancelar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCancelar.setBorderPainted(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setFocusPainted(false);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCancelarMouseReleased(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        spValor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        spValor.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 0.5d));
        spValor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        try {
            tfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfData.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        cbCategoria.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbTitulo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTitulo1)
                                    .addComponent(lbTitulo3)
                                    .addComponent(lbTitulo2))
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfData)
                                    .addComponent(cbCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(spValor))))
                        .addGap(28, 28, 28))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbTitulo)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbTitulo1)
                    .addComponent(spValor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbTitulo2)
                        .addGap(18, 18, 18)
                        .addComponent(lbTitulo3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarMouseEntered
        btnAdicionar.setBackground(new Color(50, 50, 50));
    }//GEN-LAST:event_btnAdicionarMouseEntered

    private void btnAdicionarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarMouseExited
        btnAdicionar.setBackground(new Color(33, 33, 33));
    }//GEN-LAST:event_btnAdicionarMouseExited

    private void btnAdicionarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarMousePressed
        btnAdicionar.setBackground(new Color(80, 80, 80));
    }//GEN-LAST:event_btnAdicionarMousePressed

    private void btnAdicionarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarMouseReleased
        btnAdicionar.setBackground(new Color(33, 33, 33));
    }//GEN-LAST:event_btnAdicionarMouseReleased

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        
        Categoria categoria = null;
        
        for(Categoria c : controller.getCategorias()){
            if(c.getNome().equals((String)cbCategoria.getSelectedItem()) && c.getTipoCategoria().equals(this.tipoCategoria)){
                categoria = c;
            }
        }
        
        double valor = (double)spValor.getValue();
        
        if(valor == 0){
            AlertaGenericoView alerta = new AlertaGenericoView(null, true, "Informe um valor");
            alerta.setLocationRelativeTo(this);
            alerta.setVisible(true);
            return;
        }
        
        
        System.out.println(categoria.getNome() + "" + categoria.getTipoCategoria());
        
        LocalDate data = null;
        String[] dataTexto = tfData.getText().split("/");
        
        try{
            data = LocalDate.of(Integer.parseInt(dataTexto[2]), Integer.parseInt(dataTexto[1]), Integer.parseInt(dataTexto[0]));
        }catch(DateTimeException | NumberFormatException e){
            AlertaGenericoView alerta = new AlertaGenericoView(null, true, "Data inválida");
            alerta.setLocationRelativeTo(this);
            alerta.setVisible(true);
            return;
        }
        
        switch(tipoCategoria){
            case RECEITA -> controller.inserirLancamento(new Receita(valor, data, categoria));
            case DESPESA -> controller.inserirLancamento(new Despesa(valor, data, categoria));
        }
        
        parent.atualizarListas();
        parent.atualizarListaCategoria();
        this.dispose();
        
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        btnCancelar.setBackground(new Color(255, 100, 100));
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        btnCancelar.setBackground(new Color(255, 59, 59));
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMousePressed
        btnCancelar.setBackground(new Color(184, 40, 40));
    }//GEN-LAST:event_btnCancelarMousePressed

    private void btnCancelarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseReleased
        btnCancelar.setBackground(new Color(255, 59, 59));
    }//GEN-LAST:event_btnCancelarMouseReleased

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbTitulo1;
    private javax.swing.JLabel lbTitulo2;
    private javax.swing.JLabel lbTitulo3;
    private javax.swing.JSpinner spValor;
    private javax.swing.JFormattedTextField tfData;
    // End of variables declaration//GEN-END:variables

    private void despesa(){
        setTitle("Adicionar despesa");
        lbTitulo.setText("Adicionar despesa");
        for(Categoria categoria : controller.getCategorias()){
            if(categoria.getTipoCategoria() == TipoCategoria.DESPESA){
                cbCategoria.addItem(categoria.getNome());
            }
        }
    }
    
    private void receita(){
        setTitle("Adicionar receita");
        lbTitulo.setText("Adicionar receita");
        for(Categoria categoria : controller.getCategorias()){
            if(categoria.getTipoCategoria() == TipoCategoria.RECEITA){
                cbCategoria.addItem(categoria.getNome());
            }
        }
    }


}
