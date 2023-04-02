/*인터페이스를 이해하기 위해서는 다음의 두 가지 사항을 반드시 염두에 두고 있어야 한다.
-클래스를 사용하는 쪽(User)과 클래스를 제공하는 쪽(Provide)이 있다.
-메서드를 사용(호출)하는 쪽(User)에서는 사용하려는 메서드(Provider)의 선언부만 알면 된다. [내용은 몰라도 됨.]
 */
class A {
    public void methodA(B b) {
        b.methodB();
    }
}

class B {
    public void methodB() {
        System.out.println("methodB()");
    }
}

class InterfaceTest {
    public static void main(String [] args) {
        A a = new A();
        a.methodA(new B());
    }
}
/* 이와 같이 클래스 A와 클래스 B가 있다고 하자.
클래스A(User)는 클래스 B(provider)의 인스턴스를 생성하고 메서드를 호출한다.

이 경우, 클래스 A를 작성하려면 클래스B가 이미 작성되어 있어야 한다. 그리고 클래스 B의 methodB()의 선언부가 변경되면, 이를 사용하는 클래스A도 변경되어야 한다.
그러나 클래스 A가 클래스 B를 직접 호출하지 않고 인터페이스를 매개체로 해서 클래스 A가 인터페이스를 통해서 클래스 B의 메서드에 접근하도록 하면,
클래스 B에 변경사항이 생기거나 클래스 B와 같은 기능의 다른 클래스로 대체 되어도 클래스A는 전혀 영향을 받지 않도록 하는 것이 가능하다.
두 클래스간의 관계를 간접적으로 변경하기 위해서는 먼저 인터페이스를 이용해서 클래스 B(Provider)의 선언과 구현을 분리해야한다.

#1 먼저 다음과 같이 클래스 B에 정의된 메서드를 추상메서드로 정의하는 인터페이스 I를 정의한다.
    interface I {
        public abstract void methodB() {
    }

#2 그 다음에는 클래스 B가 인터페이스 I를 구현하도록 한다.
    class B implements I {
        public void methodB() {
            System.out.println("methodB in B class");
            }
        }

#3 이제 클래스 A는 클래스 B 대신 인터페이스 I를 사용해서 작성할 수 있다.
class A {                                   class A {
    public void methodA(B b) {                  public void methodA(I i) {
        b.methodB();                ===>            i.methodB();
        }                                       }
    }                                       }
클래스 A를 작성하는데 있어서 클래스 B가 사용되지 않았다는 점에 주목하자. 이제 클래스 A와 클래스 B는 'A-B'의 직접적인 관계에서
'A-I-B'의 간접적인 관계로 바뀐 것이다.

결국 클래스 A는 여전히 클래스 B의 메서드를 호출하지만, 클래스 A는 인터페이스 I하고만 직접적인 관계에 있기 때문에 클래스 B의 변경에 영향을 받지 않는다.
클래스 A는 인터페이스를 통해 실제로 사용하는 클래스의 이름을 몰라도 되고, 심지어는 실제로 구현된 클래스가 존재하지 않아도 문제되지 않는다.
클래스 A는 오직 직접적인 관계에 있는 인터페이스 I의 영향만 받는다.

인터페이스 I는 실제구현 내용(클래스 B)을 감싸고 있는 껍데기이며, 클래스 A는 껍데기 안에 어떤 알맹이(클래스)가 들어 있는지 몰라도 된다.
 */