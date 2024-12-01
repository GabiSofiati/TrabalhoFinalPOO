/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Trabalho.view;

import Trabalho.model.Categoria;
import Trabalho.model.Despesa;
import Trabalho.model.Lancamento;
import Trabalho.model.LancamentoController;
import Trabalho.model.Receita;
import Trabalho.model.TipoCategoria;
import static Trabalho.model.TipoCategoria.DESPESA;
import static Trabalho.model.TipoCategoria.RECEITA;
import java.awt.Color;
import java.text.Normalizer;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Paulo Fontenele da Silva
 */
public class LancamentosView extends javax.swing.JFrame {

    private LancamentoController controller = new LancamentoController();
    
    private boolean digitadoCategoriaGeral = false;
    private boolean digitadoCategoriaReceita = false;
    private boolean digitadoCategoriaDespesa = false;
    
    private ArrayList<Categoria> categoriasPesquisadasGeral = new ArrayList<>();
    private ArrayList<Categoria> categoriasPesquisadasReceitas = new ArrayList<>();
    private ArrayList<Categoria> categoriasPesquisadasDespesas = new ArrayList<>();
    private ArrayList<Categoria> categoriasSelecionadasGeral = new ArrayList<>();
    private ArrayList<Categoria> categoriasSelecionadasReceitas = new ArrayList<>();
    private ArrayList<Categoria> categoriasSelecionadasDespesas = new ArrayList<>();
    
    public boolean isDigitadoCategoriaGeral() {
        return digitadoCategoriaGeral;
    }

    public void setDigitadoCategoriaGeral(boolean digitadoCategoriaGeral) {
        this.digitadoCategoriaGeral = digitadoCategoriaGeral;
    }

    public boolean isDigitadoCategoriaReceita() {
        return digitadoCategoriaReceita;
    }

    public void setDigitadoCategoriaReceita(boolean digitadoCategoriaReceita) {
        this.digitadoCategoriaReceita = digitadoCategoriaReceita;
    }

    public boolean isDigitadoCategoriaDespesa() {
        return digitadoCategoriaDespesa;
    }

    public void setDigitadoCategoriaDespesa(boolean digitadoCategoriaDespesa) {
        this.digitadoCategoriaDespesa = digitadoCategoriaDespesa;
    }
    
    public ArrayList<Categoria> getCategoriasSelecionadasGeral() {
        return categoriasSelecionadasGeral;
    }

    public ArrayList<Categoria> getCategoriasSelecionadasReceitas() {
        return categoriasSelecionadasReceitas;
    }

    public ArrayList<Categoria> getCategoriasSelecionadasDespesas() {
        return categoriasSelecionadasDespesas;
    }

    public ArrayList<Categoria> getCategoriasPesquisadasGeral() {
        return categoriasPesquisadasGeral;
    }

    public ArrayList<Categoria> getCategoriasPesquisadasReceitas() {
        return categoriasPesquisadasReceitas;
    }

    public ArrayList<Categoria> getCategoriasPesquisadasDespesas() {
        return categoriasPesquisadasDespesas;
    }
    
