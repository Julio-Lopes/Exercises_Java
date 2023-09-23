import java.util.Scanner;
import java.util.Locale;
import classes.triangulo;


public class executer {
     public static void main(String[] args) {
          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);

          triangulo x,y;
          x = new triangulo();
          y = new triangulo();

          System.out.println("Digite a area do triangulo X: ");
          x.a = sc.nextDouble();
          x.b = sc.nextDouble();
          x.c = sc.nextDouble();

          System.out.println("Digite a area do triangulo Y: ");
          y.a = sc.nextDouble();
          y.b = sc.nextDouble();
          y.c = sc.nextDouble();

          double areaX = x.area();
          double areaY = y.area();

          System.out.printf("area do triangulo X: %.4f%n" , areaX);
          System.out.printf("area do triangulo Y: %.4f%n", areaY);

          triangulo.maiorArea(areaX, areaY);
          
          sc.close();
     }
}