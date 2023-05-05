import java.util.*;

public class Collection {

    public static void main(String[] args) {
        //add array items to list1
        String[] things = {"eggs", "laser", "hats", "pie"};
        String[] more_things = {"laser", "hats"};
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();

        for (String x : things)
            list1.add(x);
        for (int i = 0; i < list1.size(); i++) System.out.printf("l1 %s \n", list1.get(i));

        for (String y : more_things)
            list2.add(y);
        for (int i = 0; i < list2.size(); i++) System.out.printf("l2 %s \n", list2.get(i));

        editList(list1, list2);
        System.out.println("final list1 = " + list1);

    }




    public static void editList(java.util.Collection<String> l1, java.util.Collection<String> l2) { //remove repeating elements in list 1
        Iterator<String> it1 = l1.iterator();
        while (it1.hasNext()) {
            if (l2.contains(it1.next()))
                it1.remove();
        }
    }
}
