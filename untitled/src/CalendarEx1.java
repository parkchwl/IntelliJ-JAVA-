import java.util.Calendar;

/* Date는 날짜와 시간을 다룰 목적으로 제공되어온 클래스이다.
#.1 Calendar와 Gregorian Calendar
todo: Calendar는 추상클래스이기 때문에 직접 객체를 생성할 수 없고, 메서드를 통해서 완전히 구현된 클래스의 인스턴스를 얻어야 한다.

$ Calendar cal = new Calendar();          // 에러 : 추상클래스는 인스턴스를 생성할 수 없다.

$ Calendar cal = Calendar.getInstance();  //  OK : getInstance() 메서드는 Calendar 클래스를 구현한 클래스의 인스턴스를 반환한다.

Calendar를 상속받아 완전히 구현한 클래스로는 GregorianCalendar와 BuddhistCalendar가 있는데, getInstance()는 시스템의 국가와
지역설정을 확인해서 태국인 경우에는 BuddhistCalendar의 인스턴스를 반환하고, 그 외에는 GregorianCalendar의 인스턴스를 반환한다.

GregorianCalendar는 Calendar를 상속받아 오늘날 전세계 공통으로 사용하고 있는 그레고리력에 맞게 구현한 것으로, 태국을 제외한 나머지 국가에서는
GregorianCalendar를 사용하면 된다. 인스턴스를 직접 생성해서 사용하지 않고 이처럼 메서드를 통해서 인스턴스를 반환받게 하는 이유는 최소한의 변경으로
프로그램이 동작할 수 있도록 하기 위한 것이다.

#.2 Date와 Calendar간의 변환
Calendar가 새로 추가되면서 Date는 대부분의 메서드가 'deprecated'가 되었으므로 잘 사용되지 않는다.
그럼에도 불구하고 여전히 Date를 필요로 하는 메서드들이 있기 때문에 Calendar를 Date로 또는 그 반대로 변환할 일이 생긴다.

1. Calendar를 Date로 변환한다.
    Calendar cal = Calendar.getInstace();
    Date d = new Date(cal.getTimeInMillis());   // Date(long date)

2. Date를 Calendar로 변환한다.
    Date d = new Date();
    Calendar cal = Calendar.getInstance();
    cal.setTime(d)
 */
public class CalendarEx1 {
    public static void main (String [] args)
    {   // 기본적으로 현재 날짜와 시간으로 설정된다.
        Calendar today = Calendar.getInstance();
        System.out.println("이 해의 년도 : " + today.get(Calendar.YEAR));
        System.out.println("월(0~11, 0:1월) : " + today.get(Calendar.MONTH));
        System.out.println("이 해의 몇 째 주: " +today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("이 달의 몇 째 주: " + today.get(Calendar.WEEK_OF_MONTH));

        // DATE와 DAY_OF_MONTH는 같다.
        System.out.println("이 달의 몇 일: " + today.get(Calendar.DATE));
        System.out.println("이 달의 몇 일: " + today.get(Calendar.DAY_OF_MONTH));
        System.out.println("이 해의 몇 일: " + today.get(Calendar.DAY_OF_YEAR));
        System.out.println("요일(1~7, 1:일요일) : " + today.get(Calendar.DAY_OF_WEEK));  // 1: 일요일, 2:월요일 ... 7:토요일

    }
}
