/* # 예외 발생시키기
키워드 throw를 사용해서 프로그래머가 고의로 예외를 발생시킬 수 있으며, 방법은 아래의 순서를 따르면 된다.
1.먼저, 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체를 만든 다음
    Exception e = new Exception("고의로 발생시켰음");
2.키워드 throw를 이용해서 예외를 발생시킨다.
    throw e;                                                                */
class ExceptionEx9 {
    public static void main(String [] args) {
        try {
            Exception e = new Exception("고의로 발생시켰음.");
            throw e;        // 예외를 발생시킨다.
//          throw new Exception("고의로 발생시켰음.");      // 위의 두 줄을 한줄로 줄여 쓸 수 있다.
        } catch (Exception e)       {
            System.out.println("에러 메세지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료되었음.");
    }
}
// Exception인스턴스를 생성할 때, 생성자에 String을 넣어 주면, 이 String이 Exception인스턴스에 메세지로 저장된다.
// 이 메세지는 getMessage()를 이용해서 얻을 수 있다.