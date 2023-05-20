import java.time.LocalDate;
import java.util.ArrayList;

public class Article extends Publication{
    private String summary;

    public Article(String titulo, LocalDate datePublication, ArrayList<Author> actorList, String summary, double lateFee) {
        super(titulo, datePublication, actorList, lateFee);
        this.summary = summary; 
        //TODO Auto-generated constructor stub
    }

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

}