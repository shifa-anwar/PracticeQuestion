import java.io.*;
import java.util.*;

public class Subset{

public static void main(String[] args) throws Exception {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int n = Integer.parseInt(br.readLine());
  int arr[]= new int[n];
  for(int i=0;i<arr.length;i++)
  {
   arr[i]=Integer.parseInt(br.readLine());      
  }
  for(int i=0;i<Math.pow(2,arr.length);i++)
  {
      int temp = i;
  for(int j=0;j<arr.length;j++)
  {
    int rem = temp%2;
    temp/=2;
    if(rem==0)
    System.out.print("-\t");
    else
    System.out.print(arr[j]+"\t");
  }
  System.out.println();
  }
 }

}

/*
Output
3
10
20
30
-	-	-	
10	-	-	
-	20	-	
10	20	-	
-	-	30	
10	-	30	
-	20	30	
10	20	30	
*/
