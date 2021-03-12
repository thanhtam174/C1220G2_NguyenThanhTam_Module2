package review_oop.oop_java_2.exercise_2;

public class Document {
    private String documentCode;
    private String imprint;
    private int publicationNumber;

    public Document(String documentCode, String imprint, int publicationNumber) {
        this.documentCode = documentCode;
        this.imprint = imprint;
        this.publicationNumber = publicationNumber;
    }

    public String getDocumentCode() {
        return documentCode;
    }

    public void setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
    }

    public String getImprint() {
        return imprint;
    }

    public void setImprint(String imprint) {
        this.imprint = imprint;
    }

    public int getPublicationNumber() {
        return publicationNumber;
    }

    public void setPublicationNumber(int publicationNumber) {
        this.publicationNumber = publicationNumber;
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentCode='" + documentCode + '\'' +
                ", imprint='" + imprint + '\'' +
                ", publicationNumber=" + publicationNumber +
                '}';
    }
}
