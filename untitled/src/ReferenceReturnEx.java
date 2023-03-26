/*to__ 참조형 반환타입
매개변수뿐만 아니라 변환타입도 참조형이 될 수 있다. 반환타입이 참조형이라는 것은 반환하는 값의 타입이 참조형이라는 얘기인데,
모든 참조형 타입의 값은 '객체의 주소'이므로 그저 정수값이 반환되는 것일 뿐이며 특별한 것이 없다.    */
public class ReferenceReturnEx {
    public static void main(String [] args) {
        Data d = new Data();
        d.x = 10;

        Data d2 = copy(d);
        System.out.println("d.x ="+d.x);
        System.out.println("d2.x="+d2.x);
    }

    static Data copy(Data d) {
        Data tmp = new Data();      // 새로운 객체 tmp를 생성한다.
        tmp.x = d.x;                // d.x의 값을 tmp.x에 복사한다.

        return tmp;                 // 복사한 객체의 주소를 반환한다.
    }
}

/* copy메서드는 새로운 객체를 생성한 다음에, 매개변수로 넘겨받은 객체에 저장된 값을 복사해서 반환한다.
반환하는 값이 Data객체의 주소이므로 반환 타입이 'Data'인 것이다.

이 메서드의 반환타입이 'Data'이므로, 호출결과를 저장하는 변수의 타입 역시 'Data'타입의 참조변수이어야 한다.
 */
