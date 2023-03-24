public class ArrayEx11 {
    public static void main(String [] args) {
        int numArr [] = new int[10];
        int counter [] = new int[10];

        for(int i=0; i < numArr.length; i++) {
            numArr[i] = (int)(Math.random() * 10); // 0~9의 임의의 수를 배열에 저장한다.
            System.out.print(numArr[i]);
        }
        System.out.println();

        for(int i=0; i < numArr.length; i++) {
            counter[numArr[i]]++;
        }
        for(int i=0; i < numArr.length; i++) {
            System.out.println( i + "의 개수 :"+ counter[i]);
        }
    } //end of main
}
/* 길이가 10인 배열을 만들고 0과 9사이의 임의의 값으로 초기화 한다. 그리고 이 배열에 저장된 각 숫자가 몇 번 반복해서 나타나는지를 세어서
배열 counter에 저장한 후 다음, 화면에 출력한다. */

//todo: (결과값이 4446579753인 것을 상정한다.)
//todo: #1 counter[numArr[i]]++;  (i의 값이 0인경우를 가정하면)
//todo: #2 counter[numArr[0]]++;  (numArr[0]의 값은 4이다.)
//todo: #3 counter[4]++;          (counter[4]의 값을 1증가시킨다.)

//배열 counter에서, 배열 numArr에 저장된 값과 일치하는 인덱스의 요소에 저장된 값을 1증가시킨다. 이 과정이 반복되고, 인덱스의 값이 몇번 나왔는지 알 수 있다.