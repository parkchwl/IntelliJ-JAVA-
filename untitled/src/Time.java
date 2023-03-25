public class Time {
    private int hour;
    private int minute;
    private float second;

    public int getHour()    { return hour;      }
    public int getMinute()  { return minute;    }
    public float getSecond(){ return second;    }

    public void setHour(int h) {
        if(h < 0 || h > 23) return;
        hour=h;
    }

    public void setMinute(int m) {
        if (m < 0 || m > 59) return;
        minute=m;
    }

    public void setSecond(float s) {
        if (s < 0.0f || s > 59.99f) return;
        second=s;
    }
}
/* 제어자를 이용해서 변수의 값을 직접 변경하지 못하도록 하고 대신 메서드를 통해서 값을 변경하도록 작성하였다.
값을 변경할 때 지정된 값의 유효성을 조건문으로 점검한 다음에 유효한 값일 경우에만 변경한다.
 */