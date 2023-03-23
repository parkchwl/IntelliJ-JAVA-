import java.util.*;
public class FlowEx27 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        boolean flag = true; // while문의 조건식으로 사용될 변수
        Scanner scanner = new Scanner(System.in);
        System.out.println("합계를 구할 숫자를 입력하세요.(끝내려면 0을 입력하세요.)");

        while (flag) { // flag의 값이 ture 이므로 조건식은 참이 된다.
            System.out.print(">>");

            String tmp = scanner.nextLine();
            num = Integer.parseInt(tmp);

            if (num != 0) {
                sum += num; //num이 0이 아니면, sum에 더한다.
            } else {
                flag = false; //num이 0이면, flag의 값을 false로 변경한다.
            }
        } //end of main

        System.out.println("합계:"+ sum);
    }
}
/* 사용자로부터 반복해서 숫자를 입력받다가 0을 입력하면 입력을 마치고 총 합을 출력하는 예제이다.
while문의 조건식으로 변수 flag를 사용했는데, 처음엔 flag에 true를 저장해서 계속 반복을 하다가
사용자가 0을 입력하면 flag의 값도 false로 바꿔서 반복을 멈춘다.
특정조건을 만족할 때 반복을 멈추게 하는 if문이 반복문 안에 꼭 필요하다.
 */