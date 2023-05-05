public class StringMethods {

    public static void main(String[] args) {

        //startsWith
        String[] words = {"funk", "chunk", "furry", "bacon"};
        for (String w : words) {
            if (w.startsWith("fu"))
                System.out.println(w + " starts witch fu");
        }

        //endsWith
        for (String w : words) {
            if (w.endsWith("unk"))
                System.out.println(w + " ends with unk");

        }


        String b = "bacon";
        String a = "   monster";
        System.out.println(a.trim().concat(b));
        System.out.println(a.replace('b', 'f'));
        System.out.println(a.toUpperCase());


    }
}

