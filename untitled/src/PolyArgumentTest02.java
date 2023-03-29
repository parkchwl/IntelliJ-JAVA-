/* 조상타입의 참조변수로 자손타입의 객체를 참조하는 것이 가능하므로, Product 클래스가 Tv,Computer,Audio 클래스의 조상일 때,
Product p1 = new Tv();
Product p2 = new Computer();
Product p3 = new Audio();           와 같이 하는 것을 배웠다.
위의 코드를 Product 타입의 참조변수 배열로 처리하면 아래와 같다.

Product p[] = new Product[3];
p[0] = new Tv();
p[1] = new Computer();
p[2] = new Audio();

이처럼 조상타입의 참조변수 배열을 사용하면, 공통의 조상을 가진 서로 다른 종류의 객체를 배열로 묶어서 다룰 수 있다.
또는 묶어서 다루고싶은 객체들의 상속관계를 따져서 가장 가까운 공통조상 클래스 타입의 참조변수 배열을 생성해서 객체들을 저장하면 된다.
 */
class Product02 {
    int price;      // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스 점수

    Product02(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
    Product02(){}   // 기본 생성자

}
class Tv02 extends Product02 {
    Tv02() { super(100);}       // 조상클래스의 생성자 Product(int price)를 생성한다.
    public String toString() { return "Tv02";}
}
class Computer02 extends Product02 {
    Computer02() { super(200);}
    public String toString() { return"Computer02";}
}
class Audio02 extends Product02 {
    Audio02() { super(50);}
    public String toString() { return"Audio02";}
}
class Buyer02 {           // 물건을 사는 사람
    int money = 1000;   // 소유금액
    int bonusPoint = 0; // 보너스 점수
    Product02[] item = new Product02[10];   // 구입한 제품을 저장하기 위한 배열
    int i = 0;          // Product 배열에 사용될 카운터

    void buy(Product02 p) {
        if(money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= p.price;               // 가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint;     // 제품의 보너스 점수를 추가한다.
        item[i++] = p;                  // 제품을 Product02[]item 에 저장한다.
        System.out.println(p + "을/를 구입하셨습니다.");
    }

    void summary() {                    // 구매한 물품에 대한 정보를 요약해서 보여 준다.
        int sum = 0;                    // 구입한 물품의 가격합계
        String itemList ="";            // 구입한 물품목록

        //반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
        for(int i=0; i<item.length;i++) {
            if(item[i]==null) break;
            sum += item[i].price;
            itemList += item[i] + ", ";
        }
        System.out.println("구입하신 물품의 총금액은 "+ sum + "만원입니다.");
        System.out.println("구입하신 제품은 "+ itemList + "입니다.");
    }
}
class PolyArgumentTest02 {
    public static void main(String [] args) {
        Buyer02 b = new Buyer02();

        b.buy(new Tv02());
        b.buy(new Computer02());
        b.buy(new Audio02());
        b.summary();
    }
}