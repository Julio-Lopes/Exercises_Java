import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Classes.AluguelVeiculo;
import Classes.Veiculo;
import Serviços.Aluguel;
import Serviços.TaxaBrasil;

public class Executer {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Dados do aluguel");

        System.out.println("Modelo do carro: ");
        String modeloCarro = sc.nextLine();

        System.out.println("Horario da retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime inicio = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.println("Horario da retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime fim = LocalDateTime.parse(sc.nextLine(), fmt);

        AluguelVeiculo aluguelCliente = new AluguelVeiculo(inicio, fim, new Veiculo(modeloCarro));

        System.out.println("Entre com o preço por Hora: ");
        double precoHora = sc.nextDouble();
        System.out.println("Entre com o preço por Dia: ");
        double precoDia = sc.nextDouble();

        Aluguel aluguel = new Aluguel(precoHora, precoDia, new TaxaBrasil());
        aluguel.ProcessaFatura(aluguelCliente);

        System.out.println("FATURA:");
        System.out.println("Pagamento Basico: " + String.format("%.2f", aluguelCliente.getFatura().getPagamento()));
        System.out.println("Imposto: " + String.format("%.2f", aluguelCliente.getFatura().getImposto()));
        System.out.println("Pagamento Total: " + String.format("%.2f", aluguelCliente.getFatura().pagamentoTotal()));

        sc.close();
    }
}