package loopsOop.Oop;

/**
 * Created by ������������� on 24.07.2016.
 */
abstract class  Stationery{
    String name;
    int cost;

    void setCost(int c){
        cost = c;
    }
    int getCost(){
        return cost;
    }
    public abstract Stationery clone();
}