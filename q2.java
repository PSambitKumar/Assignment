import java.util.*;
class q2{
    public static void main(String args[]){
        int x, y, k=1;
        System.out.println("Enter stating range: ");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        System.out.println("Enter ending range: ");
        y=sc.nextInt();

        for(int i=x; i<=y; i++){
            for(int j=x; j<=y; j++)
            k=i*j;
            System.out.print(k);
        }
        // System.out.println("\n");
    }
}