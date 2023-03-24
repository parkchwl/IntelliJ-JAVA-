// todo : 커맨드 라인을 통해 입력받기
public class ArrayEx16 {
    public static void main(String [] args) {
        System.out.println("매개변수의 개수:"+args.length);
        for(int i=0;i < args.length;i++) {
            System.out.println("args[" + 1 + ") = \""+args[i] + "\"");
        }
    }
}
