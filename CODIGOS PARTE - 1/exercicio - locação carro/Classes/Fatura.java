package Classes;

public class Fatura {
    private double pagamento;
    private double imposto;

    public Fatura(double pagamento, double imposto) {
        this.pagamento = pagamento;
        this.imposto = imposto;
    }

    public double getPagamento() {
        return pagamento;
    }

    public void setPagamento(double pagamento) {
        this.pagamento = pagamento;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public Fatura(){}

    public double pagamentoTotal(){
        return getPagamento() + getImposto();
    }
}
