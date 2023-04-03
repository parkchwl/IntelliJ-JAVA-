class ExceptionEx14 {
    public static void main(String [] args) {
        try {
                method1();
        } catch (Exception e)       {
            System.out.println("main메서드에서 예외가 처리되었습니다.");
            e.printStackTrace();
        }
    } // end of main

    static void method1() throws Exception {
        throw new Exception();
    }   // end of method1
} // end of class

/* Ex13과 Ex14 모두 main 메서드가 method1()을 호출하며, method1()에서 예외가 발생한다. 차이점은 예외처리 방법에 있다.
Ex13은 method1()에서 예외처리를 했고, Ex14는 method1()에서 예외를 선언하여 자신을 호출하는 메서드(main메서드)에 예외를 전달했으며,
호출한 메서드(main)에서는 try - catch문으로 예외처리를 했다.
Ex13처럼 예외가 발생한 메서드(method1) 내에서 처리되어지면, 호출한 메서드(main메서드)에서는 예외가 발생했다는 사실조차 모르게 된다.

Ex14처럼 예외가 발생한 메서드에서 예외를 처리하지 않고 호출한 메서드로 넘겨주면,
호출한 메서드에서는 method1()을 호출한 라인에서 예외가 발생한 것으로 간주되어 이에 대한 처리를 하게 된다.

이처럼 예외가 발생한 메서드 'method1()'에서 예외를 처리할 수도 있고, 예외가 발생한 메서드를 호출한 'main메서드'에서 처리할 수도 있다.
또는 두 메서드가 예외처리를 분담할 수도 있다.

 */