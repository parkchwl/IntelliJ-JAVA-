import java.util.Scanner;

public class ScannerEx {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //기본타입
        byte a = sc.nextByte();       // byte 입력
        short b = sc.nextShort();     // short 입력
        int c = sc.nextInt();         // int 입력
        long d = sc.nextLong();       // long 입력

        //실수타입
        float e = sc.nextFloat();     // float 입력
        double f = sc.nextDouble();   // double 입력

        //논리타입
        boolean g = sc.nextBoolean();  // boolean 입력

        //문자열타입
        String h = sc.next();       // String 형 입력 (토큰을 기준으로 한 단어를 읽음)
        String i = sc.nextLine();   // String 형 입력 (개행을 기준으로 한 줄을 읽음)

        //출력문
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
    }
}
