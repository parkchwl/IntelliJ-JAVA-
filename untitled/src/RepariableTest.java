class RepariableTest {
    public static void main(String [] args) {
        Tank01 tank = new Tank01();
        Dropship01 dropship = new Dropship01();

        Marine01 marine = new Marine01();
        SCV01 scv = new SCV01();
        scv.repair(tank);               // SCV가 탱크를 수리하도록 한다.
        scv.repair(dropship);
    }
}

interface Repariable {}

class Unit01 {
    int hitPoint;
    final int MAX_HP;
    Unit01(int hp) {
        MAX_HP = hp;
    }
}

class GroundUnit extends Unit01 {
    GroundUnit(int hp) {
        super(hp);
    }
}
class AirUnit extends Unit01 {
    AirUnit(int hp) {
        super(hp);
    }
}

class Tank01 extends GroundUnit implements Repariable {
    Tank01() {
        super(150);     // Tan01의 HP는 150이다.
        hitPoint = MAX_HP;
    }
    public String toString() {
        return"Tank01";
    }
}
class Dropship01 extends AirUnit implements Repariable {
    Dropship01() {
        super(125);         // Dropship의 HP는 125이다.
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "Dropship01";
    }
}
class Marine01 extends GroundUnit {
    Marine01() {
        super (40);
        hitPoint = MAX_HP;
    }
}
class SCV01 extends GroundUnit implements Repariable {
    SCV01() {
        super(60);
        hitPoint = MAX_HP;
    }
    void repair(Repariable r) {
        if(r instanceof Unit01) {
            Unit01 u = (Unit01)r;
            while(u.hitPoint!=u.MAX_HP) {
                // Unit의 HP를 증가시킨다.
                u.hitPoint++;
            }
            System.out.println( u.toString() + "의 수리가 끝났습니다.");
        }
    }
}
/* repair 메서드의 매개변수 r은 Repariable타입이기 때문에 인터페이스 Repairable에 정의된 멤버만 사용할 수 있다.
그러나 Repairable에는 정의된 멤버가 없으므로 이 타입의 참조변수로는 할 수 있는 일이 아무 것도 없다.
그래서 instanceof 연산자로 타입을 체크한 뒤 캐스팅하여 Unit클래스에 정의된 hitPoint와 MAX_HP를 사용할 수 있도록 하였다.
그 다음엔 유닛의 현재 체력(hitPoint)이 유닛이 가질 수 있는 최고 체력(MAX_HP)이 될 때까지 체력을 증가시키는 작업을 수행한다.

Marine은 Repairalbe 인터페이스를 구현하지 않았으므로 SCV클래스의 repair메서드의 매개변수로 Marine을 사용하면 컴파일 시에 에러가 발생한다.
 */