import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt(); // int 읽어오기
        double d = sc.nextDouble(); // double 읽어오기
        boolean b = sc.nextBoolean(); // boolean(true/false) 읽어오기
        String str = sc.nextLine(); // String 읽어오기

        System.out.println("int: " + i);
        System.out.println("double: " + d);
        System.out.println("boolean: " + b);
        System.out.println("String: " + str);
    }
}