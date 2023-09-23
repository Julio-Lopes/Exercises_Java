package Services;

public interface OnlinePaymentService {
    double paymentFee(double amount);
    double interest(Double amount, int months);
}
