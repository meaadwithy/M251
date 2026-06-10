package Q6;
import java.io.*;
public class Test{
    public static void main(String[]args) throws FileNotFoundException{
        Airways myAirways = new Airways("Kuwait Airways");

        Flight f1 = new Flight(123 , "Kuwait","Amman" );
        Flight f2 = new Flight(563 , "KSA","Cairo" );
        myAirways.addFlight(f1);
        myAirways.addFlight(f2);

        System.out.println(myAirways.arrivalFrequency("Cairo"));
        myAirways.saveIntoFile("alrways.txt");
    }
}
