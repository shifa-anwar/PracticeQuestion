import java.util.*;

public class Pattern3 {

    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt(); 
    int space = n/2;
    int star = 1;
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=space;j++)
        {
        System.out.print("\t");
        }
        for(int k=1;k<=star;k++)
        {
        System.out.print("*\t");
        }
         if(i<=n/2)
         {
          space--;
          star+=2;
         }
         else
         {
         space++;
         star-=2;
         }
        System.out.println();
        }
	}
	}