public class EspecialUser extends User{
    
    
    public EspecialUser(String name, String cpf, String email, String telefone) {
        super(name, cpf, email, telefone);
    }
    // No meu entendimento usuario criara os em
    public void addBorrowedPublications(PublicationsLoan newPublicationsLoan){
        super.addBorrowedPublications(newPublicationsLoan);
    }
    public void removePublicationLoan(PublicationsLoan publicationsLoan){
        super.removePublicationLoan(publicationsLoan);
    }

    
}