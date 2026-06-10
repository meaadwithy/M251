package Q6;

public class Flight implements Comparable<Flight>{
    private int number;
    private String FromCity;
    private String arrivalCity;

    public Flight(){}

    public Flight(int number,String FromCity,String arrivalCity){
        this.number = number;
        this.FromCity = FromCity;
        this.arrivalCity = arrivalCity;
    }
    public String getArrivalCity(){
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public String toString(){
        return "Flight number = " + number + " departure City = " + FromCity + " arrival City = "+ arrivalCity;
    }
    public boolean equals(Object o){
        if(!(o instanceof Flight))
            return false;
        Flight f = (Flight) o;
        return number == f.number;
    }
    public int compareTo(Flight f){
        if (this.number > f.number)
            return 1;
        else if (this.number < f.number)
            return -1;
        else
            return 0;
    }
}
