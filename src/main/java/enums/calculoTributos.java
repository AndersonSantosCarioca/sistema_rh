package enums;

public enum calculoTributos {
    FGTS(3.00),INSS(15.00),DECIMOTERCEIRO(12),FERIAS(12);

    double valor;

    calculoTributos(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {       
        return super.toString();
    }

  
    
}
