/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.ltp3;

/**
 *
 * @author aluno
 */
public class telefone {
    private int id;
    private int ddd;
    private int numero;

    public telefone() {
        id = 0;
        ddd = 0;
        numero = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.id;
        hash = 23 * hash + this.ddd;
        hash = 23 * hash + this.numero;
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
        final telefone other = (telefone) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.ddd != other.ddd) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "telefone{" + "id=" + id + ", ddd=" + ddd + ", numero=" + numero + '}';
    }
    
 
}
