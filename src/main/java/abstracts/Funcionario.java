package abstracts;

import java.sql.Date;

public abstract class Funcionario extends Pessoa{
    public String getCtps() {
        return ctps;
    }
    public void setCtps(String ctps) {
        this.ctps = ctps;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    String ctps;
    String cargo;
    public Funcionario(String nome, String cpf, String endereco, int telefone, Date dataNascimento, String ctps,
            String cargo) {
        super(nome, cpf, endereco, telefone, dataNascimento);
        this.ctps = ctps;
        this.cargo = cargo;
    }
    public Funcionario(String nome, String cpf, String endereco, int cep, double salario, double fGTS, double iNSS,
            double fERIAS, String ctps, String cargo) {
        super(nome, cpf, endereco, cep, salario, fGTS, iNSS, fERIAS);
        this.ctps = ctps;
        this.cargo = cargo;
    }

   
    
}
