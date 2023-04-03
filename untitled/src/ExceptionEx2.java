class ExceptionEx2 {
    public static void main(String [] args) {
        int number = 100;
        int result = 0;

        for(int i=0; i < 10; i++) {
            result = number / (int)(Math.random() * 10);    // 7번째 라인
            System.out.println(result);
        }
    } // end of main
}
/* 위의 예제는 변수 number에 저장되어 있는 값 100을 0~9사이의 임의의 정수로 나눈 결과를 출력하는 일을 10번 반복한다.
random()을 사용했기 때문에 매번 실행할 때마다 결과가 다르겠지만, 대부분의 경우 10번이 출력되기 이전에 예외가 발생하여 프로그램이 비정상적으로 종료될 것이다.
결과에 나타난 메세지를 보면 예외의 발생원인과 위치를 알 수 있다. 이 메세지를 보면, 0으로 나누려 했기 때문에 'ArithmeticException'이 발생했고,
발생위치는 ExceptionEx2의 클래스의 main메서드(ExceptionEx2.java의 7번째 라인)이라는 것을 알 수 있다.

ArithmeticException은 산술연산과정에서 오류가 있을 때 발생하는 예외이며, 정수는 0으로 나누는 것이 금지되어있기 때문에 발생했다.
하지만, 실수를 0으로 나누는 것은 금지되어있지 않으며 예외가 발생하지 않는다.
이제 어디서 왜 예외가 발생하는지 알았으니, 예외처리구을 추가해서 실행도중 예외가 발생하더라도 프로그램이 실행 도중에 비정상적으로 종료되지 않도록 수정해 보자.
 */