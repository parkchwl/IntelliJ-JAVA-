public class PowerTest {
    public static void main(String [] args) {
        int x = 2;
        int n = 5;
        long result = 0;

        for(int i=1; i<=n; i++) {
            result += power(x, i);
        }
        System.out.println(result);
    }
    static long power(int x, int n) {
        if(n==1) return x;
        return x * power(x, n-1);
    }
}
/*x^1부터 x^n까지의 합을 구하는 예제이다. 재귀호출을 사용하여 x^n을 구하는 power()를 작성하였다.
x는 2, n은 5로 계산했기 때문에 2^1+2^2+2^3+2^4+2^5의 결과인 62가 출력되었다.
x의 n제곱을 계산하는 메서드는 다음과 같이 정의할 수 있는데, 이 메서드 역시 메서드의 정의에 자신을 포함하는 재귀 메서드이다.
f(x, n) = x * f(x, n-1), 단 f(x, 1) = x
 */
