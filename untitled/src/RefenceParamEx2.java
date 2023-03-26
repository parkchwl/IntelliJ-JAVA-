public class RefenceParamEx2 {
    public static void main(String [] args){
        int x [] = {10};    // 크기가 1인 배열. x[0] = 10;
        System.out.println("main() : x = " + x[0]);

        change(x);
        System.out.println("After change(x)");
        System.out.println("main() : x = " + x[0]);
    }

    static void change(int x []) {      //참조형 매개변수
        x[0] = 1000;
        System.out.println("change() : x = " + x[0]);
    }
}
/* 이전의 참조형 매개변수를 Data클래스의 인스턴스 대신 길이가 1인 배열 x를 사용하도록 변경한 것이다.
배열도 객체와 같이 참조변수를 통해 데이터가 저장된 공간에 접근한다는 것을 이미 배웠다.
이전 예제의 Data클래스 타입의 참조변수 d와 같이 변수 x도 int배열 타입의 참조변수이기 때문에 같은 결과를 얻는다.
임시적으로 간단히 처리할 때는 별도의 클래스를 선언하는 것보다 이처럼 배열을 이용할 수도 있다.
*/
