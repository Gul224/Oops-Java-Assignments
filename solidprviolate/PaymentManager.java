package solidprviolate;

public class PaymentManager {
   String Amount;
   String paymentMode;
   String googlePay;
   String paytm;


    public String getAmount() {
        return Amount;
    }

    public String getGooglePay() {
        return googlePay;
    }

    public String getPaytm() {
        return paytm;
    }

    public void setAmount(String amount) {
        Amount = "10000";
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }
}
