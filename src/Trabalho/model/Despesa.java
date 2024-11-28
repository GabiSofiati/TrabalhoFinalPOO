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

    public Despesa(double valor, LocalDate data, Categoria categoria) {
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
