/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Trabalho.model;

/**
 * A classe Categoria representa uma categoria qual uma receita ou despesa pode pertencer.
 *
 * @author Paulo Fontenele da Silva
 */
public class Categoria {

    private String nome;
    private TipoCategoria tipoCategoria;

    /**
     * Construtor da classe Categoria
     * @param nome o nome da categoria
     * @param tipoCategoria o tipo da categoria
     */
    public Categoria(String nome, TipoCategoria tipoCategoria) {
        this.nome = nome;
        this.tipoCategoria = tipoCategoria;
    }
    
    /**
     * @return o nome da categoria
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome o nome da categoria
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return o tipo da categoria
     */
    public TipoCategoria getTipoCategoria() {
        return tipoCategoria;
    }

    /**
     * @param tipoCategoria o tipo da categoria
     */
    public void setTipoCategoria(TipoCategoria tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }
    
}
