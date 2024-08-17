import java.util.Scanner;
public class p1 {
    public static void main(String[] args) {
        int n=10;

        for(int i=1;i<=n;i++){
            int val=i;
            System.out.print(val+"  ");

            for(int j=2;j<=i;j++){
                if((j&1)==1){
                    val+=(2*(i-j)+2);
                }else{
                    val+=(2*(n-i)+1);
                }
                System.out.print(val+"  ");
            }
            System.out.println();
        }
    }
}
