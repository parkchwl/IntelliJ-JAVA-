class StringEx7 {
    public static void main(String [] args) {
        String fullName = "Hello.java";

        // fullName에서 '.'의 위치를 찾는다.
        int index = fullName.indexOf('.');

        // fullName의 첫번째 글자부터 '.'이 있는 곳까지 문자열을 추출한다.
        String fileName = fullName.substring(0,index);

        // '.'의 다음 문자 부터 시작해서 문자열의 끝까지 추출한다.
        // fullName.substring(index+1, fullName.length());의 결과와 같다.
        String ext = fullName.substring(index+1);

        System.out.println(fullName + "의 확장자를 제외한 이름은 "+ fileName);
        System.out.println(fullName + "의 확장자는 " + ext);
    }
}
/* 위 예제는 substring 메서드를 이용하여 한 문자열에서 내용의 일부를 추출하는 예를 보인 것이다.
substring(int start, int end)를 사용할 때 주의해야할 점은 매개변수로 사용되는 문자열에서 각 문자의 위치를 뜻하는 index가 0부터 시작한다는 것과
start부터 end의 범위 중 end 위치에 있는 문자는 결과에 포함되지 않는다는 것이다.

|index| 0   1   2   3   4   5   6   7   8   9
|char|  H   e   l   l   o   .   j   a   v   a

            |Ex|                                    |결과|
String str = "Hello.java";
int index = str.indexOf('.');                   index = 5
int index2 = str.lastIndexOf('.');              index2 = 5
String a = str.substring(0,5);                  a = "Hello"
String b = str.substring(6,10);
 */