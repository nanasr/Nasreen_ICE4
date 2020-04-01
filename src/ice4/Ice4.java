package ice4;

/**
 *
 * @author nasre
 */
public class Ice4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         System.out.println("" + first());
        //First(char e, String driver);
        System.out.println("the result is " + Third());
        System.out.println("The gretest char is"+Second());
        
    }

    
    public static int first() {
        String string = "the colored port should be black or white or brown";
        String[] words = string.split(" ");
        String word = "or";
        int occurrences = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)) {
                occurrences++;
            }
        }
        return (occurrences);
    }

    public static String Second() {
        String name = "foobar";
      // use the lowest character as initial value
        char greatestChar = (char) 0;
       // iterate over all characters in the string
        for (int i = 0; i < name.length(); i++) {
            // if the current character is bigger then the actual stored greatest ...
            if (name.charAt(i) > greatestChar) {
                // ... then keep the actual one as greatest
                greatestChar = name.charAt(i);
            }
            System.out.println("the greatest char is "+greatestChar);
        }
        return name;
        
    }

    public static Boolean Third() {
        String stri = "Do you like to cook food in free time";
        System.out.println(stri.contains("a"));
        System.out.println(stri.contains("Like"));
        System.out.println(stri.contains("cook"));
        System.out.println(stri.contains("free time"));
        return true;
    }
  
   
}
