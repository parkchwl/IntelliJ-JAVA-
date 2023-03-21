//Math.round()를 이용하여 간단하게 반올림해보자.
public class OperatorEx18 {
    public static void main(String [] args){
        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000) / 1000.0;
        System.out.println(shortPi);
    }
}
/* 이 예제의 결과는 Pi의 값을 소수점 넷째 자리인 5에서 반올림을 해서 3.142가 출력 되었다.
round 메서드는 매개변수로 받은 값을 소수점 첫째자리에서 반올림을 하고 그 결과를 정수로 돌려주는 메서드이다.
Math.round(3141.592) 의 결과는 3142 이다.
 */