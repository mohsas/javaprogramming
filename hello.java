//https://edabit.com/challenge/J26bZ6Fv6bWEisDYj?fbclid=IwAR0y55yEQsPdU4ZGHCPYmrlUNmb3OYALlHG-KLd8HOuRZet5ssbTJCA6zsg
/*Given the shortest side of a 30° by 60° by 90° triangle 
    you have to find out the other 2 sides,
 (return the longest side, medium-length side).
 otherSides(1) ➞ [2.0, 1.73]
otherSides(12) ➞ [24.0, 20.0]
otherSides(2) ➞ [4.0, 3.46]
otherSides(3)➞ [6.0, 5.2]
 */
import java.lang.Math;
public class hello {
    static double[] otherSiders(double a){
        double b;
        double c;
        b=a*Math.sqrt(3);
        c=2*a;
        double[] d = new double[2];
        d[0]=b;
        d[1]=c;
        return d;
}
        public static void main(String[] args) {
        System.out.printf("otherSiders(1)---> [ %.2f , %.2f ] %n",otherSiders(1)[1],otherSiders(1)[0]);
        System.out.printf("otherSiders(12)---> [ %.2f , %.2f ] %n",otherSiders(12)[1],otherSiders(12)[0]);
        System.out.printf("otherSiders(2)---> [ %.2f , %.2f ] %n",otherSiders(2)[1],otherSiders(2)[0]);
        System.out.printf("otherSiders(3)---> [ %.2f , %.2f ] %n",otherSiders(3)[1],otherSiders(3)[0]);
    }
}
