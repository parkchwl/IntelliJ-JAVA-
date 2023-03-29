class InstanceofTest {
    public static void main(String [] args) {
        FireEngine02 fe = new FireEngine02();

        if(fe instanceof FireEngine02) {
            System.out.println("This is a FireEngine02 instance.");
        }

        if(fe instanceof Car02) {
            System.out.println("This is a Car02 instance.");
        }
        if(fe instanceof Object) {
            System.out.println("This is an Object instance.");
        }
        System.out.println(fe.getClass().getName());        //클래스의 이름을 출력한다.
    }
}       //class
class Car02{}
class FireEngine02 extends Car02{}
// '참조변수.getClass().getName()'은 참조변수가 가리키고 있는 인스턴스의 클래스 이름을 문자열(String)로 반환한다.
// 어떤 타입에 대한 instanceof 연산의 결과가 true 라는 것은 검사한 타입으로 형변환이 가능하다는 것을 뜻한다.