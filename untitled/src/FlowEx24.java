public class FlowEx24 {
    public static void main(String [] args) {
        int i=11;
        System.out.println("카운트 다운을 시작합니다.");

        while(i--!=0){
            System.out.println(i);

            for(int j=0;j<2_000_000_000;j++) {
                ;   //아무런 내용도 없는 빈 문장
            }
        }
            System.out.println("GAME OVER");
    }
}
/* 10부터 0까지 1씩 감소시키면서 출력을 하되, for문으로 매 출력마다 약간의 시간이 지연되도록 했다.
for문의 블럭{}내에는 아무 일도 하지 않는 빈 문장 ';'하나만 있을 뿐 그외에는 아무것도 없다.
그저 조건식과 증감식을 2,000,000,000번 반복하면서 시간을 보낼 뿐이다.

 */