import jdk.nashorn.internal.parser.JSONParser;

import java.util.Scanner;
public class D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of D u wants: ");
        int row=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                if((i!=0 && (j==0 || j==row-1)) || ( i==0 && j!=0 && j!=row-1) || i==row/2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.print(" ");

            for(int j=0;j<row;j++){
                if(j==0 || (j==row-1 && i!=0 && i!=row-1) || ((i==0 || i==row-1) && j!=row-1) ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");

            for(int j=0;j<row;j++){
                if(j==row/2 || i==0 || i==row-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");

            for(int j=0;j<row;j++){
                if(j==row/2 || i==0){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");

            for(int j=0;j<row;j++){
                if(j==0 ||(i>row/2 && i==j) || (i==row/2 && j!=row-1) || (j==row-1 && i<row/2 && i!=0) || (i==0 && j!=row-1)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");
            for(int j=0;j<row;j++){
                if(((i==0 || i==row-1) && j!=0 && j!=row-1) || ((j==0 || j==row-1) && i!=0 && i!=row-1) || (i==j && i>row/2)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            if(i==row-1) System.out.println("* ");
            else System.out.print("  ");




            System.out.println();
        }
    }
}
