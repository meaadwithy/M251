package Q6;
import java.io.*;
import java.util.*;
public class Airways {
    private String name;
    private ArrayList<Flight> flights;
    public Airways(String name){
        this.name = name;
        flights = new ArrayList<Flight>();
    }
    public void addFlight(Flight f){
        if(!(flights.contains(f))) {
            flights.add(f);
            System.out.println("flight is added.");
        }
        else
            System.out.println("its already there.");
    }
    public int arrivalFrequency(String city){
        int count = 0;
        for(Flight f :flights) {
            if (f.getArrivalCity().equals(city))
                count++;
        }
        return count;
    }
    public void saveIntoFile(String file) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(file);
        out.println(name);
        for(Flight f: flights)
            out.println(f);
        out.close();
    }
}
