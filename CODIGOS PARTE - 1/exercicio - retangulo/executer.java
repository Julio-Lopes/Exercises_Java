import java.util.Locale;
import java.util.Scanner;

import classes.retangulos;

public class executer {
     public static void main(String[] args) {
          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);

          retangulos retangulo = new retangulos();
          System.out.println("Digite a Largura e a Base do retangulo");
          retangulo.largura = sc.nextDouble();
          retangulo.altura = sc.nextDouble();

          System.out.println("Largura: " + retangulo.largura);
          System.out.println("Altura: " + retangulo.altura);
          System.out.println("Area: " + retangulo.areaRetangulo());
          System.out.println("Perimetro: " + retangulo.perimetroRetangulo());
          System.out.println("Diagonal: " + retangulo.diagonalRetangulo());


          sc.close();
     }
}