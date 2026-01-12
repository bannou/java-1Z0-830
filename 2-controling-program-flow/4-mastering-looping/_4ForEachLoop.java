import java.util.ArrayList;
import java.util.List;

public class _4ForEachLoop {


    public static void main(String[] args) {

        String[] fruit = new String[2];
        fruit[0] = "apple";
        fruit[1] = "orange";

        for(String element : fruit) {
            System.out.println(element);
        }

        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(6);

        for(int element : nums) {
            System.out.println(element);
        }
    }
}
