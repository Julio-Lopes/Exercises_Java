package Serviços;

import java.time.Duration;

import Classes.AluguelVeiculo;
import Classes.Fatura;

public class Aluguel {
    private double precoHora;
    private double precoDia;
    private TaxaServico taxa;

    public Aluguel(double precoHora, double precoDia, TaxaServico taxa) {
        this.precoHora = precoHora;
        this.precoDia = precoDia;
        this.taxa = taxa;
    }

    public void ProcessaFatura(AluguelVeiculo aluguel){
        double minutos = Duration.between(aluguel.getInicio(), aluguel.getFim()).toMinutes();
        double horas = minutos / 60.0;

        double pagamento;
        if (horas <= 12){
           pagamento = precoHora * Math.ceil(horas);
        }else{
            pagamento = precoDia * Math.ceil(horas / 24.0);
        }

        double imposto = taxa.taxa(pagamento);
        aluguel.setFatura(new Fatura(pagamento, imposto));
    }
}