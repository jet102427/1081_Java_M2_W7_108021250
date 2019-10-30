import java .util.Scanner;
public class q2{
public static void main(String[]args) {
    Scanner scn =new Scanner(System.in);
    int n =scn.nextInt();
    for(int i=n;i>=0;i--){
        for(int x=1;x<=i;x++){
            System.out.print("*");
    }
    System.out.println();
}
}
}
