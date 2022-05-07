import java.util.ArrayList;

public class Main {
    public static void main(String... args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(10);
        arr.add(3);
        arr.add(4);

        Optmm optmm = new Optmm(arr);
        System.out.println(optmm.minSize());
    }
}
