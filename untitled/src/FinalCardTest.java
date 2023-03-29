class Card6{
    final int NUMBER;       // 상수지만 선언과 함께 초기화 하지 않고
    final String KIND;      // 생성자에서 단 한번만 초기화 할 수 있다.
    static int width = 100;
    static int height = 250;

    Card6(String kind, int num) {
        KIND = kind;                //매개변수로 넘겨받은 값으로
        NUMBER = num;               //KIND와 NUMBER를 초기화한다.
    }

    Card6() {
        this("HEART", 1);
    }

    public String toString() {
        return KIND +" "+NUMBER;
    }
}
class FinalCardTest {
    public static void main(String [] args) {
        Card6 c = new Card6("HEART", 10);
//      c.NUMBER - 5;
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);      // System.out.println(c.toString());
    }
}
/* final이 붙은 변수는 상수이므로 일반적으로 선언과 초기화를 동시에 하지만, 인스턴스의 경우 생성자에서 초기화 되도록 할 수 있다.
클래스 내에 매개변수를 갖는 생성자를 선언하여, 인스턴스를 생성할 때 final이 붙은 멤버변수를 초기화하는데 필요한 값을 생성자의 매개변수로부터 제공받는 것이다.
이 기능을 활용하면 각 인스턴스마다 final이 붙은 멤버변수가 다른 값을 갖도록 하는 것이 가능하다.
 */