/*Create a function that takes an array of increasing letters and return the missing letter.
Examples

missingLetter(["a", "b", "c", "e", "f", "g"]) ➞ "d"

missingLetter(["O", "Q", "R", "S"]) ➞ "P"

missingLetter(["t", "u", "v", "w", "x", "z"]) ➞ "y"

missingLetter(["m", "o"]) ➞ "n"

Notes

    Tests will always have exactly one letter missing.
    The length of the test array will always be at least two.
    Tests will be in one particular case (upper or lower but never both).
    */
    import java.nio.charset.Charset;
import java.util.Arrays;

    public class missingLetter {
    
        public static void sortingTable(char [] tab){
        System.out.println("**tab Array Before Sorting**");
        for (char ch: tab){
            System.out.println(ch);
        }
        Arrays.sort(tab); 
        System.out.println("**tab Array After Sorting**");
        for (char ch: tab){
            System.out.println(ch);
        }
        }    
public static void main(String[] args) {
    char [] tab1 = new char[]{'a','d','b', 'w', 'q'}; 
    sortingTable(tab1);
    int j=0;
    for (int i=1;i<tab1.length;i++){
        int diff=(int)tab1[i]-(int)tab1[i-1];
        if(diff>1){
            for(j=(int)tab1[i-1]+1;j<(int)tab1[i];j++){
                System.out.println((char) j +","  );
            }
            
                
            }
        }

     
}
}
