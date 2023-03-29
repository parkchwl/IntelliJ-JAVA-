class SuperTest2{
    public static void main(String [] args) {
        Child2 c = new Child2();
        c.method();
    }
}

class Parent2 {
    int x = 10;
}

class Child2 extends Parent2{
    int x = 20;

    void method() {
        System.out.println("x="+ x);
        System.out.println("this.x="+ this.x);
        System.out.println("super.x="+ super.x);
    }
}
/* 이전 예제와 달리 같은 이름의 멤버변수가 조상클래스인 Parent에도 있고 자손 클래스인 Child클래스에도 있을 떄는
super.x와 this.x는 서로 다른 값을 참조하게 된다. super.x는 조상클래스로부터 상속받은 멤버변수 x를 뜻하며, this.x는 자손클래스에 선언된 멤버변수를 뜻한다.
이처럼 조상클래스에 선언된 멤버변수와 같은 이름의 멤버변수를 자손 클래스에서 중복해서 정의하는 것이 가능하며, 참조변수 super를 이용해서 서로 구별할 수 있다.
변수만이 아니라 메서드 역시 super를 써서 호출할 수 있다. 특히 조상클래스의 메서드를 자손 클래스에서 오버라이딩한 경우에 super를 사용한다.
 */