public class FlowEx19 {
    public static void main(String [] args) {
        for(int i=1;i<=3;i++)
            for(int j=1;j<=3;j++)
                for(int k=1;k<=3;k++)
                    System.out.println(""+i+j+k);
    } // end of main
}

/* 3개의 반복문이 중첩되어 있는 경우 어떤 순서로 반복이 수행되는지를 눈으로 직접 확인할 수 있는 예제이다.
각 반복문이 3번씩 반복하므로 모두 27번 (3*3*3=27)이 반복된다. i, j, k가 각각 1, 2, 3일때 식 ""i+j+k는 아래와 같이 계산된다.
""+i+j+k ===> ""+1+2+3 ===> "1"+2+3 ===> "12"+3" ===> "123"
 */