class ToStringTest {
    public static void main(String [] args) {
        String str = new String("KOREA");
        java.util.Date today = new java.util.Date();

        System.out.println(str);
        System.out.println(str.toString());
        System.out.println(today);
        System.out.println(today.toString());
    }
}
/* 위의 결과에서 알 수 있듯이 String클래스와 Date클래스의 toString()을 호출하였더니 클래스이름과 해시코드 대신 다른 결과가 출력되었다.
String 클래스의 toString()은 String인스턴스가 갖고 있는 문자열을 반환하도록 오버라이딩되어 있고,
Date클래스의 경우, Date인스턴스가 갖고 있는 날짜와 시간을 문자열로 변환하여 반환하도록 오버라이딩되어 있다.
이처럼 toString()은 일반적으로 인스턴스나 클래스에 대한 정보 또는 인스턴스 변수들의 값을 문자열로 변환하여 반환하도록 오버라이딩되는 것이 보통이다.
 */