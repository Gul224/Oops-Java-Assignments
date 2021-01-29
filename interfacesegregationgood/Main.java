package interfacesegregationgood;

public class Main {
    public static void main(String[] args) {
        IPrintScanContent printScanContent;
        IFaxContent faxContent;
        IPrintDuplex printDuplex;

        printScanContent = new HPLaserJet();
        System.out.println("Print Done");
        System.out.println("Scan Done");
        System.out.println("Photo Copy Done");

        faxContent = new CannonMG2470();
        System.out.println("Fax Done");

        printDuplex = new CannonMG2470();
        System.out.println("Print Duplex done");


    }
}
