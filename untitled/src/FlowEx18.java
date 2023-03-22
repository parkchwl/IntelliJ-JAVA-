public class FlowEx18 {
    public static void main(String [] args) {
        for(int i=2;i<=9;i++){
            for(int j=1;j<=9;j++){
                System.out.printf("%d x %d = %d%n",i,j,i*j);
            }
        }
    } // end of main
}

//결과 값을 본다면 바깥쪽 for 문이 한번 반복될 때마다, 안쪽 for 문의 모든 반복이 끝나고 나서야 바깥쪽 for 문의 다음 반복으로 넘어간다.

/* 안쪽 for 문의 내부에 문장이 하나뿐 이므로 다음과 같이 괄호를 생략할 수 있다.
for(int i=2;i<=9;i++) {
    for(int j=1;j<=9;j++)       //15번 줄의 (안쪽 for 문) for 내부의 문장이 하나뿐 이므로 괄호가 생략된 모습.
            System.out.printf("%d x %d = %d%n",i,j,i*j);
되도록이면 괄호{}를 사용하는 것이 좋지만, 너무 많아도 코드가 복잡해지기 때문에 경우에 따라서는 이처럼 간략하게 하는 것도 좋다.  */