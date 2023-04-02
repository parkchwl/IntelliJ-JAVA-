class InterfaceTest02 {
    public static void main(String [] args) {
        A02 a = new A02();
        a.methodA02();
    }
}
class A02 {
    void methodA02() {
        I02 i = InstanceManager.getInstance();    // 제 3의 클래스의 메서드를 통해서 인터페이스 I를 구현한 클래스의 인스턴스를 얻어온다.
        i.methodB02();
        System.out.println(i.toString());       // i로 Object클래스의 메서드 호출 가능
    }
}
interface I02 {
    public abstract void methodB02();
}
class B02 implements I02 {
    public void methodB02() {
        System.out.println("methodB02 in B02 class");
    }
    public String toString() { return "class B02";}
}

class InstanceManager {
    public static I02 getInstance() {
        return new B02();
    }
}
/* 인스턴스를 직접 생성하지 않고, getInstance()라는 메서드를 통해 제공받는다. 이렇게하면, 나중에 다른 클래스의 인스턴스로 변경되어도
A클래스의 변경없이 getInstance()만 변경하면 된다는 장점이 생긴다.

        class InstanceManager {
            public static I getInstance() {
                return new B(); // 다른 인스턴스로 바꾸려면 여기만 변경하면 된다.
            }
        }

그리고 인터페이스 I 타입의 참조변수 i로도 Object 클래스에 정의된 메서드들을 호출할 수 있다는 것도 알아두자. i에 toString()이 정의되어 있지 않지만,
모든 객체는 Object클래스에 정의된 메서드를 가지고 있을 것이기 때문에 허용하는 것이다.

        class A {
            void methodA() {
            I i = InstanceManager.getInstance();
            i.methodB();
            System.out.println(i.toString());   // i로 Object의 메서드 호출가능
        }
    }
 */