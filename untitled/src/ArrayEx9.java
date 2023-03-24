/* 배열을 연속적인 범위의 임의의 값으로 채우는 것은 다음과 같이 random()만 사용하면 쉽게 할 수 있다.
불연속적인 값은 배열을 하나만 더 사용하면 되는데 먼저 배열 code에 불연속적인 값들을 담고, 임의로 선택된 index에 저장된 값으로
배열 arr의 요소들을 하나씩 채우면 된다. 저장된 값에 상관없이 배열의 index는 항상 연속적이기 때문이다.  */
import java.util.*;
public class ArrayEx9 {
    public static void main(String [] args) {
        int code [] = { -4, -1, 3 , 6, 11 };    //불연속적인 값들로 구성된 배열이다.
        int arr [] = new int[10];

        for (int i=0; i < arr.length; i++) {
            int tmp = (int)(Math.random() * code.length); // todo: code.length는 값이 5이다, tmp에 0,1,2,3,4 중 하나가 저장된다.
            arr[i] = code[tmp];
        }

        System.out.println(Arrays.toString(arr));
    } //end of main
}
/* 배열 code의 길이가 5이므로 code.length의 값은 5가 된다. 따라서 변수 tmp에는 0~4범위에 속한 임의의 정수가 저장되는데,
이 범위는 배열 code의 index의 범위와 일치한다. todo: 만일 i의 값이 0이고, tmp의 값이 4라면 arr[0]에는 code[4]의 값인 11이 저장된다.
*/