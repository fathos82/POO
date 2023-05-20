package Person;
public abstract class  Person {
    private String name;
    private String address;
    private String phone;
    protected int countLoans;
    protected int maxLoans;



    public Person(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.maxLoans = 1;
    }
    

    public String getName() {
        return this.name;
    }
    

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isEligibleForLoan(){
        // por padrão limite de 5
        if (this.countLoans >= this.maxLoans){ 
            return false;
        }
        return true;
    }

    public void makeLoan(){
        this.countLoans++;
    }
    public void endLoan(){
        this.countLoans--;
    }
}
