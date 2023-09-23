package classes;

public class retangulos {
     public Double largura;
     public Double altura;

     public double areaRetangulo(){
          return largura * altura;
     }

     public double perimetroRetangulo(){
          return 2 * (largura + altura);
     }

     public double diagonalRetangulo(){
          return Math.sqrt((largura * largura) + (altura * altura));
     }
}