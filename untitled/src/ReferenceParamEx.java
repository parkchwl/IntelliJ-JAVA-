class Data { int x; }
public class ReferenceParamEx {
    public static void main(String [] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d);
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(Data d) { // 참조형 매개변수이다.
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }
}
/* 이전과 달리 change 메서드를 호출한 후에 d.x의 값이 변경되었다.
change 메서드의 매개변수가 참조형이라서 값이 아니라 '값이 저장된 주소'를 change메서드에게 넘겨주기 때문에 값을 읽어오는 것뿐만 아니라 변경하는 것도 가능하다.
[1]change메서드가 호출되면서 참조변수 d의 값(주소)이 매개변수 d에 복사된다. 이제 매개변수 d에 저장된 주소값으로 x에 접근이 가능하다.
[2]change메서드에서 매개변수 d로 x의 값을 1000으로 변경
[3]change메서드가 종료되면서 매개변수 d는 스택에서 제거된다.

이전 예제와 달리, change메서드의 매개변수를 참조형으로 선언했기 때문에, x의 값이 아닌 주소가 매개변수 d에 저장되었다.
이제 main메서드의 참조변수 d와 change메서드의 참조변수 d는 같은 객체를 가리키게 된다. 그래서 매개변수 d로 x의 값을 읽는 것과 변경하는 것이 모두 가능한 것이다.
 */