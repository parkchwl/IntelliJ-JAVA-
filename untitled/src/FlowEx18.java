/*2차원 배열을 선언하는 방법은 1차원 배열과 같다. 다만 괄호 []가 하나 더 들어갈 뿐이다.
todo :        선언방법       |       선언 예시
todo :  타입[][] 변수이름 :   |    int [][] score;
todo :  타입 변수이름 [][]:   |    int score [][];
todo :  타입[]변수이름[]:     |    int[] score[];
2차원 배열은 주로 테이블 형태의 데이터를 담는데 사용되며, 만일 4행 3열의 데이터를 담기 위한 배열을 생성하려면 다음과 같다.,
int score [][] = new int[4][3]; #4행 3열의 2차원 배열을 생성한다.
배열요소타입의 기본값이 자동적으로 저장되며, int는 기본값인 0이 저장된다.
*/
//
public class FlowEx18 {
    public static void main(String[] args) {
        int score[][] = {
                {100, 100, 100}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
        };
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
            }
        }

        for (int[] tmp : score) {
            for (int i : tmp) {
                sum += i;
            }
        }
        System.out.println("sum=" + sum);
    }
}
/* 2차원 배열 score의 모든 요소의 합을 구하고, 출력하는 예제이다. 하나의 이중 for문으로 처리가 가능한 작업이지만,
향상된 for문으로 2차원 배열의 모든 요소를 읽어오는 방법을 볼 수 있기 때문에 출력과 합계를 따로 처리하였다.
to_    for (int i : score) {      //에러. 2차원 배열 score의 각 요소는 1차원 배열이다.
to_            sum += i; }
이렇게 간단히 된다면 좋겠지만, 2차원 배열 score의 각 요소는 1차원 배열이므로 아래와 같이 for문을 하나 더 추가해야 한다.

to_     for (int tmp [] : score) {  //score의 각 요소(1차원 배열 주소)를 tmp에 저장한다.
to_     for (int i : tmp) {     //tmp는 1차원 배열을 가리키는 참조변수이다.
to_             sum += i;       //향상된 for문으로 배열의 각 요소에 저장된 값들을 순차적으로 읽어올 수는 있지만, 배열에 저장된 값을 변경할 수는 없다.
        }
}

 */