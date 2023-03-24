public class ArrayEx8 {
    public static void main(String [] args) {
        int ball [] = new int [45];     //45개의 정수값을 저장하기 위한 배열을 생성한다.

        for(int i=0; i < ball.length; i++)  // 배열의 각 요소에 1~45의 값을 저장한다.
            ball[i] = i+1;                  //ball[0]에 1이 저장된다.

        int temp = 0;                       //두 값을 바꾸는데 사용할 임시변수이다.
        int j = 0;                          //임의의 값을 얻어서 저장할 변수이다.

        //배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
        //0번쨰 부터 5번째 요소까지 모두 6개만 바꾼다.
        for(int i=0; i < 6; i++) {
            j = (int)(Math.random() * 45);  //0~44범위의 임의의 값을 얻는다.
            temp    = ball[i];
            ball[i] = ball[j];
            ball[j] = temp;     //ball[i]와 ball[j]의 값을 서로 바꾼다.
        }
        // 배열 ball의 앞에서 부터 6개의 요소를 출력한다.
        for(int i=0; i < 6; i++)
            System.out.printf("ball[%d]=%d%n", i, ball[i]);

    }
}
/* 로또번호를 생성하는 예제이다. 길이가 45인 배열에 1부터 45까지의 값을 담은 다음 반복문을 이용해서 배열의 인덱스가 i인 값(ball[i])과
random()에 의해서 결정된 임의의 위치에 있는 값과 자리를 바꾸는 것을 6번 반복한다. 이것은 마치 1부터 45까지의 번호가 쓰인 카드를 잘 섞은 다음에
맨 위의 6장을 꺼내는 것과 같다고 할 수 있다. 45개의 요소 중에서 앞에 6개의 요소만 임의의 위치에 있는 요소와 자리를 바꾸면 된다.
 */