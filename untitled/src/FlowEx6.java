//switch 문은 단 하나의 조건식으로 많은 경우의 수를 처리할 수 있고, 표현도 간결하므로 알아보기 쉽다.
//그래서 처리해야할 경우의 수가 많은 경우에는 if 문 보다 switch 문으로 작성하는 것이 좋다.
//다만 switch 문은 제약조건이 있기 때문에, 경우의 수가 많아도 어쩔 수 없이 if 문을 작성해야 하는 경우가 있다.

/*switch 문은 조건식을 먼저 계산한 다음, 그 결과와 일치하는 case 문으로 이동한다. 이동한 case 문 아래에 있는 문장들을 수행하며,
break 문을 만나면 전체 switch 문을 빠져나가게 된다.
[1] 조건식을 계산한다.
[2] 조건식의 결과와 일치하는 case 문으로 이동한다.
[3] 이후의 문장들을 수행한다.
[4] break 문이나 switch 문의 끝을 만나면 switch 문 전체를 빠져나간다.
만일 조건식의 결과와 일치하는 case 문이 하나도 없는 경우에는 default 문으로 이동한다. default 문은 if 문의 else 블럭과 같은 역할을 한다고 이해하면 쉽다.
default 문의 위치는 어디라도 상관없으나 보통 마지막에 놓기 때문에 break 문을 쓰지 않아도 된다.
switch 문에서 break 문은 각 case 문의 영역을 구분하는 역할을 하는데, 만일 break 문을 생략하면 case 문 사이의 구분이 없어지므로 다른 break 문을 만나거나
switch 문 블럭 {}의 끝을 만날 때까지 나오는 모든 문장들을 수행한다. 이러한 이유로 각 case 문의 마지막에 break 문을 빼먹는 실수를 하지 않도록 주의해야한다.*/
import java.util.*;
public class FlowEx6 {
    public static void main(String [] args){
        System.out.print("현재 월을 입력하세요.>");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 month 에 저장한다.

        switch(month) {
            case 3:
            case 4:
            case 5:
                System.out.println("현재의 계절은 봄입니다.");
                break;
            case 6: case 7: case 8:
                System.out.println("현재의 계절은 여름입니다.");
                break;
            case 9: case 10: case 11:
                System.out.println("현재의 계절은 가을입니다.");
                break;
            default:
            case 12: case 1: case 2: //case 문은 한줄에 하나씩 쓰거나, 한 줄에 붙여서 쓰던 상관이 없다.
                System.out.println("현재의 계절은 겨울입니다.");
        }

    } //main 의 끝
}
/* switch 문의 조건식은 결과값이 반드시 정수이어야 하며, 이 값과 일치하는 case 문으로 이동하기 때문에 case 문의 값 역시 정수이어야 한다.
그리고 중복되지 않아야 한다. 같은 값의 case 문이 여러 개이면, 어디로 이동해야할 지 알 수 없기 때문이다.
게다가 case 문의 값은 반드시 상수이어야 한다. 변수나 실수, 문자열은 case 문의 값으로 사용할 수 없다.
    #switch 문의 제약조건
    1.switch 문의 조건식 결과는 정수 또는 문자열이어야 한다.
    2.case 문의 값은 정수 상수만 가능하며, 중복되지 않아야 한다.

#예시
public static void main(String args[]) {
    int num, result;
    final int ONE = 1;
switch(result) {
    case '1': //OK. 문자 리터럴 (정수 상수 49와 동일하다.)
    case ONE: //OK. 정수 상수
    case "YES" //OK. 문자열 리터럴.
    case num: //Error. 변수는 불가능하다.
    case 1.0: //Error. 실수도 불가능하다.

문자 '1'은 정수 49와 동등하므로 문제가 없고, ONE 은 정수가 아닌 것처럼 보이지만, 'final' 이 붙은 정수 상수이므로 case 문의 값으로 적합하다.
그러나 변수나 실수 리터럴은 case 문의 값으로 적절하지 않다.
 */