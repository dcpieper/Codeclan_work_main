import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private Integer capacity;

    public Library(Integer capacity){
        this.stock = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int bookCount() {
        return this.stock.size();
    }

    public void addBook(Book book) {
        stock.add(book);
    }

    public boolean capacityCheck() {
        if (this.bookCount() < this.capacity){
            return false;}
            else{return true;}
        }
    }
