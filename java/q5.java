import java .util.Scanner;
public class q5{
public static void main(String[]args) {
    Scanner scn =new Scanner(System.in);
    int X =scn.nextInt();
    int n =0;
 String str="";
    while (n>1){
        str = Integer.toString(n%2)+str;
       n= n/2;
    }
    
    System.out.printf("%08d\n",Integer.parseInt(str));
}
}