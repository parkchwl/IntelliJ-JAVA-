public class OverflowEx {
    public static void main(String[] args){
        short sMin = -32768;
        short sMax = 32767;
        char cMin = 0;
        char cMax = 65535;
        
        //오버플로우에 관한 설명이다.
        System.out.println("sMin = " + sMin);
        System.out.println("sMin-1= " + (short)(sMin-1));
        //sMin = -32768이다. 최소값에 -1을 한 결과 최대값을 출력하는 것을 보여준다.
        System.out.println("sMax = " + sMax);
        System.out.println("sMax+1= " + (short) (sMax+1));
        //sMax+1 또한 앞에서 서술한 것과 같다. 최대값에 +1을 해준 결과 최소값을 출력하는 것을 보여준다.
        System.out.println("cMin = " + (int)cMin);
        System.out.println("cMin-1=" + (int)--cMin);
        System.out.println("cMax = " + (int)cMax);
        System.out.println("cMax+1= " + (int)++cMax);
    }
}
