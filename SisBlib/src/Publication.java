import java.time.LocalDate;
import java.util.ArrayList;


public abstract class  Publication {
    protected LocalDate datePublication;  
    protected String titulo;    
    protected ArrayList<Publication> referenceList;  
    protected ArrayList<Author> authorList;  
    protected double fee; 
    protected boolean isBorrowed;

    public Publication(String titulo,LocalDate datePublication, ArrayList<Author> authorList,Double fee){
        this.datePublication = datePublication;
        this.titulo = titulo;
        this.authorList = authorList;
        this.isBorrowed = false;
        this.referenceList =  new ArrayList<>();
        this.fee = fee; 
    }
    
    public void addPublication(Publication publicationReference){
        
        this.referenceList.add(publicationReference);
    }

    public void addActor(Author author){
        this.authorList.add(author);
    }

    public boolean getIsBorrowed(){
        return this.isBorrowed;
    }

    
    public void toggleIsBorrowed(){
        this.isBorrowed = !this.isBorrowed;
    }
    public double getFee() {
        return this.fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }


}