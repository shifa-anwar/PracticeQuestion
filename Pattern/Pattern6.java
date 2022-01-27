import java.util.*;

public class Pattern6{

public static void main(String[] args) {
   	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int sp=2*n-3;
	int star=1;
	for(int i=1;i<=n;i++)
	{
	  int var=1;
	 for(int j=1;j<=star;j++)
	 {
	  System.out.print(var+"\t");
	  var++;
	 }
	  for(int j=1;j<=sp;j++)
	  {
	      System.out.print("\t");
	  }
	  if(i==n)
	  {
	   star--;
	   var--;
	  }
	  
	  for(int j=1;j<=star;j++)
	  {
	   var--;
	   System.out.print(var+"\t");
	  }
	  sp-=2;
	  star++;
	 System.out.println( );
	}
	}
}
