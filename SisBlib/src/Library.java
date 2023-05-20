import java.util.ArrayList;
import java.util.Date;

public class Library {

    private final String name;
    private final String andress;
    private ArrayList<Publication> publicationsList;
    // ArrayList<User> usersList; 


    public Library(String name, String andress) {
        this.name = name;
        this.andress = andress;
        this.publicationsList = new ArrayList<>(); 
    }
    
    
    // public void addUser(User user){
    //     usersList.add(user);
    // }
    // public void removeUser(User user){
    //     //if atrasos
    //     usersList.remove(user);
    // }


    public String getName() {
        return this.name;
    }

    
    public String getAndress() {
        return this.andress;
    }

    public ArrayList<Publication> getPublicationsList() {
        return this.publicationsList;
    }

    public void setPublicationsList(ArrayList<Publication> publicationsList) {
        this.publicationsList = publicationsList;
    }
    
    public void addPublication(Publication newPublication){
        publicationsList.add(newPublication);
    }
    
    public void removePublication(Publication newPublication){
        publicationsList.remove(newPublication);
    }
    
    public void borrowPublication(User user, Publication publicationToLoan){
        //checa se a publicação esta emprestada:
        if (publicationToLoan.getIsBorrowed()) throw new IllegalStateException("Esta publicação ja esta emprestada");;

        if (user instanceof EspecialUser) user = ((EspecialUser) user);

        else user = ((StandardUser) user);
        //checar se o usuario possui atraso
        
        for (PublicationsLoan currentPublicationLoan : user.getBorrowedPublications()) {
            if (currentPublicationLoan.checkLate()){
                throw new IllegalStateException("Não é possível alugar a publicação,\n O usuario possui atrasos de devolução.");
                    // return;
                }
            }
            // criando emprestimo 
            PublicationsLoan newPublicationLoan = new PublicationsLoan(publicationToLoan);
            user.addBorrowedPublications(newPublicationLoan); 
            publicationToLoan.toggleIsBorrowed();
        }


        public void returnPublication(User user, Publication publicationToReturn){

            if (user instanceof EspecialUser) user = ((EspecialUser) user);

            else user = ((StandardUser) user);

            // checar se o usuario possui atraso
            PublicationsLoan publicationLoanToReturn = user.getBorrowedPublications()
            .stream()
            .filter(loan -> loan.getPublication() == publicationToReturn)
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("User has not borrowed this publication."));
            for (PublicationsLoan currentPublicationLoan : user.getBorrowedPublications()) {
                if (currentPublicationLoan.getPublication() ==  publicationToReturn){
                    if (currentPublicationLoan.checkLate()){
                        throw new IllegalStateException("A devolução da publicação esta atrasada\nVALOR: "+currentPublicationLoan.calculateLateFee());
                        // return;
                    }
                    // caso não esteja atrasado, fazer devolução de livro
                    PublicationsLoan publicationLoanToReturn = currentPublicationLoan;
                    user.removePublicationLoan(publicationLoanToReturn);  
                    publicationToReturn.toggleIsBorrowed();

                    break;
                }
            }
            
        }
 }
