package classes;

public class produtos {
     public String nome;
     public double preco;
     public int quantidade;

     public double totalEstoque(){
          return preco * quantidade;
     }

     public void addProduto(int quantidade){
          this.quantidade += quantidade;
     }

     public void removProduto(int quantidade){
          this.quantidade -= quantidade;
     }

     public String toString(){
          return "Nome: "+ nome + ", Preço: $" + String.format("%.2f", preco) + ", Quantidade: " + quantidade + ", Total: $" + String.format("%.2f", totalEstoque());
     }

     
}