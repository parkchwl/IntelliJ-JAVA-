/* "문자열 리터럴"
자바 소스파일에 포함된 모든 문자열 리터럴은 컴파일 시에 클래스 파일에 저장된다. 이때 같은 내용의 문자열 리터럴은 한번만 저장된다.
문자열 리터럴도 String 인스턴스이고, 한번 생성하면 내용을 변경할 수 없으니 하나의 인스턴스를 공유하면 되기 때문이다.       */
class StringEx2{
    public static void main(String [] args) {
        String s1 = "AAA";
        String s2 = "AAA";
        String s3 = "AAA";
        String s4 = "AAA";
    }
}
/* 위의 예제를 컴파일하면 StringEx2.class 파일이 생성된다.
실행하면 "AAA"를 담고 있는 String 인스턴스가 하나 생성된 후, 참조변수 s1, s2, s3는 모두 이 String 인스턴스를 참조하게 된다.
 */