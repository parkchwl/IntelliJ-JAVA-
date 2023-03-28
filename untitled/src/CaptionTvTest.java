/*to__ 1.상속(inheritance)
상속이란, 기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것이다. 상속을 통해서 클래스를 작성하면 보다 적은 양의 코드로 새로운 코드를 작성 할 수 있고
코드를 공통적으로 관리할 수 있기 때문에 코드의 추가 및 변경이 매우 용이하다.
상속을 구현하는 방법은 상속받고자 하는 클래스의 이름을 키워드'extends'와 함께 써 주기만 하면 된다.
    class Child extends Parent {
                ...    'Parent'는 조상클래스, Child는 자손클래스이다.   }
상속해주는 클래스를 '조상 클래스'라고 하고, 상속받는 클래스를 '자손 클래스'라고 한다.

자손 클래스는 조상 클래스의 모든 멤버를 상속받기 때문에, Child클래스는 Parent클래스의 멤버들을 포함한다고 할 수 있다.
만일 Parent클래스에 age라는 정수형 변수를 멤버변수로 추가하면, 자손 클래스는 조상의 멤버를 모두 상속받기 때문에,
Child클래스는 자동적으로 age라는 멤버변수가 추가된 것과 같은 효과를 얻는다.
to_ #. 생성자와 초기화 블럭은 상속되지 않는다. 멤버만 상속된다.
to_ #. 자손 클래스의 멤버 개수는 조상 클래스보다 항상 같거나 많다.
 */
class Tv5 {
    boolean power;            //전원상태(on/off)
    int channel;              //채널

    void power()        { power = !power;}
    void channelUp()    { ++channel; }
    void channelDown()  { --channel; }
}
class CaptionTv extends Tv {
    boolean caption;        //캡션상태(on/off)'

    void displatCaption(String text) {
        if (caption) {       //캡션상태가 on(true)일 때만 text를 보여 준다.
            System.out.println(text);
        }
    }
}

class CaptionTvTest {
    public static void main(String [] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;                       // 조상 클래스로부터 상속받은 멤버
        ctv.channelUp();                        // 조상 클래스로부터 상속받은 멤버
        System.out.println(ctv.channel);
        ctv.displatCaption("Hello, World");
        ctv.caption = true;                     // 캡션(자막) 기능을 켠다.
        ctv.displatCaption("Hello, World");
    }
}
/* Tv클래스로부터 상속받고 기능을 추가하여 CaptionTv클래스를 작성하였다. 멤버변수 caption은 캡션기능의 상태를 저장하기 위한 boolean형 변수이고,
displayCaption(String text)은 매개변수로 넘겨받은 문자열(text)을 캡션이 켜져 있는 경우 (caption의 값이 true인 경우)에만 화면에 출력한다.
#1. 자손클래스의 인스턴스를 생성하면 조상 클래스의 멤버와 자손 클래스의 멤버가 합쳐진 하나의 인스턴스로 생성된다.

 */