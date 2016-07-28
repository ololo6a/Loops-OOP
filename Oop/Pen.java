package loopsOop.Oop;

/**
 * Created by Администратор on 19.07.2016.
 */

enum COLOR{
    BLUE,
    RED,
    BLACK;
}

public class Pen extends Stationery {

    COLOR color;
    int size;

    {
        name = new String("Pen");
    }

    public Pen(COLOR color, int size, int cost) {
        this.color = color;
        this.size = size;
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pen pen = (Pen) o;

        if (size != pen.size) return false;
        if (cost != pen.cost) return false;
        return color == pen.color;

    }

    @Override
    public int hashCode() {
        int result = color != null ? color.hashCode() : 0;
        result = 31 * result + size;
        result = 31 * result + cost;
        return result;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "color=" + color +
                ", size=" + size +
                ", cost=" + cost +
                '}';
    }

    @Override
    public Stationery clone() {
        Stationery clon = new Pen(this.color,this.size,this.cost);
        return clon;
    }
}
