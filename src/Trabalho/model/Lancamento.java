/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabalho.model;

import java.time.LocalDate;

/**
 * Representa um lancamento
 *
 * @author Paulo Fontenele da Silva
 */
public class Lancamento implements Comparable<Lancamento>{

    private double valor;
    private LocalDate data;

    public Lancamento(double valor, LocalDate data) {
        this.valor = valor;
        this.data = data;
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public int compareTo(Lancamento o) {
        
        //data primeiro
        int result = this.data.compareTo(o.getData());
        if (result != 0) {
            return result;
        }
        
        
        if (this instanceof Despesa && o instanceof Receita) {
            return 1; //despesa primeiro
        } else if (this instanceof Receita && o instanceof Despesa) {
            return -1; //receita terceiro
        }

        //valor quarto
        result = Double.compare(o.getValor(), this.getValor());
        return result;
    }

    
    
}
