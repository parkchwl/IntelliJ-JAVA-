/*블럭{}
괄호{}를 이용해서 여러 문장을 하나의 단위로 묶을 수 있는데, 이것을 '블럭(block)'이라고 한다. 블럭은 '{'으로 시작해서, '}'로 끝나는데,
'}'다음에 문장의 끝을 의미하는 ';'(세미콜론)을 붙이지 않는 것에 주의한다.
블럭 내의 문장들은 탭(tab)으로 들여쓰기(indentation) 해서 블럭 안에 속한 문장이라는 것을 알기 쉽게 해주는 것이 좋다. 탭(tab)은 키보드의 맨 왼쪽에 있다.
 */
import java.util.*; //Scanner 클래스를 사용하기 위해 추가
public class FlowEx2 {
    public static void main(String [] args){
        int input;

        System.out.print("숫자를 하나 입력하세요.>");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine(); //화면을 통해 입력받은 내용을 tmp 에 저장
        input = Integer.parseInt(tmp);   //입력받은 문자열(tmp)을 숫자로 변환
        if(input==0) {
            System.out.println("입력하신 숫자는 0입니다.");
        }
        if(input!=0){
            System.out.println("입력하신 숫자는 0이 아닙니다.");
            System.out.printf("입력하신 숫자는 %d입니다.", input);
        }
    } //main의 끝
}
