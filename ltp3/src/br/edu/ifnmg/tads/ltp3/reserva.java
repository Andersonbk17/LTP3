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
public class reserva {
    private int id ;
    private Date dataInicio;
    private Date dataFim;
    private Date dataCadastro;
    private docente responsavel;
    private pessoa pessoa;
    private recurso recurso;
    
    
   /* public reserva(){
        id = 0;
        datainicio = new Date();
        datafim = new Date();
        datacadastro = new Date();
        responsavel = new docente();
        pessoa = new pessoa();
        recurso = new recurso();
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

    public docente getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(docente responsavel) {
        this.responsavel = responsavel;
    }

    public br.edu.ifnmg.tads.ltp3.pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(br.edu.ifnmg.tads.ltp3.pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public br.edu.ifnmg.tads.ltp3.recurso getRecurso() {
        return recurso;
    }

    public void setRecurso(br.edu.ifnmg.tads.ltp3.recurso recurso) {
        this.recurso = recurso;
    }

    
    
}
