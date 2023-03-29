class CastingTest1 {
    public static void main(String [] args) {
        Car01 car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;   // car = (Car)fe;에서 형변환이 생략된 형태이다.
//      car.water();
        fe2 = (FireEngine)car;  //자손타입 <- 조상타입
        fe2.water();
    }
}
class Car01 {
    String color;
    int door;
    void drive() {                       // 운전하는 기능
        System.out.println("drive, brrr~");
    }
    void stop() {                        // 멈추는 기능
        System.out.println("stop!!!");
    }
}
class FireEngine extends Car01 {        //  소방차
    void water() {                      // 물 뿌리는 기능
        System.out.println("water!!!");
    }
}
/* 참조변수 car와 fe의 타입이 서로 다르기 때문에, 대입연산이 수행되기 전에 형변환을 수행하여 두 변수간의 타입을 맞춰주어야 한다.
그러나, 자손타입의 참조변수를 조상타입의 참조변수에 할당할 경우 형변환을 생략할 수 있어서'car = fe;'와 같이 하였다.
원칙적으로는 'car=(Car)fe;'와 같이 해야 한다.

반대로 조상타입의 참조변수를 자손타입의 참조변수에 저장할 경우 형변환을 생략할 수 없으므로, 'fe2=(FireEngine)car;'와 같이 명시적으로 형변환을 해주어야 한다.
 */