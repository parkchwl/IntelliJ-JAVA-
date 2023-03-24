public class ArrayEx4 {
    public static void main(String [] args) {
        char[] abc = { 'A', 'B', 'C', 'D'};
        char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        System.out.println(abc);
        System.out.println(num);

        // 배열 abc와 num을 붙여서 하나의 배열(result)로 만든다.
        char [] result = new char[abc.length+num.length];
        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(result);

        // 배열 abc를 배열 nume의 첫 번째 위치부터 배열 abc 길이만큼 복사한다.
        System.arraycopy(abc, 0 , num, 0, abc.length);
        System.out.println(num);

        // number의 인덱스 6 위치에 3개를 복사한다
        System.arraycopy(abc, 0, num, 6, 3);
        System.out.println(num);
    }
}
// 다른 배열과 달리 char 배열은 for 문을 사용하지 않고도 print()나 println()으로 배열에 저장된 모든 문자를 출력할 수 있다.