package enums;

public enum CalculoSalario {
    ATENDENTE(1300.00),SUPERVISOR(2400.00),GERENTE(3600.00);

    double salario;

    CalculoSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}
