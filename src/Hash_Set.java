import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hash_Set {
    public static void main(String[] args) {

        String[] arr_things = {"thg1", "thg2", "thg3", "thg4", "thg1"};
        List<String> list = Arrays.asList(arr_things);

        System.out.printf("%s ",list);
        System.out.println();

        Set<String>set = new HashSet<String>(list); // Creates a collection of unique items
        System.out.printf("%s ", set);

    }
}
