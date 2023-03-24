public class ArrayEx7 {
    public static void main(String [] args) {
        int[] numArr = new int[10]; // 배열 numArr의 길이는 10이다.
        for (int i=0; i < numArr.length; i++) {
            numArr[i] = i; // 배열을 0~9로 초기화한다.
            System.out.print(numArr[i]);
        }
        System.out.println();

        for (int i=0; i < 100; i++) {
            int n = (int)(Math.random() * 10); // 0~9중의 한 값을 임의로 얻는다.
            int tmp = numArr[0];    // numArr[0]과          todo: numArr[0]의 값을 변수 tmp에 저장한다.
            numArr[0] = numArr[n];  // numArr[n]의           todo: numArr[3]의 값을 numArr[0]에 저장한다.
            numArr[n] = tmp;        // 값을 서로 바꾼다.          todo: tmp의 값을 numArr[3]에 저장한다.
        }
        for (int i=0; i < numArr.length; i++)
            System.out.print(numArr[i]);
    } //end of main
}
// Math.random() 때문에 실행할 때 마다 결과가 다를 수 있다.