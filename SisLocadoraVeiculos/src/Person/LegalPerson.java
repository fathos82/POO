package Person;

public class LegalPerson extends Person{
    private String cnpj;

    public LegalPerson(String name, String address, String phone, String cnpj) {
        super(name, address, phone);
        //TODO Auto-generated constructor stub
        this.cnpj = cnpj;
    }
    
    public String getCnpj() {
        return this.cnpj;
    }    

    @Override
    public boolean isEligibleForLoan(){
        return true;
    }
 

}