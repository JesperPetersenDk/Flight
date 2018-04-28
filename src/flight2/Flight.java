
package flight2;

public class Flight {
    private int pass;
    private int seats;
    
    public boolean hasRoom(Flight f2)
    {
        int total = this.pass + f2.pass;
        return total <= seats;
    }
    
    public Flight createBoth(Flight f2)
    {
        Flight newFlight = new Flight();
        newFlight.seats = seats;
        newFlight.pass = pass + f2.pass;
        return newFlight;
    }
}
