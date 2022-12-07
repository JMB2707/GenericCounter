public class Cart implements Countable{
    Integer count = 0;

    @Override
    public int getCount() {
        return count;
    }

    public void add(Box<? extends Countable> item){
        count += item.getCount();
    }
}
