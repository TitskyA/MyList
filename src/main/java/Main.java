import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        MyList<Integer> list = new MyList<>();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);

        list.addFirst(-1);
        list.addFirst(-2);
        list.addFirst(-3);
        list.addFirst(-4);
        list.addFirst(-5);
        list.addFirst(-6);
        list.addFirst(-7);
        list.addFirst(-8);
        list.addFirst(-9);
        list.addFirst(-10);
        list.addFirst(-11);
        list.addFirst(-12);
        list.addFirst(-13);
        list.addFirst(-14);

        System.out.println(list.size());
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println("Удаленный элемент = " + list.remove(0));
        System.out.println("Удаленный элемент = " + list.remove(1));
        System.out.println("Удаленный элемент = " + list.remove(2));
        System.out.println("Удаленный элемент = " + list.remove(3));
        System.out.println("Удаленный элемент = " + list.remove(10));
        System.out.println(Arrays.toString(list.toArray()));

        System.out.println("-----------------------------");
        list.add(13);
        list.add(14);
        list.add(15);
        list.addFirst(-14);
        System.out.println(Arrays.toString(list.toArray()));

    }
}
