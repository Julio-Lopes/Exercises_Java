import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Class.Contract;
import Class.Installment;
import Services.ContractService;
import Services.PaypalService;

public class Executer {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato:");
        System.out.println("Numero: ");
        int number = sc.nextInt();
        System.out.println("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.println("Valor do contrato: ");
        double totalValue= sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.println("Entre com o numero de parcelas: ");
        int installment = sc.nextInt();
        
        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, installment);

        System.out.println("Parcelas: ");
        for (Installment i : contract.getInstallment()){
            System.out.println(i);
        }
        sc.close();
    }
}