// 참조변수의 다형적인 특징은 메서드의 매개변수에도 적용된다.
class Product03 { // prict와 bonusPoint 변수를 선언했다.
    int price;          // 제품의 가격
    int bonusPoint;     // 제품구매 시 제공하는 보너스 점수

    Product03(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);     // 보너스 점수는 제품 가격의 10%
    }
}

class Tv03 extends Product03 { // Product03의 자손 클래스인 Tv03
    Tv03() {
        //  조상 클래스의 생성자 Product(int price)를 호출한다.
        super(100);     //Tv의 가격을 100만원으로 한다. 그리고 자손 클래스의 price에 100을 저장한다.
    }
    // Object 클래스의 toString()을 오버라이딩한다.
    public String toString() { return"Tv03";}
}
class Computer03 extends Product03 {
    Computer03() { super(200);}

    public String toString() { return"Computer03";}
}

class Buyer {       // 고객, 물건을 사는 사람
    int money = 1000;   // 소유금액
    int bonusPoint = 0; // 보유한 보너스 점수

    void buy(Product03 p) {
        if(money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;       // 가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint;
        System.out.println(p + "을/를 구입하셨습니다.");
    }
}

class PolyArgumentTest {
    public static void main(String [] args) {
        Buyer b = new Buyer();

        b.buy(new Tv03());
        b.buy(new Computer03());

        System.out.println("현재 남은 돈은 "+ b.money+ "만원입니다.");
        System.out.println("현재 보너스점수는 " +b.bonusPoint + "점입니다.");

    }
}
// 고객(Buyer)이 buy(Product03 p)메서드를 이용해서 Tv와 Computer를 구입하고, 고객의 잔고와 보너스 점수를 출력하는 예제이다.