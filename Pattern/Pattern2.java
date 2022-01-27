import java.util.*;

public class Pattern2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
        for(int j=0;j<n;j++)
        {
        if(j<n-i-1)
        System.out.print("\t");
        else
        System.out.print("*\t");
        }
        System.out.println();
        }
    }
}