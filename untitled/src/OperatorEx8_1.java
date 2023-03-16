public class OperatorEx8_1 {
    public static void main(String []args){
        int a = 1_000_000;
        int b = 2_000_000;
        long c = (long)a * b;
        System.out.println(c);
        //OperatorEx8파일과 달리 long c 의 피연산자 a앞에 (long)을 추가하여 형변환을 진행하였다.
        //결과값으로 2000000000000이 도출됨을 확일할 수 있음.
    }
}
