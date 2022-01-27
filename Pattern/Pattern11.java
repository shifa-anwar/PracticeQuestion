import java.util.*;

public class Pattern11 {

    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
        int star =1,sp=n/2;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=sp;j++)
            {
            if(i==n/2+1)
             System.out.print("*\t");
            else
             System.out.print("\t");
            }
            for(int j=1;j<=star;j++)
            {
                System.out.print("*\t");
            }
            if(i>n/2)
            star--;
            else
            star++;
            System.out.println();
        }
        }
}
