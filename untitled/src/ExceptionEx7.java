class Exception7{
        public static void main(String [] args) {
            System.out.println(1);
            System.out.println(2);
            try {
                System.out.println(3);
                System.out.println(0/0);    // 0으로 나눠서 고의로 ArithmeticException을 발생시킨다.
                System.out.println(4);      //실행되지 않는다.
            } catch (ArithmeticException ae) {         // ArithmeticException대신 Exception을 사용하였다.
                if (ae instanceof ArithmeticException)
                    System.out.println("true");
                System.out.println("ArithmeticException");
            } catch (Exception e){          // ArithmeticException을 제외한 모든 예외가 처리된다.
                System.out.println("Exception");
            } // try - catch의 끝
            System.out.println(6);
        }   // end of main
}
/* 위의 예제에서는 두 개의 catch블럭, ArithmeticException클래스 타입의 참조변수를 선언한 것과 Exception클래스 타입의 참조변수를 선언한 것을 사용했다.
try 블럭에서 ArithmeticException이 발생하였으므로 catch블럭을 하나씩 차례로 검사하게 되는데, 첫 번째 검사에서 일치하는 catch블럭을 찾았기 때문에
두 번째 catch블럭은 검사하지 않게 된다. 만일 try블럭 내에서 ArithmeticException이 아닌 다른 종류의 예외가 발생한 경우에는 두 번째 catch블럭인
Exception 클래스 타입의 참조변수를 선언한 곳에서 처리되었을 것이다.

이처럼, try - catch 문의 마지막에 Exception클래스 타입의 참조변수를 선언한 catch블럭을 사용하면, 어떤 종류의 예외가 발생하더라도 이 catch블럭에 의해
처리되도록 할 수 있다.
 */