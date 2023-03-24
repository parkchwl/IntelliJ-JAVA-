public class ArrayEx6 {
    public static void main(String [] args) {
        int [] score = { 79, 88, 91, 33, 100, 55, 95};

        int max = score[0]; // 배열의 첫 번째 값으로 최대값을 초기화 한다.
        int min = score[0]; // 배열의 첫 번째 값으로 최소값을 초기화 한다.

        for(int i=1; i < score.length;i++) { //배열의 두 번째 요소부터 읽기 위해서 변수 i의 값을 1로 초기화했다.
            if(score[i] > max) {
                max = score[i];
            } else if(score[i] < min) {
                min = score[i];
            }
        } //end of for
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    } //end of main
} // end of class

/* 배열의 첫 번째 요소 'score[0]'의 값으로 최대값을 의미하는 변수 max와 최소값을 의미하는 변수 min을 초기화 하였다.
그 다음 반복문을 통해서 배열의 두 번째 요소'score[1]'부터 max와 비교하기 시작한다.만일 배열에 담긴 값이 max에 저장된 값보다 크다면, 이 값을 max에 저장한다.
이런 식으로 배열의 마지막 요소까지 비교하고 나면 max에는 배열에 담긴 값 중에서 최대값이 저장된다. 최소값 min도 같은 방식으로 얻을 수 있다.     */
