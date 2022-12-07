public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Box<Apple> box = new Box<>();
        Cart cart = new Cart();
        Counter<Cart> counter = new Counter<>();

        box.add(apple);
        box.add(apple);//2 apples
        cart.add(box);
        cart.add(box);//2*2=4
        counter.add(cart);
        counter.add(cart);//4*2=8
        System.out.println(counter.getCount());
    }
}