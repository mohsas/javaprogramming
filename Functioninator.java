/*
https://edabit.com/challenge/J26bZ6Fv6bWEisDYj?fbclid=IwAR0y55yEQsPdU4ZGHCPYmrlUNmb3OYALlHG-KLd8HOuRZet5ssbTJCA6zsg
Create a function that takes a single word string and does the following:

    Concatenates inator to the end if the word ends with a consonant otherwise, concatenate -inator instead.

    Adds the word length of the original word to the end, supplied with '000'.

The examples should make this clear.

inatorInator("Shrink") ➞ "Shrinkinator 6000"

inatorInator("Doom") ➞ "Doominator 4000"

inatorInator("EvilClone") ➞ "EvilClone-inator 9000"
*/
public class Functioninator {
    public static String  checkVoelinThendOfWord(String s){
        int len=s.length();
        char c = Character.toLowerCase(s.charAt(len-1));
        String slen= ' '+String.valueOf(len)+"000";

        
        String inator= "inator";
        
        if ((c=='a') || c=='o' || c=='i' || c=='e'|| c=='u' || c=='y'){

            return (s + '-'+ inator + slen);
        }
        else
        return (s+ inator + slen);
    }
    public static void main(String[] args) {

        System.out.println(checkVoelinThendOfWord("Shrink"));
        System.out.println(checkVoelinThendOfWord("Doom"));
        System.out.println(checkVoelinThendOfWord("EvilClone"));
    }
    
}
