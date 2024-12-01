/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Trabalho.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A classe LancamentoController controla os lancamentos e o salvamento de arquivos na memoria e tambem calcula o saldo disponível em um periodo definido.
 *
 * @author Paulo Fontenele da Silva
 */
public class LancamentoController {

    private ArrayList<Lancamento> lancamentos = new ArrayList<>();
    private ArrayList<Categoria> categorias = new ArrayList<>();
    
    /**
     * Insere um lançamento no ArrayList de lançamentos
     * @param lancamento o lancamento a ser adicionado
     */
    public void inserirLancamento(Lancamento lancamento){
        if (lancamento == null) {
            throw  new IllegalArgumentException();
        }
        lancamentos.add(lancamento);
    }
    
    /**
     * Remove um lançamento do ArrayList de lançamentos
     * @param lancamento o lancamento a ser removido
     */
    public void removerLancamento(Lancamento lancamento){
        if (lancamento == null) {
            throw  new IllegalArgumentException();
        }
        lancamentos.remove(lancamento);
    }
    
    /**
     * Retorna a lista de lançamentos
     * @return ArrayList<Lancamento> lista de lançamentos
     */
    public ArrayList<Lancamento> getLancamentos(){
        return lancamentos;
    }
    
    /**
     * O método carregarLancamentos recupera os lançamentos salvos no arquivo "lancamentos.csv" e os insere na lista de lancamentos
     */
    public void carregarLancamentos(){
        
        lancamentos.clear();
        File arquivo = new File("src/Trabalho/arquivos/lancamentos.csv");
        
        try (Scanner arqTexto = new Scanner(arquivo)){
            while (arqTexto.hasNext()){
                String[] lancamento = arqTexto.nextLine().split(",");
                switch(lancamento[3]){
                   case "RECEITA" -> lancamentos.add(new Receita(Double.parseDouble(lancamento[0]), LocalDate.parse(lancamento[1]), new Categoria(lancamento[2], TipoCategoria.RECEITA)));
                   case "DESPESA" -> lancamentos.add(new Despesa(Double.parseDouble(lancamento[0]), LocalDate.parse(lancamento[1]), new Categoria(lancamento[2], TipoCategoria.DESPESA)));
                }
            }
        } catch (IOException e) {

            System.out.println("Erro ao carregar arquivos " + e.toString());

        }
        
    }
    
    /**
     * O método salvarLancamentos persiste os lançamentos da lista de lançamentos no arquivo "lancamentos.csv"
     */
    public void salvarLancamentos(){
        
        File arquivo = new File("src/Trabalho/arquivos/lancamentos.csv");
        
        try (FileOutputStream fos = new FileOutputStream(arquivo);
             PrintWriter arquivoTexto = new PrintWriter(fos)){
            
            for(Lancamento lancamento : getLancamentos()){
                
                if(lancamento instanceof Receita){
                    Receita receita = (Receita) lancamento;
                    arquivoTexto.println(receita.getValor() + "," + receita.getData() + "," + receita.getCategoria().getNome() + "," + receita.getCategoria().getTipoCategoria());
                }else if(lancamento instanceof Despesa){
                    Despesa despesa = (Despesa) lancamento;
                    arquivoTexto.println(despesa.getValor() + "," + despesa.getData() + "," + despesa.getCategoria().getNome() + "," + despesa.getCategoria().getTipoCategoria());
                }
                
            }
            
        } catch (IOException e) {
        
            System.out.println("Erro ao salvar " + e.getMessage());
        
        }
    }
    
    /**
     * Inclui uma categoria no ArrayList de categorias
     * @param categoria a categoria a ser incluida
     */
    public void incluirCategoria(Categoria categoria){
        if (categoria == null) {
            throw new IllegalArgumentException();
        }
        this.categorias.add(categoria);
    }
    
    /**
     * Remova uma categoria do ArrayList de categorias
     * @param categoria a categoria a ser removida
     */
    public void removerCategoria(Categoria categoria){
        if (categoria == null) {
            throw new IllegalArgumentException();
        }
        this.categorias.remove(categoria);
    }
    
    /**
     * Retorna a lista de categorias
     * @return ArrayList<Categoria> a lista de categorias
     */
    public ArrayList<Categoria> getCategorias(){
        return this.categorias;
    }
    
    /**
     * O método carregarCategorias recupera as categorias salvas no arquivo "categorias.csv" e os insere na lista de categorias
     */
    public void carregarCategorias(){
        categorias.clear();
        File arquivo = new File("src/Trabalho/arquivos/categorias.csv");
        
        try (Scanner arqTexto = new Scanner(arquivo)){
            while (arqTexto.hasNext()){
                String[] categoria = arqTexto.nextLine().split(",");
                switch(categoria[1]){
                   case "RECEITA" -> categorias.add(new Categoria(categoria[0], TipoCategoria.RECEITA));
                   case "DESPESA" -> categorias.add(new Categoria(categoria[0], TipoCategoria.DESPESA));
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar arquivos " + e.getMessage());
        }
    }
    
    /**
     * O método salvarCategorias persiste as categorias da lista de categorias no arquivo "categorias.csv"
     */
    public void salvarCategorias(){
        
        File arquivo = new File("src/Trabalho/arquivos/categorias.csv");
        
        try (FileOutputStream fos = new FileOutputStream(arquivo);
             PrintWriter arquivoTexto = new PrintWriter(fos)){
            
            for(Categoria categoria : getCategorias()){
                arquivoTexto.println(categoria.getNome() + "," + categoria.getTipoCategoria());
            }
            
        } catch (IOException e) {
        
            System.out.println("Erro ao salvar " + e.getMessage());
        
        }
        
    }
    
    /**
     * Calcula o saldo disponível em um periodo determinado
     * 
     * @param desde inicio do periodo, null para inicio indefinido
     * @param ate fim do periodo, null para fim indefinido
     * @return double o saldo
     */
    public double calcularSaldo(LocalDate desde, LocalDate ate){
        
        double saldo = 0;
        
        for(Lancamento lancamento : getLancamentos()){
            if(!desde.equals(null) && !ate.equals(null)){
                int cmpDesde = lancamento.getData().compareTo(desde);
                int cmpAte = lancamento.getData().compareTo(ate);

                if(cmpDesde >= 0 && cmpAte <= 0){
                    if(lancamento instanceof Receita){
                        saldo += lancamento.getValor();
                    }else if(lancamento instanceof Despesa){
                        saldo -= lancamento.getValor();
                    }
                }
            }else if(desde.equals(null) && !ate.equals(null)){
                int cmpAte = lancamento.getData().compareTo(ate);

                if(cmpAte <= 0){
                    if(lancamento instanceof Receita){
                        saldo += lancamento.getValor();
                    }else if(lancamento instanceof Despesa){
                        saldo -= lancamento.getValor();
                    }
                }
            }else if(!desde.equals(null) && ate.equals(null)){
                int cmpDesde = lancamento.getData().compareTo(desde);

                if(cmpDesde >= 0){
                    if(lancamento instanceof Receita){
                        saldo += lancamento.getValor();
                    }else if(lancamento instanceof Despesa){
                        saldo -= lancamento.getValor();
                    }
                }
            }else if(desde.equals(null) && ate.equals(null)){
                if(lancamento instanceof Receita){
                    saldo += lancamento.getValor();
                }else if(lancamento instanceof Despesa){
                    saldo -= lancamento.getValor();
                }
            }
           
        }
        
        return saldo;
        
    }
    
}
