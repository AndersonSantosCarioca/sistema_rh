package entidade;

import java.sql.Date;

import Interfaces.CalculoTrabalhistas;
import abstracts.Funcionario;

public class Atendente extends Funcionario implements CalculoTrabalhistas{
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
    public Atendente(String nome, String cpf, String endereco, int telefone, Date dataNascimento, String ctps,
            String cargo, String cargo2, double salario) {
        super(nome, cpf, endereco, telefone, dataNascimento, ctps, cargo);
        cargo = cargo2;
        this.salario = salario;
    }
    public Atendente(String nome, String cpf, String endereco, int cep, double salario, double fGTS, double iNSS,
            double fERIAS, String ctps, String cargo, String cargo2, double salario2) {
        super(nome, cpf, endereco, cep, salario, fGTS, iNSS, fERIAS, ctps, cargo);
        cargo = cargo2;
        salario = salario2;
    }
    @Override
    public void calculaFgts() {
            double aliquota = 0.06;
        throw new UnsupportedOperationException("Unimplemented method 'calculaFgts'");
    }
    @Override
    public void calculaInss() {
            double aliquota = 0.04;
        throw new UnsupportedOperationException("Unimplemented method 'calculaInss'");
    }
    @Override
    public void calculaDecimoTerceiro() {
            double aliquota = 1/12;
        throw new UnsupportedOperationException("Unimplemented method 'calculaDecimoTerceiro'");
    }
    @Override
    public void calculaFerias() {
            double aliquota = 1/3 ;
        throw new UnsupportedOperationException("Unimplemented method 'calculaFerias'");
    }
    
  

}
