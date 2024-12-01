/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Trabalho.model;

import java.time.LocalDate;

/**
 * A classe Despesa representa um gasto realizado.
 * Pertence a uma categoria.
 *
 * @author Paulo Fontenele da Silva
 */
public class Despesa extends Lancamento {

    private Categoria categoria;
    
    /**
     * Construtor da classe Despesa
     * @param valor o valor da despesa
     * @param data a data em que aconteceu a despesa
     * @param categoria a categoria qual a receita despesa
     */
    public Despesa(double valor, LocalDate data, Categoria categoria) {
        super(valor, data);
        this.categoria = categoria;
    }
    
    /**
     * Retorna a categoria qual a despesa pertence
     * @return a categoria qual a despesa pertence
     */
    public Categoria getCategoria() {
        return categoria;
    }
    
    /**
     * Define qual categoria a despesa pertence
     * @param categoria a categoria qual a despesa pertence
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
}
