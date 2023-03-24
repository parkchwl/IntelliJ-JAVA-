public class ArrayEx12 {
    public static void main(String [] args) {
        String names [] = {"Park", "chul", "woo"};

        for(int i=0; i < names.length;i++)
            System.out.println("names["+i+"]:"+names[i]);
        String tmp = names[2];  // 배열 names의 세 번째 요소를 tmp에 저장한다.
        System.out.println("tmp:"+tmp);
        names[0] = "woo";       // 배열 names의 첫 번째 요소를 "woo"로 변경한다.

        for(String str : names) //향상된 for문이다.
            System.out.println(str);
    } // end of main
}
