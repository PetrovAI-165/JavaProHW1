import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> customListWithValues = new CustomArrayList<>(Arrays.asList("Test1", "Test2"));
        List<String> customListWithoutValuesAndCapacuty = new CustomArrayList<>();
        List<String> customListWithCapacity = new CustomArrayList<>(5);

        System.out.println(customListWithValues.size());
        System.out.println(customListWithCapacity.size());
    }
}