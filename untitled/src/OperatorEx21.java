public class OperatorEx21 {
    public static void main(String [] args) {
        System.out.printf("10 == 10.0f  \t %b%n", 10==10.0f);
        System.out.printf("'0'== 0 \t %b%n", '0'== 0);
        System.out.printf("'A'== 65 \t %b%n", 'A'== 65);
        System.out.printf("'A' > 'B' \t %b%n", 'A' > 'B');
        System.out.printf("'A'+1 != 'B' \t %b%n", 'A'+1 != 'B');
    }
}
/* 비교 연산자도 이항 연산자이므로 연산을 수행하기 전에 형변환을 통해 두 피연산자의 타입을 같게 맞춘 다음 피연산자를 비교한다.
10==10.f에서 10은 int 타입이고 10.0f 는 float 타입이므로, 10을 float 로 변환한 다음에 비교한다.
두 값이 10.0f로 같으므로 결과로 true 를 얻게 된다.
#1 10 == 10.0f
#2 10.0f == 10.0f
#3 true

문자 'A'의 유니코드는 10진수로 65이고, 'B'는 66, '0'는 48이므로 나머지 식들은 다음과 같은 과정으로 연산된다.
'0' == 0 ===> 48 == 0 : false

*/