/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Trabalho.view;

import Trabalho.model.Despesa;
import Trabalho.model.Lancamento;
import Trabalho.model.LancamentoController;
import Trabalho.model.Receita;
import java.awt.Color;
import java.util.List;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.NumberFormat;

/**
 *
 * @author Paulo Fontenele da Silva
 */
public class ItemLancamentoView extends javax.swing.JPanel {

    private LancamentosView parent;
    private Lancamento lancamento;
    private boolean deletavel;
    private Color hoverColor;
    private LancamentoController controller;
    
    /**
     * Creates new form ItemLancamentoLista
     */
    public ItemLancamentoView(Lancamento lancamento, LancamentoController controller, boolean deletavel, LancamentosView parent) {
        initComponents();
        this.deletavel = deletavel;
        this.controller = controller;
        this.lancamento = lancamento;
        this.parent = parent;
        
        btnDeletar.setVisible(deletavel);
        
        setItem(lancamento);
        hoverColor = new Color(240,240,240);
        
        jPanel1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                jPanel1.setBackground(new Color(255,255,255));
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                jPanel1.setBackground(hoverColor);
            }
            
        });
        
    }
    
    public void setItem(Object obj){
        if(obj instanceof Receita){
            Receita item = (Receita) obj;
            lbValor.setForeground(new Color(52, 193, 83));
            
            lbValor.setText(NumberFormat.getCurrencyInstance().format(item.getValor()));
            lbData.setText(item.getData().getDayOfMonth() + "/" + item.getData().getMonthValue() + "/" + item.getData().getYear());
            lbCategoria.setText(item.getCategoria().getNome());
            
            /*
            aqui o item calcula por si próprio o saldo atual para evitar conflito com lancamentos na mesma data,
            pois, utilizando o método calcularSaldo, caso haja varios lançamentos no mesmo dia,
            todos os lançamentos desse dia iam ter o mesmo saldo anterior que repete o do lancamento
            anterior e o mesmo saldo atual que seria o saldo anterior somado com o valor deles
            por exemplo
            na lista apareceria
            26/11/2024 receita R$250 saldo anterior R$1000 -> saldo atual R$1500
            26/11/2024 receita R$250 saldo anterior R$1000 -> saldo atual R$1500
            ao invés de
            26/11/2024 receita R$250 saldo anterior R$1250 -> saldo atual R$1500
            26/11/2024 receita R$250 saldo anterior R$1000 -> saldo atual R$1250
            (ordem de baixo para cima)
            */
            List<Lancamento> lancamentos = controller.getLancamentos();
            int indexAtual = lancamentos.indexOf(item);

            double saldoAnterior = 0;

            for (int i = lancamentos.size() - 1; i >= 0; i--) {
                Lancamento lancamento = lancamentos.get(i);

                if (i < indexAtual+1) {
                    break;
                }

                if (lancamento instanceof Receita) {
                    saldoAnterior += lancamento.getValor();
                } else if (lancamento instanceof Despesa) {
                    saldoAnterior -= lancamento.getValor();
                }
            }

            double saldoAtual = saldoAnterior;
            saldoAtual += item.getValor();

            lbSaldo.setText(NumberFormat.getCurrencyInstance().format(saldoAnterior) + 
                            " -> " + 
                            NumberFormat.getCurrencyInstance().format(saldoAtual));
            
            
        }else if(obj instanceof Despesa){
            Despesa item = (Despesa) obj;
            lbValor.setForeground(new Color(243, 45, 45));
            
            lbValor.setText(NumberFormat.getCurrencyInstance().format(item.getValor()));
            lbData.setText(item.getData().getDayOfMonth() + "/" + item.getData().getMonthValue() + "/" + item.getData().getYear());
            lbCategoria.setText(item.getCategoria().getNome());
            
            /*
            aqui o item calcula por si próprio o saldo atual para evitar conflito com lancamentos na mesma data,
            pois, utilizando o método calcularSaldo, caso haja varios lançamentos no mesmo dia,
            todos os lançamentos desse dia iam ter o mesmo saldo anterior que repete o do lancamento
            anterior e o mesmo saldo atual que seria o saldo anterior somado com o valor deles
            por exemplo
            na lista apareceria
            26/11/2024 receita R$250 saldo anterior R$1000 -> saldo atual R$1500
            26/11/2024 receita R$250 saldo anterior R$1000 -> saldo atual R$1500
            ao invés de
            26/11/2024 receita R$250 saldo anterior R$1250 -> saldo atual R$1500
            26/11/2024 receita R$250 saldo anterior R$1000 -> saldo atual R$1250
            (ordem de baixo para cima)
            */
            List<Lancamento> lancamentos = controller.getLancamentos();
            int indexAtual = lancamentos.indexOf(item);

            double saldoAnterior = 0;

            for (int i = lancamentos.size() - 1; i >= 0; i--) {
                Lancamento lancamento = lancamentos.get(i);

                if (i < indexAtual+1) {
                    break;
                }

                if (lancamento instanceof Receita) {
                    saldoAnterior += lancamento.getValor();
                } else if (lancamento instanceof Despesa) {
                    saldoAnterior -= lancamento.getValor();
                }
            }

            double saldoAtual = saldoAnterior;
            saldoAtual -= item.getValor();

            lbSaldo.setText(NumberFormat.getCurrencyInstance().format(saldoAnterior) + 
                            " -> " + 
                            NumberFormat.getCurrencyInstance().format(saldoAtual));
            
        }else{
            lbValor.setText("null");
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
        lbValor = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        lbCategoria = new javax.swing.JLabel();
        lbSaldo = new javax.swing.JLabel();
        btnDeletar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(32767, 73));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        lbValor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbValor.setText("VALOR");

        lbData.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbData.setText("DD/MM/AAAA");

        lbCategoria.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lbCategoria.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbCategoria.setText("Categoria");

        lbSaldo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbSaldo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbSaldo.setText("saldo: antes -> depois");

        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Trabalho/img/trash.png"))); // NOI18N
        btnDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbCategoria))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(lbSaldo)))
                .addGap(27, 27, 27)
                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbValor)
                            .addComponent(lbCategoria))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbData)
                            .addComponent(lbSaldo))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        String mensagem = "";
        if(lancamento instanceof Receita){
            mensagem = "Excluir receita?";
        }else if(lancamento instanceof Despesa){
            mensagem = "Excluir despesa?";
        }
        AlertaConfirmarView alerta = new AlertaConfirmarView(null, true, mensagem);
        alerta.setLocationRelativeTo(this);
        alerta.setVisible(true);
        if(alerta.isConfirmado()){
            controller.removerLancamento(lancamento);
            parent.atualizarListas();
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        
    }//GEN-LAST:event_formMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCategoria;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbSaldo;
    private javax.swing.JLabel lbValor;
    // End of variables declaration//GEN-END:variables

    public Color getHoverColor() {
        return hoverColor;
    }

    public void setHoverColor(Color hoverColor) {
        this.hoverColor = hoverColor;
    }

    
}
