import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ConvertDataStructures {

    public static void main(String[] args) {

        String[] arr_things = {"thg1", "thg2", "thg3", "thg4"};
        List<String> the_list = new LinkedList<String>(Arrays.asList(arr_things));

        the_list.add(0, "pumpkin");
        System.out.println(the_list);
        arr_things = the_list.toArray(new String[the_list.size()]);
        System.out.println(arr_things[1]);
    }
}
