/*Julius Caesar protected his confidential information by encrypting it using a cipher. 
Caesar's cipher shifts each letter by a number of letters. If the shift takes you past 
the end of the alphabet, just rotate back to the front of the alphabet. 
In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.
Create a function that takes a string s (text to be encrypted) and an integer k (the rotation factor). It should return an encrypted string.
My wife wanted more as special agent :) a shift for special characters and no space in coded phrase
*/
public class CaesarCipher{
    static String caesar(String s, int k){
        StringBuilder sb = new StringBuilder();
        int len=s.length();
        k=k%26;
        //Alphabet{a..z, A..Z}

        for(int i=0;i<len;i++){
           char c = s.charAt(i);
          
           if(Character.isLetter(c)){
            c=Character.toLowerCase(c); 
              int r=(int)c+k;
              char cipher=(char)r;            
              sb.append(cipher);
            }else
            if(Character.isDigit(c)){
                int r= Character.digit(c, 10)+2;
                sb.append(r);
              } 
            else if(c==' '){/*Nothing to do*/}
              else{
                c=Character.toLowerCase(c); 
                int r=(int)c+k;
                char cipher=(char)r;            
                sb.append(cipher);
              }

        }
        return sb.toString();

    } 
    public static void main(String[] args) {
        String t=caesar("Always-Look-on-the-Bright-Side-of-Life", 5);
        System.out.println("Always-Look-on-the-Bright-Side-of-Life: " +t);
        String t1=caesar("@Always%Look$5on& the Bright Side of Life@", 2);
        System.out.println("@Always%Look$5on& the Bright Side of Life@: " +t1);
    }

}