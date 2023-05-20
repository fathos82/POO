import java.util.ArrayList;

public abstract class User {
    protected String name;
    protected String cpf;
    protected String email;
    protected String telefone;
    protected ArrayList <PublicationsLoan> borrowedPublicationsList;


    public User(String name, String cpf, String email, String telefone) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this. borrowedPublicationsList = new ArrayList(); 
    }
    


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String elefone) {
        this.telefone = telefone;
    }
    public ArrayList<PublicationsLoan> getBorrowedPublications(){
        return borrowedPublicationsList;
    }
    public void addBorrowedPublications(PublicationsLoan newBorrowPublication){
        borrowedPublicationsList.add(newBorrowPublication);
    }
    public void removePublicationLoan(PublicationsLoan publicationsLoan){
        borrowedPublicationsList.remove(publicationsLoan);
    } 
    
}