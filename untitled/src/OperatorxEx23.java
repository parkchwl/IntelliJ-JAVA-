//문자열의 비교 : 두 문자열을 비교할 때는, 비교 연산자 '==' 대신 equals()라는 메서드를 사용한다.
public class OperatorxEx23 {
    public static void main(String []args){
    String str1 = "abc";
    String str2 = new String("abc");

    System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
    System.out.printf(" str1==\"abc\" ? %b%n", str1=="abc");
    System.out.printf(" str2==\"abc\" ? %b%n", str2=="abc");
    System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
    System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
    System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
    System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));

    }
}
/* str2 와 "abc"의 내용이 같은데도 '=='로 비교하면, false 의 결과를 얻는다.
내용은 같지만 서로 다른 객체라서 그렇다. 그러나 equals()는 객체가 달라도 내용이 같으면 true 를 반환한다.
그래서 문자열을 비교할 때는 항상 equals()를 사용해야한다.
만일 대소문자를 구별하지 않고 비교하고 싶다면, equlas() 대신 equalsIgnoreCase()를 사용하면 된다.
 */