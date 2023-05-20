public class StandardUser extends User{
    private boolean statePublicationBorrow; 

   public StandardUser(String name, String cpf, String email, String telefone) {
        super(name, cpf, email, telefone);
        this.statePublicationBorrow = false;
    }

   
   

   public void addBorrowedPublications(PublicationsLoan newPublicationsLoan){
    if (statePublicationBorrow) {
        throw new IllegalStateException("Este usuario ja possui uma publicação emprestada, que tal se tornar nosso cliente especial");
    }
    this.statePublicationBorrow = true;
    super.addBorrowedPublications(newPublicationsLoan);
}
public void removePublicationLoan(PublicationsLoan publicationLoan){
    super.removePublicationLoan(publicationLoan);
    this.statePublicationBorrow = false;
}

}