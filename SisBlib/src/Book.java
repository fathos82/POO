import java.time.LocalDate;
import java.util.ArrayList;


public class Book extends Publication{
    private int editionNumber;
    private String editionName;
    private String isbn;

    
    public Book(String titulo,LocalDate datePublication, ArrayList<Author> authorList, int editionNumber, String editionName, String isbn, double lateFee) {
        super(titulo, datePublication, authorList, lateFee);
        this.editionNumber = editionNumber;
        this.editionName = editionName;
        this.isbn = isbn;
    }


    public String getEditionName() {
        return this.editionName;
    }

    public void setEditionName(String editionName) {
        this.editionName = editionName;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getEditionNumber() {
        return this.editionNumber;
    }

    public void setEditionNumber(int editionNumber) {
        this.editionNumber = editionNumber;
    }

    
}