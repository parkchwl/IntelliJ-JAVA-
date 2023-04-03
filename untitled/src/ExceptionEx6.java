/* # 예외의 발생과 catch 블럭
catch블럭은 괄호()와 블럭{} 두 부분으로 나눠져 있는데, 괄호 ()내에는 처리하고자 하는 예외와 같은 타입의 참조변수 하나를 선언해야 한다.
예외가 발생하면, 발생한 예외에 해당하는 클래스의 인스턴스가 만들어 진다. ExceptionEx5에서는 ArithmeticException이 발생햇으므로
ArithmeticException 인스턴스가 생성된다. 예외가 발생한 문장이 try블럭에 포함되어 있다면, 이 예외를 처리할 수 있는 catch블럭이 있는지 찾게된다.

첫 번째 catch블럭부터 차례로 내려가면서 catch블럭의 괄호()내에 선언된 참조변수의 종류와 생성된 예외클래스의 인스턴스에 instanceof 연산자를 이용해서
검사하게 되는데, 검사결과가 true인 catch블럭을 만날 때까지 검사는 계속된다.
검사결과가 true인 catch블럭을 찾게 되면 블럭에 있는 문장들을 모두 수행한 후에 try-catch문을 빠져나가고 예외는 처리되지만,
검사결과가 true인 catch블럭이 하나도 없으면 예외는 처리되지 않는다.

모든 예외클래스는 Exception클래스의 자손이므로,
catch블럭의 괄호{}에 Exception클래스 타입의 참조변수를 선언해 놓으면 어떤 종류의 예외가 발생하더라도 이 catch블럭에 의해서 처리된다.
 */
class ExceptionEx6 {
    public static void main(String [] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);    // 0으로 나눠서 고의로 ArithmeticException을 발생시킨다.
            System.out.println(4);
        } catch (Exception e) {         // ArithmeticException대신 Exception을 사용하였다.
            System.out.println(5);
        }   // try - catch의 끝
        System.out.println(6);
    }   // end of main
}
/* 이 예제는 ExceptionEx5를 변경한 것인데, 결과는 같다.
catch블럭의 괄호()에 ArithmeticException 타입의 참조변수 대신에 Exception클래스의 참조변수를 선언하였다.
ArithmeticException 클래스는 Exception 클래스의 자손이므로 ArithmeticException인스턴스와 Exception클래스와의 instance연산결과가 true가 되어
Exception 클래스 타입의 참조변수를 선언한 catch블럭의 문장들이 수행되고 예외는 처리되는 것이다.                                            */