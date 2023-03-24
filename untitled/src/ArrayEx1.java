/* 배열의 선언 방식은 2가지이다.
#1. 타입 [] 변수이름;     | 선언 예시 int[] score;
                            String[] name;
#2. 타입 변수이름 [];     | 선언 예시 int score[];
                            String name[];
배열을 선언하는 것은 단지 생성된 배열을 다루기 위한 참조변수를 위한 공간이 만들어질 뿐이고,
todo:배열을 생성해야만 비로소 값을 저장할 수 있는 공간이 만들어지는 것이다.
배열을 생성하기 위해서는 연산자 'new'와 함께 배열의 타입과 길이를 지정해주어야 한다. */
public class ArrayEx1 {
    public static void main(String [] args) {
        int[] score = new int[5];
                int k =1;

        score[0] = 50;
        score[1] = 60;
        score[k+1] = 70;    //score[2] = 70
        score[3] = 80;
        score[4] = 90;
        /*배열은 생성과 동시에 자동적으로 자신의 타입에 해당하는 기본값으로 초기화되므로 배열을 사용하기 전에 따로 초기화를 해주지 않아도 되지만,
        원하는 값을 저장하려면 위와 같이 각 요소마다 값을 지정해줘야 한다.
        그러나 for문으로 배열을 초기화하려면, 저장하려는 값에 일정한 규칙이 있어야만 가능하기 때문에 자바에서는 다음과 같이 배열을 간단히 초기화 할 수 있다.
        int[] score = new int[]{ 50, 60, 70 ,80 ,90}; : 배열의 생성과 초기화를 동시에 한다.
        */

        int tmp = score[k+2] +score[4];     //int tmp = score[3] + score[4]

        //for 문으로 배열의 모든 요소를 출력한다.
        for(int i=0; i < 5; i++) {
            System.out.printf("score[%d]:%d%n",i, score[i]);
        }

        System.out.printf("tmp:%d%n", tmp);
        System.out.printf("score[%d]:%d%n",7,score[7]);     //index의 값을 벗어난 값이다.
    } // end of main
}

/* 유효한 범위를 벗어난 값을 index로 사용하는 것은 배열을 다룰 때 하는 가장 흔한 실수이다. 그러나 컴파일러는 이러한 실수를 걸러주지 못한다.
왜냐하면 배열의 index로 변수를 많이 사용하는데, 변수의 값은 실행 시에 대입되므로 컴파일러는 이 값의 범위를 확인할 수 없다.
그래서 유효한 범위의 값을 index로 사용하는 것은 전적으로 프로그래머의 책임이며, 유효하지 않은 값을 index로 사용하면, 무사히 컴파일을 마쳤더라도 실행시에
에가 (ArrayIndexOutOfBoundsException)가 발생한다.  */

//score의 길이가 5이므로 index의 범위가 0~4이지만, 일부러 이 범위에 속핮지 않은 7을 배열의 index로 해서 값을 출력해보았다.