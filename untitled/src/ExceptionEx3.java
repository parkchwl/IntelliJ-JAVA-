class ExceptionEx3{
    public static void main(String [] args) {
        int number = 100;
        int result = 0;

        for(int i=0; i < 10; i++) {
            try {
                result = number / (int) (Math.random() * 10);    // 7번째 라인
                System.out.println(result);
            } catch (ArithmeticException e)     {
                System.out.println("0");
            } // try - catch의 끝
        } // for 문의 끝
    } // end of main
}
/* try - catch문을 추가한 것. ArithmeticException이 발생했을 경우에는 0을 화면에 출력하도록 했다.
위의 결과에서 보면, 0이 출력되는 곳은 for문의 반복중에서 ArithmeticException이 발생했다.
그래서 ArithmeticException에 해당하는 catch블럭을 찾아서 그 catch블럭 내의 문장들을 실행한 다음 try - catch문을 벗어나 for 문의 다음 반복을 계속
수행하여 작업을 모두 마치고 정상적으로 종료되었다. 만일 예외처리를 하지 않았다면, 예외가 발생해서 프로그램이 종료되었을 것이다.
 */