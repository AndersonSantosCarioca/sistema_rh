package abstracts;
public class Pessoa {
    String nome;
    String cpf;
    String endereco;
    int cep;
    double salario;
    double FGTS;
    double INSS;
    double FERIAS;
    
    public Pessoa(String nome, String cpf, String endereco, int cep, double salario, double fGTS, double iNSS,
            double fERIAS) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cep = cep;
        this.salario = salario;
        FGTS = fGTS;
        INSS = iNSS;
        FERIAS = fERIAS;
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

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getFGTS() {
        return FGTS;
    }

    public void setFGTS(double fGTS) {
        FGTS = fGTS;
    }

    public double getINSS() {
        return INSS;
    }

    public void setINSS(double iNSS) {
        INSS = iNSS;
    }

    public double getFERIAS() {
        return FERIAS;
    }

    public void setFERIAS(double fERIAS) {
        FERIAS = fERIAS;
    }
}
