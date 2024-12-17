package generies;

public class Main {

    public static void main(String[] args) {
        generies<Integer, Integer> q = new generies<>(1, 2);

        System.out.println("Starting:"+q.toString());

        // also it is work without any type casting
        System.out.println(q.first+2);

        // in static with the class level parameters is not available



    }
}
