class Exception11 {
    public static void main(String [] args)
    {
        throw new RuntimeException(); // RuntimeException을 고의로 발생시킨다.
    }
}
/* 이 예제는 예외처리를 하지 않았음에도 불구하고 이전의 Exception10과 달리 성공적으로 컴파일될 것이다.
그러나 실행하면, 위의 실행결과처럼 RuntimeException이 발생하여 비정상적으로 종료될 것이다.
이 예제가 명백히 RuntimeException을 발생시키는 코드를 가지고 있고, 이에 대한 예외처리를 하지 않았음에도 불구하고 성공적으로 컴파일 되었다.
이 장의 앞부분에서 설명한 것과 같이 'RuntimeException클래스와 그 자손(RuntimeException클래스들)'에 해당하는 예외는 프로그래머에 의해 실수로 발생하는
것들이기 때문에 예외처리를 강제하지 않는 것이다. 만일 RuntimeException클래스들에 속하는 예외가 발생할 가능성이 있는 코드에도 예외처리를 필수로 해야 한다면,
아래와 같이 참조 변수와 배열이 사용되는 모든 곳에 예외처리를 해주어야 할 것이다.
    try {
            int arr [] = new int[10];
            System.out.println(arr[0]);
        } catch(ArrayIndexOutOfBoundsException ae) {
                ...
        } catch(NullPointerException ne) {
                ...
        }
컴파일러가 예외처리를 확인하지 않는 RuntimeException 클래스들은 'unchecked 예외'라고 부르고,
예외처리를 확인하는 Exception클래스들은 'checked예외'라고 부른다.
 */