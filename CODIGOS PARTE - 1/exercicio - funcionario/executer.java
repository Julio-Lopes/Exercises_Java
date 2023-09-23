import java.util.Locale;
import java.util.Scanner;

import classes.Funcionarios;

public class executer {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          Locale.setDefault(Locale.US);

          System.out.println("Digite as informações do funcionario:");
          Funcionarios funcionario = new Funcionarios();
          funcionario.nome = sc.nextLine();
          funcionario.salarioBruto = sc.nextDouble();
          funcionario.imposto = sc.nextDouble();

          System.out.println(funcionario.nome + ", $" + funcionario.salarioLiquido());

          System.out.println("Digite o aumento em % que deseja dar ao funcionario:");
          double aumento = sc.nextDouble();
          System.out.println("Salario atualizado: " + funcionario.nome + ", $" + funcionario.aumentoSalario(aumento));
          

          sc.close();
     }
}