public class OperatorEx7 {
    public static void main (String []args) {
        byte a = 10;
        byte b = 30;
        byte c = (byte) (a * b);
        System.out.println(c);
    }
}
/* 이 예제는 10 * 30 = 300이지만, 형변환(캐스팅)을 했을 경우 300은 byte의 범위를 넘어 섰기 때문에 byte형으로 변환하면
데이터의 손실이 발생하여 결국 44가 byte형 변수 c에 저장됨을 확인할 수 있다.
 */