public class BookDriver {
    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho", "9780061122415", 399.0, 5);
        Book b2 = new Book("Atomic Habits", "James Clear", "9780735211292", 499.0, 0);

        b1.display();
        b2.display();

        // update stock
        b2.setStock(10);
        System.out.println("Stock Updated");
        b2.display();
    }
}
