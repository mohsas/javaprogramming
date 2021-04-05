// https://edabit.com/challenge/7Tb7qMDQHtz3xpydd
// Create a function that takes an integer and outputs an n x n square 
// solely consisting of the integer n.

public class squarePatch{

static void printMatrix(int n){
if(n==0) System.out.printf("[]%n");    
for(int i=0;i<n;i++){
    System.out.printf("[");
    for(int j=0;j<n-1;j++){
        System.out.printf("%d,",n);
    }
    if (i < n-1) System.out.printf("%d],%n",n);
    else System.out.printf("%d]%n",n);

}
}
public static void main(String[] args) {
    printMatrix(0);
    printMatrix(1);
    printMatrix(2);
    printMatrix(3);
    printMatrix(4);
    printMatrix(5);
    printMatrix(6);
}
}