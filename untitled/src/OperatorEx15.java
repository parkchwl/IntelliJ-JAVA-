public class OperatorEx15 {
    public static void main(String []args){
        char lowerCase = 'a';
        char upperCase = (char)(lowerCase - 32);
        System.out.println(upperCase);
    }
}
// 대문자와 소문자 간의 코드값 차이는 10진수로 32이다.
// [중요] char 형과 int 형 간의 뺄셈 연산 결과는 int 형 값이므로, 연산 후 char 형으로 다시 형변환을 해야한다.
