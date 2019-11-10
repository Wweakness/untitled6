
//输入两组字符串，在第一组字符串中，删除所包含的所有第二组中的字符
//例如：A: im student     B:isu
//则输出：m tdent
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

            String A=in.nextLine();
            String B=in.nextLine();
            char[] a=A.toCharArray();
            char[] b=B.toCharArray();
            for(int i=0;i<b.length;i++){
                        String C=String.valueOf(b[i]);
                         A= A.replace(C,"");
            }
        System.out.println(A);




    }
}
