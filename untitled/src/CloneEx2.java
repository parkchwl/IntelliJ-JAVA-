/* 공변 반환타입
이 기능은 오버라이딩할 때 조상메서드의 반환타입을 자손 클래스의 타입으로 변경을 허용하는 것이다.                                              */
import java.util.*;
class CloneEx2 {
    public static void main(String [] args) {
        int arr [] = {1,2,3,4,5};
        int arrClone [] = arr.clone();      // 배열 arr을 복제해서 같은 내용의 새로운 배열을 만든다.
        arrClone[0] = 6;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrClone));
    }
}
/* clone()을 이용해서 배열을 복제하는 예제이다. 배열도 객체이기 때문에 Object클래스를 상속받으며,
동시에 Cloneable인터페이스와 Serializable인터페이스가 구현되어 있다. 그래서 Object클래스의 멤버들을 모두 상속받는다.
Object클래스에는 protected로 정의되어있는 clone()을 배열에서는 public으로 오버라이딩하였기 떄문에 예제처럼 직접 호출이 가능하다.
그리고 원본과 같은 타입을 반환하므로 형변환이 필요 없다.

일반적으로는 배열을 복사할 때, 같은 길이의 새로운 배열을 생성한 다음에 System.arraycopy()를 이용해서 내용을 복사하지만, 이처럼 clone()을 이용해서
간단하게 복사할 수 있다.
아래의 두 코드는 같은 결과를 얻는다. 어느 쪽을 사용해도 상관없다.
#1. int arr [] = {1,2,3,4,5};
    int arrClone [] = arr.clone();

#2. int arr [] = {1,2,3,4,5};
    int arrClone [] = new int[arr.length]               // 배열을 생성하고
    System.arraycopy(arr,0,arrClone,0,arr.length);      // 내용을 복사한다.
 */