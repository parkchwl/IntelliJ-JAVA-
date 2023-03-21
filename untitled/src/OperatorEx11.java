public class OperatorEx11 {
    public static void main(String [] args){
        char a = 'a';
        char d = 'd';
        char zero = '0';
        char two = '2';

        System.out.printf("'%c' - '%c' = %d%n", d ,a, d - a);
        System.out.printf("'%c' - '%c' = %d%n", two, zero, two - zero);
        System.out.printf("'%c'=%d%n", a, (int)a);
        System.out.printf("'%c'=%d%n", d, (int)d);
        System.out.printf("'%c'=%d%n", zero, (int)zero);
        System.out.printf("'%c'=%d%n", two, (int)two);
/*사칙연산의 피연산자로 숫자뿐만 아니라 문자도 가능하다. 문자는 실제로 해당 문자의 유니코드로 바뀌어 저장되므로
문자간의 사칙연산은 정수간의 연산과 동일하다. 주로 문자간의 뺄셈을 하는 경우가 대부분이며, 문자 '2'를 숫자로 변환하려면 다음과 같이 문자 '0'을 빼주면 된다.
'2' - '0' = 50 - 48 = 2
문자 '2'의 유니코드는 50이고, 문자'0'은 48이므로 두 문자간의 뺄셈은 2의 결과를 얻는다.
 */


    }
}
