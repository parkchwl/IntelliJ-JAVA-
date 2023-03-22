public class FlowEx14 {
    public static void main(String [] args) {
        for(int i=1,j=10;i<=10;i++,j--)
            System.out.printf("%d \t %d%n", i, j);
    }
}
/* for 문에 i와 j, 두 개의 변수를 사용해서 i는 1부터 10까지 증가시키는 동시에, j는 10부터 1까지 감소시키면서 출력한다.
하나의 for 문에 두 개의 변수를 이용해서 출력하는 예를 보여준 것인데, 사실 다음과 같이 하나의 변수만으로도 같은 결과를 얻을 수 있다.
for(int i=1;i<=10;i++) {
System.out.printf("%d \t %d%n", i, 11-i); }
실행결과에서 i와 j의 관계를 살펴보면, i와 j를 더한 값이 11로 일정하다는 것을 알 수 있다. 이 사실을 이용하면 j는 '11-i'가 된다.
그래서 j대신 '11-i' 라는 식을 사용할 수 있는 것이다.
i + j =11
j = 11-i
 */
