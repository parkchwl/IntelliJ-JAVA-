class StringBufferEx1 {
    public static void main(String [] args) {
        StringBuffer sb = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");

        System.out.println("sb == sb2 ? " + (sb == sb2));
        System.out.println("sb.equals(sb2) ? " + sb.equals(sb2));

        //StringBuffer의 내용을 String으로 변환한다.
        String s = sb.toString();       // String s = new String(sb);와 같다.
        String s2 = sb2.toString();

        System.out.println("s.equals(s2) ? " + s.equals(s2));
    }
}
/* String 클래스는 인스턴스를 생설할 때 지정된 문자열을 변경할 수 없지만 StringBuffer 클래스는 변경이 가능하다.
내부적으로 문자열 편집을 위한 버퍼(buffer)를 가지고 있으며, StringBuffer인스턴스를 생성할 때 그 크기를 지정할 수 있다.
이 때, 편집할 문자열의 길이를 고려하여 버퍼의 길이를 충분히 잡아주는 것이 좋다. 편집 중인 문자열이 버퍼의 길이를 넘어서게 되면
버퍼의 길이를 늘려주는 작업이 추가로 수행되어야하기 때문에 작업효율이 떨어진다.
StringBuffer클래스는 String 클래스와 유사한 점이 많다.

#StringBuffer의 생성자.
StringBuffer클래스의 인스턴스를 생성할 때, 적절한 길이의 char형 배열이 생성되고, 배열은 문자열을 저장하고 편집하기 위한 공간(buffer)으로 사용된다.
StringBuffer인스턴스를 생성할 때는 생성자 StringBuffer(int length)를 사용해서 StringBuffer인스턴스에 저장될 문자열의 길이를 고려하여
충분히 여유있는 크기로 지정하는 것이 좋다. StringBuffer인스턴스를 생성할 때, 버퍼의 크기를 지정해주지 않으면 16개의 문자를 저장할 수 있는 크기의 버퍼를 생성한다.
 */