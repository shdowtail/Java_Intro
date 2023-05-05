import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class LinkedList {
    public static void main(String[] args) {
        String[] things = {"thg1", "thg2", "thg3", "thg4"};
        String[] m_things = {"mth1", "mth2", "mth3", "mth4", "mth5"};
        List<String> main_list = new java.util.LinkedList<String>();
        List<String> sub_list = new java.util.LinkedList<String>();

        Collections.addAll(main_list, things);
        Collections.addAll(sub_list, m_things);

        main_list.addAll(sub_list);
        sub_list = null;

        printMe(main_list);
        removeStuff(main_list, 2, 5);
        printMe(main_list);
        reverseMe(main_list);

    }

    // Prints list elements
    private static void printMe(List<String> l) {
        for (String b : l)
            System.out.printf("%s ", b);
        System.out.println();
    }

    // Removes elements from index to index
    private static void removeStuff(List<String> l, int fromIndex, int toIndex) {
        l.subList(fromIndex, toIndex).clear();
    }

    // Reverses list elements
    private static void reverseMe(List<String> l) {
        ListIterator<String> l_iter = l.listIterator(l.size());
        while (l_iter.hasPrevious()) System.out.printf("%s", l_iter.previous());
    }

}
