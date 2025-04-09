public class Book {
    private String title;
    private String author;
    private String isbn;
    private double price;
    private int stock;

    // constructor
    public Book(String title,String author,String isbn,double price,int stock){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        this.price=price;
        this.stock=stock;

    }

    // Getter

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getISBN() { return isbn; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }


    // setters
    public void setStock(int stock){
        if(stock >=0){
            this.stock=stock;
        }else{
            System.out.println("Invalid stock value :");
        }
    }

    public boolean isAvailable(){
        return stock>0;
    }
    public void display(){
        System.out.println(" Title "+title+" by "+author+" ISBN "+isbn+" Price: "+ price+" Stock "+stock+" Available: "+(isAvailable()?" Yes ":" No "));
    }
}
