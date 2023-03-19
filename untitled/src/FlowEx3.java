/* if 문의 변형인 if-else 문의 구조는 다음과 같다. if 문에 'else 블럭'이 더 추가되었다.
'else' 의 뜻이 '그 밖의 다른'이므로 조건식의 결과가 참이 아닐 때, 즉 거짓일 때 else 블럭의 문장을 수행하라는 뜻이다.
#예제 if (조건식) {
    //조건식이 참(ture)일 때 수행될 문장들을 적는다.
} else {
    //조건식이 거짓(false)일 때 수행될 문장들을 적는다.
} */
import  java.util.*; //Scanner 클래스를 사용하기 위해 추가
public class FlowEx3 {
    public static void main(String args[]){
    System.out.print("숫자를 하나 입력하세요.>");
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt(); //화면을 통해 입력받은 숫자를 input 에 저장
        if (input==0) {
            System.out.println("입력받은 숫자는 0입니다.");
        }else { //input!=0인 경우
            System.out.println("입력하신 숫자는 0이 아닙니다.");
        }
    } //main 의 끝
}
