public class OperatorEx29 {
    public static void main(String []args){
        byte p = 10;
        byte n = -10;

        System.out.printf(" p =%d \t%s%n", p, toBinaryString(p));
        System.out.printf("~p =%d \t%s%n", ~p, toBinaryString(~p));
        System.out.printf("~p+1=%d \t%s%n", ~p+1, toBinaryString(~p+1));
        System.out.println();
        System.out.printf(" n = %d%n", n);
        System.out.printf("~(n-1)=%d%n", ~(n-1));

    } // main 의 끝
    //10진 정수를 2진수로 변환하는 메서드
    static  String toBinaryString(int x){
        String zero = "00000000000000000000000000000000";
        String tmp = zero + Integer.toBinaryString(x);
        return tmp.substring(tmp.length()-32);
    }
}
/* 결과를 보면, 어떤 양의 정수에 대한 음의 정수를 얻으려면 어떻게 해야 하는지 알 수 있다. 양의 정수 p가 있을 때, p에 대한 음의 정수를 얻으려면
'~p+1'을 계산하면 된다.
 */
