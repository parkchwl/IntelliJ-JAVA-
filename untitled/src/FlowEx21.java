public class FlowEx21 {
    public static void main(String [] args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++) {
                if(i==j) {
                    System.out.printf("[%d,%d]", i, j);
                } else {
                    System.out.printf("%5c",' ');
                }
            }
            System.out.println();
        }
    } //end of main
}
// FlowEx20 파일에서 2중 for문에 if 문을 넣어 조건식 'i==j'를 만족하는 경우에만 i와 j의 값을 출력하고 나머지는 공백을 출력하였다.