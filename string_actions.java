import java.util.Locale;

class String_Actions{


    public static <string> void main(String[] args) {
        String word = "Music";
        int pos = 3;
        System.out.println("The word is " +  word);
        int l = word.length()-1;
        String partOfString = word.substring(0,3);
        String replace = word.replace("Music", "mania");
        System.out.println("Substring: " + partOfString);
        System.out.println(l);
        char ch = word.charAt(0);
        String lower = word.toLowerCase(Locale.ROOT);
        System.out.println(lower);
        String upper = word.toUpperCase(Locale.ROOT);
        System.out.println(upper);

        System.out.println(replace);


    }
    
}