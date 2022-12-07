import java.util.ArrayList;

public class Box<T extends Countable> extends ArrayList<T> implements Countable{
    public Box() {}

    @Override
    public int getCount() {
        int count = 0;
        for (T item : this){
            count += item.getCount();
        }
        return count;
    }
}
