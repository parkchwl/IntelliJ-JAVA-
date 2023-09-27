class Tv{
    //Tv의 속성(멤버변수)
    String color;
    boolean power;
    int channel;

    void power()    { power = !power; } // TV를 켜거나 끄는 기능을 하는 메서드
    void channelUp()    {++channel;}
    void channelDown()  {--channel;}
}

class TvTest {
    public static void main(String [] args) {
        Tv t;               // TV인스턴스를 참조하기 위한 변수 t를 선언
        t = new Tv();       // TV인스턴스를 생성한다.
        t.channel
    }
}