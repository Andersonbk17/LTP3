/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.ltp3;

import java.util.Objects;

/**
 *
 * @author aluno
 */
public class endereco {
    private int id;
    private String rua;
    private int num;
    private String comp;
    private String bairro;
    private int cep;
    private String cidade;
    private String estado;

    public endereco() {
        id = 0;
        rua = "";
        num = 0;
        comp = "";
        bairro = "";
        cep = 0;
        cidade = "";
        estado = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getComp() {
        return comp;
    }

    public void setComp(String comp) {
        this.comp = comp;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.id;
        hash = 41 * hash + Objects.hashCode(this.rua);
        hash = 41 * hash + this.num;
        hash = 41 * hash + Objects.hashCode(this.comp);
        hash = 41 * hash + Objects.hashCode(this.bairro);
        hash = 41 * hash + this.cep;
        hash = 41 * hash + Objects.hashCode(this.cidade);
        hash = 41 * hash + Objects.hashCode(this.estado);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final endereco other = (endereco) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.rua, other.rua)) {
            return false;
        }
        if (this.num != other.num) {
            return false;
        }
        if (this.cep != other.cep) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "endereco{" + "id=" + id + ", rua=" + rua + ", num=" + num + ", comp=" + comp + ", bairro=" + bairro + ", cep=" + cep + ", cidade=" + cidade + ", estado=" + estado + '}';
    }
    
   
    
    
}
