public class FlowEx20 {
    public static void main(String [] args) {
        for (int i=1;i<=5;i++) {
            for(int j=1;j<=5;j++) {
                System.out.printf("[%d,%d]",i,j);
            }
            System.out.println();
        }
    } // end of main
}

/*2중 반복문을 이용해서 i와 j를 1부터 5까지 1씩 증가시키면서 i와 j의 값을 쌍으로 출력하였다.
이 2중 for 문 안에 if 문을 넣어서 조건에 맞는 쌍만 출력함으로써 다양한 예제를 만들 수 있다.
 */