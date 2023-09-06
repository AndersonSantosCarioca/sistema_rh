package entidade;

public class Supervisor {
    String cargo;
    double salario;
    double descFgts;
    double descInss;
    double ferias;
    
    public Supervisor(String cargo, double salario, double descFgts, double descInss, double ferias) {
        this.cargo = cargo;
        this.salario = salario;
        this.descFgts = descFgts;
        this.descInss = descInss;
        this.ferias = ferias;
    }

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

}
