/* 인터페이스란 ? 일종의 추상클래스이다. 인터페이스는 추상클래스처럼 추상메서드를 갖지만 추상클래스보다 추상화 정도가 높아서 추상클래스와 달리
몸통을 갖춘 일반 메서드 또는 멤버변수를 구성원으로 가질 수 없다. 오직 추상메서드와 상수만을 멤버로 가질 수 있으며, 그 외의 다른 어떠한 요소도 허용하지 않는다.
추상클래스를 부분적으로만 완성된 '미완성 설계도'라고 한다면, 인터페이스는 구현된 것은 아무 것도 없고 밑그림만 그려져 있는 '기본 설계도'라 할 수 있다.
인터페이스도 추상클래스처럼 완성되지 않은 불완전한 것이기 때문에 그 자체만으로 사용되기 보다는 다른 클래스를 작성하는데 도움을 줄 목적으로 작성된다.

#.인터페이스의 작성
인터페이스를 작성하는 것은 클래스를 작성하는 것과 같다. 다만 키워드로 class 대신 interface를 사용한다는 것만 다르다.
그리고 interface에도 클래스와 같이 접근제어자로 public 또는 default를 사용할 수 있다.
    interface 인터페이스이름 {
            public static final 타입 상수이름 = 값;
            public abstract 메서드이름(매개변수목록);
    }

일반적인 클래스의 멤버들과 달리 인터페이스의 멤버들은 다음과 같은 제약사항이 있다.
-모든 멤버변수는 public static final이어야 하며, 이를 생략할 수 있다.
-모든 메서드는 public abstract 이어야 하며, 이를 생략할 수 있다. (단, static메서드와 디폴트 메서드는 예외이다.[JDK1.8부터])

인터페이스에 정의된 모든 멤버에 예외없이 적용되는 사항이기 때문에 제어자를 생략할 수 있는 것이며, 편의상 생략하는 경우가 많다.
생략된 제어자는 컴파일 시에 컴파일러가 자동적으로 추가해준다.

interface PlayingCard {
    public static final int SPADE = 4;
    final int DIAMOND = 3;   // public static final int DIAMOND = 3;
    static int HEART = 2;    // public static final int HEART = 2;
    int CLOVER = 1;          // public static final int CLOVER = 1;

    public abstract String getCardNumber();
    String getCardKind();    // public abstract String getCardkind();
 */
class FighterTest {
    public static void main(String [] args) {
        Fighter f = new Fighter();

        if(f instanceof Unit)
            System.out.println("f는 Unit클래스의 자손입니다.");

        if(f instanceof Fightable)
            System.out.println("f는 Fightable인터페이스를 구현했습니다.");

        if(f instanceof Movable)
            System.out.println("f는 Movable인터페이스를 구현했습니다.");

        if(f instanceof Attackable)
            System.out.println("f는 Attackable인터페이스를 구현했습니다.");

        if(f instanceof Object)
            System.out.println("f는 Object클래스의 자손입니다.");
    }   // main
}
class Fighter extends Unit implements Fightable {
    public void move(int x, int y)  {/* 내용생략 */}
    public void attack(Unit u) {/* 내용생략 */}
}

class Unit {
    int currentHP;  // 유닛의 체력
    int x;          // 유닛의 위치(x좌표)
    int y;          // 유닛의 위치(y좌표)
}
interface Fightable extends Movable, Attackable { }
interface Movable   { void move(int x, int y); }
interface Attackable{ void attack(Unit u);}
/* 인터페이스는 인터페이스로부터만 상속받을 수 있으며, 클래스와는 달리 다중삭속, 즉 여러 개의 인터페이스로부터 상속을 받는 것이 가능하다.
클래스의 상속과 마찬가지로 자손 인터페이스(Fightable)는 조상 인터페이스(Movable, Attackable)에 정의된 멤버를 모두 상속받는다.
그래서 Fightable자체에는 정의된 멤버가 하나도 없지만 조상 인터페이스로부터 상속받은
두 개의 추상메서드, move(int x, int y)와 attack(Unit U)을 멤버로 갖게 된다.

인터페이스도 추상클래스처럼 그 자체로는 인스턴스를 생성할 수 없으며, 추상클래스가 상속을 통해 추상메서드를 완성하는 것처럼, 인터페이스도 자신에 정의된
추상메서드의 몸통을 만들어주는 클래스를 작성해야 하는데, 그 방법은 추상클래스가 자신을 상속받는 클래스를 정의하는 것과 다르지 않다.
다만 클래스는 확장한다는 의미의 키워드'extends'를 사용하지만 인터페이스는 구현한다는 의미의 키워드 'implements'를 사용할 뿐이다.
#1
    class 클래스이름 implements 인터페이스이름 {
        // 인터페이스에 정의된 추상메서드를 구현해야 한다.
    }
    class Figther implements Fightable {
        public void move(int x, int y)  { 내용 }
        public void attack(Unit u)      { 내용 }
    } [이 때 'Figther클래스는 Fightable인터페이스를 구현한다.'라고 한다.]

#2 만일 구현하는 인터페이스의 메서드 중 일부만 구현한다면, abstract를 붙여서 추상클래스로 선언해야 한다.
    abstract class Fighter implements Fightable {
        public void move(int x, int y) { 내용 }
    }


#3 그리고 다음과 같이 상속과 구현을 동시에 할 수도 있다.
    class Fighter extends Unit implements Fightable {
        public void move(int x, int y)  { 내용 }
        public void attack(Unit u)      { 내용 }

#4 |참고| 인터페이스의 이름에는 주로 Fightable과 같이 '~을 할 수 있는'의 의미인 'able'로 끝나는 것들이 많은데, 그 이유는 어떠한 기능 또는 행위를 하는데
필요한 메서드를 제공한다는 의미를 강조하기 위해서이다. 또한 그 인터페이스를 구현한 클래스는 '~를 할 수 있는' 능력을 갖추었다는 의미이기도 하다.
이름이 'able'로 끝나는 것은 인터페이스라고 추측할 수 있지만, 모든 인터페이스의 이름이 반드시 'able'로 끝나야 하는 것은 아니다.
 */