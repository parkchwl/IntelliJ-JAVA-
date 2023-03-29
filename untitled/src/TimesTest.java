/* get으로 시작하는 메서드는 단순히 멤버변수의 값을 반환하는 일을 하고,
set으로 시작하는 메서드는 매개변수에 지정된 값을 검사하여 조건에 맞는 값일 때만 멤버변수의 값을 변경하도록 작성하였다.

보통 멤버변수의 값을 읽는 메서드의 이름을 'get멤버변수이름'으로 하고, 멤버변수의 값을 변경하는 메서드의 이름을'set멤버변수이름'으로 한다.
get으로 시작하는 메서드를 '겟터(getter)', set으로 시작하는 메서드를'셋터(setter)'라고 부른다.
 */
public class TimesTest {
    public static void main(String [] args) {
        Time2 t = new Time2(12, 35 ,30);
        System.out.println(t);
//      t.hour = 13;            // Error : 변수 hour의 접근 제어자가 private이므로 접근할 수 없다.
        t.setHour(t.getHour()+1);       //현재 시간보다 1시간 후로 변경한다.
        System.out.println(t);  //System.out.println(t.toString());과 같다.
    }
}
class Time2{
    private int hour, minute, second;

    Time2(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {      return hour;}
    public void setHour(int hour) {
        if (hour < 0 || hour > 23) return;
        this.hour = hour;
    }
    public int getMinute() {    return minute;}
    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) return;
        this.minute = minute;
    }
    public int getSecond() {    return second; }
    public void setSecond(int second) {
        if (second < 0 || second > 59) return;
        this.second = second;
    }

    public  String toString() {
        return hour + ":" + minute + ":" + second;
    }
}
/* Time 클래스의 모든 멤버변수의 접근 제어자를 private으로 하고, 이 들을 다루기 위한 public메서드를 추가했다.
그래서 t.hour=13; 과 같이 멤버변수로의 직접적인 접근은 허가되지 않는다. 메서드를 통한 접근만이 허용될 뿐이다.
[하나의 소스파일에는 public 클래스가 단 하나만 존재할 수 있으며, 소스파일의 이름은 반드시 public클래스의 이름과 같아야 한다.]
 */