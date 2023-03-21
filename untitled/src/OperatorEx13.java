public class OperatorEx13 {
    public static void main(String [] args){
        char c1 = 'a';

        //char c2 = c1+1; 라인5번은 컴파일 에러가 발생한다.
        char c2 = 'a'+1;

        System.out.println(c2);
    }
}
/* 라인6번을 컴파일 하면 오류가 발생하지 않고 실행도 올바른 결과를 얻는다. 덧셈 연산자와 같은 이항 연산자는 int보다 작은 타입의 피연산자를
int로 자동 형변환 한다고 생각하지만, char c2 = (char)('a'+1)처럼 문제가 없는 것인가? */
/*이유는 'a'+1이 리터럴 간의 연산이기 때문이다 상수 또는 리터럴 간의 연산은 실행과정동안 변하는 값이 아니기 때문에, 컴파일 시에 컴파일러가 계산해서
그 결과로 대체한다. */

//char c2 = 'a'+1;  ==compile==>> char c2 = 'b';
//int sec = 60 * 60 * 24;  ==compile==>> int sec = 86400;

/*그러나 라인5와 같이 수식에 변수가 들어가 있는 경우에는 컴파일러가 미리 계산을 할 수 없기 떄문에 형변환을 해주어야 한다. 그렇지 않으면 컴파일 에러가 발생한다.
char c2 = c1 + 1;     ==casting==>> char c2 = (char)(c1+1);      */