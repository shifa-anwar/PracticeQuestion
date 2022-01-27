import java.util.*;

public class Pattern9 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

      int n = scn.nextInt();
     int var1=0,var2=1,sum=0;
     for(int i=1;i<=n;i++)
     {
     for(int j=1;j<=i;j++)
     {
       System.out.print(var1+"\t");
       sum = var1+var2;
       var1=var2;
       var2 = sum;
     }
     System.out.println( );
     }
    }
}