import java.util.Scanner;
public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of A u wants: ");
        int row=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                if((i!=0 && (j==0 || j==row-1)) || ( i==0 && j!=0 && j!=row-1) || i==row/2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
