// 아래의 예제는 finally블럭을 사용해서 1번의 예제를 변경한 것이다.
class FinallyTest2 {
    public static void main(String [] args) {
        try {
            startInstall();     // 프로그램 설치에 필요한 준비를 한다.
            copyFiles();        // 파일들을 복사한다.
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            deleteTempFiles();  // 프로그램 설치에 사용된 임시파일들을 삭제한다.
        }   // try - catch의 끝
    } //end of main

    static void startInstall() {
        /*  프로그램 설치에 필요한 준비를 하는 코드를 적는다.*/
    }
    static void copyFiles() { /* 파일들을 복사하는 코드를 적는다. */}
    static void deleteTempFiles() { /* 임시파일들을 삭제하는 코드를 적는다. */}
}
