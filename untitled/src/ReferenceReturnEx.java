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
Data d2 = copy(d);      // static Data copy(Data d)
copy메서드 내에서 생성한 객체를 main메서드에서 사용할 수 있으려면, 이렇게 새로운 객체의 주소를 반환해줘야 한다.
그렇지 않으면, copy메서드가 종료되면서 새로운 객체의 참조가 사라지기 때문에 더 이상 이 객체를 사용할 방법이 없다.
[1]copy메서드를 호출하면서 참조변수 d의 값이 매개변수 d에 복사된다.
[2]새로운 객체를 생성한 다음, d.x에 저장된 값을 tmp.x에 복사한다.
[3]copy메서드가 종료되면서 반환한 tmp의 값은 참조변수 d2에 저장된다.
[4]copy메서드가 종료되어 tmp가 사라졌지만, d2로 새로운 객체를 다룰 수 있다.
to_ "반환타입이 '참조형'이라는 것은 메서드가 '객체의 주소'를 반환한다는 것을 의미한다."
 */
