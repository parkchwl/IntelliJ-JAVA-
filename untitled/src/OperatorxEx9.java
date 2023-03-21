public class OperatorxEx9 {
    public static void main(String [] args){
        long a = 1_000_000 * 1_000_000;
        long b = 1_000_000 * 1_000_000l;

        System.out.println("a="+a);
        System.out.println("b="+b);
        /*
        1)OperatorEx8과 비슷한 예제이다. 1000000 * 1000000의 결과가 10^12임에도 불구하고 -727379968라는 결과가 출력되었다.
        그 이유는 int 타입과 int 타입의 연산결과는 int 타입인데, 연산결과가 int 타입의 최대값인 2x10^9을 넘어감으로 오버플로우가 발생했기 떄문이다.
        이미 오버플로우가 발생한 값을 long 타입의 변수에 저장을 해도 소용이 없다.
        2)1000000 * 1000000L은 int 타입과 Long 타입의 연산이기 때문에 그결과가 long 타입이다. long 타입은 연산결과인 10^12을 저장할 수 있는
        타입이므로 올바를 결과를 얻을 수 있다.
         */
    }
}
