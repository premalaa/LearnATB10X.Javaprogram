package ex_06_TernaryOperator;

public class Lab067_Interview_ThreeOfMax {
    public static void main(String[] args) {
        // Finding the largest number between N1,N2andN3
        // step1: find input / outputs
        //n1,n2,n3--> DataType is int
        //o/p is int
        //23,34,10
        //n1>n2-->no
        //
        // int n1 = 2 , n2 = 9 , n3 = -11;
        int n1 = 23, n2 = 34, n3= 10;
        int largest = (n1>= n2) ?( (n1>= n3 ) ? n1 : n3 ) : ((n2>=n3))?n2:n3;
        System.out.println("largest number " + largest);
    }
}
