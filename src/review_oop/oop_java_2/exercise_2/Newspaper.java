package review_oop.oop_java_2.exercise_2;

public class Newspaper extends Document{
    private String releaseDate;

    public Newspaper(String documentCode, String imprint, int publicationNumber, String releaseDate) {
        super(documentCode, imprint, publicationNumber);
        this.releaseDate = releaseDate;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "documentCode='" + super.getDocumentCode() + '\'' +
                ", imprint='" + super.getImprint() + '\'' +
                ", publicationNumber=" + super.getPublicationNumber() +
                "releaseDate='" + releaseDate + '\'' +
                '}';
    }
}
