package sater;

import java.util.ArrayList;

public class List {
    private ArrayList<Vehicle> list = new ArrayList<>();

    public void addV(Vehicle v){
        list.add(v);
    }
    public void removeV(Vehicle v){
        list.remove(v);
    }

    public ArrayList<Vehicle> getList(){
        return list;
    }

}
