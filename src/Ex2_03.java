class AuthorC{
    private String name;
    private String email;

    public AuthorC(String name, String email){
        this.name = name;
        this.email = email;
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

    public String toString(){
        return "Author[name= "+name+",email= "+email+"]";
    }
}

class BookC extends AuthorC{
    private String isbn;
    private String name;
    private AuthorC authorC;
    private double price;
    private int qty = 0;

    public BookC(String isbn, String name, AuthorC authorC,double price){
        super(authorC.getName(),authorC.getEmail());
        this.isbn = isbn;
        this.name = name;
        this.authorC = authorC;
        this.price = price;
    }

    public BookC(String isbn, String name, AuthorC authorC,double price, int qty){
        super(authorC.getName(),authorC.getEmail());
        this.isbn = isbn;
        this.name = name;
        this.authorC = authorC;
        this.price = price;
        this.qty = qty;
    }

    public String getIsbn(){
        return isbn;
    }

    public String getName(){
        return name;
    }

    public AuthorC getAuthorC(){
        return authorC;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQty(){
        return qty;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    public String getAuthorName(){
        return authorC.getName();
    }

    public String toString(){
        return "Book[isbn="+isbn+",name="+name+","+authorC+",price="+price+",qty="+qty+"]";
    }
}
public class Ex2_03{
        public static void main(String[] args) {
            AuthorC a1 = new AuthorC("Tan Ah Teck", "ahteck@nowhere.com");
            System.out.println(a1);

            a1.setEmail("ahteck@somewhere.com");
            System.out.println(a1);
            System.out.println("name is: " + a1.getName());
            System.out.println("email is: " + a1.getEmail());

            // Test Book class
            BookC b1 = new BookC("12345", "Java for dummies", a1, 8.8, 88);
            System.out.println(b1);

            b1.setPrice(9.9);
            b1.setQty(99);
            System.out.println(b1);
            System.out.println("isbn is: " + b1.getIsbn());
            System.out.println("name is: " + b1.getName());
            System.out.println("price is: " + b1.getPrice());
            System.out.println("qty is: " + b1.getQty());
            System.out.println("author is: " + b1.getAuthorC());  // Author's toString()
            System.out.println("author's name: " + b1.getAuthorName());
            System.out.println("author's name: " + b1.getAuthorC().getName());
            System.out.println("author's email: " + b1.getAuthorC().getEmail());
        }
}
