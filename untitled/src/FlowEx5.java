/*i if 문의 블럭 내에 또 다른 if 문을 포함시키는 것이 가능한데 이것을 중첩 if 문이라고 부르며 중첩에 횟수에는 거의 제한이 없다.
if (조건식1){
            조건식1의 연산 결과가 true 일 때 수행될 문장들을 적는다.
    if (조건식2) {
            //조건식 1과 조건식 2가 모두 true 일 때 수행될 문장들
    } else {
            //조건식 1이 true 이고, 조건식 2가 false 일ㄷ 때 수행되는 문장들
    }
} else {
        //조건식 1이 false 일 때 수행되는 문장들
}
위와 같이 내부의 If 문은 외부의 if 문 보다 안쪽으로 들여쓰기를 해서 두 if 문의 범위가 명확히 구분될 수 있도록 작성해야 한다.
중첩 if 문에서는 괄호{}의 생략에 더욱 조심해야 한다.
바깥쪽의 if 문과 안쪽의 if 문이 서로 엉켜서 if 문과 else 블럭의 관계가 의도한 바와 다르게 형성될 수도 있기 때문이다.
 */
import java.util.*;
public class FlowEx5 {
    public static void main(String args[]) {
        int score = 0;
        char grade = ' ', opt = '0';

        System.out.print("점수를 입력해주세요.>");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt(); // 화면을 통해 입력받은 점수를 score 에 저장

        System.out.printf("당신의 점수는 %d입니다.%n", score);

        if (score >= 90) {      //score 가 90점 보다 같거나 크면 A 학점(grade)
            grade = 'A';
            if (score >= 98) {      //90점 이상 중에서도 98점 이상은 A+
                opt = '+';
            } else if (score < 94) { //90점 이상 94점 미만은 A-
                opt = '-';
            }
        } else if (score >= 80) {       //score 가 80점 보다 같거나 크면 B학점 (grade)
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }
        } else {     //나머지는 C학점 (grade)
            grade = 'C';
        }

System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
}
}
/*위 예제는 모두 3개의 if 문으로 이루어져 있으며 if 문 안에 또 다른 2개의 if 문을 포함하고 있는 모습을 하고 있다.
제일 바깥쪽에 있는 if 문에서 점수에 따라 학점(grade)을 결정하고, 내부의 if 문에서는 학점을 더 세부적으로 나누어서 평가를 하고 그 결과를 출력한다.
외부 if 문의 조건식에 의해 한번 걸러졌기 때문에 내부 if 문의 조건식은 더 간단해 질 수 있다.
원래는 아래의 #1과 같이 써야하는데, '90 <=score' 라는 조건이 이미 외부 if 문의 조건식과 동일하므로 #2의 조건식처럼 간단히 쓸 수 있는 것이다.
 */
/*
#1 if (score >= 90){
    grade = 'A';
    if (score >=98) {
        opt = '+';
        } else if (90<= score && score < 94) {
        opt = '-';
    }
#2 if (score >=90 ) {
    grade = 'A';
    if (score >=98) {
        opt = '+';
    } else if (score < 94) {
        opt = '-';
    }
 */
/* #4의 if-else if 문은 else 블럭이 생략되었는데, 만일 생략되지 않았다면 #3과 같은 코드가 될 것이다.
변수 opt 를 선언할 때 이미 '0'으로 초기화했기 때문에 굳이 else 블럭을 쓸 필요가 없는 것이다.

#3 char opt = '0';                 #4 char opt = '0';
if (score >= 98) {                  if (score >= 98) {
    opt = '+';                          opt = '+';
} else if (score < 94) {            } else if (score < 94) {
    opt = '-';                          opt = '-';
} else { //94 ≤ score < 98          }
    opt = '0';
}


 */