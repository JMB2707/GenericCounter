public class Counter<T extends Countable> {
    Integer count = 0;

    public void add(T t){
        count += t.getCount();
    }

    public Integer getCount() {
        return this.count;
    }
}
