package review_oop.oop_java_2.exercise_2;

public class Book extends Document{
    private String author;
    private int numberOfPages;

    public Book(String documentCode, String imprint, int publicationNumber, String author, int numberOfPages) {
        super(documentCode, imprint, publicationNumber);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "documentCode='" + super.getDocumentCode() + '\'' +
                ", imprint='" + super.getImprint() + '\'' +
                ", publicationNumber=" + super.getPublicationNumber() +
                "author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
