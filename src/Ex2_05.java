class CustomerB{
    private int id;
    private String name;
    private char gender;

    public CustomerB(int id, String name, char gender){
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String toString(){
        return "name("+id+")";
    }
}

class Account extends CustomerB{
    private int id;
    private CustomerB customerB;
    private double balance = 0.0;

    public Account(int id, CustomerB customerB, double balance){
        super(customerB.getId(), customerB.getName(), customerB.getGender());
        this.id = id;
        this.customerB = customerB;
        this.balance = balance;
    }

    public Account(int id , CustomerB customerB){
        super(customerB.getId(), customerB.getName(), customerB.getGender());
        this.id = id;
        this.customerB = customerB;
    }

    @Override
    public int getId() {
        return id;
    }

    public CustomerB getCustomerB() {
        return customerB;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString(){
        return customerB+" balance=$"+balance;
    }

    public String getCustomerName(){
        return customerB.getName();
    }

    public Account deposit(double amount){
        balance += amount;
        return this;
    }

    public Account withdraw(double amount){
        if(balance>=amount){
            balance -= amount;
        } else {
            System.out.println("amount withdrawn exceeds the current balance!");
        } return this;
    }
}
public class Ex2_05 {
    public static void main(String[] args) {

    }
}
