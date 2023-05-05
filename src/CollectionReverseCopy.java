import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionReverseCopy {
    public static void main(String[] args) {
        //create an array and convert to list
        Character[] chars = {'p', 'w', 'n'};
        List<Character> l_char = Arrays.asList(chars);
        System.out.println("List is : ");
        output(l_char);

        //create a new array and a new list(same size, empty)
        Character[] new_chars = new Character[3];
        List<Character> list_copy = Arrays.asList(new_chars);

        //copy contents of l_char to list_copy
        Collections.copy(list_copy, l_char);
        System.out.println("Copy of list: ");
        output(list_copy);

        //reverse and print out the list
        Collections.reverse(l_char);
        System.out.println("Post reverse : ");
        output(l_char);

        //fill collection
        Collections.fill(l_char, 'X');
        System.out.println("After filling the list: ");
        output(l_char);
    }

    //output Method
    private static void output(List<Character> the_list) {
        for (Character element : the_list) {
            System.out.printf("%s, ", element);

        }
        System.out.println("\n");
    }
}
