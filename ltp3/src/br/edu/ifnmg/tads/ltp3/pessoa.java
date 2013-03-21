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
public class pessoa {
    
    private int id;
    private String nome;
    private Date nascimento;
    private String rg;
    private int cpf;
    private List<endereco> endereco;
    private List<telefone> telefone;
    private List<email> email;

    public pessoa(){
        id = 0;
        nome = "";
        rg = "";
        cpf = 0;
        endereco = new LinkedList<endereco>();
        telefone = new LinkedList<telefone>();
        email = new LinkedList<email>();
        
    }
    
    
    public void addEndereco(endereco e){
        this.endereco.add(e);
    }
    
    public void addTelefone(telefone t){
        this.telefone.add(t);
    }
    public void addEmail(email e){
        this.email.add(e);
    }
    
    
        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id > 1)
            this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if((nome.length()>3) && (nome.length()<250 ))
            this.nome = nome;
        else
            throw new Exception("Não podem haver nomes com menos de 3 letras e mais do que 250 letras");
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public List<br.edu.ifnmg.tads.ltp3.endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<br.edu.ifnmg.tads.ltp3.endereco> endereco) {
        this.endereco = endereco;
    }

    public List<br.edu.ifnmg.tads.ltp3.telefone> getTelefone() {
        return telefone;
    }

    public void setTelefone(List<br.edu.ifnmg.tads.ltp3.telefone> telefone) {
        this.telefone = telefone;
    }

    public List<br.edu.ifnmg.tads.ltp3.email> getEmail() {
        return email;
    }

    public void setEmail(List<br.edu.ifnmg.tads.ltp3.email> email) {
        this.email = email;
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
        hash = 97 * hash + Objects.hashCode(this.endereco);
        hash = 97 * hash + Objects.hashCode(this.telefone);
        hash = 97 * hash + Objects.hashCode(this.email);
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
        final pessoa other = (pessoa) obj;
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
        return "pessoa{" + "id=" + id + ", nome=" + nome + ", nascimento=" + nascimento + ", rg=" + rg + ", cpf=" + cpf + ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email + '}';
    }

   
    
   
}
