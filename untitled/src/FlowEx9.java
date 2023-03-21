import java.util.*;
public class FlowEx9 {
    public static void main(String [] args){
        char grade = ' ';
        System.out.print("당신의 점수를 입력하세요.(1~100)>");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt(); //화면을 통해 입력받은 숫자를 score 에 저장

        switch(score) {
            case 100: case 99: case 98: case 97: case 96:
            case 95:  case 94: case 93: case 92: case 91: case 90:
                grade = 'A';
                break;
            case 89: case 88: case 87: case 86: case 85:
            case 84: case 83: case 82: case 81: case 80:
                grade = 'B';
                break;
            case 79: case 78: case 77: case 76: case 75:
            case 74: case 73: case 72: case 71: case 70:
                grade = 'C';
                break;
            default :
                grade = 'F';
        } // end of switch
        System.out.println("당신의 학점은"+ grade +"입니다.");
    }
}
/* FlowEx4의 if 문을 switch 문을 이용해서 변경한 것이다.
이 예제를 if 문을 이용해서 구현하려면, 조건식이 4개가 필요하며, 최대 4번의 조건식을 계산해야한다.
반면에 switch 문은 조건식을 1번만 계산하면 되므로 더 빠르다. # 그러나 case 문이 너무 많아져서 좋지 않은 코드가 되었다.
반드시 속도를 더 향상시켜야 한다면 복잡하더라도 switch 문을 선택해야겠지만, 그렇지 않다면 이 경우 if 문이 더 적합하다.
 */