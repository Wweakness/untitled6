//一个同学去买苹果，水果店只有6个一袋装和8个一袋装，设同学想买n个苹果，他是否可以刚好买到，若买的，输出苹果袋数，买不到，输出-1
import java.util.Scanner;
public class Apple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<6){            //如果要买的苹果小于6是买不到的
            System.out.println(-1);
        }else {
        for(int i=0;i<17;i++){      //因为题目规定1<n<100,所以买6个的对多16袋
            if(6*i<n){
                if((n-6*i)%8==0){
                    int j=(n-6*i)/8;
                    int sum=i+j;
                    System.out.println(sum);
                    break;
                }


                else {
                    continue;
                }
            }else if(6*i==n){
                System.out.println(i);
                break;
            }
            else{
                System.out.println(-1);
                break;
              }

           }
        }

    }
}
