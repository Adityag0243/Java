import java.util.Scanner;
 public class solid_square_diagonal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int row=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                if(j==0 || j==row-1 || i==0 || i==row-1 || (i<row/2 && i>=j) || (i>=row/2 && i<=j) || (i<row/2 && i+j>=row-1) || (i>=row/2 && i+j<=row-1)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
