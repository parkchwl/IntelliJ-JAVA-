public class StringBufferEx3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World"); // "Hello World"라는 문자열이 생성됩니다.
        System.out.println(sb.toString()); // "Hello World"를 출력합니다.

        sb.insert(6, "Java "); // "Hello Java World"라는 문자열이 생성됩니다.
        System.out.println(sb.toString()); // "Hello Java World"를 출력합니다.

        sb.delete(6, 10); // "Hello World"라는 문자열이 생성됩니다.
        System.out.println(sb.toString()); // "Hello World"를 출력합니다.

        sb.reverse(); // "dlroW olleH"라는 문자열이 생성됩니다.
        System.out.println(sb.toString()); // "dlroW olleH"를 출력합니다.
    }
}
