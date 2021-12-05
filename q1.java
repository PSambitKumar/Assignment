import java.util.*;
class q1{
    public static void main(String args[]){
        int x, y;
        System.out.println("Enter a valuer for multiplication: ");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        System.out.println("Enter no of Expression: ");
        y=sc.nextInt();

        for(int i=1; i<=y; i++){
            int z=x*i;
            System.out.println(x +" * "+ i+" = "+z);
        }
    }
}