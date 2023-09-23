package classes;

import java.io.PrintStream;

public class triangulo {
     public double a;
     public double b;
     public double c;

     public double area(){
          double p = (a + b + c) / 2.0;
          return Math.sqrt(p*(p - a)*(p - b)*(p - c));
     }

     public static PrintStream maiorArea(double areaX,double areaY){
          if (areaX > areaY ){
               return System.out.printf("A maior area é X: %.4f%n" , areaX);
          }else{
               return System.out.printf("A maior area é Y: %.4f%n" , areaY);
          }
     }
}    

