/*패키지란 클래스의 묶음이다. 패키지에는 클래스 또는 인터페이스를 포함시킬 수 있으며,
서로 관련된 클래스들끼리 그룹 단위로 묵어 놓음으로써 클래스를 효율적으로 관리할 수 있다.
같은 이름의 클래스 일지라도 서로 다른 패키지에 존재하는 것이 가능하므로, 자신만의 패키지 체계를 유지함으로써 클래스 이름이 충돌하는 것을 피할 수 있다.
# 하나의 소스파일에는 첫 번째 문장으로 단 한 번의 패키지 선언만을 허용한다.
# 모든 클래스는 반드시 하나의 패키지에 속해야 한다.
# 패키지는 점(.)을 구분자로 하여 계층구조로 구성할 수 있다.
# 패키지는 물리적으로 클래스 파일(.class)을 포함하는 하나의 디렉토리이다.
to_ 패키지는 클래스나 인터페이스의 소스파일 맨 위에  package 패키지명; 으로 선언한다.
 */
package Test.Fist.Package;
public class PackageTest {
    public static void main(String [] args) {
        System.out.println("Fist Package");
    }
}
