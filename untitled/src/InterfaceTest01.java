class A01 {
    void autoPlay(I i) {
        i.play();
    }
}
interface I {
    public abstract void play();
}
class B01 implements I {
    public void play() {
        System.out.println("play in B01 class");
    }
}
class C01 implements I{
    public void play() {
        System.out.println("play in C01 class");
    }
}
class InterfaceTest01 {
    public static void main(String [] args) {
        A01 a = new A01();
        a.autoPlay(new B01());  // void autoPlay(I i) 호출
        a.autoPlay(new C01());  // void autoPlay(I i) 호출
    }
}
/* 클래스 A가 인터페이스 I를 사용해서 작성되긴 하였지만, 이처럼 매개변수를 통해서 인터페이스 I를 구현한 클래스의 인스턴스를 동적으로 제공받아야 한다.
클래스 Thread의 생성자인 Thread(Runnable Target)이 이런 방식으로 되어 있다.
 */