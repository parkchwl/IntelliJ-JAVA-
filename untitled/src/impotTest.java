/* import 문에서 클래스의 이름 대신'*'을 사용하는 것이 하위 패키지의 클래스까지 포함하는 것은 아니다.
import java.util.*;
import java.text.*;
위의 두 문장 대신 다음과 같이 사용할 수 없다.
import java.*;  //util의 하위클래스에 접근하지 않는다. text패키지의 클래스도 마찬가지이다.      */
import java.text.SimpleDateFormat;
import java.util.Date;

class ImportTest{
    public static void main(String [] args) {
        Date today = new Date();

        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");

        System.out.println("오늘 날짜는 " + date.format(today));
        System.out.println("현재 시간은 " + time.format(today));
    }
}
/* SimpleDateFormat과 Date클래스는 다른 패키지에 속한 클래스이므로 import문으로 어느 패키지에 속하는 클래스인지 명시해주었다.
그래서 소스에서 클래스이름 앞에 패키지명을 생략할 수 있었다.
만일 import문을 지정하지 않았다면 다음과 같이 클래스 이름에 패키지 명도 적어줘야 한다.
java.util.Date today = new java.util.Date();
java.text.SimpleDateFormat date = new java.text.SimpleDateFormat("yyyy/MM/dd");

지금까지 System과 String 같은 java.lang패키지의 클래스들을 패키지명 없이 사용할 수 있었던 이유는
모든 소스파일에는 묵시적으로 다음과 같은 import문이 선언되어 있기 떄문이다. import java.lang*;
 */