package entidade;

import java.sql.Date;

import abstracts.Funcionario;

public class Supervisor extends Funcionario{
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
    public double getDescFgts() {
        return descFgts;
    }
    public void setDescFgts(double descFgts) {
        this.descFgts = descFgts;
    }
    public double getDescInss() {
        return descInss;
    }
    public void setDescInss(double descInss) {
        this.descInss = descInss;
    }
    public double getFerias() {
        return ferias;
    }
    public void setFerias(double ferias) {
        this.ferias = ferias;
    }
    String cargo;
    double salario;
    double descFgts;
    double descInss;
    public Supervisor(String nome, String cpf, String endereco, int telefone, Date dataNascimento, String ctps,
            String cargo, String cargo2, double salario, double descFgts, double descInss, double ferias) {
        super(nome, cpf, endereco, telefone, dataNascimento, ctps, cargo);
        cargo = cargo2;
        this.salario = salario;
        this.descFgts = descFgts;
        this.descInss = descInss;
        this.ferias = ferias;
    }
    public Supervisor(String nome, String cpf, String endereco, int cep, double salario, double fGTS, double iNSS,
            double fERIAS, String ctps, String cargo, String cargo2, double salario2, double descFgts, double descInss,
            double ferias2) {
        super(nome, cpf, endereco, cep, salario, fGTS, iNSS, fERIAS, ctps, cargo);
        cargo = cargo2;
        salario = salario2;
        this.descFgts = descFgts;
        this.descInss = descInss;
        ferias = ferias2;
    }
    double ferias;
    
 

   

}
