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
public class Lancamento {

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

    
    
}
