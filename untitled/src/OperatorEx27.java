public class OperatorEx27 {
    public static void main(String args[]){
        boolean b = true;
        char ch = 'C';

        System.out.printf("b=%b%n", b);
        System.out.printf("!b=%b%n", !b);
        System.out.printf("!!b=%b%n", !!b);
        System.out.printf("!!!b=%b%n", !!!b);
        System.out.println();

        System.out.printf("ch=%c%n", ch);
        System.out.printf("ch < 'a' || ch > 'z' = %b%n", ch < 'a' || ch > 'z');
        System.out.printf("!('a'<=ch && ch<='z')=%b%n", !('a'<=ch && ch<='z'));
        System.out.printf("  'a'<=ch && ch<='z' =%b%n", 'a'<=ch && ch<='z');
    }
}

/* 식 '!!b'가 평가되는 과정은 아래와 같다. 단항연산자는 결합 방향이 오른쪽에서 왼쪽이므로 피연산자와 가까운것부터 먼저 연산된다.
그래서 피연산자인 b와 가까운 논리 부정 연산자 '!'가 먼저 수행되어 false를 결과로 얻는다. 그리고 이 값에 다시 '!'연산을 수행하므로 true를 결과로 얻는다.
 */
