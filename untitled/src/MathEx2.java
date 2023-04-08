import static java.lang.Math.*;
import static java.lang.System.*;

class MathEx2 {
    public static void main (String [] args) {
        int i = Integer.MIN_VALUE;

        out.println("i ="+1);
        out.println("-i="+(-i));

        try {
            out.printf("negateExact(%d)=", 10, negateExact(10));
            out.printf("negateExact(%d)=", -10, negateExact(-10));
            out.printf("negateExact(%d)=", i, negateExact(i));  // 예외발생
        } catch(ArithmeticException e) {
            // i 를 long 타ㅣㅂ으로 형변환 다음에 negateExact (long a)를 호출
            out.printf("negateExact(%d)= %d%n", (long)i, negateExact((long)i));
        }
    } // end of main
}