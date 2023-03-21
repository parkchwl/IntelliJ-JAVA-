import java.util.*;
public class FlowEx7 {
    public static void main(String [] args){
        System.out.print("가위(1),바위(2),보(3) 중 하나를 입력하세요.>");

        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 user 에 저장
        int com = (int)(Math.random() * 3) + 1; // 1,2,3중 하나가 com 에 저장된다.

        System.out.println("당신은 "+ user +"입니다.");
        System.out.println("컴은 "+ com + "입니다.");

        switch (user - com) {
            case 2, -1 -> System.out.println("당신이 졌습니다.");
            case 1, -2 -> System.out.println("당신이 이겼습니다.");
            case 0 -> System.out.println("비겼습니다.");
            //마지막 문장이므로 break 를 사용할 필요가 없다.
        }
    }
}
/* 이 예제는 컴퓨터와 사용자가 가위바위보를 하는 간단한 게임이다. 사용자로부터 1(가위), 2(바위), 3(보) 중의 하나를 입력받고
컴퓨터는 1,2,3 중에서 하나를 임의로 선택한다. 난수(임의의 수)를 얻기 위해서는 Math.random()을 사용해야 하는데,
이 메서드는 0.0과 1.0사이의 범위에 속하는 하나의 double 값을 반환한다. 0.0은 범위에 포함되고, 1.0은 범위에 포함되지 않는다.

# 0.0 <= Math.random() < 1.0

만일 1과 3 사이의 정수를 구하기를 원한다면, 다음과 같은 과정으로 난수를 구하는 식을 얻을 수 있다.

#1 각 변에 3을 곱한다.
0.0 * 3 <= Math.random() * 3 < 1.0 *3
0.0 <= Math.random() *3 < 3.0

#2 각 변을 int 형으로 변환한다.
(int)0.0 <= (int)(Math.random() * 3) < (int)3.0
     0.0 <= (int)(Math.random() * 3) < 3

#3 각 변에 1을 더한다.
0 + 1 <= (int)(Math.random() * 3) + 1 < 3 + 1
    1 <= (int)(Math.random() * 3) + 1 < 4

이렇게 하면 1과 3사이의 정수 중 하나를 얻을 수 있다. 1은 포함되고 4는 포함되지 않는다.
 */