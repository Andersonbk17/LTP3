/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.ltp3;

/**
 *
 * @author aluno
 */
public class Discente extends Pessoa {

    private int matricula;
    private Curso curso;
    private int periodo;
    
    
    
    public Discente() {
        matricula = 0;
        curso = new Curso();
        periodo = 0;
    }

    public br.edu.ifnmg.tads.ltp3.Curso getCurso() {
        return curso;
    }

    public void setCurso(br.edu.ifnmg.tads.ltp3.Curso curso) {
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
