import java.util.Scanner;

import java.util.Scanner;
public class diamond  {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int row=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                if( (i+j>=row/2) && (j-i<=row/2) && (i-j<=row/2) && (i+j<=row+row/2-1)){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }

            }
            System.out.println();

        }

    }

}
