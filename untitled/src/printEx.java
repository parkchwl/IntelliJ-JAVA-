public class printEx {
    public static void main(String []args){
            System.out.print("자바의 출력문을 ");
            System.out.print("예시를 통해서 확인해보자" );
            System.out.println("자바의 출력문을");
            System.out.println("예시를 통해 확인해보자");

            //printf 문은 줄바꿈을 하지 않지만, %n을 사용하면 줄을 바꿀 수 있다.
            System.out.printf("줄을 바꾸자.%n");
            System.out.printf("이처럼 줄이 추가된다.%n");
        int year = 10;
        String area = "세종";

        System.out.printf("나는 앞으로 %d년 동안 공부를 열심히 할 것이다.%n", year);
        System.out.printf("나는 고려대학교 %s캠퍼스에서 공부중이다.%n", area);
    }
}
