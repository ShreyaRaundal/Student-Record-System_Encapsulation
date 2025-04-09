public class MovieDriver {
    public static void main(String[] args){

        // craete  movie object
        Movie m1=new Movie("Inception","English",250.0,100);
        
        // Dispaly movie details
        System.out.println("Now Showing "+m1.getMovieName());
        System.out.println("Language: "+m1.getLanguage());
        System.out.println("Ticket Price :"+m1.getTickPrice());
        System.out.println("Seats Available: "+m1.getAvaliableSeats());

        // Booking Tickets
        m1.bookTicket(5);
        m1.bookTicket(0);
        m1.bookTicket(200);

        // Recheck availability
        System.out.println("Final Seats Left: " + m1.getAvaliableSeats());
    }

    
}
