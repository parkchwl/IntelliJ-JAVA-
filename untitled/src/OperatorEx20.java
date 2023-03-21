public class OperatorEx20 {
    public static void main(String [] args){
        System.out.println(-10%8);
        System.out.println(10%8);
        System.out.println(-10%-8);
    }
}
//나머지 연산자 (%)는 나누는 수로 음수도 허용한다. 그러나 부호는 무시되므로 결과는 음수의 절대값으로 나눈 나머지와 결과가 같다.
//쉽게 말하자면 절대값으로 나누고, 나머지는 그대로 적용한다고 생각하자.