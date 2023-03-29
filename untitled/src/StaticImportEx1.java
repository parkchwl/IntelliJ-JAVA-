import static java.lang.System.out;
import static java.lang.Math.*;

class StaticImportEx1 {
    public static void main(String [] args) {
        // System.out.println(Math.random());
        out.println(random());

        // System.out.println("Math.PI :"+Math.PI);
        out.println("Math.PI: " +PI);
    }
}

/* import문을 사용하면 클래스의 패키지명을 생략할 수 있는 것과 같이 static import문을 사용하면 static 멤버를 호출할 때 클래스 이름을 생략할 수 있다.
특정 클래스의 static멤버를 자주 사용할 때 편리하다.
import static java.lang.Integer.*;      // Integer클래스의 모든 static 메서드
import static java.lang.Math.random;  // Math.random()만. Math.random의 import static 선언문은 괄호는 붙이지 않는다.
import static java.lang.System.out;     // System.out을 out만으로도 참조가  가능하다.

만일 위와 같이 static import문을 선언하였다면, 아래처럼 간략하게 바꿀 수 있다.
System.out.println(Math.random());      ===>    out.println(random());

 */