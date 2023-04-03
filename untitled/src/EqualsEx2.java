class Person {
    long id;

    public boolean equals(Object obj) {
        if(obj instanceof Person)
            return id ==((Person)obj).id;   // obj가 Object타입이므로 id값을 참조하기 위해서는 Person타입으로 형변환이 필요하다.
        else
            return false;                   // 타입이 Person이 아니면 값을 비교할 필요도 없다.
    }

    Person(long id) {
        this.id = id;
    }
}
class EqualsEx2 {
    public static void main(String [] args) {
        Person p1 = new Person(8011081111222L);
        Person p2 = new Person(8011081111222L);

        if(p1==p2)
            System.out.println("p1과 p2는 같은 사람입니다.");
        else
            System.out.println("p1과 p2는 다른 사람입니다.");

        if(p1.equals(p2))
            System.out.println("p1과 p2는 같은 사람입니다.");
        else
            System.out.println("p1과 p2는 다른 사람입니다.");
    }
}
/* equals 메서드가 Person인스턴스의 주소값이 아닌 멤버변수 id의 값을 비교하도록 하기 위해 equals메서드를 다음과 같이 오버라이딩 했다.
이렇게 함으로써 서로 다른 인스턴스 일지라도 같은 id를 가지고 있다면 equals메서드로 비교했을 때 true를 결과로 얻게 할 수 있다.
 */