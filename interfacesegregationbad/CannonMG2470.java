package interfacesegregationbad;

public class CannonMG2470 implements IPrintTasks{
    @Override
    public boolean PrintContent(String content) {
       return false;


        }


    @Override
    public boolean ScanContent(String content) {
        return false;
    }

    @Override
    public boolean FaxContent(String content) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean PhotoCopyContent(String content) {
        return false;
    }

    @Override
    public boolean PrintDuplexContent(String content) {
        return false;
    }
}
