/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.ltp3;

/**
 *
 * @author aluno
 */
public class discente extends pessoa {

    private int matricula;
    private curso curso;
    private int periodo;
    
    
    
    public discente() {
        matricula = 0;
        curso = new curso();
        periodo = 0;
    }
    
    
   public void addCurso(curso a){
       this.curso = a;
    }
    
   public void setMatricula(int a){
       this.matricula =a;
   }
   public void setPeriodo(int a){
       this.periodo = a;
   }
   
   public int getMatricula(){
       return this.matricula;
   }
   public int getPeriodo(){
       return this.periodo;
   }
    
}
