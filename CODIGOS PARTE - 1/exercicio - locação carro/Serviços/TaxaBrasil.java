package Serviços;

public class TaxaBrasil implements TaxaServico{
    public double taxa(double amount){
        if (amount <= 100.0){
            return amount * 0.2;
        }else{
            return amount * 0.15;
        }
    }
}