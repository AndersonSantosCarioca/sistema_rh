package abstracts;

import java.sql.Date;

public class Pessoa {
    String nome;
    String cpf;
    String endereco;
    int telefone;
    Date dataNascimento; 
  
    
    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Pessoa(String nome, String cpf, String endereco, int telefone, Date dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    public Pessoa(String nome, String cpf, String endereco, int cep, double salario, double fGTS, double iNSS,
            double fERIAS) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
      
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    } 

   
}
