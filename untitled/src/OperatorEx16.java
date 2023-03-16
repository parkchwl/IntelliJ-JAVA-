public class OperatorEx16 {
    public static void main(String []args){
        float pi = 3.141592f;
        float shortPi = (int)(pi * 1000) / 1000f;
        System.out.println(shortPi);
    }
}
/*나눗셈 연산자의 성질을 이용하여 pi 값의 소수점 셋째자리까지 빼내는 방법을 보여준다.
#1 (int)(pi * 1000) / 1000f;
제일 먼저 수행되는 것은 괄호 안의 'pi * 1000'이다. pi가 float 이고, 1000이 정수형이니까 연산의 결과는 float 인 3141.592f가 된다.
#2 (int)(3141.592f) / 1000f;
그 다음으로는 단항 연산자인 형변환 연산자의 형변환이 수행된다. 3141.592f를 int 로 변환하면 3141의 값을 얻는다. 소수점 이하는 버려진다.
#3 3141 / 1000f;
int 와 float 의 연산이므로, int 가 float 로 변환된 다음, float 와 float 의 연산이 수행된다.
#4 3141.0f / 1000f ===> 3.141f
float 와 float 의 나눗셈이므로 결과는 float 인 3.141f가 된다.

 */