/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.ltp3;

/**
 *
 * @author aluno
 */
public class Administrativo extends Pessoa{
    private String setor;
    private String cargo;
    private int siape;

    public Administrativo() {
        setor = "";
        cargo = "";
        siape = 0;
    }
    
    public void setSiape(int num){
        this.siape = num;
    }
    
    public int getSiape(){
        return this.siape;
    }
    public String getSetor(){
        return this.setor;
    }
    public String getCargo(){
        return this.cargo;
    }
    
    
}
