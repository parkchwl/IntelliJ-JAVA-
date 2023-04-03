/* toString()
이 메서드는 인스턴스에 대한 정보를 문자열(String)로 제공할 목적으로 정의한 것이다.
인스턴스의 정보를 제공한다는 것은 대부분의 경우 인스턴스 변수에 저장된 값들을 문자열로 표현한다는 뜻이다.
Object 클래스에 정의된 toString()은 아래와 같다.
    public String toString() {
        return getClass().getName()+"@"+Integer.toHexString(hashCode());
}

클래스를 작성할 때 toString()을 오버라이딩하지 않는다면, 위와 같은 내용이 그대로 사용될 것이다.
즉, toString()을 호출하면 클래스 이름에 16진수의 해시코드를 얻게 될 것이다.
|참고| getClass()와 hashCode()역시 Object클래스에 정의된 것이므로 인스턴스 생성없이 바로 호출할 수 있다. */
class Card09 {
    String kind;
    int number;

    Card09() {
        this("SPADE", 1);
    }

    Card09(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

}
class CardToString{
    public static void main(String [] args) {
        Card09 c1 = new Card09();
        Card09 c2 = new Card09();

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
/* Card인스턴스 두 개를 생성한 다음, 각 인스턴스에 toString()을 호출한 결과를 출력했다. Card클래스에서 Object클래스로부터 상속받은 toString()을
오버라이딩하지 않았기 때문에 Card인스턴스에 toString()을 호출하면, Object클래스의 toString()이 호출된다.
그래서 위의 결과에 클래스 이름과 해시코드가 출력되었다.
서로 다른 인스턴스에 대해서 toString()을 호출하였으므로 클래스의 이름은 같아도 해시코드값이 다르다는 것을 확인할 수 있다.
 */