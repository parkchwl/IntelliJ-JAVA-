import java.util.Scanner;
public class Solution15 {
    public static void main(String [] args) {
        Scanner scn = new Scanner(System.in);

        int A = scn.nextInt();
        scn.close();

        if(A>=90) System.out.println("A");
        else if(A>=80) System.out.println("B");
        else if(A>=70) System.out.println("C");

        else if(A>=60) System.out.println("D");
        else System.out.println("F");


    }
}
