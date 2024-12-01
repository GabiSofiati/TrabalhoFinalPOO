/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Trabalho.view;

import Trabalho.model.Categoria;
import Trabalho.model.Despesa;
import Trabalho.model.Lancamento;
import Trabalho.model.LancamentoController;
import Trabalho.model.Receita;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

/**
 *
 * @author Paulo Fontenele da Silva
 */
public class ItemCategoriaView extends javax.swing.JPanel {

    private LancamentosView parent;
    private boolean deletavel;
    private LancamentoController controller;
    private Color hoverColor;
    private Categoria categoria;
    
    /**
     * Creates new form ItemCategoria
     */
    public ItemCategoriaView(LancamentosView parent, Categoria categoria, LancamentoController controller, boolean deletavel) {
        this.parent = parent;
        this.deletavel = deletavel;
        this.controller = controller;
        this.categoria = categoria;
        initComponents();
        
        lblCategoria.setText(categoria.getNome());
        
        hoverColor = new Color(240,240,240);
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(new Color(255,255,255));
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(hoverColor);
            }
            
        });
        
        btnDeletar.setVisible(deletavel);
        
        for(Lancamento lancamento : controller.getLancamentos()){
            if(lancamento instanceof Receita){
                if(((Receita)lancamento).getCategoria().getNome().equals(this.categoria.getNome()) && ((Receita)lancamento).getCategoria().getTipoCategoria().equals(this.categoria.getTipoCategoria())){
                    btnDeletar.setVisible(false);
                }
            }else if(lancamento instanceof Despesa){
                if(((Despesa)lancamento).getCategoria().getNome().equals(this.categoria.getNome()) && ((Despesa)lancamento).getCategoria().getTipoCategoria().equals(this.categoria.getTipoCategoria())){
                    btnDeletar.setVisible(false);
                }
            }
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

        lblCategoria = new javax.swing.JLabel();
        btnDeletar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(32767, 51));
        setMinimumSize(new java.awt.Dimension(0, 51));
        setPreferredSize(new java.awt.Dimension(0, 51));

        lblCategoria.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCategoria.setText("Categoria");

        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Trabalho/img/trash.png"))); // NOI18N
        btnDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        controller.removerCategoria(categoria);
        parent.getCategoriasSelectionadasGeral().remove(categoria);
        parent.getCategoriasSelectionadasReceitas().remove(categoria);
        parent.getCategoriasSelectionadasDespesas().remove(categoria);
        parent.atualizarListaCategoria();
    }//GEN-LAST:event_btnDeletarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar;
    private javax.swing.JLabel lblCategoria;
    // End of variables declaration//GEN-END:variables
}