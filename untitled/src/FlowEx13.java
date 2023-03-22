public class FlowEx13 {
    public static void main(String [] args){
        int sum = 0; //합계를 저장하기 위한 변수이다.

        for(int i=1; i <= 10; i++) {
            sum += i ; // sum = sum + i;
            System.out.printf("1부터 %2d 까지의 합: %2d%n", i, sum);
        }
    } //end of main
}

/*
i | sum=sum+i
1 | 1 = 0 + 1
2 | 3 = 1 + 2
3 | 6 = 3 + 3
4 | 10 = 6 + 4
5 | 15 = 10 + 5
6 | 21 = 15 + 6
7 | 28 = 21 + 7
8 | 36 = 28 + 6
9 | 45 = 36 + 9
10| 55 = 45 +10

 */