package sater;

public class Garage {
    private List garageList = new List();

    public void printAll(){
        if(garageList.getList().isEmpty()){
            System.out.println("Garage is empty");

        }else{
            for(Vehicle x : garageList.getList()){//x: list
                System.out.println(x.getInfo());
            }
        }

    }
    public void addV(Vehicle v){
        garageList.addV(v);
    }
    public void removeV(Vehicle v){
        garageList.removeV(v);
    }
}
