class Document {
    static int count = 0;
    String name;        // 문서명(Document name)

    Document() {        // 문서 생성 시 문서명을 지정하지 않았을 때
        this("제목없음" + ++count);
    }

    Document(String name) {
        this.name = name;
        System.out.println("문서 " + this.name + "가 생성되었습니다.");
    }
}
class DocumentTest {
    public static void main(String [] args) {
        Document d1 = new Document();
        Document d2 = new Document("자바.txt");
        Document d3 = new Document();
        Document d4 = new Document();
    }
}
/* 일련번호 예제를 응용한 것으로, 문자(Document)를 생성할때, 문서의 이름을 지정하면 그 이름의 문서가 생성되지만, 문서의 이름을 지정하지 않으면
프로그램이 일정한 규칙을 적용해서 자동으로 이름을 결정한다.
예를 들면, '제목없음1', '제목없음2', '제목없음3'... 과 같은 식으로 문서의 이름이 결정된다. 문서의 이름은 서로 구별될 수 있어야 하기 때문이다.
 */
