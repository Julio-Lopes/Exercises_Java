import java.util.Locale;
import java.util.Scanner;

import classes.produtos;

public class executer{
     public  static void main(String[] args) {
          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);

          produtos produto = new produtos();
          System.out.println("entre com o produto: ");
          System.out.print("Nome: ");
          produto.nome = sc.nextLine();
          System.out.print("Preco: ");
          produto.preco = sc.nextDouble();
          System.out.print("Quantidade: ");
          produto.quantidade = sc.nextInt();

          System.out.println();
          System.out.println(produto);
          System.out.println();

          System.out.print("Quantidade a ser adicionado: ");
          int quantidade = sc.nextInt();
          produto.addProduto(quantidade);
          System.out.println();
          System.out.println(produto);
          System.out.println();

          System.out.print("Quantidade a ser removido: ");
          quantidade = sc.nextInt();
          produto.removProduto(quantidade);
          System.out.println();
          System.out.println(produto);
          System.out.println();

          sc.close();
     }  
}