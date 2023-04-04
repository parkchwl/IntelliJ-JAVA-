/* clone()
이 메서드는 자신을 복제하여 새로운 인스턴스를 생성하는 일을 한다. 어떤 인스턴스에 대해 작업을 할 때, 원래의 인스턴스는 보존하고 clone메서드를 이용해서
새로운 인스턴스를 생성하여 작업을 하면 작업이전의 값이 보존되므로 작업에 실패해서 원래의 상태로 되돌리거나 변경되기 전의 값을 참고하는데 도움이 될 것 이다.
Object클래스에 정의된 clone()은 단순히 인스턴스 변수의 값만 복사하기 때문에 참조타입의 인스턴스 변수가 있는 클래스는 완전한 인스턴스 복제가 이루어지지 않는다.

예를 들어 배열의 경우, 복제된 인스턴스도 같은 배열의 주소를 갖기 때문에 복제된 인스턴스의 작업이 원래의 인스턴스에 영향을 미치게 된다. 이런 경우 clone메서드를
오버라이딩해서 새로운 배열을 생성하고 배열의 내용을 복사하도록 해야 한다.                                                               */
class Point1 implements Cloneable{      // Cloneable 인터페이스를 구현할 클래스에서만 clone()을 호출할 수 있다. 구현하지 않고 호출하면 예외
    int x, y;

    Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x="+ x + ", y=" + y;
    }

    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();                    // clone()은 반드시 예외처리 해주어야 한다.
        } catch(CloneNotSupportedException e) {}
        return obj;
    }
}
class CloneEx1 {
    public static void main(String [] args) {
        Point1 original = new Point1(3, 5);
        Point1 copy = (Point1)original.clone();     // 복제(clone)해서 새로운 객체를 생성
        System.out.println(original);
        System.out.println(copy);
    }
}
/* clone()을 사용하려면, 먼저 복제할 클래스가 Cloneable 인터페이스에 구현해야하고,
clone()을 오버라이딩하면서 접근 제어자를 protected에서 public으로 변경한다.
그래야만 상속관계가 없는 다른 클래스에서 clone()을 호출 할 수 있다.
 */