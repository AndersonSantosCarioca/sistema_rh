package entidade;

import java.sql.Date;

import abstracts.Funcionario;

public class Gerente extends Funcionario{
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    String cargo;
    double salario;
    public Gerente(String nome, String cpf, String endereco, int telefone, Date dataNascimento, String ctps,
            String cargo, String cargo2, double salario) {
        super(nome, cpf, endereco, telefone, dataNascimento, ctps, cargo);
        cargo = cargo2;
        this.salario = salario;
    }
    public Gerente(String nome, String cpf, String endereco, int cep, double salario, double fGTS, double iNSS,
            double fERIAS, String ctps, String cargo, String cargo2, double salario2) {
        super(nome, cpf, endereco, cep, salario, fGTS, iNSS, fERIAS, ctps, cargo);
        cargo = cargo2;
        salario = salario2;
    }
    
 
    
}
