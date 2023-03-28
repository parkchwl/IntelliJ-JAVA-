/* #1.명시적 초기화 : 변수를 선언과 동시에 초기화하는 것을 명시적초기화라고 한다. 가장 기본적이면서도 간단한, 우선적으로 고려되야할 초기화 방법이다.
#2.초기화 블럭 : 초기화 블럭에는 '클래스 초기화 블럭'과 '인스턴스 초기화 블럭' 두 가지 종류가 있다.
클래스 초기화 블럭은 클래스 변수의 초기화에 사용되고, 인스턴스 초기화 블럭은 인스턴스 변수의 초기화에 사용된다.
초기화 블럭을 작성하려면, 인스턴스 초기화 블럭은 단순히 클래스 내에 블럭{}을 만들고 그 안에 코드를 작성하기만 하면 된다.
그리고 클래스 초기화 블럭은 인스턴스 초기화 블럭 앞에 단순히 static을 덧붙이기만 하면 된다.

초기화 블럭 내에는 메서드 내에서와 같이 조건문, 반복문, 예외처리 구문 등을 자유롭게 사용할 수 있으므로,
초기화 작업이 복잡하여 명시적 초기화만으로는 부족한 경우 초기화 블럭을 사용한다.
        class InitBlock {
        static {  --- 클래스 초기화 블럭입니다. --- }

        { --- 인스턴스 초기화 블럭입니다. --- }
        }

클래스 초기화 블럭은 클래스가 메모리에 처음 로딩될 때 한번만 수행되며, 인스턴스 초기화 블럭은 생성자와 같이 인스턴스를 생성할 때 마다 수행된다.
그리고 생성자 보다 인스턴스 초기화 블럭이 먼저 수행된다는 사실을 기억하자.

인스턴스 변수의 초기화는 주로 생성자를 사용하고, 인스턴스 초기화 블럭은 모든 생성자에서 공통으로 수행돼야 하는 코드를 넣는데 사용한다.

        Car()  {
                            count++;
                            serialNo = count;
            color ="White";
            gearType ="Auto";
    }                                        // 같은 코드가 중복되었다.
    Car(String color, String gearType) {
                            count++;
                            serialNo = count;
            this.color = color;
            this.gearType = gearType;
 */
class BlockTest {
    static {
        System.out.println("static { }");       // 클래스 초기화 블럭
    }

    {
        System.out.println("{  }");             // 인스턴스 초기화 블럭
    }

    public BlockTest() {
        System.out.println("생성자");
    }

    public static void main(String [] args) {
        System.out.println("BlockTest bt = new BlcokTest(); ");
        BlockTest bt = new BlockTest();

        System.out.println("BlcokTest bt2 = new BlcokTest(); ");
        BlockTest bt2 = new BlockTest();
    }
}
/* 예제가 실행되면서 BlcokTest가 메모리에 로딩될 때, 클래스 초기화 블럭이 가장 먼저 수행되어 'static{ }'이 화면에 출력된다.