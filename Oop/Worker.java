package loopsOop.Oop;

import java.util.ArrayList;

/**
 * Created by Администратор on 24.07.2016.
 */
public class Worker {

    ArrayList<Stationery> stationeries = new  ArrayList<Stationery>();

    void addStationery(Stationery stationery){
        stationeries.add(stationery.clone());
    }

    int getTotalCost(){
       int total = 0;

        for (Stationery i:stationeries){
            total+=i.getCost();
        }
       return total;
    }
}
