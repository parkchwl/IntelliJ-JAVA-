class TvTest4 {
    public static void main(String [] args) {
        Tv4 tvArr [] = new Tv4[3];    // 길이가 3인 Tv객체 배열이다.

        // Tv객체를 생성해서 Tv객체 배열의 각 요소에 저장한ㄷ.
        for(int i=0;i < tvArr.length;i++) {
            tvArr[i] = new Tv4();
            tvArr[i].channel = i+10;    // tvArr[i]의 channel에 i+10을 저장한다.
        }
        for(int i=0; i < tvArr.length;i++) {
            tvArr[i].channelUp();   //tvArr[i]의 메서드를 호출한다. 채널이 1 증가한다.
            System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
        }
    } // end of main
}

class  Tv4 {
    String color;   // 색상
    boolean power;  // 전원상태(on/off)
    int channel;    // 채널

    void power()    { power = !power; }
    void channelUp()    { ++channel; }
    void channelDown()  { --channel; }
}
/* Tv tvArr [] = new Tv[3]; // 길이가 3인 Tv타입의 참조변수 배열
#1.객체 배열을 생성하는 것은, 그저 객체를 다루기 위한 참조변수들이 만들어진 것일 뿐, 객체가 저장되지 않는다. 객체를 생성해서 객체 배열의 각 요소에 저장해야한다.

Tv tvArr [] = new Tv[3];    //참조변수 배열(객체 배열)을 생성
#2.객체를 생성해서 배열의 각 요소에 저장한다.
tvArr[0] = new Tv();
tvArr[1] = new Tv();
tvArr[2] = new Tv();
                    배열의 초기화 블럭을 사용하면, 다음과 같이 간단히 할 수 있다. Tv tvArr [] = { new Tv(), new Tv(), new Tv() } ;

#3 다뤄야할 객체가 많다면 for문을 사용하면 된다.
Tv tvArr [] = new Tv[100];
for(int i=0; i < tvArr.length;i++) {
        tvArr[i] = new Tv();        }
 */