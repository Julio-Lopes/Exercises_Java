package classes;

public class Funcionarios {
     public String nome;
     public double salarioBruto;
     public double imposto;

     public double salarioLiquido(){
          return salarioBruto - imposto;
     }

     public double aumentoSalario(Double porcetagem){
          return salarioBruto * porcetagem / 100 + salarioBruto - imposto;
     }
}
