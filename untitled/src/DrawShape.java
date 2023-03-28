import java.awt.*;

/* to__ # 클래스관의 관계 - 포함관계
상속이외에도 클래스를 재사용하는 또 다른 방법이 있는데, 그것은 클래스간에 '포함(Composite)'관계를 맺어 주는 것이다.
클래스 간의 포함관계를 맺어 주는 것은 "한 클래스의 멤버변수로 다른 클래스 타입의 참조변수를 선언하는 것이다."


 */
class DrawShape {
    public static void main(String [] args) {
        Point p [] = {  new Point(100, 100),
                        new Point(140, 50),
                        new Point(200, 100)
        };

        Triangle t = new Triangle(p);
        Circle   c = new Circle(new Point(150, 150), 50);
        //Point  p = new Point(150, 150);
        //Circle c = new Circle(p, 50);  을 한문장으로 합친 것이다.

        t.draw();       //삼각형을 그린다.
        c.draw();       //원을 그린다.
        }
}

    class Shape {
    String color = "black";
    void draw() {
        System.out.printf("[color=%s]%n", color);
    }
}

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Point(){
        this(0,0);
    }
    String getXY() {
        return "("+x+","+y+")"; //x와 y의 값을 문자열로 반환한다.
    }
}

class Circle extends Shape {
    Point center;   // 원의 원점좌표
    int r;          // 반지름

    Circle() {
        this(new Point(0,0), 100);  // Circle(Point center, int r)를 호출한다.
    }

    Circle(Point center, int r) {
        this.center = center;
        this.r = r;
    }

    void draw() {   // 원을 그리는 대신에 원의 정보를 출력한다.
        System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
    }
}

class Triangle extends Shape {
    Point p [] = new Point[3];      // 3개의 Point인스턴스를 담을 배열을 생성한다.

    Triangle(Point p []) {
        this.p = p;
    }

    void draw() {
        System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
    }
}
/* 도형을 의미하는 Shape 클래스를 정의하고, 2차원 좌표에서의 점을 의미하는 Point 클래스를 정의한 다음, 이 두 클래스를 재활용해서
Circle 클래스와 Triangle클래스를 정의하였다.

class Circle extends Shape {    // Circle과 Shape는 상속관계
        Point center;           // Circle과 Point는 포함관계
        int r;              }
to_ Circle 클래스는 Shape 클래스로부터 모든 멤버를 상속받았으므로, Shape 클래스에 정의된 color이나, draw()를 사용할 수 있다.

 */