import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<String> customListWithValues = new CustomArrayList<>(Arrays.asList("Test1", "Test2"));
        CustomArrayList<String> customListWithoutValuesAndCapacity = new CustomArrayList<>();
        CustomArrayList<String> customListWithCapacity = new CustomArrayList<>(5);

        for(int i = 3; i<=100; i++){
            customListWithValues.add("Test"+i);
        }
        System.out.println(customListWithValues);
        System.out.println(customListWithValues.size());
        System.out.println(customListWithCapacity.size());
    }
}