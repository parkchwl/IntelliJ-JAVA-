public class OperatorEx8 {
    public static void main(String [] args) {
        int a = 1_000_000;
        int b = 2_000_000;
        long c = a * b;
        System.out.println(c);
        /*int 타입과 int 타입의 연산결과는 int 타입이다.
        "a * b 의 결과가 이미 int 타입의 값이므로 Long 형으로 자동 형변환 되어도 값은 변하지 않는다!"
         */
    }
}
