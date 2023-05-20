import java.time.LocalDateTime;
import java.time.Period;

public class PublicationsLoan {
    // date
    private Publication publication;
    private LocalDateTime  dueDate;

    public PublicationsLoan(Publication publication){
        this.setPublication(publication);
        this.setDueDate(); 
    }
    public Publication getPublication() {
        return this.publication;
        
    }
    
    private void setPublication(Publication publication) {
        if(publication.getIsBorrowed()){
            //throw
            return;
        }
        this.publication = publication;
    }
    private void setDueDate(){
        int daysToDue = 7;
        this.dueDate = LocalDateTime.now();
        this.dueDate = this.dueDate.plusDays(daysToDue); 
    }
    public boolean checkLate(){
        LocalDateTime nowDate = LocalDateTime.now();
        if(this.dueDate.isBefore(nowDate)){
            return true;
        }
        return false;
    }
    public double calculateLateFee(){
        if(this.checkLate()){
            LocalDateTime nowDate = LocalDateTime.now();
            Period period = Period.between(this.dueDate.toLocalDate(), nowDate.toLocalDate());
            int daysOfDelay = period.getDays(); 
            double lateFee = publication.getFee() * daysOfDelay;
            return lateFee; 
        }
        return 0.0;

    }
    
    


}