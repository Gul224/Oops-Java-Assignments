package polymorphism;

public class Main {
    public static void main(String[] args) {
        Invoice medical = new Invoice();

        medical.addBill(2395);
        medical.addBill(3458);
        medical.addBill(76545, 0.75f);
        medical.addBill(34096, 0.25f);
        medical.addBill(459);
        medical.printTotal();

        PrivateInvoice secretBill = new PrivateInvoice();
        secretBill.printTotal();

        // runtime Polymorphism
        // depending on the object bill info will print different result
        BillInfo billInfo;

        billInfo = medical;
        billInfo.printTotal();

        billInfo = secretBill;
        secretBill.printTotal();

    }
}
