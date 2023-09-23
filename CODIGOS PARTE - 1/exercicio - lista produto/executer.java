import java.util.Scanner;

import classes.lista;

public class executer {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          while (true){
               System.out.println("1 - Adicionar Produto");
               System.out.println("2 - Mostrar Produtos");
               System.out.println("3 - Remover Produtos");
               System.out.println("4 - Valor Total dos Produtos");
               System.out.println("5 - Sair");
               int entrada = sc.nextInt();

               if(entrada == 5){
                    break;
               }if(entrada == 1){
                    System.out.println("Nome do Produto: ");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    System.out.println("Valor do Produto: ");
                    Double valor = sc.nextDouble();
                    new lista(nome, valor);
               }if (entrada == 2){
                    classes.lista.MostrarLista();
               }if(entrada == 3){
                    sc.nextLine();
                    System.out.println("Nome do produto a ser removido: ");
                    String nome = sc.nextLine();
                    classes.lista.removerProduto(nome);
               }if (entrada == 4){
                    classes.lista.totalProduto();
               }
          }
          sc.close();
     }    
}