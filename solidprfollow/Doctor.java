package solidprfollow;

public class Doctor extends Person {
    private String docName;
    private String docID;
    private boolean isDocAvailable;


    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDocID() {
        return docID;
    }

    public void setDocID(String docID) {
        this.docID = docID;
    }

    public boolean isDocAvailable() {
        return isDocAvailable;
    }

    public void setDocAvailable(boolean docAvailable) {
        isDocAvailable = docAvailable;
    }
}
