
package flight2;

public class Main {

    public static void main(String[] args) {
        Flight lax1 = new Flight();
        Flight lax2 = new Flight();
        
        Flight lax3;
        
        if(lax1.hasRoom(lax2))
        {
            lax3 = lax1.createBoth(lax2);
        }
        
    }
    
}
