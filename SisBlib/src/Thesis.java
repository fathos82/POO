import java.time.LocalDate;
import java.util.ArrayList;

public class Thesis extends Publication{

    private int numberPages;
    private String sumary;
    private LocalDate dateDefense;  
    private String institute;
    
    public Thesis(String titulo, LocalDate datePublication, ArrayList<Author> authorList, int numberPages, String sumary, LocalDate dateDefense, String institute, double lateFee) {
        super(titulo, datePublication, authorList, lateFee);
        this.numberPages = numberPages;
        this.sumary = sumary;
        this.dateDefense = dateDefense;
        this.institute = institute;
    }


    public int getNumberPages() {
        return this.numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    public String getSumary() {
        return this.sumary;
    }

    public void setSumary(String sumary) {
        this.sumary = sumary;
    }

    public LocalDate getDateDefense() {
        return this.dateDefense;
    }

    public void setDateDefense(LocalDate dateDefense) {
        this.dateDefense = dateDefense;
    }

    public String getInstitute() {
        return this.institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

}