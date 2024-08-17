import java.util.Scanner;

public class launch{
    public static void main(String[] args) {
        int h=10;
        int oddAdder=2*h-1;
        for(int i=0;i<h;i++){
            int val=i+1;
            System.out.print(val+" ");
            int evenAdder=0;
            if(i>1) evenAdder=2*(i-1);
            for(int j=1;j<=i;j++){
                if(j%2==1){
                    val+=oddAdder;
                }else{
                    val+=evenAdder;
                    evenAdder-=4;
                }
                System.out.print(val+" ");
            }
            System.out.println();
            oddAdder-=2;
        }
    }
}