    /**
     * Creates new form FinancasView
     */
    public LancamentosView() {
        initComponents();
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        controller.carregarLancamentos();
        controller.carregarCategorias();
        
        LocalDate hoje = LocalDate.now();
        lblDataHoje.setText("Hoje: " + hoje.getDayOfMonth() + "/" + hoje.getMonthValue() + "/" + hoje.getYear());
        lblDataHoje1.setText("Hoje: " + hoje.getDayOfMonth() + "/" + hoje.getMonthValue() + "/" + hoje.getYear());
        lblDataHoje2.setText("Hoje: " + hoje.getDayOfMonth() + "/" + hoje.getMonthValue() + "/" + hoje.getYear());
        
        jScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(15);
        jScrollPane2.getVerticalScrollBar().setUnitIncrement(15);
        jScrollPane3.getVerticalScrollBar().setUnitIncrement(15);
        jScrollPane4.getVerticalScrollBar().setUnitIncrement(15);
        jScrollPane5.getVerticalScrollBar().setUnitIncrement(15);
        jScrollPane6.getVerticalScrollBar().setUnitIncrement(15);
        jScrollPane7.getVerticalScrollBar().setUnitIncrement(15);
        jScrollPane8.getVerticalScrollBar().setUnitIncrement(15);
        jScrollPane9.getVerticalScrollBar().setUnitIncrement(15);
        jScrollPane10.getVerticalScrollBar().setUnitIncrement(15);
        jScrollPane11.getVerticalScrollBar().setUnitIncrement(15);
        jScrollPane12.getVerticalScrollBar().setUnitIncrement(15);
        
        Geral();
        
        Menu.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                switch(Menu.getSelectedIndex()){
                    case 0 -> Geral();
                    case 1 -> Receitas();
                    case 2 -> Despesas();
                }
            }
        });
        
        
        atualizarListaCategoria();
        atualizarListas();
        
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
        Geral = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        listaTodos = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaLancados = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaFuturos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfPesquisa = new javax.swing.JTextField();
        lblDataHoje = new javax.swing.JLabel();
        lblSaldoAtual = new javax.swing.JLabel();
        lblSaldoTotal = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaCategorias = new javax.swing.JPanel();
        Receitas = new javax.swing.JPanel();
        tfPesquisaCategoriaReceita = new javax.swing.JTextField();
        lblDataHoje1 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        listaTodasReceitas = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        listaLancadasReceitas = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        listaFuturasReceitas = new javax.swing.JPanel();
        lblSaldoAtual1 = new javax.swing.JLabel();
        lblSaldoTotal1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfAdicionarCategoriaReceita = new javax.swing.JTextField();
        btnAdicionarCategoriaReceita = new javax.swing.JButton();
        btnAdicionarReceita = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        listaCategoriasReceitas = new javax.swing.JPanel();
        Despesas = new javax.swing.JPanel();
        tfPesquisaCategoriaDespesa = new javax.swing.JTextField();
        lblDataHoje2 = new javax.swing.JLabel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        listaTodasDespesas = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        listaLancadasDespesas = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        listaFuturasDespesas = new javax.swing.JPanel();
        lblSaldoAtual2 = new javax.swing.JLabel();
        lblSaldoTotal2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfAdicionarCategoriaDespesa = new javax.swing.JTextField();
        btnAdicionarCategoriaDespesa = new javax.swing.JButton();
        btnAdicionarDespesa = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        listaCategoriasDespesas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Menu = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador de Finanças");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N

        Geral.setBackground(new java.awt.Color(255, 255, 255));
        Geral.setForeground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jPanel2.setForeground(new java.awt.Color(153, 153, 153));

        listaTodos.setBackground(new java.awt.Color(255, 255, 255));
        listaTodos.setLayout(new javax.swing.BoxLayout(listaTodos, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane.setViewportView(listaTodos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Todos", jPanel2);

        jPanel3.setForeground(new java.awt.Color(153, 153, 153));

        listaLancados.setBackground(new java.awt.Color(255, 255, 255));
        listaLancados.setLayout(new javax.swing.BoxLayout(listaLancados, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(listaLancados);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Lançados", jPanel3);

        jPanel4.setForeground(new java.awt.Color(153, 153, 153));

        listaFuturos.setBackground(new java.awt.Color(255, 255, 255));
        listaFuturos.setLayout(new javax.swing.BoxLayout(listaFuturos, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane3.setViewportView(listaFuturos);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Futuros", jPanel4);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Categorias");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Lançamentos");

        tfPesquisa.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPesquisaKeyReleased(evt);
            }
        });

        lblDataHoje.setFont(new java.awt.Font("Artifakt Element Hair", 0, 24)); // NOI18N
        lblDataHoje.setForeground(new java.awt.Color(0, 0, 0));
        lblDataHoje.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDataHoje.setText("Hoje: dd/mm/aaaa");

        lblSaldoAtual.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblSaldoAtual.setForeground(new java.awt.Color(0, 0, 0));
        lblSaldoAtual.setText("Saldo atual:");
        lblSaldoAtual.setToolTipText("Saldo disponível até a data atual");

        lblSaldoTotal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblSaldoTotal.setForeground(new java.awt.Color(0, 0, 0));
        lblSaldoTotal.setText("Saldo total:");
        lblSaldoTotal.setToolTipText("Saldo disponível independente do período");

        listaCategorias.setBackground(new java.awt.Color(255, 255, 255));
        listaCategorias.setLayout(new javax.swing.BoxLayout(listaCategorias, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane4.setViewportView(listaCategorias);

        javax.swing.GroupLayout GeralLayout = new javax.swing.GroupLayout(Geral);
        Geral.setLayout(GeralLayout);
        GeralLayout.setHorizontalGroup(
            GeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GeralLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(GeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GeralLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(125, 125, 125)
                        .addGroup(GeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSaldoAtual)
                            .addComponent(lblSaldoTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                        .addComponent(lblDataHoje))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GeralLayout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(GeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4)
                            .addComponent(tfPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))))
                .addGap(24, 24, 24))
        );
        GeralLayout.setVerticalGroup(
            GeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GeralLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(GeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaldoAtual)
                    .addComponent(jLabel2)
                    .addComponent(lblDataHoje))
                .addGap(1, 1, 1)
                .addComponent(lblSaldoTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(GeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(GeralLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );

        Receitas.setBackground(new java.awt.Color(255, 255, 255));
        Receitas.setForeground(new java.awt.Color(255, 255, 255));

        tfPesquisaCategoriaReceita.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfPesquisaCategoriaReceita.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfPesquisaCategoriaReceita.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPesquisaCategoriaReceitaKeyReleased(evt);
            }
        });

        lblDataHoje1.setFont(new java.awt.Font("Artifakt Element Hair", 0, 24)); // NOI18N
        lblDataHoje1.setForeground(new java.awt.Color(0, 0, 0));
        lblDataHoje1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDataHoje1.setText("Hoje: dd/mm/aaaa");

        jTabbedPane2.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane2.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jPanel5.setForeground(new java.awt.Color(153, 153, 153));

        listaTodasReceitas.setBackground(new java.awt.Color(255, 255, 255));
        listaTodasReceitas.setLayout(new javax.swing.BoxLayout(listaTodasReceitas, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane5.setViewportView(listaTodasReceitas);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Todas", jPanel5);

        jPanel6.setForeground(new java.awt.Color(153, 153, 153));

        listaLancadasReceitas.setBackground(new java.awt.Color(255, 255, 255));
        listaLancadasReceitas.setLayout(new javax.swing.BoxLayout(listaLancadasReceitas, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane6.setViewportView(listaLancadasReceitas);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Lançadas", jPanel6);

        jPanel7.setForeground(new java.awt.Color(153, 153, 153));

        listaFuturasReceitas.setBackground(new java.awt.Color(255, 255, 255));
        listaFuturasReceitas.setLayout(new javax.swing.BoxLayout(listaFuturasReceitas, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane7.setViewportView(listaFuturasReceitas);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Futuras", jPanel7);

        lblSaldoAtual1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblSaldoAtual1.setForeground(new java.awt.Color(0, 0, 0));
        lblSaldoAtual1.setText("Saldo atual:");
        lblSaldoAtual1.setToolTipText("Saldo disponível até a data atual");

        lblSaldoTotal1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblSaldoTotal1.setForeground(new java.awt.Color(0, 0, 0));
        lblSaldoTotal1.setText("Saldo total:");
        lblSaldoTotal1.setToolTipText("Saldo disponível independente do período");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Categorias");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Receitas");

        tfAdicionarCategoriaReceita.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfAdicionarCategoriaReceita.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnAdicionarCategoriaReceita.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAdicionarCategoriaReceita.setText("+");
        btnAdicionarCategoriaReceita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionarCategoriaReceita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdicionarCategoriaReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarCategoriaReceitaActionPerformed(evt);
            }
        });

        btnAdicionarReceita.setBackground(new java.awt.Color(33, 33, 33));
        btnAdicionarReceita.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAdicionarReceita.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarReceita.setText("Adicionar");
        btnAdicionarReceita.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAdicionarReceita.setBorderPainted(false);
        btnAdicionarReceita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionarReceita.setFocusPainted(false);
        btnAdicionarReceita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdicionarReceitaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdicionarReceitaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAdicionarReceitaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAdicionarReceitaMouseReleased(evt);
            }
        });
        btnAdicionarReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarReceitaActionPerformed(evt);
            }
        });

        listaCategoriasReceitas.setBackground(new java.awt.Color(255, 255, 255));
        listaCategoriasReceitas.setLayout(new javax.swing.BoxLayout(listaCategoriasReceitas, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane12.setViewportView(listaCategoriasReceitas);

        javax.swing.GroupLayout ReceitasLayout = new javax.swing.GroupLayout(Receitas);
        Receitas.setLayout(ReceitasLayout);
        ReceitasLayout.setHorizontalGroup(
            ReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReceitasLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(ReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReceitasLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(186, 186, 186)
                        .addGroup(ReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSaldoAtual1)
                            .addComponent(lblSaldoTotal1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDataHoje1))
                    .addGroup(ReceitasLayout.createSequentialGroup()
                        .addGroup(ReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ReceitasLayout.createSequentialGroup()
                                .addComponent(btnAdicionarReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTabbedPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ReceitasLayout.createSequentialGroup()
                                .addComponent(tfAdicionarCategoriaReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAdicionarCategoriaReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfPesquisaCategoriaReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );
        ReceitasLayout.setVerticalGroup(
            ReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReceitasLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(ReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReceitasLayout.createSequentialGroup()
                        .addGroup(ReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblDataHoje1))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReceitasLayout.createSequentialGroup()
                        .addComponent(lblSaldoAtual1)
                        .addGap(5, 5, 5)
                        .addComponent(lblSaldoTotal1)))
                .addGap(6, 6, 6)
                .addGroup(ReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReceitasLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfPesquisaCategoriaReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdicionarCategoriaReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAdicionarCategoriaReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2))
                    .addGroup(ReceitasLayout.createSequentialGroup()
                        .addComponent(jTabbedPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdicionarReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
        );

        Despesas.setBackground(new java.awt.Color(255, 255, 255));
        Despesas.setForeground(new java.awt.Color(255, 255, 255));

        tfPesquisaCategoriaDespesa.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfPesquisaCategoriaDespesa.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfPesquisaCategoriaDespesa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPesquisaCategoriaDespesaKeyReleased(evt);
            }
        });

        lblDataHoje2.setFont(new java.awt.Font("Artifakt Element Hair", 0, 24)); // NOI18N
        lblDataHoje2.setForeground(new java.awt.Color(0, 0, 0));
        lblDataHoje2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDataHoje2.setText("Hoje: dd/mm/aaaa");

        jTabbedPane5.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane5.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jPanel10.setForeground(new java.awt.Color(153, 153, 153));

        listaTodasDespesas.setBackground(new java.awt.Color(255, 255, 255));
        listaTodasDespesas.setLayout(new javax.swing.BoxLayout(listaTodasDespesas, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane8.setViewportView(listaTodasDespesas);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Todas", jPanel10);

        jPanel11.setForeground(new java.awt.Color(153, 153, 153));

        listaLancadasDespesas.setBackground(new java.awt.Color(255, 255, 255));
        listaLancadasDespesas.setLayout(new javax.swing.BoxLayout(listaLancadasDespesas, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane9.setViewportView(listaLancadasDespesas);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Lançadas", jPanel11);

        jPanel12.setForeground(new java.awt.Color(153, 153, 153));

        listaFuturasDespesas.setBackground(new java.awt.Color(255, 255, 255));
        listaFuturasDespesas.setLayout(new javax.swing.BoxLayout(listaFuturasDespesas, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane10.setViewportView(listaFuturasDespesas);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Futuras", jPanel12);

        lblSaldoAtual2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblSaldoAtual2.setForeground(new java.awt.Color(0, 0, 0));
        lblSaldoAtual2.setText("Saldo atual:");
        lblSaldoAtual2.setToolTipText("Saldo disponível até a data atual");

        lblSaldoTotal2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblSaldoTotal2.setForeground(new java.awt.Color(0, 0, 0));
        lblSaldoTotal2.setText("Saldo total:");
        lblSaldoTotal2.setToolTipText("Saldo disponível independente do período");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Categorias");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Despesas");

        tfAdicionarCategoriaDespesa.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfAdicionarCategoriaDespesa.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnAdicionarCategoriaDespesa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAdicionarCategoriaDespesa.setText("+");
        btnAdicionarCategoriaDespesa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionarCategoriaDespesa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdicionarCategoriaDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarCategoriaDespesaActionPerformed(evt);
            }
        });

        btnAdicionarDespesa.setBackground(new java.awt.Color(33, 33, 33));
        btnAdicionarDespesa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAdicionarDespesa.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarDespesa.setText("Adicionar");
        btnAdicionarDespesa.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAdicionarDespesa.setBorderPainted(false);
        btnAdicionarDespesa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionarDespesa.setFocusPainted(false);
        btnAdicionarDespesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdicionarDespesaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdicionarDespesaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAdicionarDespesaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAdicionarDespesaMouseReleased(evt);
            }
        });
        btnAdicionarDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarDespesaActionPerformed(evt);
            }
        });

        listaCategoriasDespesas.setBackground(new java.awt.Color(255, 255, 255));
        listaCategoriasDespesas.setLayout(new javax.swing.BoxLayout(listaCategoriasDespesas, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane11.setViewportView(listaCategoriasDespesas);

        javax.swing.GroupLayout DespesasLayout = new javax.swing.GroupLayout(Despesas);
        Despesas.setLayout(DespesasLayout);
        DespesasLayout.setHorizontalGroup(
            DespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DespesasLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(DespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DespesasLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(175, 175, 175)
                        .addGroup(DespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSaldoAtual2)
                            .addComponent(lblSaldoTotal2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDataHoje2))
                    .addGroup(DespesasLayout.createSequentialGroup()
                        .addGroup(DespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DespesasLayout.createSequentialGroup()
                                .addComponent(btnAdicionarDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 342, Short.MAX_VALUE))
                            .addComponent(jTabbedPane5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(DespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfPesquisaCategoriaDespesa)
                            .addComponent(jLabel5)
                            .addGroup(DespesasLayout.createSequentialGroup()
                                .addComponent(tfAdicionarCategoriaDespesa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAdicionarCategoriaDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );
        DespesasLayout.setVerticalGroup(
            DespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DespesasLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(DespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DespesasLayout.createSequentialGroup()
                        .addGroup(DespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblDataHoje2))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DespesasLayout.createSequentialGroup()
                        .addComponent(lblSaldoAtual2)
                        .addGap(5, 5, 5)
                        .addComponent(lblSaldoTotal2)))
                .addGap(6, 6, 6)
                .addGroup(DespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DespesasLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfPesquisaCategoriaDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane11))
                    .addComponent(jTabbedPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdicionarDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionarCategoriaDespesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfAdicionarCategoriaDespesa))
                .addGap(47, 47, 47))
        );

        jScrollPane2.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        Menu.setBackground(new java.awt.Color(204, 204, 204));
        Menu.setBorder(javax.swing.BorderFactory.createEmptyBorder(40, 0, 0, 0));
        Menu.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Menu.setForeground(new java.awt.Color(0, 0, 0));
        Menu.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Geral", "Receitas", "Despesas" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Menu.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Menu.setSelectedIndex(0);
        Menu.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Menu.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(Menu);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Geral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(218, 218, 218)
                    .addComponent(Receitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(218, 218, 218)
                    .addComponent(Despesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Geral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Receitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Despesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
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

    private void btnAdicionarDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarDespesaActionPerformed
        AdicionarLancamentoView popup = new AdicionarLancamentoView(controller, TipoCategoria.DESPESA, this, true);
        popup.setLocationRelativeTo(this);
        popup.setVisible(true);
    }//GEN-LAST:event_btnAdicionarDespesaActionPerformed

    private void btnAdicionarDespesaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarDespesaMouseReleased
        btnAdicionarDespesa.setBackground(new Color(33, 33, 33));
    }//GEN-LAST:event_btnAdicionarDespesaMouseReleased

    private void btnAdicionarDespesaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarDespesaMousePressed
        btnAdicionarDespesa.setBackground(new Color(80, 80, 80));
    }//GEN-LAST:event_btnAdicionarDespesaMousePressed

    private void btnAdicionarDespesaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarDespesaMouseExited
        btnAdicionarDespesa.setBackground(new Color(33, 33, 33));
    }//GEN-LAST:event_btnAdicionarDespesaMouseExited

    private void btnAdicionarDespesaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarDespesaMouseEntered
        btnAdicionarDespesa.setBackground(new Color(50, 50, 50));
    }//GEN-LAST:event_btnAdicionarDespesaMouseEntered

    private void btnAdicionarReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarReceitaActionPerformed
        AdicionarLancamentoView popup = new AdicionarLancamentoView(controller, TipoCategoria.RECEITA, this, true);
        popup.setLocationRelativeTo(this);
        popup.setVisible(true);
    }//GEN-LAST:event_btnAdicionarReceitaActionPerformed

    private void btnAdicionarReceitaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarReceitaMouseReleased
        btnAdicionarReceita.setBackground(new Color(33, 33, 33));
    }//GEN-LAST:event_btnAdicionarReceitaMouseReleased

    private void btnAdicionarReceitaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarReceitaMousePressed
        btnAdicionarReceita.setBackground(new Color(80, 80, 80));
    }//GEN-LAST:event_btnAdicionarReceitaMousePressed

    private void btnAdicionarReceitaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarReceitaMouseExited
        btnAdicionarReceita.setBackground(new Color(33, 33, 33));
    }//GEN-LAST:event_btnAdicionarReceitaMouseExited

    private void btnAdicionarReceitaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarReceitaMouseEntered
        btnAdicionarReceita.setBackground(new Color(50, 50, 50));
    }//GEN-LAST:event_btnAdicionarReceitaMouseEntered

    private void btnAdicionarCategoriaReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarCategoriaReceitaActionPerformed
        
        if(tfAdicionarCategoriaReceita.getText().equals("")){
            AlertaGenericoView alerta = new AlertaGenericoView(this, true, "Digite algo para categoria");
            alerta.setLocationRelativeTo(this);
            alerta.setVisible(true);
        }else{
            Set<String> nomesAdicionados = new HashSet<>();
            for(Categoria categoria : controller.getCategorias()){
                if(categoria.getTipoCategoria() == TipoCategoria.RECEITA && normalize(categoria.getNome()).equals(normalize(tfAdicionarCategoriaReceita.getText()))){
                    AlertaGenericoView alerta = new AlertaGenericoView(this, true, "Esta categoria já existe");
                    tfAdicionarCategoriaReceita.setText("");
                    alerta.setLocationRelativeTo(this);
                    alerta.setVisible(true);
                    return;
                }
            }
            controller.incluirCategoria(new Categoria(tfAdicionarCategoriaReceita.getText(), TipoCategoria.RECEITA));
            tfAdicionarCategoriaReceita.setText("");
        }
        atualizarListas();
        atualizarListaCategoria();
    }//GEN-LAST:event_btnAdicionarCategoriaReceitaActionPerformed

    private void btnAdicionarCategoriaDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarCategoriaDespesaActionPerformed
        if(tfAdicionarCategoriaDespesa.getText().equals("")){
            AlertaGenericoView alerta = new AlertaGenericoView(this, true, "Digite algo para categoria");
            alerta.setLocationRelativeTo(this);
            alerta.setVisible(true);
        }else{
            Set<String> nomesAdicionados = new HashSet<>();
            for(Categoria categoria : controller.getCategorias()){
                if(categoria.getTipoCategoria() == TipoCategoria.DESPESA && normalize(categoria.getNome()).equals(normalize(tfAdicionarCategoriaDespesa.getText()))){
                    tfAdicionarCategoriaDespesa.setText("");
                    AlertaGenericoView alerta = new AlertaGenericoView(this, true, "Esta categoria já existe");
                    alerta.setLocationRelativeTo(this);
                    alerta.setVisible(true);
                    return;
                }
            }
            controller.incluirCategoria(new Categoria(tfAdicionarCategoriaDespesa.getText(), TipoCategoria.DESPESA));
            tfAdicionarCategoriaDespesa.setText("");
        }
        atualizarListas();
        atualizarListaCategoria();
    }//GEN-LAST:event_btnAdicionarCategoriaDespesaActionPerformed

    private void tfPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisaKeyReleased
        
        atualizarListaCategoria();
        atualizarListas();
        
    }//GEN-LAST:event_tfPesquisaKeyReleased

    private void tfPesquisaCategoriaReceitaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisaCategoriaReceitaKeyReleased
        
        atualizarListaCategoria();
        atualizarListas();
        
    }//GEN-LAST:event_tfPesquisaCategoriaReceitaKeyReleased

    private void tfPesquisaCategoriaDespesaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisaCategoriaDespesaKeyReleased
        
        atualizarListaCategoria();
        atualizarListas();
        
    }//GEN-LAST:event_tfPesquisaCategoriaDespesaKeyReleased

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    javax.swing.UIManager.put("List.focusCellHighlightBorder", BorderFactory.createEmptyBorder());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LancamentosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LancamentosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LancamentosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LancamentosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LancamentosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Despesas;
    private javax.swing.JPanel Geral;
    private javax.swing.JList<String> Menu;
    private javax.swing.JPanel Receitas;
    private javax.swing.JButton btnAdicionarCategoriaDespesa;
    private javax.swing.JButton btnAdicionarCategoriaReceita;
    private javax.swing.JButton btnAdicionarDespesa;
    private javax.swing.JButton btnAdicionarReceita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JLabel lblDataHoje;
    private javax.swing.JLabel lblDataHoje1;
    private javax.swing.JLabel lblDataHoje2;
    private javax.swing.JLabel lblSaldoAtual;
    private javax.swing.JLabel lblSaldoAtual1;
    private javax.swing.JLabel lblSaldoAtual2;
    private javax.swing.JLabel lblSaldoTotal;
    private javax.swing.JLabel lblSaldoTotal1;
    private javax.swing.JLabel lblSaldoTotal2;
    private javax.swing.JPanel listaCategorias;
    private javax.swing.JPanel listaCategoriasDespesas;
    private javax.swing.JPanel listaCategoriasReceitas;
    private javax.swing.JPanel listaFuturasDespesas;
    private javax.swing.JPanel listaFuturasReceitas;
    private javax.swing.JPanel listaFuturos;
    private javax.swing.JPanel listaLancadasDespesas;
    private javax.swing.JPanel listaLancadasReceitas;
    private javax.swing.JPanel listaLancados;
    private javax.swing.JPanel listaTodasDespesas;
    private javax.swing.JPanel listaTodasReceitas;
    private javax.swing.JPanel listaTodos;
    private javax.swing.JTextField tfAdicionarCategoriaDespesa;
    private javax.swing.JTextField tfAdicionarCategoriaReceita;
    private javax.swing.JTextField tfPesquisa;
    private javax.swing.JTextField tfPesquisaCategoriaDespesa;
    private javax.swing.JTextField tfPesquisaCategoriaReceita;
    // End of variables declaration//GEN-END:variables

    public void Geral(){
        
        Despesas.setVisible(false);
        Receitas.setVisible(false);
        Geral.setVisible(true);
        
    }
    
    public void Receitas(){
        
        Despesas.setVisible(false);
        Geral.setVisible(false);
        Receitas.setVisible(true);
        
    }
    
    public void Despesas(){
        
        Receitas.setVisible(false);
        Geral.setVisible(false);
        Despesas.setVisible(true);
        
    }

    public void atualizarListas(){
     
        Collections.sort(controller.getLancamentos());
        Collections.reverse(controller.getLancamentos());
        
        listaTodos.removeAll();
        listaLancados.removeAll();
        listaFuturos.removeAll();
        listaTodasReceitas.removeAll();
        listaTodasDespesas.removeAll();
        listaLancadasReceitas.removeAll();
        listaLancadasDespesas.removeAll();
        listaFuturasReceitas.removeAll();
        listaFuturasDespesas.removeAll();
        
        for (Lancamento lancamento : controller.getLancamentos()){
            if(categoriasSelecionadasGeral.isEmpty()){
                listaTodos.add(new ItemLancamentoView(lancamento, controller, false, this));
                if(lancamento.getData().isBefore(LocalDate.now()) || lancamento.getData().equals(LocalDate.now())){
                    listaLancados.add(new ItemLancamentoView(lancamento, controller, false, this));
                }else if(lancamento.getData().isAfter(LocalDate.now())){
                    listaFuturos.add(new ItemLancamentoView(lancamento, controller, false, this));
                }
            }else{
                for(Categoria categoria : categoriasSelecionadasGeral){
                    if(lancamento instanceof Receita){
                        if(((Receita)lancamento).getCategoria().getNome().equals(categoria.getNome())){
                            listaTodos.add(new ItemLancamentoView(lancamento, controller, false, this));
                            if(lancamento.getData().isBefore(LocalDate.now()) || lancamento.getData().equals(LocalDate.now())){
                                listaLancados.add(new ItemLancamentoView(lancamento, controller, false, this));
                            }else if(lancamento.getData().isAfter(LocalDate.now())){
                                listaFuturos.add(new ItemLancamentoView(lancamento, controller, false, this));
                            }
                        }
                    }else{
                        if(((Despesa)lancamento).getCategoria().getNome().equals(categoria.getNome())){
                            listaTodos.add(new ItemLancamentoView(lancamento, controller, false, this));
                            if(lancamento.getData().isBefore(LocalDate.now()) || lancamento.getData().equals(LocalDate.now())){
                                listaLancados.add(new ItemLancamentoView(lancamento, controller, false, this));
                            }else if(lancamento.getData().isAfter(LocalDate.now())){
                                listaFuturos.add(new ItemLancamentoView(lancamento, controller, false, this));
                            }
                        }
                    }
                }
            }
            if(lancamento instanceof Receita){
                if(categoriasSelecionadasReceitas.isEmpty()){
                    listaTodasReceitas.add(new ItemLancamentoView(lancamento, controller, true, this));
                    if(lancamento.getData().isBefore(LocalDate.now()) || lancamento.getData().equals(LocalDate.now())){
                        listaLancadasReceitas.add(new ItemLancamentoView(lancamento, controller, true, this));
                    }else if(lancamento.getData().isAfter(LocalDate.now())){
                        listaFuturasReceitas.add(new ItemLancamentoView(lancamento, controller, true, this));
                    }
                }else{
                    for(Categoria categoria : categoriasSelecionadasReceitas){
                        if(((Receita)lancamento).getCategoria().getNome().equals(categoria.getNome()) && categoria.getTipoCategoria() == RECEITA){
                            listaTodasReceitas.add(new ItemLancamentoView(lancamento, controller, true, this));
                            if(lancamento.getData().isBefore(LocalDate.now()) || lancamento.getData().equals(LocalDate.now())){
                                listaLancadasReceitas.add(new ItemLancamentoView(lancamento, controller, true, this));
                            }else if(lancamento.getData().isAfter(LocalDate.now())){
                                listaFuturasReceitas.add(new ItemLancamentoView(lancamento, controller, true, this));
                            }
                        }
                    }
                }
            }else if(lancamento instanceof Despesa){
                
                if(categoriasSelecionadasDespesas.isEmpty()){
                    listaTodasDespesas.add(new ItemLancamentoView(lancamento, controller, true, this));
                    if(lancamento.getData().isBefore(LocalDate.now()) || lancamento.getData().equals(LocalDate.now())){
                        listaLancadasDespesas.add(new ItemLancamentoView(lancamento, controller, true, this));
                    }else if(lancamento.getData().isAfter(LocalDate.now())){
                        listaFuturasDespesas.add(new ItemLancamentoView(lancamento, controller, true, this));
                    }
                }else{
                    for(Categoria categoria : categoriasSelecionadasDespesas){
                        if(((Despesa)lancamento).getCategoria().getNome().equals(categoria.getNome()) && categoria.getTipoCategoria() == DESPESA){
                            listaTodasDespesas.add(new ItemLancamentoView(lancamento, controller, true, this));
                            if(lancamento.getData().isBefore(LocalDate.now()) || lancamento.getData().equals(LocalDate.now())){
                                listaLancadasDespesas.add(new ItemLancamentoView(lancamento, controller, true, this));
                            }else if(lancamento.getData().isAfter(LocalDate.now())){
                                listaFuturasDespesas.add(new ItemLancamentoView(lancamento, controller, true, this));
                            }
                        }
                    }
                }
                
            }
            
        }
        
        atualizarSaldo();
        
        controller.salvarLancamentos();
        
        this.revalidate();
        this.repaint();
        
    }
    
    public void atualizarListaCategoria(){
        
        Collections.sort(controller.getCategorias(), (c1, c2) -> {
            String nome1 = Normalizer.normalize(c1.getNome(), Normalizer.Form.NFD).replaceAll("\\p{M}", "");
            String nome2 = Normalizer.normalize(c2.getNome(), Normalizer.Form.NFD).replaceAll("\\p{M}", "");
            return nome1.compareToIgnoreCase(nome2);
        });
        
        //Collections.sort(controller.getCategorias(), (c1, c2) -> c1.getNome().compareToIgnoreCase(c2.getNome()));
        
        listaCategoriasReceitas.removeAll();
        listaCategoriasDespesas.removeAll();
        listaCategorias.removeAll();
        
        pesquisarCategoriaGeral();
        pesquisarCategoriaReceita();
        pesquisarCategoriaDespesa();
        
        Set<String> nomesAdicionados = new HashSet<>();
        
        if(categoriasSelecionadasGeral.isEmpty()){
            for (Categoria categoria : controller.getCategorias()){
                if (nomesAdicionados.add(categoria.getNome().toLowerCase())) {
                    listaCategorias.add(new ItemCategoriaView(this, categoria, controller, false, -1));
                }
            }
        }else{
            for (Categoria categoria : categoriasSelecionadasGeral){
                if (nomesAdicionados.add(categoria.getNome().toLowerCase())) {
                    listaCategorias.add(new ItemCategoriaView(this, categoria, controller, false, -1));
                }
            }
        }
        
        if(categoriasSelecionadasReceitas.isEmpty()){
            for (Categoria categoria : controller.getCategorias()){
                if(categoria.getTipoCategoria() == TipoCategoria.RECEITA){
                    listaCategoriasReceitas.add(new ItemCategoriaView(this, categoria, controller, true, 0));
                }
            }
        }else{
            for (Categoria categoria : categoriasSelecionadasReceitas){
                if(categoria.getTipoCategoria() == TipoCategoria.RECEITA){
                    listaCategoriasReceitas.add(new ItemCategoriaView(this, categoria, controller, true, 0));
                }
            }
        }
        
        if(categoriasSelecionadasDespesas.isEmpty()){
            for (Categoria categoria : controller.getCategorias()){
                if(categoria.getTipoCategoria() == TipoCategoria.DESPESA){
                    listaCategoriasDespesas.add(new ItemCategoriaView(this, categoria, controller, true, 1));
                }
            }
        }else{
            for (Categoria categoria : categoriasSelecionadasDespesas){
                if(categoria.getTipoCategoria() == TipoCategoria.DESPESA){
                    listaCategoriasDespesas.add(new ItemCategoriaView(this, categoria, controller, true, 1));
                }
            }
        }
        
        this.revalidate();
        this.repaint();
        
        controller.salvarCategorias();
    }

    public void atualizarSaldo(){
        
        double saldoAtual = controller.calcularSaldo(null, LocalDate.now());
        double saldoTotal = controller.calcularSaldo(null, null);
        
        if(saldoAtual<0){
            lblSaldoAtual.setForeground(new Color(243, 45, 45));
            lblSaldoAtual1.setForeground(new Color(243, 45, 45));
            lblSaldoAtual2.setForeground(new Color(243, 45, 45));
        }else{
            lblSaldoAtual.setForeground(new Color(0, 0, 0));
            lblSaldoAtual1.setForeground(new Color(0, 0, 0));
            lblSaldoAtual2.setForeground(new Color(0, 0, 0));
        }
        
        if(saldoTotal<0){
            lblSaldoTotal.setForeground(new Color(243, 45, 45));
            lblSaldoTotal1.setForeground(new Color(243, 45, 45));
            lblSaldoTotal2.setForeground(new Color(243, 45, 45));
        }else{
            lblSaldoTotal.setForeground(new Color(0, 0, 0));
            lblSaldoTotal1.setForeground(new Color(0, 0, 0));
            lblSaldoTotal2.setForeground(new Color(0, 0, 0));
        }
        
        lblSaldoAtual.setText("Saldo atual: " + NumberFormat.getCurrencyInstance().format(saldoAtual));
        lblSaldoAtual1.setText("Saldo atual: " + NumberFormat.getCurrencyInstance().format(saldoAtual));
        lblSaldoAtual2.setText("Saldo atual: " + NumberFormat.getCurrencyInstance().format(saldoAtual));
        
        lblSaldoTotal.setText("Saldo total: " + NumberFormat.getCurrencyInstance().format(saldoTotal));
        lblSaldoTotal1.setText("Saldo total: " + NumberFormat.getCurrencyInstance().format(saldoTotal));
        lblSaldoTotal2.setText("Saldo total: " + NumberFormat.getCurrencyInstance().format(saldoTotal));
        
    }
    
    private void pesquisarCategoriaGeral(){
        Set<String> nomesAdicionados = new HashSet<>();
        
        categoriasPesquisadasGeral.clear();
        categoriasSelecionadasGeral.clear();
        listaCategorias.removeAll();
        
        for (Categoria categoria : controller.getCategorias()){
            String nomeNormalizado = normalize(categoria.getNome());
            String pesquisaNormalizada = normalize(tfPesquisa.getText());
            if (nomesAdicionados.add(nomeNormalizado) && nomeNormalizado.contains(pesquisaNormalizada)) {
                categoriasSelecionadasGeral.add(categoria);
                categoriasPesquisadasGeral.add(categoria);
                setDigitadoCategoriaGeral(true);
            }
        }
    }
    
    private void pesquisarCategoriaReceita(){
        categoriasPesquisadasReceitas.clear();
        categoriasSelecionadasReceitas.clear();
        listaCategoriasReceitas.removeAll();
        
        for (Categoria categoria : controller.getCategorias()){
            String nomeNormalizado = normalize(categoria.getNome());
            String pesquisaNormalizada = normalize(tfPesquisaCategoriaReceita.getText());
            if (nomeNormalizado.contains(pesquisaNormalizada) && categoria.getTipoCategoria() == TipoCategoria.RECEITA) {
                categoriasSelecionadasReceitas.add(categoria);
                categoriasPesquisadasReceitas.add(categoria);
                setDigitadoCategoriaReceita(true);
            }
        }
    }
    
    private void pesquisarCategoriaDespesa(){
        categoriasPesquisadasDespesas.clear();
        categoriasSelecionadasDespesas.clear();
        listaCategoriasDespesas.removeAll();
        
        for (Categoria categoria : controller.getCategorias()){
            String nomeNormalizado = normalize(categoria.getNome());
            String pesquisaNormalizada = normalize(tfPesquisaCategoriaDespesa.getText());
            if (nomeNormalizado.contains(pesquisaNormalizada) && categoria.getTipoCategoria() == TipoCategoria.DESPESA) {
                categoriasSelecionadasDespesas.add(categoria);
                categoriasPesquisadasDespesas.add(categoria);
                setDigitadoCategoriaDespesa(true);
            }
        }
    }
    
    private String normalize(String texto) {
        return Normalizer.normalize(texto, Normalizer.Form.NFD).replaceAll("\\p{M}", "").toLowerCase();
    }
    
}
