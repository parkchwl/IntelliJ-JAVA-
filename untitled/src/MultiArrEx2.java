import java.util.*;
public class MultiArrEx2 {
    public static void main(String[] args) {
        final int SIZE = 5;
        int x = 0, y = 0, num = 0;

        int bingo[][] = new int[SIZE][SIZE];
        Scanner scanner = new Scanner(System.in);

        // 배열의 모든 요소를 1부터 SIZE*SIZE까지의 숫자로 초기화한다.
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                bingo[i][j] = i * SIZE + j + 1;

        // 배열에 저장된 값을 뒤섞는다.(shuffle)
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                x = (int) (Math.random() * SIZE);
                y = (int) (Math.random() * SIZE);

                //bingo[i][j]와 임의로 선택된 값(bingo[x][y])을 바꾼다.
                int tmp = bingo[i][j];
                bingo[i][j] = bingo[x][y];
                bingo[x][y] = tmp;
            }
        }
        do {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++)
                    System.out.printf("%2d ", bingo[i][j]);
                System.out.println();
            }
            System.out.println();

            System.out.printf("1~%d의 숫자를 입력하세요.(종료:0)>", SIZE * SIZE);
            String tmp = scanner.nextLine(); //화면에서 입력받은 내용을 tmp에 저장한다.
            num = Integer.parseInt(tmp);    //입력받은 문자열(tmp)를 숫자로 변환한다.

            //입력받은 숫자와 같은 숫자가 저장된 요소를 찾아서 0을 저장한다.
            outer:
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (bingo[i][j] == num) {
                        bingo[i][j] = 0;
                        break outer; //2중 반복문을 벗어난다.
                    }
                }
            }
        } while(num!=0);
    } // end of main
}
/* 5 X 5 크기의 빙고판에 1~25의 숫자를 차례로 저장한 다음에, Math.random()을 이용해서 저장된 값의 위치를 섞는다.
그 다음에 사용자로부터 숫자를 입력받아서 일치하는 숫자가 빙고판에 있으면 해당 숫자를 0으로 바꾼다.
 */