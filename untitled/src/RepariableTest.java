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