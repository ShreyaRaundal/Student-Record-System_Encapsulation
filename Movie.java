public class Movie {
    private String movieName;
    private String language ;
    private double ticketPrice;
    private int availableseats;

    // constructor
    public Movie(String movieName,String language,double ticketPrice,int availableseats){
        this.movieName=movieName;
        this.language=language;
        this.ticketPrice=ticketPrice;
        this.availableseats=availableseats;
    }
        // getter metods

    public String getMovieName() {
        return movieName;
    }

    public String getLanguage(){
        return language;
    } 

    public double getTickPrice(){
        return ticketPrice;
    }
    public int getAvaliableSeats(){
        return availableseats;
    }

    // ticket Booking Method
    public void bookTicket(int numberOfTickets){
        if(numberOfTickets<=0){
            System.out.println("Invalid number of ticket :");
        }else if(availableseats>=numberOfTickets){
            availableseats-=numberOfTickets;
            double totalCost=ticketPrice*numberOfTickets;
            System.out.println(numberOfTickets+"tickets booked for"+movieName);
            System.out.println("Total price "+totalCost);
            System.out.println("Seats remaining "+availableseats);

        }else{
            System.out.println("Not enough seats availake . Only "+availableseats+"left.");
        } 
    }

}
