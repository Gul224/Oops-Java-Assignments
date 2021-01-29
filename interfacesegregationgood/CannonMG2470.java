package interfacesegregationgood;

public class CannonMG2470 implements IPrintScanContent, IPrintDuplex, IFaxContent {


    @Override
    public boolean PrintContent(String content) {
        return false;
    }

    @Override
    public boolean ScanContent(String content) {
        return false;
    }

    @Override
    public boolean PhotoCopyContent(String content) {
        return false;
    }

    @Override
    public boolean FaxContent(String content) {
        return false;
    }

    @Override
    public boolean PrintDuplexContent(String content) {
        return false;
    }
}
