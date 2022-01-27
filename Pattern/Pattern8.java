import java.util.*;

public class Pattern8{

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
int is=-1;
int os = n/2;
for (int i=1;i<=n;i++) 
{
for(int j=1;j<=os;j++)
{
System.out.print("\t");
}
System.out.print("*\t");
for(int j=1;j<=is;j++)
{
System.out.print("\t");   
}
if(i>1&&i<n)
{
System.out.print("*\t");
}
if(i<=n/2)
{
os--;
is+=2;
}
else
{
os++;
is-=2;
}
System.out.println();
}
}
}