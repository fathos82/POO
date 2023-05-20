import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();

        ArrayList<Author> authors = new ArrayList<Author>();
        
        Author author1 = new Author("John Doe", "1233");
        Author author2 = new Author("Jane Smith", "12341");
        
        authors.add(author1);
        authors.add(author2);
        // int editionNumber, String editionName, String isbn, double lateFee
        Book book1 = new Book("Dom Quixote", nowDate, authors, 800,"edu","AFSS", 50.0);
        Book book2 = new Book("Memórias Póstumas de Brás Cubas", nowDate, authors, 300,"edu","AFSS", 30.0);

        Library library = new Library("Biblioteca Municipal", "Rua das Flores, 123");

        library.addPublication(book1);
        library.addPublication(book2);

        StandardUser user1 = new StandardUser("João", "111.111.111-11", "joao@gmail.com", "(11) 1111-1111");
        StandardUser user2 = new StandardUser("Maria", "222.222.222-22", "maria@gmail.com", "(22) 2222-2222");
        EspecialUser user3 = new EspecialUser("José", "333.333.333-33", "jose@gmail.com", "(33) 3333-3333");

        library.borrowPublication(user3, book1);
        library.returnPublication(user3, book1);
        
        // library.borrowPublication(user2, book1);
        
        // library.borrowPublication(user3, book2);

        System.out.println(user1.getBorrowedPublications());
        System.out.println(user2.getBorrowedPublications());
        System.out.println(user3.getBorrowedPublications());
    }
}
