package classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class lista {
     private static List<String> listaNome = new ArrayList<>();
     private static List<Double> listaValor = new ArrayList<>();

     public lista(String nome, Double valor) {
          lista.listaNome.add(nome);
          lista.listaValor.add(valor);
     }
     public List<String> getListaNome() {
          return listaNome;
     }
     public void setListaNome(List<String> listaNome) {
          lista.listaNome = listaNome;
     }
     public List<Double> getListaValor() {
          return listaValor;
     }
     public void setListaValor(List<Double> listaValor) {
          lista.listaValor = listaValor;
     }

     public static void MostrarLista(){
          Iterator<String> nomeIterator = listaNome.iterator();
          Iterator<Double> valorIterator = listaValor.iterator();

          while (nomeIterator.hasNext() && valorIterator.hasNext()) {
               String nome = nomeIterator.next();
               Double valor = valorIterator.next();
                 
               System.out.println("Nome: " + nome + " Valor: $" + valor);
           }
     }

     public static void removerProduto(String nome){
          int index = listaNome.indexOf(nome);
          listaNome.remove(index);
          listaValor.remove(index);
     }

     public static void totalProduto(){
          double sum = 0;

          for (double x : listaValor){
               sum = sum + x;
          }
          System.out.println("Total dos valores dos produtos é: " + sum);
     }
}