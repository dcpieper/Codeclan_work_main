public class Book {

    private String name;
    private String author;
    private String genre;

    public Book(String name, String author, String genre){
        this.name = name;
        this.author = author;
        this.genre = genre;
    }

    public String bookName() {
        return name;
    }

    public String bookAuthor() {
        return author;
    }

    public String bookGenre() {
        return genre;
    }
}
