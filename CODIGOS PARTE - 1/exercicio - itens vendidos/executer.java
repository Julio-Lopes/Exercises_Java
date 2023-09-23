import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Classes.Produtos;

public class executer{
    public static void main(String[]args) {
        List<Produtos> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        
        File arquivo = new File("CSV/sumario.csv");
        String arquivoParent = arquivo.getParent();

        boolean sucesso = new File(arquivoParent, "/out").mkdir();
        System.out.println(sucesso);

        String pegaArquivo = arquivoParent + "/out/sumario.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(arquivo))){
            String itemCsv = br.readLine();
            while (itemCsv != null){
                String[] campos = itemCsv.split(",");
                String nome = campos[0];
                double preco = Double.parseDouble(campos[1]);
                int quantidade = Integer.parseInt(campos[2]);

                lista.add(new Produtos(nome, preco, quantidade));

                itemCsv = br.readLine();
            }
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(pegaArquivo))){
                for (Produtos item : lista){
                    bw.write(item.getNome() + "," + String.format("%.2f", item.total()));
                    bw.newLine();
                }
                System.out.println("Criado com sucesso");
            }catch(IOException e){
                System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            }

        }catch(IOException e){
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        sc.close();
    }
}