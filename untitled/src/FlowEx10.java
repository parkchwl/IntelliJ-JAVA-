import java.util.*;
public class FlowEx10 {
    public static void main(String [] args) {
        int score = 0;
        char grade = ' ';

        System.out.print("당신의 점수를 입력하세요.(1~100)>");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();    //화면을 통해 입력받은 내용을 tmp 에 저장한다.
        score = Integer.parseInt(tmp);      //입력받은 문자열(tmp)를 숫자로 변환한다.

        switch(score/10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            default:
                grade = 'F';
        } //end of switch

        System.out.println("당신의 학점은 "+ grade +"입니다.");
    }//end of main
}

/* 전에 서술한 것과 같이 'int / int' 의 결과는 int 이기 때문에 88/10은 8.8이 아니라 8의 결과를 얻는다.
따라서 80과 89사이의 숫자들은 10으로 나누면 결과가 8이 된다.
마찬가지로 70과 79사이의 숫자들은 10으로 나누면 7이 된다.
이처럼 switch 문에서는 조건식을 잘 만들어서 case 문의 갯수를 줄이는 것이 매우 중요하다.
 */