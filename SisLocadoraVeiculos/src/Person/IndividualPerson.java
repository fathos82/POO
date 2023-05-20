package Person;
public class IndividualPerson  extends Person{
    public IndividualPerson(String name, String address, String phone, String cpf) {
        super(name, address, phone);
        this.cpf = cpf;
        this.maxLoans = 1;
    }

    private String cpf;
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}