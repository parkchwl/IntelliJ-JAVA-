/* 메서드도 변수와 마찬기지로 같은 클래스 내에서 서로 구별될 수 있어야 하기 때문에 각기 다른 이름을 가져야 한다.
그러나 자바에서는 한 클래스 내에 이미 사용하려는 이름과 같은 이름을 가진 메서드가 있더라도 매개변수의 개수 또는 타입이 다르면,
같은 이름을 사용해서 메서드를 정의할 수 있다.
이처럼, 한 클래스 내에 같은 이름의 메서드를 여러 개 정의하는 것을 '메서드 오버로딩(method overloading)'또는 간단히 오버로딩(overloading)이라 한다.
#4.2 오버로딩의 조건
같은 이름의 메서드를 정의한다고 해서 무조건 오버로딩인 것은 아니다. 오버로딩이 성립하기 위해서는 다음과 같은 조건을 만족해야 한다.
to__ 1.메서드 이름이 같아야 한다.
to__ 2.매개변수의 개수 또는 타입이 달라야 한다.
비록 메서드의 이름이 같다 하더라도 매개변수가 다르면 서로 구별될 수 있기 때문에 오버로딩이 가능한 것이다.
위의 조건을 만족시키지 못하는 메서드는 중복 정의로 간주되어 컴파일 시에 에러가 발생한다. 그리고 오버로딩된 메서드들은 매개변수에 의해서만 구별될 수 있으므로
to_ 반환 타입은 오버로딩을 구현하는데 아무런 영향을 주지 못한다는 것에 주의해야 한다.
 */
class OverloadingTest {
    public static void main(String args []) {
        MyMath3 mm = new MyMath3();
        System.out.println("mm.add(3, 3) 결과:"        +mm.add(3,3));
        System.out.println("mm.add(3L, 3) 결과: "   +mm.add(3L,3));
        System.out.println("mm.add(3, 3L) 결과: "   +mm.add(3,3L));
        System.out.println("mm.add(3L,3L) 결과: "   +mm.add(3L,3L));

        int a [] = {100, 200, 300};
        System.out.println("mm.add(a) 결과: " + mm.add(a));
    }
}
class MyMath3 {
    int add(int a, int b) {
        System.out.print("int add(int a, int b) - ");
        return a + b;
    }

    long add(int a, long b) {
        System.out.print("long add(int a, long b) - ");
        return a + b;
    }

    long add(long a, int b) {
        System.out.print("long add(long a, int b) - ");
        return a + b;
    }

    long add(long a, long b) {
        System.out.print("long add(long a, long b) - ");
        return a + b;
    }

    int add(int a[]) {             // 배열의 모든 요소의 합을 결과로 돌려준다.
        System.out.print("int add(int a[]) - ");
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;

    }
}