import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionAddFrequencyDisjoint {
    public static void main(String[] args) {
        String[] items = {"x1", "x2", "x3", "x4"};
        List<String> list_items1 = Arrays.asList(items);

        //Empty list sizeof(3)
        ArrayList<String> list_items2 = new ArrayList<>(3);

        list_items2.add("g2");
        list_items2.add("fnc");
        list_items2.add("dig");

        for (String x : list_items2) System.out.printf("%s ", x);

        System.out.println();
        Collections.addAll(list_items2, items);

        for (String x : list_items2) System.out.printf("%s ", x);

        //Check the appearance frequency of an element
        System.out.println();
        System.out.println(Collections.frequency(list_items2, "fnc"));

        //returns true if lists have no items in common
        boolean flag = Collections.disjoint(list_items1, list_items2);
        System.out.println(flag);

        if (flag) System.out.println("These lists Don't have common items");
        else System.out.println("These lists Have common elements");

    }
}
