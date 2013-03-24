/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.ltp3;
import java.util.Date;

/**
 *
 * @author aluno
 */
public class Reserva {
    private int id ;
    private Date dataInicio;
    private Date dataFim;
    private Date dataCadastro;
    private Docente responsavel;
    private Pessoa pessoa;
    private Recurso recurso;
    
    
   /* public Reserva(){
        id = 0;
        datainicio = new Date();
        datafim = new Date();
        datacadastro = new Date();
        responsavel = new Docente();
        Pessoa = new Pessoa();
        Recurso = new Recurso();
    }

  */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Docente getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Docente responsavel) {
        this.responsavel = responsavel;
    }

    public br.edu.ifnmg.tads.ltp3.Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(br.edu.ifnmg.tads.ltp3.Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public br.edu.ifnmg.tads.ltp3.Recurso getRecurso() {
        return recurso;
    }

    public void setRecurso(br.edu.ifnmg.tads.ltp3.Recurso recurso) {
        this.recurso = recurso;
    }

    
    
}
