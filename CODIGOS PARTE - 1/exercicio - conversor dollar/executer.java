import java.util.Locale;
import java.util.Scanner;

import conversao.*;

public class executer {
     public static void main(String[] args) {
          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);

          System.out.println("Qual o preço do Dollar?");
          double dollar = sc.nextDouble();
          System.out.println("Quantos Dollars deseja comprar?");
          double dollarPrice = sc.nextDouble();

          System.out.println("Voce pagara = R$" + conversor.conversorDollar(dollar, dollarPrice) + " Pelos Dollars contendo 6% de imposto");

          sc.close();
     }
}