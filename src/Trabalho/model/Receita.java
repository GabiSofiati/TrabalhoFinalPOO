/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Trabalho.model;

import java.time.LocalDate;

/**
 * A classe Receita representa uma receita realizada.
 * Pertence a uma categoria.
 *
 * @author Paulo Fontenele da Silva
 */
public class Receita extends Lancamento {

    private Categoria categoria;

    /**
     * Construtor da classe Receita
     * @param valor o valor da receita
     * @param data a data em que aconteceu a receita
     * @param categoria a categoria qual a receita pertence
     */
    public Receita(double valor, LocalDate data, Categoria categoria) {
        super(valor, data);
        this.categoria = categoria;
    }
    
    /**
     * Retorna a categoria qual a receita pertence
     * @return a categoria qual a receita pertence
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * Define qual categoria a receita pertence
     * @param categoria a categoria qual a receita pertence
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
}
