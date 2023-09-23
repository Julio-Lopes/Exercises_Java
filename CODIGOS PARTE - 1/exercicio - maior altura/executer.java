import java.util.Locale;
import java.util.Scanner;


import classes.pessoas;

public class executer{
     public static void main(String[] args) {
          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);
          double sum = 0;
          String nome = null;

          System.out.println("Digite o numero total de pessoas: ");
          int n = sc.nextInt();
          pessoas[] pessoa = new pessoas[n];
          
          for (int i=0; i < pessoa.length ; i++){
               sc.nextLine();
               String name = sc.nextLine();
               Double altura = sc.nextDouble();
               pessoa[i] = new pessoas(name, altura);
          }

          for (int i=0; i < pessoa.length; i++){
               if (sum == 0){
                    sum = pessoa[i].getAltura();
               } if (pessoa[i].getAltura() > sum){
                    sum = pessoa[i].getAltura();
                    nome = pessoa[i].getName();
               }

          }
          System.out.println("A pessoa com mais altura é : " + nome + ", " + sum + "cm");
          
          sc.close();
     }
}