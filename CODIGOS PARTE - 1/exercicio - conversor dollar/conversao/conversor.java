package conversao;

public class conversor {
     public static int porc = 6;

     public static double conversorDollar(double priceDollar, double dollar) {
          return priceDollar * dollar + (priceDollar * dollar * porc / 100);
     }
}