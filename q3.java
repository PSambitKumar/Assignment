public class q3 {  
    public static void main(String[] args)  {  
        int rows=4;  
        int count=1;
        for (int i= 0; i<= rows-1; i++)  {  
            for (int j=0; j<=i; j++)  {  
                System.out.print(" ");  
            }  
            for (int k=0; k<=rows-1-i; k++)  {  
                System.out.print(count%2+" ");
                count++;  
            }  
            System.out.println();  
        }  
    }  
}  