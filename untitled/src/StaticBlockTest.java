public class StaticBlockTest {
    static int arr [] = new int[10];
    static {
        for(int i=0;i<arr.length;i++) {
            //1과 10사이의 임의의 값을 배열 arr에 저장한다.
            arr[i] = (int)(Math.random()*10) + 1;
        }
    }
    public static void main(String [] args) {
        for(int i=0; i<arr.length;i++)
            System.out.println("arr["+i+"] :" + arr[i]);
    }
}
/* 명시적 초기화를 통해 배열 arr을 생성하고, 클래스 초기화 블럭을 이용해서 배열의 각 요소들을 random()을 사용해서 임의의 값으로 채우도록 했다.
이처럼 배열이나 예외처리가 필요한 초기화에서는 명시적 초기화만으로는 복잡한 초기화 작업을 할 수 없다. 이런 경우에 클래스 초기화 블럭을 추가적으로 사용하도록 한다.
(인스턴스 변수의 복잡한 초기화는 생성자 또는 인스턴스 초기화 블럭을 사용한다.)

#초기화 시기와 순서
클래스 변수의 초기화 시점 : 클래스가 처음 로딩될 때 단 한번만 초기화 된다.
인스턴스 변수의 초기화 시점 : 인스턴스가 생성될 때마다 각 인스턴스별로 초기화가 이루어진다.
클래스 변수의 초기화 순서 : 기본값 -> 명시적 초기화 -> 클래스 초기화 블럭
인스턴스 변수의 초기화 순서 : 기본값 -> 명시적 초기화 -> 인스턴스 초기화 블럭 -> 생성자

    class InitTest {
            static int cv = 1;      // 명시적 초기화
            int iv = 1;             // 명시적 초기화

            static {    cv = 2;     }   // 클래스 초기화 블럭
            {       iv = 2;         }   // 인스턴스 초기화 블럭
            InitTest () {               // 생성자
                iv = 3;
            }
        }
 */