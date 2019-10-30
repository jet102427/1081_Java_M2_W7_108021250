import java .util.Scanner;
public class q1{
public static void main(String[]args) {
    Scanner scn =new Scanner(System.in);
    int o =scn.nextInt();
    int p =scn.nextInt();
     for(int i=1;i<=o;i++){
        for(int x=1;x<=p;x++){
            System.out.print((i*x)+"\t");
    }
    System.out.println();
}
}
}

