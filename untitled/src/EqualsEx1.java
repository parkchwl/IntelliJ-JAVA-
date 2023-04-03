/* java.lang 패키지는 자바프로그래밍에 가장 기본이 되는 클래스들을 포함하고 있다.
그렇기 때문에 java.lang패키지의 클래스들은 import문 없이도 사용할 수 있게 되어 있다.
그 동안 String 클래스나 System클래스를 import문 없이 사용할 수 있었던 이유가 바로 java.lang패키지에 속한 클래스들이기 때문이었던 것이다.
우선 java.lang 패키지의 여러 클래스들 중에서도 자주 사용되는 클래스 몇 가지만을 골라서 학습해보자.
#1. Object클래스
Object클래스는 모든 클래스의 최고 조상이기 때문에 Object클래스의 멤버들은 모든 클래스에서 바로 사용 가능하다.
Object클래스는 멤버변수는 없고 오직 11개의 메서드만 가지고 있다.
[1]equals(Object obj)
매개변수로 객체의 참조변수를 받아서 비교하여 그 결과를 boolean값으로 알려주는 역할을 한다.
아래의 코드는 Object클래스에 정의되어 있는 equals메서드의 실제 내용이다.
    public boolean equals(Object obj) {
        return (this==obj);
    }
위의 코드에서 알 수 있듯이 두 객체의 같고 다름을 참조변수의 값으로 판단한다. 그렇기 때문에 서로 다른 두 객체를 equals메서드로 비교하면 항상 false를 얻는다.
|참고| 객체를 생성할 때, 메모리의 비어있는 공간을 찾아 생성하므로 서로 다른 두 개의 객체가 같은 주소를 갖는 일은 있을 수 없다.
        두 개 이상의 참조변수가 같은 주소값을 갖는 것(한 객체를 참조하는 것)은 가능하다.
 */
class EqualsEx1 {
    public static void main(String [] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if (v1.equals(v2))
            System.out.println("v1과 v2는 같습니다.");
        else
            System.out.println("v1과 v2는 서로 다릅니다.");
        v2 = v1;
        if (v1.equals(v2))
            System.out.println("v1과 v2는 같습니다.");
        else
            System.out.println("v1과 v2는 서로 다릅니다.");
    } // end of main
}

class Value {
    int value;
    Value(int value) {
        this.value = value;
    }
}
/* value라는 멤버변수를 갖는 Value클래스를 정의하고, 두 개의 Value클래스의 인스턴스를 생성한 다음 equals메서드를 이용해서 두 인스턴스를 비교하도록 했다.
equals메서드는 주소값으로 비교를 하기 때문에,
두 Value인스턴스의 멤버변수 value의 값이 10으로 서로 같은지라도 equals메서드로 비교한 결과는 false 일 수 밖에 없는 것이다.

하지만, v2=v1;을 수행한 후에는 참조변수 v2는 v1이 참조하고 있는 인스턴스의 주소값이 저장되므로 v2도 v1과 같은 주소값이 저장된다.
그래서 이번에는 v1.equals(v2)의 결과가 true가 되는 것이다.
 */