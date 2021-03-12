package review_oop.oop_java_2.exercise_2;

public class Journal extends Document{
    private String numberOfRelease;
    private String monthOfRelease;

    public Journal(String documentCode, String imprint, int publicationNumber, String numberOfRelease, String monthOfRelease) {
        super(documentCode, imprint, publicationNumber);
        this.numberOfRelease = numberOfRelease;
        this.monthOfRelease = monthOfRelease;
    }

    public String getNumberOfRelease() {
        return numberOfRelease;
    }

    public void setNumberOfRelease(String numberOfRelease) {
        this.numberOfRelease = numberOfRelease;
    }

    public String getMonthOfRelease() {
        return monthOfRelease;
    }

    public void setMonthOfRelease(String monthOfRelease) {
        this.monthOfRelease = monthOfRelease;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "documentCode='" + super.getDocumentCode() + '\'' +
                ", imprint='" + super.getImprint() + '\'' +
                ", publicationNumber=" + super.getPublicationNumber() +
                "numberOfRelease='" + numberOfRelease + '\'' +
                ", monthOfRelease='" + monthOfRelease + '\'' +
                '}';
    }
}
