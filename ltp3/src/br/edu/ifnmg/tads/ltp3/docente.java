/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.ltp3;

/**
 *
 * @author aluno
 */
public class docente extends pessoa {
    
    private String titulacao;
    private String nivel;
    private int siape;
    
    public docente() {
        titulacao = "";
        nivel = "";
        siape = 0;
        
    }
    
    public void setTitulacao(String a){
        this.titulacao = a;
    }
    public void setNivel(String a){
        this.nivel = a;
    }
    public void setSiape(int a){
        this.siape = a;
    }
    
    public String getTitulacao(){
        return this.titulacao;
    }
    public String getNivel(){
        return this.nivel;
    }
    public int getSiape(){
        return this.siape;
    }
    
    
    
    
    
    
}
