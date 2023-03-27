import java.util.Scanner;
public class Solution10 {

    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        String B = in.next();

        in.close();

        System.out.println(A * (B.charAt(2) - '0'));
        System.out.println(A * (B.charAt(1) - '0'));
        System.out.println(A * (B.charAt(0) - '0'));
        System.out.println(A * Integer.parseInt(B));

    }
}
/* Scanner을 이용하여 A는 int로, B는 String으로 입력받는다.
그리고 B는 charAt()으로 각 자리수를 참조해준다.
charAt()는 문자열의 인덱스 위치에 있는 문자(Character) 값을 반환한다.
String str = "abcdef";
    a   b   c   d   e   f
   [0] [1] [2] [3] [4] [5]
str에 문자열 abcdef가 저장되어 있을 때 문자열을 문자들이 모인 배이라고 보고 인덱스를 참조하 해당 문자를 반환하는 것이다.
이때 반환되는 값은 아스키코드값인 문자(char)이다.
 */