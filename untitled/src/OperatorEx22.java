public class OperatorEx22 {
    public static void main(String [] args) {
        float f = 0.1f;
        double d = 0.1;
        double d2 = (double)f;

        System.out.printf("10.0==10.0f %b%n", 10.0==10.0f); //==연산자는 두 값이 같으면 ture, 다르면 false
        System.out.printf("0.1==01.f %b%n", 0.1==0.1f); //==연산자는 두 값이 같으면 ture, 다르면 false
        System.out.printf("f =%19.17f%n", f);
        System.out.printf("d =%19.17f%n", d);
        System.out.printf("d2=%19.17f%n",  d2);
        System.out.printf("d==f %b%n", d==f);
        System.out.printf("d==d2 %b%n", d==d2);
        System.out.printf("d2==f %b%n", d2==f);
        System.out.printf("(float)d==f %b%n", (float)d==f);

        /*7번 라인과 8번라인의 결과값이 다른이유(7번은 true, 8번은 false)
        정수형과 달리 실수형은 근사값으로 저장되므로 오차가 발생할 수 있다.
        10.0f는 오차없이 저장할 수 있는 값이라서 double 로 형변환해도 그대로 10.0이 되지만.
        0.1f는 저장할 때 2진수로 변환하는 과정에서 오차가 발생한다.
        double 타입의 상수인 0.1도 저장되는 과정에서 오차가 발생하지만, float 타입의 리터럴인 0.1f보다 적은 오차로 저장된다.
         */
        //float f = 0.1f; : f에 0.10000000149011612로 저장된다.
        //double d = 0.1; : d에 0.10000000000000000로 저장된다.

        /* d == f 가 연산되는 과정을 단계적으로 살펴본다.
        #1 d == (double)f
        #2 0.10000000000000001 == (double)0.10000000149011612
        #3 0.10000000000000001 == 0.10000000149011612
        #4 ===> 결과값 : false

        변수 d2에 변수 f의 값을 double 로 형변환해서 저장해도, 앞에 서술한 것과 같이 f의 값이 그대로 d2에 저장된다.
        그래서 'd2==f'의 결과가 ture 가 되는 것이다.

        ##1 double d2 = (double)f;
        ##2 double d2 = (double)0.10000000149011612;
        ##3 double d2 = 0.10000000149011612;

        ##4 d2 == f
        ##5 0.10000000149011612 == 0.10000000149011612
        ##6 ===> 결과값 : true

         */


    }
}
