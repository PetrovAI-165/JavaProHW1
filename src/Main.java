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

        for(int i = 3; i<=10; i++){
            customListWithValues.add("Test"+i);
        }
        for(int i = 1; i<=10; i++){
            customListWithCapacity.add("Test"+i);
        }
        for (int i = 1; i<=10; i++){
            customListWithoutValuesAndCapacity.add("Test"+i);
        }

        System.out.println(customListWithCapacity);
        System.out.println(customListWithoutValuesAndCapacity);
        System.out.println(customListWithValues);

        customListWithValues.remove("Test3");
        System.out.println(customListWithValues);

        customListWithValues.add("Test3");
        System.out.println(customListWithValues);

        customListWithValues.remove("Test3");
        System.out.println(customListWithValues);

    }
}