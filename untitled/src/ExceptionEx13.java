class ExceptionEx13 {
    public static void main(String[] args) {
        method1();      // 같은 클래스 내의 static멤버이므로 객체 생성없이 직접 호출 가능하다.
    } // end of main

    static void method1() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1메서드에서 예외가 처리되었습니다.");
            e.printStackTrace();
        }
    }       //end of method1
}
// 예외는 처리되었지만, printStackTrace()를 통해 예외에 대한 정보를 화면에 출력하였다.
// 예외가 method1()에서 발생했으며,main 메서드가 method1()을 호출했음을 알 수 있다.