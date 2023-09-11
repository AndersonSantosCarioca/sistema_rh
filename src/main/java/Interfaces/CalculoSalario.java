package Interfaces;
import java.util.Scanner;



public interface CalculoSalario {

    public class CalcularSalarioFuncionario{
        Scanner sc = new Scanner(System.in);
        private String cargoFuncionario;

        public void cargoFuncionario(){

            System.out.println("Funcionario. ");
                String cargoFuncionario = sc.nextLine();
        }
                   

        public CalcularSalarioFuncionario(String cargoFuncionario) {
            this.cargoFuncionario = cargoFuncionario;

           

            System.out.println("Digite o cargo do funcionário: ");
            System.out.println("(1)Atendente\n,(2)Supervisor\n,(3)Gerente");
            int escolha ;

            switch(escolha) {
                case 1:
                    System.out.println("dd");
                    break;
                case 2:
                    System.out.println("ddd");
                    break;
                case 3:
                    System.out.println("ghgh");
                    break;            
                default:
                    System.out.println("Funcionário não cadastrado.");
                    break;
            }
    
        }

       

        

       
    }
    
}
