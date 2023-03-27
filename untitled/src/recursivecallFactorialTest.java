/* 메서드의 내부에서 메서드 자신을 다시 호출하는 것을 '재귀호출'이라고 하며, 재귀호출을 하는 메서드는 '재귀 메서드'라고 한다.
    void method() {
        method(); }      // 재귀호출. 메서드 자신을 호출한다.
재귀호출뿐이면, 무한히 자기 자신을 호출하기 때문에 무한반복에 빠지게 된다. 무한반복문이 조건문과 함께 사용되어야하는 것처럼, 재귀호출도 조건문이 필수적이다.

    void method(int n) {
    if(n==0)
            return;      // n의 값이 0일때, 메서드를 종료한다.
        System.out.println(n);
        method(--n);   } //재귀호출. method(int n)을 호출한다.
이 코드는 매개변수 n을 1씩 감소시켜가면서 재귀호출을 하다가 n의 값이 0이 되면 재귀호출을 중단하게 된다.
재귀호출을 굳이 사용하는 이유는 논리적 간결함 때문이다. 다소 비효율적이라도 알아보기 쉽게 작성하는 것이 논리적 오류가 발생할 확률이 줄어들고 수정하기도 쉽다.
 */
public class recursivecallFactorialTest {
    public static void main(String [] args) {
        int result = factorial(4);

        System.out.println(result);
    }

    static int factorial(int n) {
        int result=0;

        if( n == 1)
            result = 1;
        else
            result = n * factorial(n-1);    // 다시 메서드 자신을 호출한다.
        return result;
    }
}
/* factorial메서드가 static메서드이므로 인스턴스를 생성하지 않고 직접 호출할 수 있다.
그리고 main메서드와 같은 클래스에 있기 때문에 static메서드를 호출할 때 클래스 이름을 생략하는 것이 가능하다.
 */