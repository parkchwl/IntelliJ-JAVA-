public class FlowEx26 {
    public static void main(String [] args){
        int sum = 0;
        int i = 0;

        // i를 1씩 증가시켜서 sum에 계속 더해나간다.
        while ((sum += ++i) <= 100) {
            System.out.printf("%d - %d%n", i, sum);
        }
    }// end of main
}
/* 1부터 몇까지 더하면 누적합계가 100을 넘지 않는 제일 큰수가 되는지 알아내는 예제이다.
이전에 비해 조건식 'sum += ++i) <= 100'이 복잡한데, 아래의 두 식을 하나로 합쳐놓은 것이라고 생각하면 이해하기 쉬울 것이다.
sum += ++i // i의 값을 1씩 증가시켜서 sum에 누적
sum <= 100 // sum의 값이 100보다 작거나 같은지 확인한다.
 */