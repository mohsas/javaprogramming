/*This program calculates the GCD of two integers
https://edabit.com/challenge/HmicQW4LMYyNHXRzT?fbclid=IwAR34-iUuEOj8mBhkwVMMaTW_H7ljBMYFXTQh1X-YQWvJwToI0U2GlFG_81k

Welcome to part two of the collection for Computer Science Algorithms. 
This challenge will deal further with writing recursive functions by covering the Euclidean 
Algorithm. The "Euclidean Algorithm" is a method for finding the greatest common divisor (GCD) 
of two numbers. 
It was originally described by the Greek mathematician Euclid.
*/

public class gcdEuclides{
    public static void swap(int a, int b){
        if(a>b){
            int c =a;
            a=b;
            b=c;

        }
        

    }
    public  static void gcd(int a,int b){
        /*bad way it costs a lot*/
        /* Swap should be done only once*
        /*it means it shouldn't be in the body of this function*/
        swap(a, b);

        int r=a%b;
        if(r==0) System.out.println(b); 
        else gcd(b,r);
    }
public static void main(String[] args){    

    System.out.println(" GCd(15,20)= ");
    gcd(15,20);
    System.out.println(" GCd(20,15)= ");
    gcd(20,15);
    System.out.println(" GCd(3,17)= ");
    gcd(3,17);
    System.out.println(" GCd(17,3)= ");
    gcd(17,3);
    
    }

}