/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Trabalho.model;

/**
 * A classe categoria representa uma categoria qual um lançamento pode ser pertencer.
 *
 * @author Paulo Fontenele da Silva
 */
public class Categoria {

    private String nome;
    private TipoCategoria tipoCategoria;

    public Categoria(String nome, TipoCategoria tipoCategoria) {
        this.nome = nome;
        this.tipoCategoria = tipoCategoria;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCategoria getTipoCategoria() {
        return tipoCategoria;
    }

    public void setTipoCategoria(TipoCategoria tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }
    
}
