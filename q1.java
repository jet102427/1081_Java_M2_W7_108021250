import java .util.Scanner;
public class q1{
public static void main(String[]args) {
    Scanner scn =new Scanner(System.in);
    int sum =0;
    int x = scn.nextInt(); 
    for(int i=0;i<=x;i+=3){
        sum+= i;
    }
    System.out.println(sum);

    
}
}