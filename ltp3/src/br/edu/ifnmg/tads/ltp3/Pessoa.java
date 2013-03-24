/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.ltp3;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
/**
 *
 * @author aluno
 */
public class Pessoa {
    
    private int id;
    private String nome;
    private Date nascimento;
    private String rg;
    private int cpf;
    private List<Endereco> enderecos;
    private List<Telefone> telefones;
    private List<Email> emails;

    public Pessoa(){
        id = 0;
        nome = "";
        rg = "";
        cpf = 0;
        enderecos = new LinkedList<Endereco>();
        telefones = new LinkedList<Telefone>();
        emails = new LinkedList<Email>();
        
    }
    
    
    public void addEndereco(Endereco e){
        if(!enderecos.contains(e)){
            this.enderecos.add(e);
        }
    }
    
    public void addTelefone(Telefone t){
        if(!telefones.contains(t)){
            this.telefones.add(t);
        }
    }
    public void addEmail(Email e){
        if(!emails.contains(e)){
               this.emails.add(e);
        }
    }
    
    
    public void removeEmails(Email e){
        if(emails.contains(e)){
               emails.remove(e);
        }
    }
    
    public void removeEnderecos(Endereco e){
        if(enderecos.contains(e)){
            enderecos.remove(e);
        }
    }
    
    public void removeTelefones(Telefone t){
        if(telefones.contains(t)){
            telefones.remove(t);
        }
    }
    
        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id > 1) {
            this.id = id;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if((nome.length()>3) && (nome.length()<250 )) {
            this.nome = nome;
        }
        else {
            throw new Exception("Não podem haver nomes com menos de 3 letras e mais do que 250 letras");
        }
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public List<br.edu.ifnmg.tads.ltp3.Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<br.edu.ifnmg.tads.ltp3.Endereco> endereco) {
        this.enderecos = endereco;
    }

    public List<br.edu.ifnmg.tads.ltp3.Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<br.edu.ifnmg.tads.ltp3.Telefone> telefone) {
        this.telefones = telefone;
    }

    public List<br.edu.ifnmg.tads.ltp3.Email> getEmails() {
        return emails;
    }

    public void setEmails(List<br.edu.ifnmg.tads.ltp3.Email> email) {
        this.emails = email;
    }

   

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

   

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.nascimento);
        hash = 97 * hash + Objects.hashCode(this.rg);
        hash = 97 * hash + this.cpf;
        hash = 97 * hash + Objects.hashCode(this.enderecos);
        hash = 97 * hash + Objects.hashCode(this.telefones);
        hash = 97 * hash + Objects.hashCode(this.emails);
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
        final Pessoa other = (Pessoa) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.nascimento, other.nascimento)) {
            return false;
        }
        if (!Objects.equals(this.rg, other.rg)) {
            return false;
        }
        if (this.cpf != other.cpf) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pessoa{" + "id=" + id + ", nome=" + nome + ", nascimento=" + nascimento + ", rg=" + rg + ", cpf=" + cpf + ", endereco=" + enderecos + ", telefone=" + telefones + ", email=" + emails + '}';
    }

   
    
   
}
