import java.util.*;
public class MultiArrEx1 {
    public static void main(String [] args) {
        final int SIZE = 10;
        int x = 0, y =0;

        char board [][] = new char[SIZE][SIZE];
        byte shipBoard [][] = {
                // 1    2   3   4   5   6   7   8   9
                { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 1
                { 1, 1, 1, 1, 0, 0, 1, 0, 0 }, // 2
                { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 3
                { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 4
                { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 5
                { 1, 1, 0, 1, 0, 0, 0, 0, 0 }, // 6
                { 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 7
                { 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 8
                { 0, 0, 0, 0, 0, 1, 1, 1, 0 }, // 9
        };
                //1행에 행번호를, 1열에 열번호를 저장한다.
                for(int i=1;i<SIZE;i++)
                    board[0][i] = board[i][0] = (char)(i+'0'); // 숫자를 문자로 변환하여 저장해야 하기 때문에 0을 더해준 모습이다.

                Scanner scanner = new Scanner(System.in);

                while(true) {
                    System.out.printf("좌표를 입력하세요.(종료는 00>");
                    String input = scanner.nextLine();  //화면 입력받은 내용을 input에 저장한다.

                    if(input.length()==2) {    // 두 글자를 입력한 경우
                        x = input.charAt(0) - '0';  //문자를 숫자로 변환한다.
                        y = input.charAt(1) - '0';

                        if(x==0 && y==0)    //x와 y가 모두 0인 경우 종료한다.
                            break;
                }
                    if(input.length()!=2 || x<=0 || x>=SIZE || y<=0 || y>=SIZE) {
                        System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                        continue;
                    }

                    //shipBoard[x-1][y-1]의 값이 1이면, '0'을 board[x][y]에 저장한다.
                    board[x][y] = shipBoard[x-1][y-1]==1 ? 'O' : 'X';

                    //배열 board의 내용을 화면에 출력한다.
                    for(int i=0;i<SIZE;i++)
                        System.out.println(board[i]);   // board[i]는 1차원배열이다.
                    System.out.println();
        }
    } // end of main
} //결과 값에 0은 바다이고 1은 배가 있는 것이다.
/* Java에서는 2차원 이상의 배열을 '배열의 배열'의 형태로 처리한다는 사실을 이용하면 보다 자유로운 형태의 배열을 구성할 수 있다.
2차원 이상의 다차원 배열을 생성할때 전체 배열 차수 중 마지막 차수의 길이를 지정하지 않고, 추후에 각기 다른 길이의 배열을 생성함으로써 고정된 형태가 아닌
보다 유동적인 가변 배열을 구성할 수 있다.
만일 다음과 같이 '5 x 3'길이의 2차원 배열 score를 생성하는 코드가 있을 때.
to_ int score [][] = new int[5][3]; : 5행 3열의 2차원 배열을 생성하는 코드이다.
위 코드를 다음과 같이 표현할 수 있다.
#1 to_ int socre [][] = new int 5[][];     :2번째 차원의 길이는 지정하지 않는다.
score[0] = new int[3];
score[1] = new int[3];
score[2] = new int[3];
score[3] = new int[3];
score[4] = new int[3];              to_ 이와 같은 코드로 2차원 배열을 생성하면 직사각형 테이블 형태의 '5 x 3'의 고정적인 배열을 생성할 수 있지만
                                    to_ 아래와 같은 코드로 2차원 배열을 생성하면 다음과 같이 각 행마다 다른 길이의 배열을 생성하는 것이 가능하다.
#2 to_ int socre [][] = new int 5[][];     :2번째 차원의 길이는 지정하지 않는다.
score[0] = new int[4];
score[1] = new int[3];
score[2] = new int[2];
score[3] = new int[2];
score[4] = new int[3];              to_ 가변배열의 예시이다.
                                    to_ 가변배열 역시 중괄호{}를 이용해서 다음과 같이 생성과 초기화를 하는 것이 가능하다.


#2-1 to_ int score [][] = {
                    {100, 100, 100, 100}
                    , {20, 20, 20}
                    , {30, 30}
                    , {40, 40}
                    , {50, 50, 50}
                };
 */
