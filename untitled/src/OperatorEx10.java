public class OperatorEx10 {
    public static void main(String []args){
        int a = 1000000;

        int result1 = a * a / a;
        int result2 = a / a * a;

        System.out.println(result1);
        System.out.println(result2);
    }
}
/*실행 결과 결과값이 1,000,000에 1,000,000을 먼저 곱한 후에 나누는 것과
먼저 나눈 후에 곱하는 것의 연산 결과가 다르다는 것을 알 수 있다. 먼저 곱하는 경우 int의 범위를 넘어서기 때문에 예상했던 것과 다른 결과가 나왔다.
 */
