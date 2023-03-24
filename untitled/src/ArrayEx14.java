public class ArrayEx14 {
    public static void main(String [] args) {
        String src = "ABCDE";

        for(int i=0; i < src.length();i++) {
            char ch = src.charAt(i); // src의 i번째 문장을 ch에 저장한다.
            System.out.println("src.charAt("+i+"):"+ ch);
        }
        char chArr [] = src.toCharArray(); //String을 ===> char 배열로
        System.out.println(chArr);  //char 배열 (char[])을 출력한다.
    }
}
/* String 클래스의 charAt(int idx)을 사용하는 방법을 보여주는 예제이다. charAt(int idx)은 문자열중에서 idx번째 위치에 있는 문자를 반환한다.
idx의 값은 배열처럼 0부터 시작한다는 것을 확인할 수 있다. 그리고 println()으로 문자배열을 출력하면
문자열 출력하듯이 문자배열의 모든 요소를 이어서 한 줄로 출력한다.   */