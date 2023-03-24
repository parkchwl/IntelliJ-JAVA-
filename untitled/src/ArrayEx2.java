/*
int[] arr = new int[5];     //길이가 5인 int 배열이다.
int tmp   = arr.length;     //arr.length의 값은 5이고 tmp가 5에 저장된다.
배열은 한번 생성하면 길이를 변경할 수 없기 때문에, 이미 생성된 배열의 길이는 변하지 않는다. '배열이름.length'는 상수다.
즉, 값을 읽을 수만 있을뿐 변경할 수 없다.

int[] score = new int[]{ 50, 60, 70, 80, 90};
int[] score = { 50, 60, 70, 80, 90};   //new int[]를 생략할 수 있다.

# 괄호{}안에 아무 것도 넣지 않는다면, 길이가 0인 배열이 생성된다.
참조변수의 기본 값은 null이지만, 배열을 가리키는 참조변수는 null대신 길이 0인 배열로 초기화 하기도 한다. */
import java.util.*;     // Arrays.toString()을 사용하기 위해 추가한다.
public class ArrayEx2 {
    public static void main(String [] args){
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
//        int[] iArr3 = new int[]{100, 95, 80, 70, 60};
        int[] iArr3 = {100, 95, 80, 70, 60};
        char[] chArr = {'a', 'b', 'c', 'd'};
        for (int i =0; i< iArr1.length ; i++ ) { //'배열이름.lenght'를 통해 배열의 길이에 대한 정보를 얻을 수 있다.
            iArr1[i] = i + 1;   // 1~10의 숫자를 순서대로 배열에 저장한다.
        }

        // 배열에 저장된 값들을 출력한다.
        for(int i=0; i <iArr1.length;i++) {
            System.out.print(iArr1[i]+",");
        }
        System.out.println();
        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr3);
        System.out.println(chArr); // char배열은 println메서드로 출력하면 각 요소가 그대로 출력된다.[char배열일 때만 이렇게 작동한다.]
    }
}
