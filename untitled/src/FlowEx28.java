import java.util.*;
/* do-while문은 while문의 변형으로 기본적인 구조는 while문과 같으나, 조건식과 블럭{}의 순서를 바꿔놓은 것이다.
그래서 while 문과 반대로 블럭{}을 먼저 수행한 후에 조건식을 평가한다.
while 문은 조건식의 결과에 따라 블럭{}이 한 번도 수행되지 않을 수 있지만, do-while문은 최소한 한번은 수행될 것을 보장한다. */
public class FlowEx28 {
    public static void main(String [] args) {
        int input = 0, answer = 0;

        answer = (int)(Math.random() * 100) + 1;    // 1~100 사이의 임의의 수를 저장한다.
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("1과 100사이의 정수를 입력하세요,>");
            input = scanner.nextInt();

            if(input > answer) {
                System.out.println("더 작은 수로 다시 시도해보세요.");
            } else if(input < answer) {
                System.out.println("더 큰 수로 다시 시도해보세요.");
            }
        } while(input!=answer);
        System.out.println("정답입니다.");
    }
}
/* Math.random()을 이용해서 1과 100사이의 임의의 수를 변수 answer에 저장하고, 이 값을 맞출때까지 반복하는 예제이다.
사용자 입력인 input이 변수 answer의 값과 다른 동안 반복하다가 두 값이 같으면 반복을 벗어난다.                 */