class Circle01 implements Cloneable {
    Point p;    // 원점
    double r;   // 반지름

    Circle01(Point p, double r) {
        this.p = p;
        this.r = r;
    }

    public Circle01 shallowCopy() {     // 얕은 복사
        Object obj = null;

        try{
            obj = super.clone();
        } catch (CloneNotSupportedException e) {}
        return (Circle01)obj;
    }
    public Circle01 deepCopy() {        // 깊은 복사

    }
}