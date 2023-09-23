package classes;

public class pessoas {
     private String name;
     private double altura;

     
     public pessoas(String name, double altura) {
          this.name = name;
          this.altura = altura;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public double getAltura() {
          return altura;
     }
     
     public void setAltura(double altura) {
          this.altura = altura;
     }
}
