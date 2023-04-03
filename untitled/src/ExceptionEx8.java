class Exception8 {
    public static void main(String [] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);    // 0으로 나눠서 고의로 ArithmeticException을 발생시킨다.
            System.out.println(4);      //실행되지 않는다.
        } catch (ArithmeticException ae) {         // ArithmeticException대신 Exception을 사용하였다.
            ae.printStackTrace();       // 참조변수 ae를 통해, 생성된 ArithmeticException 인스턴스에 접근할 수 있다.
            System.out.println("예외메세지 : " +ae.getMessage());
        }   // try-catch의 끝
        System.out.println(6);
    }   //end of main
}
/* 위 예제의 결과는 예외가 발생해서 비정상적으로 종료되었을 때의 결과와 비슷하지만 예외는 try - catch문에 의해 처리되었으며 프로그램은 정상적으로 종료되었다.
그 대신 ArithmeticException인스턴스의 printStackTrace()를 사용해서, 호출로 예외처리를 하여 예외가 발생해도 비정상적으로 종료하지 않도록 해주는 동시에,
printStackTrace() 또는 getMessage()와 같은 메서드를 통해서 예외의 발생원인을 알 수 있다.
|참고| printStackTrace(PrintStream s) 또는 printStackTrace(PrintWriter s)를 사용하면 발생한 예외에 대한 정보를 파일에 저장할 수도 있다.
 */