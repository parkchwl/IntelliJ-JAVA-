public class OperatorEx17 {
    public static void main(String [] args) {
        double pi = 3.141592;
        double shortPi = (int)(pi * 1000 + 0.5) / 1000.0;
        System.out.println(shortPi);
    }
}
//반올림을 위해 0.5를 더해주었다. round 를 쓰지 않고, 그냥 더하기만 한 것.
//제일 먼저 실행되는 것은 pi * 1000이 수식에서 제일 먼저 수행되고, pi가 double 이고 1000이 정수형이니까 연산의 결과는 double인 3141.592가 된다.
//그 후 0.5를 더해 3142.092가 된다.
//형변환 연산자(int)에 의해 3142가 된다.
//3142 / 1000.0 의 수식은 int 와 double의 연산이므로, int가 double로 변환된 다음, double과 double과 double의 연산이 수행된다.
//3142.0 / 1000.0 ===> 3.142
//double과 double의 나눗셈이므로 결과는 double인 3.142가 된다. #만일 1000.0이 아닌 1000으로 나누었다면 결과 값은 3을 얻는다.