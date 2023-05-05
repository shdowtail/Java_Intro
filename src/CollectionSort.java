import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import static java.util.Collections.*;

public class CollectionSort {
    public static void main(String[] args) {
        String[] items = {"lemons", "apples", "geese", "youtube"};


        //reverse and print the list


        List<String> l1;

        {
            l1 = Arrays.asList(items);
        }


        l1.sort(reverseOrder());
        System.out.printf("\n%s\n", l1);


    }

}
