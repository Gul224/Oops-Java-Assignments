package polymorphism;

public class PrivateInvoice  implements BillInfo {

    @Override
    public void printTotal() {
        System.out.println("Not allowed to view private Invoice");
    }
}
