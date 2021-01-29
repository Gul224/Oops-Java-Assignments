package interfacesegregationgood;

public class HPLaserJet implements IPrintScanContent{
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


}
