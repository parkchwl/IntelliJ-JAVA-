import static java.lang.Math.*;
import static java.lang.System.*;

class MathEx1 {
    public static void main (String [] args) {
        double val = 90.7552;
        out.println("round("+val+")=" + round(val));    // 반올림

        val *= 100;
        out.println("round("+val+")=" + round(val));    // 반올림
    }
}