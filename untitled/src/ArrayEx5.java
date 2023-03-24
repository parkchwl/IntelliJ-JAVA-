public class ArrayEx5 {
    public static void main(String [] args) {
        int sum = 0;        //총점을 저장하기 위한 sum 변수 선언.
        float average = 0f; //평균을 저장하기 위한 average 변수 선언.

        int score [] = {100, 88, 100, 100, 90};

        for(int i=0; i < score.length;i++) {
            sum += score[i];
        }
        average = sum / (float)score.length;    //계산결과를 float로 얻기 위해서 형변환했다.

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + average);
    }
}
/* for문을 이용해서 배열에 저장된 값을 모두 더한 결과를 배열의 개수로 나누어서 평균을 구하는 예제이다.
평균을 구하기 위해 전체 합을 배열의 길이인 score.length로 나누었다. */