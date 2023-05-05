public class GenericMethods {
    public static void main(String[] args) {

        Integer[] intArr = {1, 2, 3, 4, 5};
        Character[] charArr = {'a', 'b', 'c', 'd'};

        charPrintMe(charArr);
        intPrintMe(intArr);

        genericPrintMe(intArr);
        genericPrintMe(charArr);

        System.out.println(max(32, 45,15));
        System.out.println(max("abc", "vbs",">%"));

    }
    public static <T extends Comparable<T>> T max(T a, T b, T c){
            T m = a;
            if (b.compareTo(a) > 0)
                m = b;
            if (c.compareTo(m) > 0)
                m = c;
            return m;
    }

    public static <T> void genericPrintMe(T[] x) {
        for (T b : x)
            System.out.printf("%s ", b);
        System.out.println();

    }

    public static void intPrintMe(Integer[] i) {
        for (Integer x : i)
            System.out.printf("%s ", x);
        System.out.println();

    }

    public static void charPrintMe(Character[] i) {
        for (Character x : i)
            System.out.printf("%s ", x);
        System.out.println();

    }
}
