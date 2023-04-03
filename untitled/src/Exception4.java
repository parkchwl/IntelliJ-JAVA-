/* try - catch문에서, 예외가 발생한 경우와 발생하지 않았을 때의 흐름(문장의 실행순서)이 달라지는데, 아래에 이 두 가지 경우에 따른 실행순서를 정리하였다.
#try블럭 내에서 예외가 발생한 경우,
1.발생한 예외와 일치하는 catch블럭이 있는지 확인한다.
2.일치하는 catch블럭을 찾게 되면, 그 catch블럭 내의 문장들을 수행하고 전체 try - catch문을 빠져나가서 그 다음 문장을 계속해서 수행한다.
만일 일치하는 catch블럭을 찾지 못하면, 예외는 처리되지 못한다.

#try블럭 내에서 예외가 발생하지 않은 경우
1.catch블럭을 거치지 않고 전체 try-catch문을 빠져나가서 수행을 계속한다.                                                */
class ExceptionEx4 {
    public static void main(String [] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(4);
        } catch (Exception e)       {
            System.out.println(5);      // 실행되지 않는다.
        }   //try - catch의 끝
        System.out.println(6);
    } // end of main
}

//위의 예제에서는 예외가 발생하지 않았으므로 catch블럭의 문장이 실행되지 않았다. 다음의 예제는 위의 예제를 변경해서, try블럭에서 예외가 발생하도록 하였다.
