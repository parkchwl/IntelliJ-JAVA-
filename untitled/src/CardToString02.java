class Card02 {
    String kind;
    int number;

    Card02() {
        this("SPADE", 1);   // Card02(String king, int number)를 호출한다.
    }
    Card02(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }
    public String toString() {
        return "kind : " + kind + ", number : " + number;   // Card인스턴스의 kind와 number를 문자열로 반환한다.
    }
}
class CardToString2 {
    public static void main(String [] args) {
        Card02 c1 = new Card02();
        Card02 c2 = new Card02("HEART", 10);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
/* Card인스턴스의 toString()을 호출하면 인스턴스가 갖고 있는 인스턴스변수 kind와 number의 값을 문자열로 변환하여
반환하도록 toString()을 오버라이딩 하였다. 오버라이딩할 때, Object클래스에 정의된 toString()의 접근 제어자가 public이므로 Card클래스의 toString()의
접근제어자도 public으로 했다는 것을 눈 여겨 보아야 한다.

조상에 정의된 메서드를 자손에서 오버라이딩할 때는 조상에 정의된 접근범위보다 같거나 더 넓어야 하기 때문이다. Object클래스에서 toString()의 접근 제어자가
public이므로, 이를 오버라이딩하는 Card클래스에서는 toString()의 접근 제어자를 public으로 할 수 밖에 없다.                            */