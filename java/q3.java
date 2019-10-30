import java .util.Scanner;
public class q3{
public static void main(String[]args) {
    Scanner scn =new Scanner(System.in);
    int n =scn.nextInt();
    for(int i=1;i<=n;i++){
        for(int x=n;x>i;x--){
            System.out.print(" ");
        }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
        
        System.out.println();
    }
    }

}