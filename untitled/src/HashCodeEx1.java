/* hashCode()
이 메서드는 해싱(hashing)기법에 사용되는 '해싱함수'를 구현한 것이다.
해싱은 데이터 관리기법중의 하나인데 다량의 데이터를 저장하고 검색하는 데 유용하다.
해시함수는 찾고자하는 값을 입력하면, 그 값이 저장된 위치를 알려주는 해시코드를 반환한다.
일반적으로 해시코드가 같은 두 객체가 존재하는 것이 가능하지만, Object클래스에 정의된 hashCode메서드는 객체의 주소값으로 해시코드를 만들어
반환하기 때문에 해시코드가 중복될 수 있다.
 */
public class HashCodeEx1 {
    public static void main(String [] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
    }
}
/* String 클래스는 문자열의 내용이 같으면, 동일한 해시코드를 반환하도록 hashCode메서드가 오버라이딩되어 있기 때문에,
문자열의 내용이 같은 str1과 str2에 대해 hashCode()를 호출하면 항상 동일한 해시코드값을 얻는다.
반면에 System.identityHashCode(Object x)는 Object클래스의 hashCode메서드처럼 객체의 주소값으로 해시코드를 생성하기 때문에
모든 객체에 대해 항상 다른 해시코드 값을 반환할 것을 보장한다. 그래서 str1과 str2가 해시코드는 같지만 서로 다른 객체라는 것을 알 수 있다.
|참고| System.identityHashCode(Object x)의 호출결과는 실행 할 때마다 달라질 수 있다.    */