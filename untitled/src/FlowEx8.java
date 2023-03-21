import java.util.Scanner;
public class FlowEx8 {
    public static void main(String [] args){
        System.out.print("당신의 주민번호를 입력하세요. (011231-1111222)");

        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();

        char gender = regNo.charAt(7); //입력받은 번호의 8번째 문자를 gender 에 저장.
        switch(gender){
            case'1': case '3':
                System.out.println("당신은 남자입니다.");
                break;
            case '2': case '4':
                System.out.println("당신은 여자입니다.");
                break;
            default:
                System.out.println("유효하지 않은 주민등록번호입니다.");
        }
    } // 메인의 끝
}
/*주민등록번호를 입력받아서 성별을 확인하여 출력하는 예제이다. 주민등록 번호 뒷 번호의 첫 번째 자리의 값은 성별을 의미하는데,
그 값이 1,3이면 남자, 2,4이면 여자를 의미한다. 입력받은 주민등록번호는 char 배열 regNo에 저장되며, 이 배열에서 성별을 의미하는 값은 8 번째에 저장되어 있다.

# gender = regNo.charAt(7); //입력받은 번호의 8번째 문자를 gender 에 저장

문자열에 저장된 문자는 '문자열.charAt(index)'로 가져올 수 있는데, index 는 연속된 정수값으로 1이 아닌 0부터 시작한다.
그래서 8번째 문자는 regNo.charAt(8)이 아닌 regNo.charAt(7)이다.
 */