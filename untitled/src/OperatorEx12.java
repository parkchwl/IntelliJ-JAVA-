public class OperatorEx12 {
    public static void main(String [] args){
        char c1 = 'a'; //c1에는 문자 'a'의 코드 값인 97이 저장된다.
        char c2 = c1;  //c2에는 c1에 저장되어 있는 값이 저장된다.
        char c3 =' ';  //c3를 공백으로 초기화 한다.
        int i = c1 + 1; // 'a'+1 = 97 + 1 = 98
        /*c1+1을 계산할 때, c1이 char형이므로 int형으로 변환한 후 덧셈연산을 수행하게 된다. c1에 저장되어 있는 코드값이 변환되어 int형 값이 되는 것이다.
        따라서 c1+1은 97+1이고, 결과적으로 int 형 변수 i에는 98이 저장된다.
        */

        c3 = (char)(c1 + 1);
        c2++;
        c2++;
        //c2++는 c2에 저장되어 있는 값을 1 증가시키므로, 예제에서는 원래 저장되어 있던 값인 97이 1씩 두번 증가되어 99가 된다.
        //코드값이 10진수로 99인 문자는 'c'이다. 따라서 c2를 출력하면, 'c'가 화면에 나타나는 것이다.
        System.out.println("i=" + i);
        System.out.println("c2=" + c2);
        System.out.println("c3=" + c3);
    }
}

