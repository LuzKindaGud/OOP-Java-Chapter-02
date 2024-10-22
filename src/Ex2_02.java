class AuthorB{
    private String name;
    private String email;
    private char gender;

    public AuthorB(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender(){
        return gender;
    }

    public String toString(){
        return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }
}

class BookB extends AuthorB {
    private String name;
    private AuthorB[] authors;
    private double price;
    private int qty=0;

    public BookB(String name, AuthorB[] authors, double price){
        super(name, authors[0].getEmail(), authors[0].getGender());
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public BookB(String name, AuthorB[] authors, double price, int qty){
        this(name, authors, price);
        this.qty = qty;
    }

    public String getName(){
        return name;
    }

    public AuthorB[] getAuthors(){
        return authors;
    }

    public double getPrice(){
        return price;
    }

    public int getQty(){
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString(){
        return "Book[name=" + name + ",["+ authors + "], price=" + price + ", qty=" + qty + "]";
    }

    public String getAuthName() {
        String getAuthName = "";
        for ( AuthorB author : authors ) {
            getAuthName += author.getName() + " ";
        }
        return getAuthName;
    }
}

public class Ex2_02{
    public static void main(String[] args) {
        // Declare and allocate an array of Authors
        AuthorB[] authors = new AuthorB[2];
        authors[0] = new AuthorB("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new AuthorB("Paul Tan", "Paul@nowhere.com", 'm');

// Declare and allocate a Book instance
        BookB javaDummy = new BookB("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);  // toString()
    }
}