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
import static Trabalho.model.TipoCategoria.DESPESA;
import static Trabalho.model.TipoCategoria.RECEITA;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Paulo Fontenele da Silva
 */
public class ItemCategoriaView extends javax.swing.JPanel {

    private int lista;
    private boolean selected;
    private LancamentosView parent;
    private boolean deletavel;
    private LancamentoController controller;
    private Color hoverColor;
    private Color selectedColor;
    private Color backgroundColor;

    
    private Categoria categoria;
    
    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
    
    public Color getSelectedColor() {
        return selectedColor;
    }

    public void setSelectedColor(Color selectedColor) {
        this.selectedColor = selectedColor;
    }
    
    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
    
    /**
     * Creates new form ItemCategoria
     */
    public ItemCategoriaView(LancamentosView parent, Categoria categoria, LancamentoController controller, boolean deletavel, int lista) {
        this.parent = parent;
        this.deletavel = deletavel;
        this.controller = controller;
        this.categoria = categoria;
        this.lista = lista;
        
        initComponents();
        
        lblCategoria.setText(categoria.getNome());
        hoverColor = new Color(240,240,240);
        selectedColor = new Color(210,210,210);
        backgroundColor = new Color(255,255,255);
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                if(!selected){
                    setBackground(backgroundColor);
                    revalidate();
                    repaint();
                }
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                if(!selected){
                    setBackground(hoverColor);
                    revalidate();
                    repaint();
                }
            }
            
        });
        
        btnDeletar.setVisible(deletavel);
        
        for(Lancamento lancamento : controller.getLancamentos()){
            if(lancamento instanceof Receita){
                if(((Receita)lancamento).getCategoria().getNome().equals(this.categoria.getNome()) && ((Receita)lancamento).getCategoria().getTipoCategoria() == RECEITA){
                    btnDeletar.setVisible(false);
                }
            }else if(lancamento instanceof Despesa){
                if(((Despesa)lancamento).getCategoria().getNome().equals(this.categoria.getNome()) && ((Despesa)lancamento).getCategoria().getTipoCategoria() == DESPESA){
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
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMaximumSize(new java.awt.Dimension(32767, 51));
        setMinimumSize(new java.awt.Dimension(0, 51));
        setPreferredSize(new java.awt.Dimension(0, 51));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
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
        parent.getCategoriasPesquisadasGeral().remove(categoria);
        parent.getCategoriasPesquisadasReceitas().remove(categoria);
        parent.getCategoriasPesquisadasDespesas().remove(categoria);
        parent.getCategoriasSelecionadasGeral().remove(categoria);
        parent.getCategoriasSelecionadasReceitas().remove(categoria);
        parent.getCategoriasSelecionadasDespesas().remove(categoria);
        parent.atualizarListas();
        parent.atualizarListaCategoria();
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        /*
        if(selected){
            parent.getCategoriasSelectionadasGeral().remove(categoria);
            setSelected(false);
            setBackground(backgroundColor);
            parent.atualizarListas();
        }else{
            if(parent.isDigitadoCategoriaGeral()){
                parent.setDigitadoCategoriaGeral(false);
                parent.getCategoriasSelectionadasGeral().clear();
                parent.getCategoriasSelectionadasGeral().add(categoria);
                parent.atualizarListas();
                setSelected(true);
                setBackground(selectedColor);
                return;
            }
            setSelected(true);
            setBackground(selectedColor);
            parent.getCategoriasSelectionadasGeral().add(categoria);
            parent.atualizarListas();
        }
        */
        if(selected){
            switch(lista){
                case -1:
                    parent.getCategoriasSelecionadasGeral().remove(categoria);
                    if(parent.getCategoriasSelecionadasGeral().isEmpty()){
                        parent.setDigitadoCategoriaGeral(true);
                        for(Categoria categoria : parent.getCategoriasPesquisadasGeral()){
                            parent.getCategoriasSelecionadasGeral().add(categoria);
                        }
                    }
                    setSelected(false);
                    setBackground(backgroundColor);
                    parent.atualizarListas();
                    break;
                case 0:
                    parent.getCategoriasSelecionadasReceitas().remove(categoria);
                    if(parent.getCategoriasSelecionadasReceitas().isEmpty()){
                        parent.setDigitadoCategoriaReceita(true);
                        for(Categoria categoria : parent.getCategoriasPesquisadasReceitas()){
                            parent.getCategoriasSelecionadasReceitas().add(categoria);
                        }
                    }
                    setSelected(false);
                    setBackground(backgroundColor);
                    parent.atualizarListas();
                    break;
                case 1:
                    parent.getCategoriasSelecionadasDespesas().remove(categoria);
                    if(parent.getCategoriasSelecionadasDespesas().isEmpty()){
                        parent.setDigitadoCategoriaDespesa(true);
                        for(Categoria categoria : parent.getCategoriasPesquisadasDespesas()){
                            parent.getCategoriasSelecionadasDespesas().add(categoria);
                        }
                    }
                    setSelected(false);
                    setBackground(backgroundColor);
                    parent.atualizarListas();
                    break;
            }
        }else{
            switch(lista){
                case -1:
                    if(parent.isDigitadoCategoriaGeral()){
                        parent.getCategoriasSelecionadasGeral().clear();
                        parent.setDigitadoCategoriaGeral(false);
                    }
                    parent.getCategoriasSelecionadasGeral().add(categoria);
                    setSelected(true);
                    setBackground(selectedColor);
                    parent.atualizarListas();
                    break;
                case 0:
                    if(parent.isDigitadoCategoriaReceita()){
                        parent.getCategoriasSelecionadasReceitas().clear();
                        parent.setDigitadoCategoriaReceita(false);
                    }
                    parent.getCategoriasSelecionadasReceitas().add(categoria);
                    setSelected(true);
                    setBackground(selectedColor);
                    parent.atualizarListas();
                    break;
                case 1:
                    if(parent.isDigitadoCategoriaDespesa()){
                        parent.getCategoriasSelecionadasDespesas().clear();
                        parent.setDigitadoCategoriaDespesa(false);
                    }
                    parent.getCategoriasSelecionadasDespesas().add(categoria);
                    setSelected(true);
                    setBackground(selectedColor);
                    parent.atualizarListas();
                    break;
            }
        }
        
    }//GEN-LAST:event_formMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar;
    private javax.swing.JLabel lblCategoria;
    // End of variables declaration//GEN-END:variables
}
