import java.util.Scanner;
public class square_with_diagonals {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int row=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                if(j==0 || j==row-1 || i==0 || i==row-1 || i==j || i+j==row-1){
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
