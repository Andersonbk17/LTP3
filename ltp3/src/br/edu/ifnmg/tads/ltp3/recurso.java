/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.ltp3;

/**
 *
 * @author aluno
 */
public class recurso {
    private int id;
    private String nome;
    private String descricao;
    private int numpatrimonio;
    private int capacidade;
    private tipo tipo;

    public recurso() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNumpatrimonio() {
        return numpatrimonio;
    }

    public void setNumpatrimonio(int numpatrimonio) {
        this.numpatrimonio = numpatrimonio;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public br.edu.ifnmg.tads.ltp3.tipo getTipo() {
        return tipo;
    }

    public void setTipo(br.edu.ifnmg.tads.ltp3.tipo tipo) {
        this.tipo = tipo;
    }

    
}
