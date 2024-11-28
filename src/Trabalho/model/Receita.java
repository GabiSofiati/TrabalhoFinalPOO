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

    public Receita(double valor, LocalDate data, Categoria categoria) {
        super(valor, data);
        this.categoria = categoria;
    }
    
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
}
