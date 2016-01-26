import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(10);

        for(int i = 0; i < 8; i++) {
            integers.add(i);
        }
        print("The original array has size: " + integers.size());
        print(integers);

        int sum = 0;
        for(int val : integers) {
            sum += val;
        }
        print("Sum is: " + sum);
        duplicateMethod(7, integers);
        duplicateMethod(12, integers);
        for(int a = 20; a < 24; a++) {
            integers.add(a);
        }
        print("The new array after adding values to now has size: " + integers.size());
        print(integers);
        int loc = 1;
        int val = 100;
        integers.add(loc, val);
        print("The array after adding item in the middle has size: " + integers.size());
        print(integers);
        val = integers.remove(integers.size() - 1);
        print("With the las item deleted the array has size: " + integers.size());
        print(integers);
        loc = 1;
        val = integers.remove(loc);
        print("With an inner item deleted the array has size: " + integers.size());
        print(integers);
        loc = 3;
        val = 300;
        integers.set(loc, val);
        print("With an inner item changed the array has size: " + integers.size());
        print(integers);
    }

    public static void duplicateMethod(int target, List<Integer> list) {
        if(list.contains(target)) {
            print(target + " found");
        } else {
            print(target + " not found");
        }
        int index = list.indexOf(target);
        if(index > -1) {
            print(target + " found at location " + index);
        } else {
            print(target + " not found index return is " + index);
        }
    }

    public static void print(String str) {
        System.out.println(str);
    }

    public static void print(List str) {
        System.out.println(str);
    }

    public static void print(int str) {
        System.out.println(str);
    }
}
