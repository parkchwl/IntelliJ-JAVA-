/* # 내부 클래스의 선언
아래의 오른쪽 코드에는 외부 클래스(Outer)에 3개의 서로 다른 종류의 내부 클래스를 선언했다. 양쪽의 코드를 비교해 보면 내부 클래스의 선언위치가 변수의 선언위치와
동일함을 알 수 있다. 변수가 선언된 위치에 따라 인스턴스변수, 클래스변수(static변수), 지역변수로 나뉘듯이 내부 클래스도 이와 마찬가지로 선언된 위치에 따라 나뉜다.
그리고, 각 내부 클래스의 선언위치에 따라 같은 선언위치의 변수와 동일한 유효범위(scope)와 접근성(accessibility)를 갖는다.

class Outer {                           class Outer{
    int iv = 0;                             class InstanceInner {}
    static int cv = 0;                      static class StaticInner {}
                                ===>
    void myMethod() {                       void myMethod() {
        int lv = 0;                             class LocalInner {}
    }                                           }
}                                           }

#2. 내부 클래스의 제어자와 접근성
아래 코드에서 인스턴스클래스(InstanceInner)와 스태틱 클래스(StaticInner)는 외부 클래스(Outer)의 멤버변수(인스턴스변수와 클래스 변수)와 같은 위치에
선언되며, 또한 멤버변수와 같은 성질을 갖는다. 따라서 내부 클래스가 외부 클래스의 멤버와 같이 간주되고, 인스턴스 멤버와 static멤버 간의 규칙이
내부 클래스에도 똑같이 적용된다.

class Outer {                               class Outer {
    private int iv = 0;                         private class InstanceInner {}
    protected static int cv = 0;                protected static class StaticInner {}
                                    ===>
    void myMethod() {                           void myMethod() {
        int Iv=0;                                   class LocalInner {}
    }                                           }
}                                           }
그리고 내부 클래스도 클래스이기 때문에 abstract나 final과 같은 제어자를 사용할 수 있을 뿐만 아니라,
멤버변수들처럼 private, protected과 같은 접근제어자도 사용할 수 있다.                     */

class InnerEx1{
    class InstanceInner {
        int iv = 100;
//      static int cv = 100;    // 에러 ! static 변수를 선언할 수 없다.
        final static int CONST = 100;   //final은 상수이므로 허용한다.
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 200;        // static클래스만 static멤버를 정의할 수 있다.
    }

    void myMethod() {
        class LocalInner {
            int iv = 300;
//          static int cv = 300;            // 에러 ! static변수를 선언할 수 없다.
            final static int CONST = 300;   // final static은 상수이므로 허용한다.
        }
    }
    public static void main(String [] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
    }
}
/* 내부 클래스 중에서 스태틱 클래스(StaticInner)만 static멤버를 가질 수 있다.
드문 경우지만 내부 클래스에 static변수를 선언해야한다면 스태틱 클래스로 선언해야 한다.
다만 final과 static이 동시에 붙은 변수는 상수(constant)이므로 모든 내부 클래스에서 정의가 가능하다.
 */