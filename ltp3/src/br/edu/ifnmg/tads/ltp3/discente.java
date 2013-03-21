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

    public br.edu.ifnmg.tads.ltp3.curso getCurso() {
        return curso;
    }

    public void setCurso(br.edu.ifnmg.tads.ltp3.curso curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    
    
   
    
}
