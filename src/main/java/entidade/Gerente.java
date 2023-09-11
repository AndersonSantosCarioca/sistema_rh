package entidade;

import java.sql.Date;

import abstracts.Funcionario;
import enums.Cargo;

public class Gerente extends Funcionario{
    public Gerente(String nome, String cpf, String endereco, int telefone, Date dataNascimento, String ctps,
            String cargo) {
        super(nome, cpf, endereco, telefone, dataNascimento, ctps, cargo);
       
    }

    /**
     * 
     */
    public void calculaFgts(){
        double aliquota = 0.11;
        double tributodevido;
        Cargo[] lista = this.cargo.Atendente.values();
        final double salario = lista[].getSalario();

        tributodevido = salario * aliquota;
    }

    public void calculaInss(){
        double aliquota = 0.06;
    }
    public void calculaDecimoTerceiro(){
        double aliquota = 1/12;
    }
    public void calculaFerias(){
        double aliquota = 1/3;
    }
   
  
    
 
    
}
