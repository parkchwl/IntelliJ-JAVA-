public class FlowEx16_2 {
    public static void main(String [] args) {
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=10;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//2개의 for 문이 중첩되었으며 바깥 쪽 for 문이 5번, 안쪽 for 문이 10번 반복되므로 모두 50번이 반복된다.