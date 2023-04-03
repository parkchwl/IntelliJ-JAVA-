/* finally블럭
finally블럭은 예외의 발생여부에 상관없이 실행되어야할 코드를 포함시킬 목적으로 사용된다. try - catch문의 끝에 선택적으로 덧붙여 사용할 수 있으며,
try - catch - finally의 순서로 구성된다.

    try {
        // 예외가 발생할 가능성이 있는 문장들을 넣는다.
    } catch (Exception1 e1) {
        // 예외처리를 위한 문장을 적는다.
    } finally {
        // 예외의 발생여부에 관계없이 항상 수행되어야하는 문장들을 넣는다.
        // finally 블럭은 try - catch 문의 맨 마지막에 위치해야 한다.
    }
예외가 발생한 경우에는 'try - catch - finally'의 순으로 실행되고, 예외가 발생하지 않은 경우에는 'try - finally' 순으로 실행된다.
*/
class FinallyTest {
    public static void main(String [] args) {
        try {
            startInstall();     // 프로그램 설치에 필요한 준비를 한다.
            copyFiles();        // 파일들을 복사한다.
            deleteTempFiles();  // 프로그램 설치에 사용된 임시파일들을 삭제한다.
        } catch (Exception e) {
            e.printStackTrace();
            deleteTempFiles();      // 프로그램 설치에 사용된 임시파일들을 삭제한다.
        }   // try - catch의 끝
    } //end of main

    static void startInstall() {
        /*  프로그램 설치에 필요한 준비를 하는 코드를 적는다.*/
    }
    static void copyFiles() { /* 파일들을 복사하는 코드를 적는다. */}
    static void deleteTempFiles() { /* 임시파일들을 삭제하는 코드를 적는다. */}
} // |참고| startInstall(), copyFiles(), deleteTempFiles()에 주석문 이외에는 아무런 문장이 없지만, 작업을 수행하는 코드들이 작성되있다고 가정함.

/* 이 예제가 하는 일은 프로그램 설치를 위한 준비를 하고 파일들을 복사하고 설치가 완료되면, 프로그램을 설치하는데 사용된 임시파일들을 삭제하는 순서로 진행된다.
프로그램의 설치과정 중에 예외가 발생하더라도, 설치에 사용된 임시파일들이 삭제되도록 catch블럭에 deleteTempFiles()메서드를 넣었다.
결국 try블럭의 문장을 수행하는 동안에(프로그램을 설치하는 과정에), 예외의 발생여부에 관계없이 deleteTempFiles()메서드는 실행되어야 하는 것이다.
 */