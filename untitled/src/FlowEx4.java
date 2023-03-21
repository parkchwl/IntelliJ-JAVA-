/* if - else 문은 두 가지 경우 중 하나가 수행되는 구조인데, 처리해야할 경우의 수가 셋 이상인 경우에는 어떻게 해야 할까?
그럴 때는 한 문장에 여러 개의 조건식을 쓸 수 있는 'if-else if' 문을 사용하면 된다.
        if (조건식1) {
        //조건식 1의 연산결과가 참일 때 수행될 문장
        } else if (조건식2) {
        //조건식 2의 연산결과가 참일 때 수행될 문장
        } else if (조건식3) {      //여러 개의 else if 를 사용할 수 있다.
        //조건식 3의 연산결과가 참일 때 수행될 문장
        }else { // 마지막에는 보통 else 블럭으로 끝나며, else 블럭은 생략 가능하다.
        //위의 어느 조건식도 만족하지 않을 때 수행될 문자들을 적는다.
        }
# 첫 번째 조건식부터 순서대로 평가해서 결과가 참인 조건식을 만나면, 해당 블럭{}만 수행하고 'if-else if' 문 전체를 벗어난다.
만일 결과가 참인 조건식이 하나도 없으면, 마지막에 있는 else 블럭의 문장들이 수행된다. 그리고 else 블럭은 생략이 가능하다.
else 블럭이 생략되었을 때는 if-else if 문의 어떤 블럭도 수행되지 않을 수 있다
예를 들어 다음과 같은 if-else if 문이 있을 때, 변수 score 의 값이 85라면, 다음의 과정으로 처리된다.
*/
/* if(score >=90)
{
    grade = 'A'; // 거짓이므로 두 번째 조건식으로 넘어간다.
} else if(score >=80)
{
    grade = 'B'; // 참 이므로 if else 문을 빠져나온다.
} else if(score >=70)
{
    grade = 'c';
} else {
    grade = 'D';
}
#1 결과가 참인 조건식을 만날 때까지 첫 번째 조건식부터 순서대로 평가한다. (첫 번째 조건식은 거짓이므로, 두 번째 조건식으로 넘어간다.)
#2 참인 조건식을 만나면, 해당 블럭{}의 문장들을 수행한다.
#3 if else 문 전체를 빠져나온다.
 */

import java.util.*;
public class FlowEx4 {
    public static void main(String [] args){
        int score = 0; //점수를 저장하기 위한 변수
        char grade = ' '; //학점은 저장하기 위한 변수. 공백으로 초기화한다.

        System.out.print("점수를 입력하세요.>");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt(); //화면을 통해 입력받은 숫자를 score 에 저장한다.

        if (score >=90) {
            grade = 'A';
        } else if (score >=80)
        {
            grade = 'B';
        } else if (score >=70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("당신의 학점은 "+grade +"입니다.");
        }


    }
/* 점수를 입력하면, 그에 해당하는 학점을 출력하는 간단한 예제이다. 여기서 한가지 눈여겨봐야할 것은 두 번째와 세 번째 조건식이다.
if (score >=90) {
    grade = 'A';
} else if (80 <= score && score < 90) { // 80 ≤ score < 90
    grade = 'B';
} else if ( 70 <= score && score < 80) { // 70 ≤ score < 80
    grade = 'C';
} else { // score < 70
    grade = 'D';
}

#점수가 90점 미만이고, 80점 이상인 사람에게 'B' 학점을 주는 조건이라면,
위의 코드에서처럼 조건식이 '80 <= score && score < 90'이 되어야 하는 것이 아닐까?
그럼에도 불구하고, 두 번째 조건식을 'score >=80'이라고 쓸 수 있는 것은 첫 번째 조건식인 'score >=90'이 거짓이기 때문이다.
'score >=90'이 거짓이라는 것은 'score < 90'이 참이라는 뜻이므로 두 번째 조건식에서 'score < 90'이라는 조건을 중복해서 확인할 필요가 없다.
세 번째 조건식도 같은 이유로, '70 <= score&&score <80'이 아닌 'score >= 70'과같이 간단히 쓸 수 있다.
 */