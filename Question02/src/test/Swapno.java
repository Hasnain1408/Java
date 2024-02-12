package test;

public class Swapno {
    public static void main(String[] args) {
        Item p1 = new Item("pen",5,10);
        Item p2 = new Item("book",5,150);
        User c1 = new User("hasnain","123","1234567890");

        Item i = new Item("pen",5,2);

        c1.additem(i);
        c1.showBill();



    }
}
