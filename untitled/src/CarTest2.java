/* 생성자에서 다른 생성자 호출하기 - this(), this
같은 클래스의 멤버들 간에 서로 호출할 수 있는 것처럼 생성자 간에도 서로 호출이 가능하다. 단, 다음의 두 조건을 만족시켜야 한다.
[1]생성자의 이름으로 클래스이름 대신 this를 사용한다.
[2]한 생성자에서 다른 생성자를 호출할 때는 반드시 첫 줄에서만 호출이 가능하다.

다음의 코드는 생성자를 작성할 때 지켜야하는 두 조건을 모두 만족시키지 못했기 때문에 에러가 발생한다.
    Car(String color) {
        door = 5;                //첫번째 줄    || 첫번째 줄에 생성자를 호출해야한다.this(color, "auto", 4);
        Car(color, "auto", 4);   //에러1. 생성자의 두 번째 줄에서 다른 생성자를 호출했다.
        }                        //에러2. this(color, "auto", 4);로 해야한다.
생성자 내에서 다른 생성자를 호출할 때는 클래스 이름인 'Car'대신 'this'를 사용해야 하는데 그러지 않아서 에러이고,
또 다른 에러는 생성자 호출이 첫 번째 줄이 아닌 두 번째 줄이기 때문에 에러이다.
 */
class Car {
    String color;       // 색상
    String gearType;    // 변속기 종류 - auto(자동), manual(수동)
    int door;           // 문의 개수

    Car() {
        this("white", "auto", 4);       //Car(String color, String gearType, int doo)를 호출한다.
    }

    Car(String color) {
        this(color, "auto", 4);
    }
    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
class CarTest2 {
    public static void main(String [] args) {
        Car c1 = new Car();
        Car c2 = new Car("blue");

        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+", door="+c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+", door="+c2.door);
    }
}

/* 생성자 Car()에서 또 다른 생성자 Car(String color, String gearType, int door)를 호출했다.
이처럼 생성자간의 호출에는 생성자의 이름 대신 this를 사용해야만 하므로 'Car'대신 'this'를 사용하였다

Car() {
        this("white", "auto", 4);
Car c1 = new Car();와 같이 생성자 Car()를 사용해서 Car인스턴스를 생성한 경우에,
인스턴스 변수 color는 "white", gearType은 "auto", door는 4로 초기화 되도록 하였다.

'this'는 참조변수로 인스턴스 자신을 가리킨다. 참조변수를 통해 인스턴스의 멤버에 접근할 수 있는 것처럼, 'this'로 인스턴스 변수에 접근할 수 있는 것이다.
하지만 'this'를 사용할 수 있는 것은 인스턴스 멤버 뿐이다. static메서드(클래스메서드)에서는 인스턴스 멤버들을 사용할 수 없는 것처럼,
'this'역시 사용할 수 없다. 왜냐하면, static메서드는 인스턴스를 생성하지 않고도 호출될 수 있으므로
static메서드가 호출된 시점에 인스턴스가 존재하지 않을 수도 있기 때문이다.

to_ "this" : 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장되어 있다. 모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재한다.
to_ "this(), this(매개변수) : 생성자, 같은 클래스의 다른 생성자를 호출할 떄 사용한다.
[this와 this()는 비슷하게 생겼을 뿐, 완전히 다른 것이다. this는 '참조변수'이고, this()는 '생성자'이다.]
 */
