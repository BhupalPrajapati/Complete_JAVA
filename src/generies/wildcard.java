package generies;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;

public class wildcard {


    // for the upper bound
    public static double sumOfValues(List<? extends Number>list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    // for the lower bound
    public static void addNumbers(List<? super Integer> list) {
        list.add(4);
        list.add(5);
        list.add(6);
    }
    public static void main(String[] args) {
        // for upper bound
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        List<Double> list1 = new ArrayList<>();
        list1.add(1.5);
        list1.add(2.5);
        list1.add(3.5);

        System.out.println(sumOfValues(list));
        System.out.println(sumOfValues(list1));

        // for lower bound
        List<Object> list3 = new ArrayList<>();
        addNumbers(list3);
        System.out.println(list3);
    }
}
