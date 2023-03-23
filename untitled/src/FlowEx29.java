public class FlowEx29 {
    public static void main(String [] args) {
        for(int i=1;i<=100;i++) {
            System.out.printf("i=%d ", i);

            int tmp = i;

            do{
                //tmp%10이 3의 배수인지 확인(0은 제외한다.)
                if(tmp%10%3==0 && tmp%10!=0)
                    System.out.print("짝");
                //tmp /=10은 tmp = tmp / 10 과 동일하다.
            } while ((tmp/=10)!=0);

            System.out.println();
        }
    } // end of main
}
/* 숫자 중에 3의 배수(3,6,9)가 포함되어 있으면, 포함된 개수만큼 박수를 치는 369게임의 예제이다.
숫자의 각 자리를 확인해야하기 때문에 10으로 나누고 10으로 나머지 연산을 한다. 그러나 이 작업은 변수 i에 직접 하면 안 되고
다른 변수에 저장해서 처리해야한다. 변수 i는 for문의 제어에 사용되는 변수이기 때문이다.
 */